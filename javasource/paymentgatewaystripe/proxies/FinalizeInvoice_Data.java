// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class FinalizeInvoice_Data
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject finalizeInvoice_DataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.FinalizeInvoice_Data";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FinalizeInvoice_Data_FinalizeInvoice_Lines("PaymentGatewayStripe.FinalizeInvoice_Data_FinalizeInvoice_Lines");

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

	public FinalizeInvoice_Data(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected FinalizeInvoice_Data(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject finalizeInvoice_DataMendixObject)
	{
		if (finalizeInvoice_DataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, finalizeInvoice_DataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.finalizeInvoice_DataMendixObject = finalizeInvoice_DataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FinalizeInvoice_Data.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.FinalizeInvoice_Data initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.FinalizeInvoice_Data.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.FinalizeInvoice_Data initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.FinalizeInvoice_Data(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.FinalizeInvoice_Data load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.FinalizeInvoice_Data.initialize(context, mendixObject);
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
	 * @return value of FinalizeInvoice_Data_FinalizeInvoice_Lines
	 */
	public final paymentgatewaystripe.proxies.FinalizeInvoice_Lines getFinalizeInvoice_Data_FinalizeInvoice_Lines() throws com.mendix.core.CoreException
	{
		return getFinalizeInvoice_Data_FinalizeInvoice_Lines(getContext());
	}

	/**
	 * @param context
	 * @return value of FinalizeInvoice_Data_FinalizeInvoice_Lines
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.FinalizeInvoice_Lines getFinalizeInvoice_Data_FinalizeInvoice_Lines(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.FinalizeInvoice_Lines result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FinalizeInvoice_Data_FinalizeInvoice_Lines.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.FinalizeInvoice_Lines.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of FinalizeInvoice_Data_FinalizeInvoice_Lines
	 * @param finalizeinvoice_data_finalizeinvoice_lines
	 */
	public final void setFinalizeInvoice_Data_FinalizeInvoice_Lines(paymentgatewaystripe.proxies.FinalizeInvoice_Lines finalizeinvoice_data_finalizeinvoice_lines)
	{
		setFinalizeInvoice_Data_FinalizeInvoice_Lines(getContext(), finalizeinvoice_data_finalizeinvoice_lines);
	}

	/**
	 * Set value of FinalizeInvoice_Data_FinalizeInvoice_Lines
	 * @param context
	 * @param finalizeinvoice_data_finalizeinvoice_lines
	 */
	public final void setFinalizeInvoice_Data_FinalizeInvoice_Lines(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.FinalizeInvoice_Lines finalizeinvoice_data_finalizeinvoice_lines)
	{
		if (finalizeinvoice_data_finalizeinvoice_lines == null) {
			getMendixObject().setValue(context, MemberNames.FinalizeInvoice_Data_FinalizeInvoice_Lines.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.FinalizeInvoice_Data_FinalizeInvoice_Lines.toString(), finalizeinvoice_data_finalizeinvoice_lines.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return finalizeInvoice_DataMendixObject;
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
			final paymentgatewaystripe.proxies.FinalizeInvoice_Data that = (paymentgatewaystripe.proxies.FinalizeInvoice_Data) obj;
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
