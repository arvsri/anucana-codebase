<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | registration</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
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
           <div id="anucana_registration" style="float:center; ">
		   <div>
	            <sf:form action="registerNewUser" method="post" modelAttribute="userLogin" >
	                <table border="0" style="" cellpadding="10">
	                    <tbody>
							<tr>
								<td colspan="2"></td>
								<td colspan="4">
									<h2>Get Started - It's free.</h2>
									<p class="description">Registration takes less than 2 minutes.</p>
								</td>
							</tr>
	                        <tr>
								<td width="50%" class="errMsgTD">
									<div class="inlineError" >
									   <sf:errors path="firstName" cssClass="inlineError" />
									</div>
								</td>
								<td class="inlineError redCrossTD" align="right"><i class="fa fa-times-circle hidden"></i></td>
	                            <td><sf:input path="firstName" id="firstname" placeholder="First name" /></td>
	                            <td style="padding-left:11px;"><sf:input path="lastName" id="lastname" placeholder="Last name" /></td>
								<td class="inlineError redCrossTD"><i class="fa fa-times-circle hidden"></i></td>
								<td style="width:65%;" class="errMsgTD">
									<div class="inlineError"
										<sf:errors path="lastName" cssClass="inlineError" />
									</div>
								</td>
	                        </tr>
	                        <tr>
								<td colspan="2"></td>
								<td colspan="2"><sf:input path="username" id="reg_email" placeholder="Email Address" /></td>
								<td class="inlineError redCrossTD"><i class="fa fa-times-circle hidden"></i></td>
								<td class="errMsgTD">
									<div class="inlineError">
									   <sf:errors htmlEscape="false" path="username"/>
									</div>
								</td>
	                        </tr>
                        	<tr>
								<td colspan="2"></td>
                        		<td colspan="2"><sf:password path="password" id="reg_pass" placeholder="Password (6 or more characters)" /></td>
								<td class="inlineError redCrossTD"><i class="fa fa-times-circle hidden"></i></td>
								<td class="errMsgTD">
									<div class="inlineError" >
									   <sf:errors htmlEscape="false" path="password"/>
									</div>
								</td>
                        	</tr>
                        	<tr>
								<td colspan="2"></td>
                        		<td colspan="2"><sf:password path="passwordVerify" id="reg_pass_verify" placeholder="Password Repeat" /></td>
								<td class="inlineError redCrossTD"><i class="fa fa-times-circle hidden"></i></td>
								<td class="errMsgTD">
									<div class="inlineError">
									   <sf:errors path="passwordVerify"/>
									</div>
								</td>
                        	</tr>
	                        <tr>
								<td colspan="2"></td>
	                        	<td colspan="3"><input id="signup_submit" type="submit" value="Join Now" /></td>
								<td></td>
	                        </tr>
							<tr>
							<td colspan="6" align="center">
								<p id="reg_policy" >By joining anucana, you agree to anucana's
									<a href="${pageContext.request.contextPath}/unmanaged/useragreement">User Agreement</a>
									,
									<a href="${pageContext.request.contextPath}/unmanaged/privacypolicy">Privacy Policy</a>
									and
									<a href="${pageContext.request.contextPath}/unmanaged/cookiepolicy">Cookie Policy</a>
									.
								</p>
							</td>
							</tr>
	                    </tbody>
	                </table>
                </sf:form>
                
				</div>
            </div>
       	</div>
      </div> <!-- end of main -->
    <div id="emptyPad" > </div>
	<%@ include file="fragments/footerContent.jsp" %>
</div> 


  <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery.textarea.autoresize.js"></script>



  <script type="text/javascript">
	$(document).ready(function() {
		// helper tool tip
        $( ".tooltip" ).tooltip({
            tooltipClass: "custom-tooltip-styling",
            show: null,
            position: {
        	    my: "center top",
    	        at: "center+50 bottom"
            },
            open: function( event, ui ) {
	            ui.tooltip.animate({ top: ui.tooltip.position().top + 10 }, "fast" );
            },
            content: function() {
              return $(this).attr('title');
            }
        });
		
		$( ".errMsgTD div" ).each(function( index ) {
				var errText = $(this).html().trim();//siblings( ".selected" ).
				if(errText != ""){
					$( ".errMsgTD" ).siblings( ".redCrossTD" ).children("i").css("display","block");
				}
		});
		

	});

  </script>




</body>
</html>
