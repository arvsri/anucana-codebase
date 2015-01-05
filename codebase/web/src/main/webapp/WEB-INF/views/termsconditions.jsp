<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | terms and conditions</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body id="contactUs_page">
	<%@ include file="fragments/headerContent.jsp"%>
	<%@ include file="fragments/sideButtons.jsp"%>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
			<div id="anucana_main">
				<div id="grey_wrapper" class="greyLinen_background">

					<div id="terms_and_conditions_accordion">
						<div>
							<h3><a href="#"><b>Terms and Conditions</b></a></h3>
							<div id="anucana_terms_conditions">
								<i>
									<br><b>anucana</b> respects your privacy and recognizes the need to protect the personally identifiable information 
									(any information by which you can be identified, such as name, address, and telephone number) you share with us. 
									We would like to assure you that we follow appropriate standards when it comes to protecting your privacy on our web sites.</br>

									<br>In general, you can visit <b>anucana</b> website without telling us who you are or revealing any personal information about yourself.
									 We track the Internet address of the domains from which people visit us and analyze this data for trends and statistics, 
									 but the individual user remains anonymous.</br>

									<br>Some of our web pages use "cookies" so that we can better serve you with customized information when you return to our site. 
									Cookies are identifiers which a web site can send to your browser to keep on your computer to facilitate your next visit to our site. 
									You can set your browser to notify you when you are sent a cookie, giving you the option to decide whether or not to accept it. 
									The information we collect and analyze is used to improve our service to you.</br>

									<br>There are times when we may collect personal information from you such as name, physical address or telephone number. 
									It is our intent to inform you before we do that and to tell you what we intend to do with the information. 
									Generally, you will have the option not to provide the information, 
									and in the future you will be able to "opt out" of certain uses of the information. 
									If you choose not to provide the information we request, you can still visit the <b>anucana</b> website, 
									but you may be unable to access certain options, offers and services.</br>

									<br><b>anucana</b> will not sell, trade or disclose to third parties any information derived from the registration for, or use of, 
									any online service (including names and addresses) without the consent of the user or customer 
									(except as required by subpoena, search warrant, or other legal process or in the case of imminent physical harm to the user or others). 
									<b>anucana</b> will allow suppliers to access the information for purposes of confirming your registration 
									and providing you with benefits you are entitled to.<br>

									<br><b>anucana</b> will take appropriate steps to protect the information you share with us. 
									We have implemented technology and security features and strict policy guidelines to safeguard the privacy of your personally identifiable 
									information from unauthorized access and improper use or disclosure. 
									<b>anucana</b> will continue to enhance our security procedures as new technology becomes available.</br>

									<br>If our privacy policy changes in the future, it will be posted here and a new effective date will be shown. 
									You should access our privacy policy regularly to ensure you understand our current policies. 
									Please reference the privacy policy in your subject line. 
									<b>anucana</b> will attempt to respond to all reasonable concerns or inquiries within five business days of receipt.</br>

									<br><a href="${pageContext.request.contextPath}/unmanaged/contactUs"><b>Contact Us</b></a></br>
								</i>
							</div>
						</div>
					</div>
				</div>
				<!-- end of grey_wrapper -->
			</div>
			<!-- end of anucana_main -->
		</div>
		<div id="emptyPad"></div>
		<%@ include file="fragments/footerContent.jsp"%>
	</div>
	<!-- end of anucana_wrapper -->


	<script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>

	<script type="text/javascript">
		$(function() {
			var $acc = $("#terms_and_conditions_accordion > div").accordion(
					{
						header : "> h3",
						collapsible : false,
						active : false,
						heightStyle : "content"
					});
			$("#terms_and_conditions_accordion > div:first-child").accordion('option','active', 0);
		})();
	</script>
</body>
</html>


