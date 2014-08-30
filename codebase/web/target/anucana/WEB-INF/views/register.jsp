<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | registration</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<style type="text/css">
		#anucana_registration{
			float: none;
			margin: auto;
		}
		.inlineError {color:#FF614D;padding:0px;}	
	</style>
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
    <!--Block 4 - This block holds login form and error blocks -->
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
           <div id="anucana_registration">
                <h2>Get Started - It's free.</h2>
                <p class="description">Registration takes less than 2 minutes.</p>
	            <sf:form action="registerNewUser" method="post" modelAttribute="userLogin">
	                <table>
	                    <tbody>
	                        <tr>
	                            <td><sf:input path="firstName" id="firstname" placeholder="First name" /></td>
	                            <td style="padding-left:11px;"><sf:input path="lastName" id="lastname" placeholder="Last name" /></td>
	                        </tr>
	                        <tr>
	                            <td><sf:errors path="firstName" cssClass="inlineError" /></td><td style="padding-left:11px;"><sf:errors path="lastName" cssClass="inlineError" /></td>
	                        </tr>
	                        <tr>
	                        	<td colspan="2"><sf:input path="username" id="reg_email" placeholder="Email Address" /></td>
	                        </tr>
	                        <tr>
	                        	<td colspan="2"><sf:errors htmlEscape="false" element="div" path="username" cssClass="inlineError"/></td>
	                        </tr>
                        	<tr>
                        		<td colspan="2"><sf:password path="password" id="reg_pass" placeholder="Password (6 or more characters)" /></td>
                        	</tr>
	                        <tr>
	                        	<td colspan="2"><sf:errors path="password" cssClass="inlineError"/></td>
	                        </tr>
                        	<tr>
                        		<td colspan="2"><sf:password path="passwordVerify" id="reg_pass_verify" placeholder="Password Repeat" /></td>
                        	</tr>
	                        <tr>
	                        	<td colspan="2"><sf:errors path="passwordVerify" cssClass="inlineError"/></td>
	                        </tr>
	                        <tr>
	                        	<td colspan="2"><input id="signup_submit" type="submit" value="Join Now" /></td>
	                        </tr>
	                    </tbody>
	                </table>
                </sf:form>
                <p id="reg_policy" >By joining anucana, you agree to anucana's
                    <a href="${pageContext.request.contextPath}/unmanaged/useragreement">User Agreement</a>
                    ,
                    <a href="${pageContext.request.contextPath}/unmanaged/privacypolicy">Privacy Policy</a>
                    and
                    <a href="${pageContext.request.contextPath}/unmanaged/cookiepolicy">Cookie Policy</a>
                    .
                </p>
            </div>
       	</div>
      </div> <!-- end of main -->
    <div id="emptyPad" > </div>
	<%@ include file="fragments/footerContent.jsp" %>
</div> 
</body>
</html>
