<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="anucana" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | event</title>
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
</head>
<body>	
	<div id="anucana_outer_wrapper">
		<%@ include file="fragments/headerContent.jsp" %>
		<%@ include file="fragments/sideButtons.jsp" %>

		<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper" class="greyLinen_background">
            
				<form action="${pageContext.request.contextPath}/booking/managed/bookEvent" method="get">
					<input type="hidden" value="${event.eventId}" name="eventId" />
					<input type="submit" style="margin-top:7px;" class="blueButton smallButton" value="Book my seat"/>
				</form>

                <div style="margin-top:10px;">
                  <div id="container" style="overflow: hidden; position: relative;">
                      <div class="darkShadeOverlay roundedTopCorners" style="height:250px;">
                      </div>
                      <div class="darkShadeOverlay roundedBottomCorners" style="height:50px;margin-top:5px;">
						  <div style="padding-left: 440px;">
						  	<!-- 
							<form action="${pageContext.request.contextPath}/booking/managed/bookEvent" method="get">
								<input type="hidden" value="${event.eventId}" name="eventId" />
								<input type="submit" style="margin-top:7px;" class="blueButton smallButton" value="Book my seat"/>
							</form>
							 -->
						  </div>
                      </div>
                      <div id="profileBannerBox" class="communityFontsize col4">
                        <table style="width:100%">
                          <tr>
                            <td style="padding:10px;width:30%">
                              <div id="eventPicBlock">
                                <img id="eventPic" class="eventPicImage" src="${event.bannerUrl}" />
                              </div> 
                            </td>
                            <td style="position:relative;">
                              <div style="position:absolute; top:10px;">
                                <table id="eventDetailsTable">
                                  <tr style="padding:10px 0px 10px 65px;">
                                    <td colspan="2">
                                      <div id="eventName">
                                          <h3><b>${event.name}</b></h3>
                                      </div>
                                    </td>
                                  </tr>
                                  <tr>
                                    <td>
                                      <div id="eventDate">
                                          <i class="fa fa-calendar" style="width:20px;"></i> : ${event.eventDateBreakup.month} ${event.eventDateBreakup.date}, ${event.eventDateBreakup.year}
                                      </div>
                                    </td>
                                  </tr>
                                  <tr>
                                    <td>
                                      <div id="eventTime">
                                          <i class="fa fa-clock-o" style="width:20px;"></i> : ${event.eventDateBreakup.hour}.${event.eventDateBreakup.minute} ${event.eventDateBreakup.amOrPm} (${event.durationInMinutes} mins)
                                      </div>
                                    </td>
                                  </tr>
								  <tr>
                                    <td>
                                      <div id="eventSpeaker">
                                          <i class="fa fa-microphone" style="width:20px;"></i> : ${event.speakerName}
                                      </div>
                                    </td>
                                  </tr>
								  <tr>
                                    <td>
                                      <div id="eventVenue">
									  <table><tr><td style="padding:5px 0; vertical-align:top;"><i class="fa fa-map-marker" style="width:20px;"></i></td>
									  <td style="padding: 0px;"> : ${event.addressLine1}, ${event.addressLine2}  
									  	<c:if test="${not empty fn:trim(event.addressLine1)}">
											 , Pincode - ${event.pinCode}
									  	</c:if>
									  </td></tr></table>
                                           
                                      </div>
                                    </td>
                                  </tr>
                                </table>
                              </div>                              
                            </td>
                          </tr>
                        </table>
                      </div>
					  
					  <div id="eventSummary" class="roundedCorners" style="color: black;background-color:white; margin-top:10px; padding:10px; font-size:15px; line-height:21px; "><h4 style="color:#008fcc;"><b>About Event</b></h4>
					  	<spring:escapeBody javaScriptEscape='true'>${event.longDesc}</spring:escapeBody>
					  </div>

					  <c:if test="${not empty fn:trim(event.lattitude) && not empty fn:trim(event.longitude)}">
					  <div id="mapLocator" class="roundedCorners" style="color: black;background-color:white; margin-top:10px; padding:10px; font-size:15px; line-height:21px; "><h4 style="color:#008fcc;"><b>Locate Venue</b></h4>
					  <div style="margin : 20px 0px;" id="map-canvas"></div>
					  </div>
					  </c:if>
                  </div>


            </div> <!-- end of grey_wrapper -->

        </div> <!-- end of anucana_main -->
	    <div id="emptyPad"></div>
	    	<%@ include file="fragments/footerContent.jsp" %>
	    </div>
    </div>
    </div>
    <c:if test="${not empty fn:trim(event.lattitude) && not empty fn:trim(event.longitude)}">
    <script src="https://maps.googleapis.com/maps/api/js"></script>
    <script>
      function initialize() {
        var mapCanvas = document.getElementById('map-canvas');
		var myLatlng = new google.maps.LatLng(${event.lattitude}, ${event.longitude});

        var mapOptions = {
          center: myLatlng,
          zoom: 15,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        var map = new google.maps.Map(mapCanvas, mapOptions)
		
		var marker = new google.maps.Marker({
		  position: myLatlng,
		  map: map,
		  title: '${event.addressLine1}, ${event.addressLine2}'
		});

      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
    </c:if>

  <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/anucana-util.js" type="text/javascript"></script>
  
</body>
</html>
