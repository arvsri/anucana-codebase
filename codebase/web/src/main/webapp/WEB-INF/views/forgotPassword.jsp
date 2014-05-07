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
    <!--Block 4 - This block holds Forgot Password form and error blocks -->
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper">
                <div style="margin:28px auto;">
                	<div id="anucana_forgotPwd">
                        <h3>Changing your password is simple</h3>
                        <p class="description">Please enter your email address to get instructions.</p>
						<sf:form action="${pageContext.request.contextPath}/forgotPassword" method="post" modelAttribute="forgotPasswordUserLogin" >
							<table>
								<tbody>
									<tr>
										<td><sf:input path="userId" id="forgotpwd_email" placeholder="Email address" /></td>
										<td><div class="inlineError"><sf:errors path="userId" /></div></td>
									</tr>
									<tr>
										<td><input type="submit" class="button grey_button" id="forgotpwd_cont" tabindex="4" value="Continue" /></td>
									</tr>
								</tbody>
							</table>
						</sf:form>
                    </div>
                </div>
            </div> <!-- end of grey_wrapper -->
        </div> <!-- end of anucana_main -->
        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" style="height:160px" > </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
	</div> <!-- end of anucana_outer_wrapper -->


<script type='text/javascript' src='static/js/logging.js'></script>
  <!-- jQuery -->
  <script src="static/js/jquery1.9.1.min.js"></script>
  <!-- txReplaceFormPassword script -->
  <script type="text/javascript" src="static/js/txReplaceFormPassword.js"></script>
  <script type="text/javascript">
	$(window).load(function() {
        // this block displays the pageErrorBlock and highlights login feilds in case of page level error.
        if($('.pageErrorBlock h4').html().length > 0) {
            $(".pageErrorBlock").css('display','block');
            $('#forgotpwd_email').addClass( "errorInputbox" );

        }
        // this function highlights the input boxes with errors
        $('.inlineError').each(function(i) {
            if ($(this).html().length > 0) {
                $(this).closest("tr").find("input").addClass( "errorInputbox" );
            }
        });
	});
  </script>
</body>
</html>
