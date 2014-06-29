<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="anucana" tagdir="/WEB-INF/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | change password</title>
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
        <div id="anucana_main">
            <div id="grey_wrapper">

                <div style="margin:28px auto;">
                
                	<div id="anucana_forgotPwd">
                        <h3>Changing your password is simple</h3>
                        <p class="description">Please enter your new password.</p>
                        
						<c:if test="${success}">
	                    	<p style="color: olive;">Your password is updated successfully.</p>
						</c:if>                        
                        
						<sf:form action="login/managed/updatePassword" method="post" modelAttribute="userLogin">                        
		                    <table>
	                            <tr>
	                            	<td colspan="2"><sf:password path="password" id="login_pass" cssClass="bigInputBox" placeholder="New Password (6 or more characters)" /></td>
	                            </tr>
	                            <tr>
	                            	<td colspan="2"><sf:errors cssClass="inlineError" path="password"/></td>
	                            </tr>
	                            <tr>
	                            	<td colspan="2">
	                            		<sf:password path="passwordVerify" id="login_pass" cssClass="bigInputBox" placeholder="Re-enter your new password" /></td>
	                            	</tr>
	                            <tr>
	                            	<td colspan="2"><sf:errors cssClass="inlineError" path="passwordVerify" /></td>
	                            </tr>
	                            <tr>
	                            	<td ><input type="submit" class="button grey_button" id="logIn_submit" tabindex="4" value="Save" /></td>
		                            </tr>
		                    </table>
		                 </sf:form>        
                    </div>
                </div>
            </div> <!-- end of grey_wrapper -->
	        </div> <!-- end of anucana_main -->	
        <div id="emptyPad" > </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
</body>
</html>
<<anucana:dump-variables></anucana:dump-variables>
