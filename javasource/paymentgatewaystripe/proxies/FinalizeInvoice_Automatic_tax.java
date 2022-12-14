// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class FinalizeInvoice_Automatic_tax
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject finalizeInvoice_Automatic_taxMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.FinalizeInvoice_Automatic_tax";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Enabled("Enabled"),
		FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root("PaymentGatewayStripe.FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root");

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

	public FinalizeInvoice_Automatic_tax(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected FinalizeInvoice_Automatic_tax(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject finalizeInvoice_Automatic_taxMendixObject)
	{
		if (finalizeInvoice_Automatic_taxMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, finalizeInvoice_Automatic_taxMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.finalizeInvoice_Automatic_taxMendixObject = finalizeInvoice_Automatic_taxMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FinalizeInvoice_Automatic_tax.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax.initialize(context, mendixObject);
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
	 * @return value of Enabled
	 */
	public final java.lang.Boolean getEnabled()
	{
		return getEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of Enabled
	 */
	public final java.lang.Boolean getEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Enabled.toString());
	}

	/**
	 * Set value of Enabled
	 * @param enabled
	 */
	public final void setEnabled(java.lang.Boolean enabled)
	{
		setEnabled(getContext(), enabled);
	}

	/**
	 * Set value of Enabled
	 * @param context
	 * @param enabled
	 */
	public final void setEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean enabled)
	{
		getMendixObject().setValue(context, MemberNames.Enabled.toString(), enabled);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root
	 */
	public final paymentgatewaystripe.proxies.FinalizeInvoice_Root getFinalizeInvoice_Automatic_tax_FinalizeInvoice_Root() throws com.mendix.core.CoreException
	{
		return getFinalizeInvoice_Automatic_tax_FinalizeInvoice_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.FinalizeInvoice_Root getFinalizeInvoice_Automatic_tax_FinalizeInvoice_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.FinalizeInvoice_Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.FinalizeInvoice_Root.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root
	 * @param finalizeinvoice_automatic_tax_finalizeinvoice_root
	 */
	public final void setFinalizeInvoice_Automatic_tax_FinalizeInvoice_Root(paymentgatewaystripe.proxies.FinalizeInvoice_Root finalizeinvoice_automatic_tax_finalizeinvoice_root)
	{
		setFinalizeInvoice_Automatic_tax_FinalizeInvoice_Root(getContext(), finalizeinvoice_automatic_tax_finalizeinvoice_root);
	}

	/**
	 * Set value of FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root
	 * @param context
	 * @param finalizeinvoice_automatic_tax_finalizeinvoice_root
	 */
	public final void setFinalizeInvoice_Automatic_tax_FinalizeInvoice_Root(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.FinalizeInvoice_Root finalizeinvoice_automatic_tax_finalizeinvoice_root)
	{
		if (finalizeinvoice_automatic_tax_finalizeinvoice_root == null) {
			getMendixObject().setValue(context, MemberNames.FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.FinalizeInvoice_Automatic_tax_FinalizeInvoice_Root.toString(), finalizeinvoice_automatic_tax_finalizeinvoice_root.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return finalizeInvoice_Automatic_taxMendixObject;
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
			final paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax that = (paymentgatewaystripe.proxies.FinalizeInvoice_Automatic_tax) obj;
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
