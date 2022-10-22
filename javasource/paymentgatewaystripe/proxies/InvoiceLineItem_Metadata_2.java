// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class InvoiceLineItem_Metadata_2
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject invoiceLineItem_Metadata_2MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.InvoiceLineItem_Metadata_2";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		InvoiceLineItem_Metadata_2_InvoiceLineItem_Price("PaymentGatewayStripe.InvoiceLineItem_Metadata_2_InvoiceLineItem_Price");

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

	public InvoiceLineItem_Metadata_2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected InvoiceLineItem_Metadata_2(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject invoiceLineItem_Metadata_2MendixObject)
	{
		if (invoiceLineItem_Metadata_2MendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, invoiceLineItem_Metadata_2MendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.invoiceLineItem_Metadata_2MendixObject = invoiceLineItem_Metadata_2MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'InvoiceLineItem_Metadata_2.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2.initialize(context, mendixObject);
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
	 * @return value of InvoiceLineItem_Metadata_2_InvoiceLineItem_Price
	 */
	public final paymentgatewaystripe.proxies.InvoiceLineItem_Price getInvoiceLineItem_Metadata_2_InvoiceLineItem_Price() throws com.mendix.core.CoreException
	{
		return getInvoiceLineItem_Metadata_2_InvoiceLineItem_Price(getContext());
	}

	/**
	 * @param context
	 * @return value of InvoiceLineItem_Metadata_2_InvoiceLineItem_Price
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.InvoiceLineItem_Price getInvoiceLineItem_Metadata_2_InvoiceLineItem_Price(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.InvoiceLineItem_Price result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InvoiceLineItem_Metadata_2_InvoiceLineItem_Price.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.InvoiceLineItem_Price.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of InvoiceLineItem_Metadata_2_InvoiceLineItem_Price
	 * @param invoicelineitem_metadata_2_invoicelineitem_price
	 */
	public final void setInvoiceLineItem_Metadata_2_InvoiceLineItem_Price(paymentgatewaystripe.proxies.InvoiceLineItem_Price invoicelineitem_metadata_2_invoicelineitem_price)
	{
		setInvoiceLineItem_Metadata_2_InvoiceLineItem_Price(getContext(), invoicelineitem_metadata_2_invoicelineitem_price);
	}

	/**
	 * Set value of InvoiceLineItem_Metadata_2_InvoiceLineItem_Price
	 * @param context
	 * @param invoicelineitem_metadata_2_invoicelineitem_price
	 */
	public final void setInvoiceLineItem_Metadata_2_InvoiceLineItem_Price(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.InvoiceLineItem_Price invoicelineitem_metadata_2_invoicelineitem_price)
	{
		if (invoicelineitem_metadata_2_invoicelineitem_price == null) {
			getMendixObject().setValue(context, MemberNames.InvoiceLineItem_Metadata_2_InvoiceLineItem_Price.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.InvoiceLineItem_Metadata_2_InvoiceLineItem_Price.toString(), invoicelineitem_metadata_2_invoicelineitem_price.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return invoiceLineItem_Metadata_2MendixObject;
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
			final paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2 that = (paymentgatewaystripe.proxies.InvoiceLineItem_Metadata_2) obj;
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
