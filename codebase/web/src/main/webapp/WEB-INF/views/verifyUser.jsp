<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana</title>
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
    <!--Block 4 - This block holds Forgot Password form and error blocks -->
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper">
                <div style="margin:28px auto;">
                	<div id="anucana_forgotPwd">
                        <h3>Just verify your email address and your account will be activated</h3>
                        <p class="description">Please enter your registered email address to get instructions.</p>
						<sf:form action="verifyUser" method="post" modelAttribute="userLogin" >
							<table>
								<tbody>
									<tr>
										<td><sf:input path="username" id="forgotpwd_email" placeholder="Email address"/></td>
									</tr>
									<tr>
										<td><sf:errors path="username" htmlEscape="false" element="div" path="username" cssClass="inlineError"/></td>
									</tr>
									<tr>
										<td><input type="submit" class="button grey_button" id="forgotpwd_cont" tabindex="4" value="Continue" /></td>
									</tr>
								</tbody>
							</table>
						</sf:form>
                    </div>
                </div>
            </div> 
        </div>
        <div id="emptyPad"> </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div>
	</div>
</body>
</html>
