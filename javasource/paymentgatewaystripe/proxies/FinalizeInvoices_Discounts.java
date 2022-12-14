// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class FinalizeInvoices_Discounts
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject finalizeInvoices_DiscountsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.FinalizeInvoices_Discounts";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject("PaymentGatewayStripe.FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject");

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

	public FinalizeInvoices_Discounts(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected FinalizeInvoices_Discounts(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject finalizeInvoices_DiscountsMendixObject)
	{
		if (finalizeInvoices_DiscountsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, finalizeInvoices_DiscountsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.finalizeInvoices_DiscountsMendixObject = finalizeInvoices_DiscountsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FinalizeInvoices_Discounts.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.FinalizeInvoices_Discounts initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.FinalizeInvoices_Discounts.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.FinalizeInvoices_Discounts initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.FinalizeInvoices_Discounts(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.FinalizeInvoices_Discounts load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.FinalizeInvoices_Discounts.initialize(context, mendixObject);
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
	 * @return value of FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject
	 */
	public final paymentgatewaystripe.proxies.FinalizeInvoice_JsonObject getFinalizeInvoices_Discounts_FinalizeInvoice_JsonObject() throws com.mendix.core.CoreException
	{
		return getFinalizeInvoices_Discounts_FinalizeInvoice_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.FinalizeInvoice_JsonObject getFinalizeInvoices_Discounts_FinalizeInvoice_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.FinalizeInvoice_JsonObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.FinalizeInvoice_JsonObject.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject
	 * @param finalizeinvoices_discounts_finalizeinvoice_jsonobject
	 */
	public final void setFinalizeInvoices_Discounts_FinalizeInvoice_JsonObject(paymentgatewaystripe.proxies.FinalizeInvoice_JsonObject finalizeinvoices_discounts_finalizeinvoice_jsonobject)
	{
		setFinalizeInvoices_Discounts_FinalizeInvoice_JsonObject(getContext(), finalizeinvoices_discounts_finalizeinvoice_jsonobject);
	}

	/**
	 * Set value of FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject
	 * @param context
	 * @param finalizeinvoices_discounts_finalizeinvoice_jsonobject
	 */
	public final void setFinalizeInvoices_Discounts_FinalizeInvoice_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.FinalizeInvoice_JsonObject finalizeinvoices_discounts_finalizeinvoice_jsonobject)
	{
		if (finalizeinvoices_discounts_finalizeinvoice_jsonobject == null) {
			getMendixObject().setValue(context, MemberNames.FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.FinalizeInvoices_Discounts_FinalizeInvoice_JsonObject.toString(), finalizeinvoices_discounts_finalizeinvoice_jsonobject.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return finalizeInvoices_DiscountsMendixObject;
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
			final paymentgatewaystripe.proxies.FinalizeInvoices_Discounts that = (paymentgatewaystripe.proxies.FinalizeInvoices_Discounts) obj;
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
