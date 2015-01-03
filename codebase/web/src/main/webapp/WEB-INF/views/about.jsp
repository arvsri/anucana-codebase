<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | about us</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body id="contactUs_page">
	<%@ include file="fragments/headerContent.jsp"%>
	<%@ include file="fragments/sideButtons.jsp"%>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
			<div id="anucana_main">
				<div id="grey_wrapper" class="greyLinen_background">

					<div id="about_us_accordion">
						<div>
							<h3><a href="#"><b>anucana - what it is ?</b></a></h3>
							<div id="anucana_what_it_is">
								<i>
									<b>anucana</b>, in essence, is an enabling platform for knowledge communities. 
									<br>It provides a virtual as well as a physical podium to all the professionals, educationalists and hobbyist who wish to share their knowlegde and experience with like minded people</br>
									<br>Blogs, discussion forums and online social networking facilities consititue the virtual platform which is managed and moderated by <b>anucana</b> free of cost ( you read it right, its absolutely free !). As a physical platform, <b>anucana's</b> endeavour is to give a stage, a microphone and interested audiences to anybody who wants to speak and share knowledge and experience.</br>
								</i>
							</div>
						</div>
						
						<div>
							<h3><a href="#"><b>vision and values</b></a></h3>
							<div id="vision_mission_values">
								<i>
									<b>Our vision</b> is to bring in a systematic change in the the way knowledge is shared and managed in india.</br>
									<br><b>Our values</b>, which is the sole basis of all our decisions and actions, are  </br>
									<ul>
										<li><b>Integrity</b> - zero tolerance to corrupt practices ( direct or indirect). No withholding of information</li>
										<li><b>Collaboration</b> - all decisions are to be made collectively. Once made, everybody must think - work - talk in unison.</li>
										<li><b>Excellence</b> - world class quality</li>
										<li><b>Relentlessness</b> -  never ever give up</li>
									</ul>
								</i>
							
							</div>
						</div>
						
						<div>
							<h3><a href="#"><b>anucana - what it isn't ?</b></a></h3>
							<div id="anucana_what_it_is_not">
								<i>
									<b>anucana</b> is not a training institute. We don't have trainers and curriculums, instead we have speakers and knowledge sharing events. 
								</i>
							</div>
						</div>
					</div>
				</div>
				<!-- end of grey_wrapper -->
			</div>
			<!-- end of anucana_main -->
		</div>
		<div id="emptyPad"></div>
		<%@ include file="fragments/footerContent.jsp"%>
	</div>
	<!-- end of anucana_wrapper -->


	<script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>

	<script type="text/javascript">
		$(function() {
			var $acc = $("#about_us_accordion > div").accordion(
					{
						header : "> h3",
						collapsible : true,
						active : false,
						heightStyle : "content"
					});
			$("#about_us_accordion > div:first-child").accordion('option','active', 0);
		})();
	</script>
</body>
</html>


