<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana</title>
	<link href="static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="static/images/icons/favicon.ico" />
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerLinkStripe.jsp" %>
	<%@ include file="fragments/sideButtonsGuest.jsp" %>
          <div id="anucana_main" style="height:300px;">
          	<div id="grey_wrapper">
                  <div style="margin-left:308px;">
                   <h3 style="margin-top:40px;margin-bottom:40px;">Login to anucana</h3>
				<sf:form action="${pageContext.request.contextPath}/loginExistingUser" method="post" modelAttribute="existingUserLogin">                        
  	                       <table width="100%"> 
                              <col width="10%">
                              <col width="40%">                 
                              <col width="50%">
                                  <tr>
                                      <td colspan="2"><sf:input path="userId" id="login_email" cssClass="bigInputBox" placeholder="Email address" /></td>
                                      <td><div class="inlineError"><sf:errors path="userId"/></div></td>
                                  </tr>
                                  <tr>
                                      <td colspan="2"><sf:password path="password" id="login_pass" cssClass="bigInputBox" placeholder="Password (6 or more characters)" /></td>
                                      <td><div class="inlineError"><sf:errors path="password"/></div></td>
                                  </tr>
                                  <tr>
                                      <td><input type="submit" class="button grey_button" id="logIn_submit" tabindex="4" value="Log In"></td>
                                      <td style="padding:10px"><a href="${pageContext.request.contextPath}/forgotPassword">Forgot Password?</a></td>
                                      <td></td>
                                  </tr>    
                                  <tr>
                                      <td>New to Anucana?</td>
                                      <td style="padding:10px"><a href="${pageContext.request.contextPath}/registerNewUser">Sign up now » </a></td>
                                      <td></td>
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
