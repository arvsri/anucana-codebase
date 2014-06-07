<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
          <div id="anucana_main" style="height:300px;">
          	<div id="grey_wrapper">
                  <div style="margin-left:308px;">
                   <h3 style="margin-top:40px;margin-bottom:40px;">Set your password</h3>
					<sf:form action="login/resetPassword" method="post" modelAttribute="userLogin">                        
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
                            	<td><sf:hidden path="userId"></sf:hidden></td>
                            </tr>
                            <tr>
                            	<td><sf:hidden path="secretKey"></sf:hidden></td>
                            </tr>
                            
                            <tr>
                            	<td ><input type="submit" class="button grey_button" id="logIn_submit" tabindex="4" value="Save" /></td>
	                            </tr>
	                    </table>
	                 </sf:form>        
                  </div>
              </div> <!-- end of grey_wrapper -->
          </div> <!-- end of anucana_main -->
        <div id="emptyPad" > </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
</body>
</html>
