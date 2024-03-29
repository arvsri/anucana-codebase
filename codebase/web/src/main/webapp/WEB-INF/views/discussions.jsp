<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | discussion</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body id="contactUs_page">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
          <div id="anucana_main">
    		   <h2>Discussion</h2>
               <p class="description">Here, you will be redirected to our discussion forum app .... stay tuned .. coming very soon. (.. todo .. )</p>
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
   
   <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
   <script type="text/javascript">
		$(document).ready(function(){
			$('#discuss_link').addClass('active');
		}
	</script>
</body>
</html>


