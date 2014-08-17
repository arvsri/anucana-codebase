<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | page not found</title>
	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
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
  
  <script src="/web/static/js/jquery1.9.1.min.js"></script>
  <script src="/web/static/js/jquery-ui.js"></script>
  <script src="/web/static/js/masonry.pkgd.js"></script>
  <script src="/web/static/js/imagesloaded.pkgd.js"></script>
  <script src="/web/static/js/jquery.flexslider.js"></script>
  <script src="/web/static/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="/web/static/js/jquery.colorbox.js"></script>
  <script src="/web/static/js/jquery.textarea.autoresize.js"></script>
  
   <script type="text/javascript">
	$(document).ready(function() {
		
		$.getJSON("${pageContext.request.contextPath}/util/unmanaged/pincode/122001",function(jsonData){
			console.log(jsonData);
		});
		
		$.getJSON("${pageContext.request.contextPath}/community/unmanaged/listAll",function(jsonData){
			console.log(jsonData);
		});
		
		$.getJSON("${pageContext.request.contextPath}/event/unmanaged/addresses",function(jsonData){
			console.log(jsonData);
		});

		$.getJSON("${pageContext.request.contextPath}/event/unmanaged/1",function(jsonData){
			console.log(jsonData);
		});

		$.getJSON("${pageContext.request.contextPath}/event/unmanaged/search?communityId=1&pincode=122001&timeFilter=MONTH&pageNumber=1",function(jsonData){
			console.log(jsonData);
		});
		$.getJSON("${pageContext.request.contextPath}/event/unmanaged/search?communityId=1&pincode=122001&timeFilter=MONTH&pageNumber=2",function(jsonData){
			console.log(jsonData);
		});

		// Community search : http://localhost:8080/web/community/unmanaged/search 
		// Community readonly page : http://localhost:8080/web/community/unmanaged/1
		
		
      });
	</script>
</body>
</html>
