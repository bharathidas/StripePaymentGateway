// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package paymentgatewaystripe.actions;

import com.google.gson.JsonSyntaxException;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.Event;
import com.stripe.model.EventDataObjectDeserializer;
import com.stripe.model.Invoice;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentMethod;
import com.stripe.model.StripeObject;
import com.stripe.net.Webhook;

public class StripeSignature extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String endpointSecret;
	private java.lang.String payload;
	private java.lang.String sigHeader;

	public StripeSignature(IContext context, java.lang.String endpointSecret, java.lang.String payload, java.lang.String sigHeader)
	{
		super(context);
		this.endpointSecret = endpointSecret;
		this.payload = payload;
		this.sigHeader = sigHeader;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		final ILogNode Ilogger = Core.getLogger("Payment Signature validation start");
		 Event event = null;

		  try {
		    event = Webhook.constructEvent(
		      payload, sigHeader, endpointSecret
		    );
		  } catch (JsonSyntaxException e) {
		    // Invalid payload
		    //response.status(400);
		    return false;
		  } catch (SignatureVerificationException e) {
		    // Invalid signature
		    //response.status(400);
		    return false;
		  }

		  // Deserialize the nested object inside the event
		  EventDataObjectDeserializer dataObjectDeserializer = event.getDataObjectDeserializer();
		  StripeObject stripeObject = null;
		  if (dataObjectDeserializer.getObject().isPresent()) {
		    stripeObject = dataObjectDeserializer.getObject().get();
		  } else {
		    // Deserialization failed, probably due to an API version mismatch.
		    // Refer to the Javadoc documentation on `EventDataObjectDeserializer` for
		    // instructions on how to handle this case, or return an error here.
		  }

		  // Handle the event
		  Ilogger.info("Event Type:"+event.getType());
		  switch (event.getType()) {
		    case "payment_intent.succeeded":
		      PaymentIntent paymentIntent = (PaymentIntent) stripeObject;
		      System.out.println("PaymentIntent was successful!");
		      break;
		    case "payment_method.attached":
		      PaymentMethod paymentMethod = (PaymentMethod) stripeObject;
		      System.out.println("PaymentMethod was attached to a Customer!");
		      break;
		    case "invoice.paid":
			      Invoice invoice = (Invoice) stripeObject;
			      Ilogger.info(invoice);
			      //System.out.println("PaymentMethod was attached to a Customer!");
			      break;
		    // ... handle other event types
		    default:
		      System.out.println("Unhandled event type: " + event.getType());
		  }

		  //response.status(200);
		  return true;
		
		//throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StripeSignature";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}