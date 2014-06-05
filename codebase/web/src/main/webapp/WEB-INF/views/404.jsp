<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Anucana</title>
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtonsGuest.jsp" %>
    <!--Block 4 - This block holds login form and error blocks -->
	<div id="anucana_wrapper" class="wrapper_1020">
        
            <div id="anucana_main" style="height:300px;">
            	<div id="grey_wrapper">
                    <div style="margin-left:308px;">
						<h4 style="color:#FF614D"><img src="${contentsBaseURL}/images/icons/login_error_black.png" />&nbsp;&nbsp;Request Page Not Found !!</h4>
						<p class="description"><a href="${pageContext.request.contextPath}/">Click here</a> to login to return to Login Home.</p>
                    </div>
                </div> <!-- end of grey_wrapper -->
            </div> <!-- end of anucana_main -->

        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" style="height:85px" > </div>
	<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
  </div> <!-- end of outer wrapper -->
</body>
</html>
