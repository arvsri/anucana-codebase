package com.anucana.constants;

public interface ITypeConstants {

	String TYPE_GRP_STATUS_CD = "type_code_status";
	String TYPE_STATUS_CD_ACT = "tcs_act";
	String TYPE_STATUS_CD_INACT = "tcs_inact";
	
	String TYPE_GRP_LOGIN_STATUS = "login_status";
	String TYPE_LOGIN_ACT = "ls_act";
	String TYPE_LOGIN_INACT = "ls_inact";
	String TYPE_LOGIN_SUS = "ls_sus";
	String TYPE_LOGIN_DEL = "ls_del";

	String TYPE_GRP_USER_ROLES = "user_roles";
	String TYPE_ROLE_GENERAL_USER = "ur_gu";
	String TYPE_ROLE_COMMUNITY_MEMBER = "ur_cm";
	String TYPE_ROLE_COMMUNITY_MODERATOR = "ur_cmo";
	String TYPE_ROLE_SALES_AGENT = "ur_sa";
	String TYPE_ROLE_FINANCE_AGENT = "ur_fa";
	String TYPE_ROLE_ADMIN = "ur_a";

	String TYPE_GRP_USER_PROFILE_ACCESS = "profile_access_cd";
	String TYPE_PROFILE_ACCESS_ALL = "pac_all";
	String TYPE_PROFILE_ACCESS_NONE = "pac_non";
	String TYPE_PROFILE_ACCESS_FEW = "pac_few";
	
	
	String TYPE_GRP_PHONE_TYPE_CD = "phone_type_cd";
	String TYPE_PHONE_WORK = "ptc_w";
	String TYPE_PHONE_HOME = "ptc_h";
	String TYPE_PHONE_MOBILE = "ptc_m";

	String TYPE_GRP_MESSENGER_TYPE_CD = "messenger_type_cd";
	String TYPE_MESSENGER_SKYPE = "mtc_skype";
	String TYPE_MESSENGER_GTALK = "mtc_gtalk";
	String TYPE_MESSENGER_YAHOO = "mtc_yahoo";

	String TYPE_GRP_INDUSTRY_TYPE_CD = "industry_type_cd";

	String TYPE_GRP_COUNTY_CD = "country_cd";

    String TYPE_GRP_MESSAGE = "message_cd";
    String TYPE_MESSAGE_ANNONYMOUS = "mc_anyms";
    String TYPE_MESSAGE_LOGGED_IN_USER = "mc_user";
    String TYPE_MESSAGE_USER_EVENT = "mc_event";

    String TYPE_GRP_COMMUNITY_STATUS = "community_status";
    String TYPE_COMMUNITY_ACTIVE = "cs_act";
    String TYPE_COMMUNITY_INACTIVE = "cs_inact";

    String TYPE_GRP_EVENT_STATUS = "event_status";
    String TYPE_EVENT_ACTIVE = "es_act";
    String TYPE_EVENT_INACTIVE_PROJECTED = "es_inact_proj";
    String TYPE_EVENT_INACTIVE_SUSPENDED = "es_inact_sus";

    String TYPE_GRP_USER_EVENT_STATUS = "user_event_status";
    String TYPE_USER_EVENT_STATUS_ENROLLED = "ues_enrol";
    String TYPE_USER_EVENT_STATUS_PAID = "ues_paid";
    String TYPE_USER_EVENT_STATUS_PAYMENT_FAILED ="ues_pay_failed";
    String TYPE_USER_EVENT_STATUS_PAYMENT_DISPUTE ="ues_dispute";
    String TYPE_USER_EVENT_STATUS_CANCELLED = "ues_cancel";
    String TYPE_USER_EVENT_STATUS_PAYMENT_REVERESED = "ues_payrev";
    
    String TYPE_GRP_PAYMENT_TRANSACTION_LOG_TYPE = "payment_tx_log";
    String TYPE_PAYMENT_TRANSACTION_REQUEST_LOG = "ptl_request";
    String TYPE_PAYMENT_TRANSACTION_RESPONSE_LOG = "ptl_response";

    String TYPE_GRP_DISCOUNT_CALC_STRATEGY_TYPE = "disc_calc";
    String TYPE_DISCOUNT_CALC_STRATEGY_ABSOLUTE = "dc_abs";
    String TYPE_DISCOUNT_CALC_STRATEGY_PERCENTAGE= "dc_per";

    String TYPE_GRP_DISCOUNT_COUPON_STATUS = "coupon_status";
    String TYPE_DISCOUNT_COUPON_ACTIVE = "coups_act";
    String TYPE_DISCOUNT_COUPON_INACTIVE = "coups_inact";

    String TYPE_GRP_PREFIX_PAYU_MONEY = "payum_";
    
    String TYPE_GRP_GENERIC_PAY_ERROR_CODE = "paygeneric_error";
    String TYPE_GENERIC_PAY_ERROR_NONE = "payge_000";
    String TYPE_GENERIC_PAY_ERROR_ANY = "payge_100";
    String TYPE_GENERIC_PAY_ERROR_CHECKSUM_FAILED = "payge_200";
    
    String TYPE_GRP_PAYMENT_TRANSACTION_MODE = "payment_tx_mode";
    String TYPE_PAYMENT_TRANSACTION_MODE_CREDIT_CARD = "ptm_cc";
    String TYPE_PAYMENT_TRANSACTION_MODE_NET_BANKING = "ptm_nb";
    String TYPE_PAYMENT_TRANSACTION_MODE_CHEQUE = "ptm_cd";
    String TYPE_PAYMENT_TRANSACTION_MODE_DEMAND_DRAFT = "ptm_dd";
    String TYPE_PAYMENT_TRANSACTION_MODE_CASH_PICKUP = "ptm_co";
    
    String TYPE_GRP_PAYMENT_TRANSACTION_STATUS = "payment_tx_status";
    String TYPE_PAYMENT_TRANSACTION_STATUS_SUCCESS = "pts_success";
    String TYPE_PAYMENT_TRANSACTION_STATUS_PENDNG = "pts_pending";
    String TYPE_PAYMENT_TRANSACTION_STATUS_FAILURE = "pts_failure";
    String TYPE_PAYMENT_TRANSACTION_STATUS_DISPUTE = "pts_dispute";
    
}
