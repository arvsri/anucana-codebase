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
	<%@ include file="fragments/headerLinkStripe.jsp" %>
	<%@ include file="fragments/sideButtonsGuest.jsp" %>
            <div id="anucana_main" style="height:400px;">
                <div style="width:400px; margin:28px auto;">
                    <h3>Set your new password</h3>
					<sf:form action="login/resetPassword" method="post" modelAttribute="userLogin">                        
	                    <table>
	                        <tbody>
	                            <tr><td colspan="2"><sf:password path="password" id="login_pass" cssClass="bigInputBox" placeholder="New Password (6 or more characters)" /></td></tr>
	                            <tr><td colspan="2"><sf:errors path="password"/></td></tr>
	                            <tr><td colspan="2"><sf:password path="passwordVerify" id="login_pass" cssClass="bigInputBox" placeholder="Re-enter your new password" /></td></tr>
	                            <tr><td colspan="2"><sf:errors path="passwordVerify" /></td></tr>
	                            <tr><td><sf:hidden path="userId"></sf:hidden></td></tr>
	                            <tr><td><sf:hidden path="secretKey"></sf:hidden></td></tr>
	                            <tr><td style="width:26%"><label for="u_0_l" id="loginbutton"><input type="submit" class="button grey_button" id="u_0_l" tabindex="4" value="Change Password" /></label></td></tr>
	                        </tbody>
	                    </table>
	                 </sf:form>        
                </div>
            </div> <!-- end of anucana_main -->
        <div id="emptyPad" > </div>
        <div id="anucana_footer" >
            <a href="${contentsBaseURL}/index.html" class="current">Home</a> | <a href="${contentsBaseURL}/aboutus.html">About Us</a> | <a href="${contentsBaseURL}/services.html">Services</a> | <a href="${contentsBaseURL}/gallery.html">Gallery</a> | <a href="${contentsBaseURL}/contactus.html">Contact Us</a><br /><br />
            Copyright © 2048 <a href="#">Your Company Name</a> | Designed by <a href="http://www.anucana.com" target="_parent">Anucana Designers</a>
        </div>
    </div> <!-- end of anucana_wrapper -->
</body>
</html>
