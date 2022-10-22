// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class PaymentLink_Hosted_confirmation
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject paymentLink_Hosted_confirmationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.PaymentLink_Hosted_confirmation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PaymentLink_Hosted_confirmation_PaymentLink_After_completion("PaymentGatewayStripe.PaymentLink_Hosted_confirmation_PaymentLink_After_completion");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public PaymentLink_Hosted_confirmation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected PaymentLink_Hosted_confirmation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject paymentLink_Hosted_confirmationMendixObject)
	{
		if (paymentLink_Hosted_confirmationMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, paymentLink_Hosted_confirmationMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.paymentLink_Hosted_confirmationMendixObject = paymentLink_Hosted_confirmationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PaymentLink_Hosted_confirmation.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of PaymentLink_Hosted_confirmation_PaymentLink_After_completion
	 */
	public final paymentgatewaystripe.proxies.PaymentLink_After_completion getPaymentLink_Hosted_confirmation_PaymentLink_After_completion() throws com.mendix.core.CoreException
	{
		return getPaymentLink_Hosted_confirmation_PaymentLink_After_completion(getContext());
	}

	/**
	 * @param context
	 * @return value of PaymentLink_Hosted_confirmation_PaymentLink_After_completion
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.PaymentLink_After_completion getPaymentLink_Hosted_confirmation_PaymentLink_After_completion(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.PaymentLink_After_completion result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PaymentLink_Hosted_confirmation_PaymentLink_After_completion.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.PaymentLink_After_completion.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of PaymentLink_Hosted_confirmation_PaymentLink_After_completion
	 * @param paymentlink_hosted_confirmation_paymentlink_after_completion
	 */
	public final void setPaymentLink_Hosted_confirmation_PaymentLink_After_completion(paymentgatewaystripe.proxies.PaymentLink_After_completion paymentlink_hosted_confirmation_paymentlink_after_completion)
	{
		setPaymentLink_Hosted_confirmation_PaymentLink_After_completion(getContext(), paymentlink_hosted_confirmation_paymentlink_after_completion);
	}

	/**
	 * Set value of PaymentLink_Hosted_confirmation_PaymentLink_After_completion
	 * @param context
	 * @param paymentlink_hosted_confirmation_paymentlink_after_completion
	 */
	public final void setPaymentLink_Hosted_confirmation_PaymentLink_After_completion(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.PaymentLink_After_completion paymentlink_hosted_confirmation_paymentlink_after_completion)
	{
		if (paymentlink_hosted_confirmation_paymentlink_after_completion == null) {
			getMendixObject().setValue(context, MemberNames.PaymentLink_Hosted_confirmation_PaymentLink_After_completion.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.PaymentLink_Hosted_confirmation_PaymentLink_After_completion.toString(), paymentlink_hosted_confirmation_paymentlink_after_completion.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return paymentLink_Hosted_confirmationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation that = (paymentgatewaystripe.proxies.PaymentLink_Hosted_confirmation) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}