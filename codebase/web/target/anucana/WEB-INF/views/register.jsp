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
    <!--Block 4 - This block holds login form and error blocks -->
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main" style="height:600px;">
           <div style="width:500px; margin:28px auto;">
                <h2>Get Started - It's free.</h2>
                <p class="description">Registration takes less than 2 minutes.</p>
	            <sf:form action="registerNewUser" method="post" modelAttribute="userLogin">
	                <table>
	                    <tbody>
	                        <tr>
	                            <td><sf:errors path="firstName"/></td><td style="padding-left:11px;"><sf:errors path="lastName" /></td>
	                        </tr>
	                        <tr>
	                            <td><sf:input path="firstName" id="firstname" placeholder="First name" /></td>
	                            <td style="padding-left:11px;"><sf:input path="lastName" id="lastname" placeholder="Last name" /></td>
	                        </tr>
	                        <tr><td colspan="2"><sf:errors path="username" /></td></tr>
	                        <tr><td colspan="2"><sf:input path="username" id="reg_email" placeholder="Email Address" /></td></tr>
	                        <tr><td colspan="2"><sf:errors path="password" /></td></tr>
                        	<tr><td colspan="2"><sf:password path="password" id="reg_pass" placeholder="Password (6 or more characters)" /></td></tr>
	                        <tr><td colspan="2"><input id="signup_submit" type="submit" value="Join Now" /></td></tr>
	                    </tbody>
	                </table>
                <div>
                </sf:form>
                <p id="reg_policy" >By joining anucana, you agree to anucana's
                    <a href="http://www.anucana.com">User Agreement</a>
                    ,
                    <a href="http://www.anucana.com">Privacy Policy</a>
                    and
                    <a href="http://www.anucana.com">Cookie Policy</a>
                    .
                </p>
                </div>
           	</div>
        </div> <!-- end of main -->
        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" style="height:85px" > </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
</body>
</html>

<%
	String str = "<br>";
	java.util.Enumeration enumeration = request.getAttributeNames();
	while(enumeration.hasMoreElements()){ 
		String attrName =  enumeration.nextElement().toString();
	%>	
		<%=str %><%=str %>
		<%=attrName %>
		<%=str %>
		<%=request.getAttribute(attrName) %>
	
	<%}%>

