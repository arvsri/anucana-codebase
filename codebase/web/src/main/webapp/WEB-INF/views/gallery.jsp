<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | gallery</title>
	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="/web/static/css/flexslider.css" type="text/css" media="screen" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico">
	<link rel="stylesheet" type="text/css" href="/web/static/css/style.css" />
	<link rel="stylesheet" href="/web/static/css/colorbox.css" />
</head>
<body id="contactUs_page">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
	    <div id="anucana_wrapper" class="wrapper_1020" style="margin-top:8px;">
            <div id="anucana_main" >
	            <div id="grey_wrapper" style="padding-top:0px;" class="greyLinen_background">
                    <div>
                      <div id="container" style="overflow: hidden;" class="masonry"></div>
                      <div id="lightBoxesContainer"></div>
                    </div>
	            </div>    
                <span class="centered">
                    <button type="button" id="more" class="blueButton bigButton">Load more albums</button>
                </span>            
            </div> <!-- end of anucana_main -->
	        <div id="emptyPad" > </div>
			<%@ include file="fragments/footerContent.jsp" %>
		</div> <!-- end of anucana_wrapper -->
    </div> <!-- end of anucana_outer_wrapper -->
</body>
</html>
