<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | events</title>

	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="/web/static/css/flexslider.css" type="text/css" media="screen" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<link rel="stylesheet" href="/web/static/css/colorbox.css" />
	<link href="${contentsBaseURL}/fancyfields/fancyfields.css" rel="stylesheet" type="text/css" />

</head>
<body id="events_page">

  	<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

    <!--Block 4 - This block holds login form and error blocks -->
    <div id="anucana_wrapper" class="wrapper_1020">
            <div id="anucana_main" >
                <div id="grey_wrapper" class="greyLinen_background" >
                    <div>
                        <div id="dropDownBar" class="darkShadeOverlay">
                        	<form action="" method="post" id="eventSearchForm">
	                          <table width="100%">
	                            <tr>
	                              <td width="70%">
	                                <select name="communityId" tabindex="1" class="formSubmitSelect">
	                                     <option value="0">
	                   						<c:out value="All Communities"></c:out>
	                                     </option>
	                                     <c:forEach items="${communities}" var="community">
		                                      <option value="${community.communityId}"
	                                                <c:if test="${eventSearch.communityId eq community.communityId}">
	                                                  selected
	                                                </c:if>
	                                           >      
		                    						<c:out value="${community.name}"></c:out>
		                                      </option>
	                                     </c:forEach>
	                                </select>
	                              </td>
	                              <td>
	                                <select name="pincode" tabindex="2" class="formSubmitSelect">
	                                    <option value="0">
	                  						<c:out value="All Locations"></c:out>
	                                    </option>
	                                    <c:forEach items="${addresses}" var="address">
	                                      <option value="${address.postalCode}"
                                                <c:if test="${eventSearch.pincode eq address.postalCode}">
                                                  selected
                                                </c:if>
                                           >     
	                    						<c:out value="${address.district}"></c:out>
	                                      </option>
	                                    </c:forEach>
	                                </select>
	                              </td>
	                              <td>
	                                <select name="timeFilter" tabindex="3" class="formSubmitSelect">                         
	                                  <option value="WEEK" <c:if test='${eventSearch.timeFilter eq "WEEK"}'>selected</c:if>>Weekly</option> 
	                                  <option value="MONTH" <c:if test='${eventSearch.timeFilter eq "MONTH"}'>selected</c:if> >Monthly</option> 
	                                  <option value="YEAR" <c:if test='${eventSearch.timeFilter eq "YEAR"}'>selected</c:if>>Yearly</option>
	                                </select>
	                              </td>
	                            </tr>
	                          </table>
	                          
	                          <!-- Build the load time json object for initial rendering  -->
	                          <script type="text/javascript">
		  	                	/**************************************************************** Events description variable ******************************************/
		  	                	/***************************************************************************************************************************************/
	                           var responseObject = {"events":[
	                        	   <c:forEach items="${events}" var="event" varStatus="loop">
	                        	   		<c:if test="${loop.index != 0}"><c:out value=","></c:out></c:if>	                        	   
		                        		{"eventId":"${event.eventId}",
		                        		"bannerUrl":"${event.bannerUrl}",
		                        		"eventDate":"${event.eventDate}",
		                        		"durationInMinutes":"${event.durationInMinutes}",
		                        		"eventDateBreakup":{"date":"${event.eventDateBreakup.date}","month":"${event.eventDateBreakup.month}",
		                        							"year":"${event.eventDateBreakup.year}","hour":"${event.eventDateBreakup.hour}",
		                        							"minute":"${event.eventDateBreakup.minute}"},
		                        		"name":"${event.name}",
		                        		"phone":"${event.phone}",
		                        		"importanceIndex":"${event.importanceIndex}",
		                        		"shortDesc":"${event.shortDesc}",
		                        		"longDesc":"${event.longDesc}",
		                        		"pinCode":"${event.pinCode}",
		                        		"pincodeId":"${event.pincodeId}",
		                        		"addressLine1":"${event.addressLine1}",
		                        		"addressLine2":"${event.addressLine2}",
		                        		"communityId":"${event.communityId}",
		                        		"speakerId":"${event.speakerId}",
		                        		"speakerName":"${event.speakerName}",
		                        		"capacity":"${event.capacity}",
		                        		"costInINR":"${event.costInINR}",
		                        		"statusCd":"${event.statusCd}"}
	                        		</c:forEach>
	                        	],
	                        	"nextPage":${nextPage}
	                        	}	                          
	                          
	                          </script>
	                        </form>     
                        </div>
                        
                       <c:if test="${empty events}">
                       		<div style="margin-top:40px;margin-left:20px; overflow: hidden;" >
                       			<p class="description">Sorry!, We could not find any event for the search conditions. Please try changing the community / address or time frame.</p>
                       		</div>
                       </c:if> 
                      <div id="container" style="margin-top:20px;overflow: hidden;" class="masonry"></div>
                      <div id="lightBoxesContainer"></div>
                    </div>
  
                </div> <!-- end of grey_wrapper -->
                <c:if test="${nextPage}">
	                <span class="centered">
	                    <button type="button" id="more" class="blueButton bigButton">Load more events</button>
	                </span>
                </c:if>
            </div> <!-- end of anucana_main -->
        <div id="emptyPad" > </div>
	    <%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
  </div> <!-- end of outer wrapper -->

  <!-- jQuery -->
  <script src="/web/static/js/jquery1.9.1.min.js"></script>
  <script src="/web/static/js/jquery-ui.js"></script>
  <script src="/web/static/js/masonry.pkgd.js"></script>
  <script src="/web/static/js/imagesloaded.pkgd.js"></script>
  <script src="/web/static/js/jquery.colorbox.js"></script>
    <!-- Fancy fields js & css files -->
  <script src="${contentsBaseURL}/fancyfields/fancyfields-1.2.min.js" type="text/javascript"></script>
  <!-- Fancy fields add-on for custom scroll bar -->
  <script src="${contentsBaseURL}/fancyfields/fancyfields.csb.min.js" type="text/javascript"></script>
  <script type='text/javascript' src='${contentsBaseURL}/js/anucana-util.js'></script>  

  <script type="text/javascript">
  	
  	var eventSearchAPI = "${pageContext.request.contextPath}/event/unmanaged/search";	
 
  	$(document).ready(function(){
    
      	$('#dropDownBar').fancyfields();
      	$('#events_link').addClass('active');
      	
      	$(".ffSelectMenuMid > ul > li ").on("click",function(){
      		// dirty fix but it will work provided this time is more than $.slideUp() time
      	  	setTimeout(function() {$("#eventSearchForm").submit();}, 500);      		
      	});

      	// this function makes the top 'Hello member' menu to slide down.
      	$('#anucana_outer_wrapper').on("click", "#flip", function() {
        	if(! $("#panel").is(":visible")){
            	$("#panel").slideDown("fast");
              	$( "#member_arrow" ).attr( "src", "img/up_arrow_grey6.png" );
              	$("#panel").focus();
          	}
      	});

      	// slide up the 'Hello member' menu, if user clicks anywhere else on the page.
      	$('#anucana_outer_wrapper').on("blur", "#panel", function() {
          	$("#panel").slideUp("fast");
          	$( "#member_arrow" ).attr( "src", "img/down_arrow_grey6.png" );
     	});
      
        // Global variable to count the number of dynamic boxes loaded on this page so far
      	var dynamicBoxesLoaded = 0;
        var pageNumber = 1;
      	var $container = $('.masonry');
      	appendMasonryElements(responseObject);
      	
      	$('#more').click(function(){
      		var $more = $(this);
      		var submitData = $("#eventSearchForm").serialize() + "&pageNumber=" + ++pageNumber;
        	$.ajax({
    			type: "get",
            	url: eventSearchAPI,
				data: submitData,
            	dataType: "json",          
            	success: function(response){
            		appendMasonryElements(response);
            		if(!response.nextPage){
            			$more.css("display","none");
            		}else{
            			var $PageNumber = $('#pageNumber');
            			$PageNumber.val(+$PageNumber.val() + 1);            			
            		}
            	}
        	});
      	});

        // This method appends newly generated masonry boxes to the masonry container
        function appendMasonryElements(responseObject){
        	var responseJSON = responseObject.events;
        	var lastLoadedCount = dynamicBoxesLoaded;
        	var boxList = $();
	    	$.each(responseJSON, function(i, eventData) {
        		var boxElement = getEventBox(i + lastLoadedCount, eventData);
            	var lightBoxElement = getEventLightBox(i + lastLoadedCount, eventData);
            	boxList = boxList.add($(boxElement));
            	$('#lightBoxesContainer').append(lightBoxElement);
            	dynamicBoxesLoaded++;
          	});

          	$container = $container.append( boxList );
          	
	        $('.masonry').imagesLoaded( function() {
            	// images have loaded
    	        $container.masonry( 'appended', boxList ).masonry({
            	      itemSelector: '.box',
                	  columnWidth: 100,
                  	  isAnimated: true,
                  	  gutter:20
                });
          	});

	        // Apply colorBox styling to all generated masonry boxes, to support lightbox display on click.
	        $(".inline").colorbox({inline:true, width:"50%", initialWidth: 100, initialHeight: 50});
        }

      });
  </script>
</body>
</html>
