// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class Root
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.Root";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_object("_object"),
		Has_more("Has_more"),
		Url("Url"),
		Data_Root("PaymentGatewayStripe.Data_Root");

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

	public Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Root(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject)
	{
		if (rootMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, rootMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.rootMendixObject = rootMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.Root.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.Root(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.Root load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.Root.initialize(context, mendixObject);
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
	 * @return value of _object
	 */
	public final java.lang.String get_object()
	{
		return get_object(getContext());
	}

	/**
	 * @param context
	 * @return value of _object
	 */
	public final java.lang.String get_object(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._object.toString());
	}

	/**
	 * Set value of _object
	 * @param _object
	 */
	public final void set_object(java.lang.String _object)
	{
		set_object(getContext(), _object);
	}

	/**
	 * Set value of _object
	 * @param context
	 * @param _object
	 */
	public final void set_object(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _object)
	{
		getMendixObject().setValue(context, MemberNames._object.toString(), _object);
	}

	/**
	 * @return value of Has_more
	 */
	public final java.lang.Boolean getHas_more()
	{
		return getHas_more(getContext());
	}

	/**
	 * @param context
	 * @return value of Has_more
	 */
	public final java.lang.Boolean getHas_more(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Has_more.toString());
	}

	/**
	 * Set value of Has_more
	 * @param has_more
	 */
	public final void setHas_more(java.lang.Boolean has_more)
	{
		setHas_more(getContext(), has_more);
	}

	/**
	 * Set value of Has_more
	 * @param context
	 * @param has_more
	 */
	public final void setHas_more(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean has_more)
	{
		getMendixObject().setValue(context, MemberNames.Has_more.toString(), has_more);
	}

	/**
	 * @return value of Url
	 */
	public final java.lang.String getUrl()
	{
		return getUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of Url
	 */
	public final java.lang.String getUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Url.toString());
	}

	/**
	 * Set value of Url
	 * @param url
	 */
	public final void setUrl(java.lang.String url)
	{
		setUrl(getContext(), url);
	}

	/**
	 * Set value of Url
	 * @param context
	 * @param url
	 */
	public final void setUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.Url.toString(), url);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Data_Root
	 */
	public final paymentgatewaystripe.proxies.Data getData_Root() throws com.mendix.core.CoreException
	{
		return getData_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.Data getData_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.Data result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_Root.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.Data.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Data_Root
	 * @param data_root
	 */
	public final void setData_Root(paymentgatewaystripe.proxies.Data data_root)
	{
		setData_Root(getContext(), data_root);
	}

	/**
	 * Set value of Data_Root
	 * @param context
	 * @param data_root
	 */
	public final void setData_Root(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.Data data_root)
	{
		if (data_root == null) {
			getMendixObject().setValue(context, MemberNames.Data_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Data_Root.toString(), data_root.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rootMendixObject;
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
			final paymentgatewaystripe.proxies.Root that = (paymentgatewaystripe.proxies.Root) obj;
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
