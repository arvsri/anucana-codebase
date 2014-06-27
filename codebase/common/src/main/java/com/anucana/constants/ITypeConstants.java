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
    String TYPE_EVENT_INACTIVE = "es_inact";

    String TYPE_GRP_USER_EVENT_STATUS = "user_event_status";
    String TYPE_USER_EVENT_STATUS_ENROLLED = "ues_enrol";
    String TYPE_USER_EVENT_STATUS_PAID = "ues_paid";
    String TYPE_USER_EVENT_STATUS_CANCELLED = "ues_cancel";
    String TYPE_USER_EVENT_STATUS_PAYMENT_REVERESED = "ues_payrev";

}
