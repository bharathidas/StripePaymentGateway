// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package paymentgatewaystripe.proxies;

public class Tires
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tiresMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PaymentGatewayStripe.Tires";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		up_to("up_to"),
		flat_amount("flat_amount"),
		flat_amount_decimal("flat_amount_decimal"),
		unit_amount("unit_amount"),
		unit_amount_decimal("unit_amount_decimal"),
		Tires_PriceAPI("PaymentGatewayStripe.Tires_PriceAPI");

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

	public Tires(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Tires(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tiresMendixObject)
	{
		if (tiresMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, tiresMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.tiresMendixObject = tiresMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Tires.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static paymentgatewaystripe.proxies.Tires initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return paymentgatewaystripe.proxies.Tires.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static paymentgatewaystripe.proxies.Tires initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new paymentgatewaystripe.proxies.Tires(context, mendixObject);
	}

	public static paymentgatewaystripe.proxies.Tires load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return paymentgatewaystripe.proxies.Tires.initialize(context, mendixObject);
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
	 * @return value of up_to
	 */
	public final java.lang.String getup_to()
	{
		return getup_to(getContext());
	}

	/**
	 * @param context
	 * @return value of up_to
	 */
	public final java.lang.String getup_to(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.up_to.toString());
	}

	/**
	 * Set value of up_to
	 * @param up_to
	 */
	public final void setup_to(java.lang.String up_to)
	{
		setup_to(getContext(), up_to);
	}

	/**
	 * Set value of up_to
	 * @param context
	 * @param up_to
	 */
	public final void setup_to(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String up_to)
	{
		getMendixObject().setValue(context, MemberNames.up_to.toString(), up_to);
	}

	/**
	 * @return value of flat_amount
	 */
	public final java.lang.Integer getflat_amount()
	{
		return getflat_amount(getContext());
	}

	/**
	 * @param context
	 * @return value of flat_amount
	 */
	public final java.lang.Integer getflat_amount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.flat_amount.toString());
	}

	/**
	 * Set value of flat_amount
	 * @param flat_amount
	 */
	public final void setflat_amount(java.lang.Integer flat_amount)
	{
		setflat_amount(getContext(), flat_amount);
	}

	/**
	 * Set value of flat_amount
	 * @param context
	 * @param flat_amount
	 */
	public final void setflat_amount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer flat_amount)
	{
		getMendixObject().setValue(context, MemberNames.flat_amount.toString(), flat_amount);
	}

	/**
	 * @return value of flat_amount_decimal
	 */
	public final java.math.BigDecimal getflat_amount_decimal()
	{
		return getflat_amount_decimal(getContext());
	}

	/**
	 * @param context
	 * @return value of flat_amount_decimal
	 */
	public final java.math.BigDecimal getflat_amount_decimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.flat_amount_decimal.toString());
	}

	/**
	 * Set value of flat_amount_decimal
	 * @param flat_amount_decimal
	 */
	public final void setflat_amount_decimal(java.math.BigDecimal flat_amount_decimal)
	{
		setflat_amount_decimal(getContext(), flat_amount_decimal);
	}

	/**
	 * Set value of flat_amount_decimal
	 * @param context
	 * @param flat_amount_decimal
	 */
	public final void setflat_amount_decimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal flat_amount_decimal)
	{
		getMendixObject().setValue(context, MemberNames.flat_amount_decimal.toString(), flat_amount_decimal);
	}

	/**
	 * @return value of unit_amount
	 */
	public final java.lang.Integer getunit_amount()
	{
		return getunit_amount(getContext());
	}

	/**
	 * @param context
	 * @return value of unit_amount
	 */
	public final java.lang.Integer getunit_amount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.unit_amount.toString());
	}

	/**
	 * Set value of unit_amount
	 * @param unit_amount
	 */
	public final void setunit_amount(java.lang.Integer unit_amount)
	{
		setunit_amount(getContext(), unit_amount);
	}

	/**
	 * Set value of unit_amount
	 * @param context
	 * @param unit_amount
	 */
	public final void setunit_amount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer unit_amount)
	{
		getMendixObject().setValue(context, MemberNames.unit_amount.toString(), unit_amount);
	}

	/**
	 * @return value of unit_amount_decimal
	 */
	public final java.math.BigDecimal getunit_amount_decimal()
	{
		return getunit_amount_decimal(getContext());
	}

	/**
	 * @param context
	 * @return value of unit_amount_decimal
	 */
	public final java.math.BigDecimal getunit_amount_decimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.unit_amount_decimal.toString());
	}

	/**
	 * Set value of unit_amount_decimal
	 * @param unit_amount_decimal
	 */
	public final void setunit_amount_decimal(java.math.BigDecimal unit_amount_decimal)
	{
		setunit_amount_decimal(getContext(), unit_amount_decimal);
	}

	/**
	 * Set value of unit_amount_decimal
	 * @param context
	 * @param unit_amount_decimal
	 */
	public final void setunit_amount_decimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal unit_amount_decimal)
	{
		getMendixObject().setValue(context, MemberNames.unit_amount_decimal.toString(), unit_amount_decimal);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tires_PriceAPI
	 */
	public final paymentgatewaystripe.proxies.PriceAPI getTires_PriceAPI() throws com.mendix.core.CoreException
	{
		return getTires_PriceAPI(getContext());
	}

	/**
	 * @param context
	 * @return value of Tires_PriceAPI
	 * @throws com.mendix.core.CoreException
	 */
	public final paymentgatewaystripe.proxies.PriceAPI getTires_PriceAPI(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		paymentgatewaystripe.proxies.PriceAPI result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tires_PriceAPI.toString());
		if (identifier != null) {
			result = paymentgatewaystripe.proxies.PriceAPI.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tires_PriceAPI
	 * @param tires_priceapi
	 */
	public final void setTires_PriceAPI(paymentgatewaystripe.proxies.PriceAPI tires_priceapi)
	{
		setTires_PriceAPI(getContext(), tires_priceapi);
	}

	/**
	 * Set value of Tires_PriceAPI
	 * @param context
	 * @param tires_priceapi
	 */
	public final void setTires_PriceAPI(com.mendix.systemwideinterfaces.core.IContext context, paymentgatewaystripe.proxies.PriceAPI tires_priceapi)
	{
		if (tires_priceapi == null) {
			getMendixObject().setValue(context, MemberNames.Tires_PriceAPI.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tires_PriceAPI.toString(), tires_priceapi.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tiresMendixObject;
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
			final paymentgatewaystripe.proxies.Tires that = (paymentgatewaystripe.proxies.Tires) obj;
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