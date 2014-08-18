<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | community</title>
	<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="/web/static/css/flexslider.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/web/static/css/colorbox.css" />	
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body class="fontBlack">
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
    <!-- This div holds Block 1 & Block 2 -->
    <div id="headerContent_Member"></div>
    <!-- This div holds Block 3 -->
    <div id="sideButtons_Member"></div> 
    <!--Block 4 - This block holds Search Community form and search results -->
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper" class="greyLinen_background">
                <div style="margin-top:10px;">
                
                <!-- page display global variables  -->
                <script type="text/javascript">

                	/**************************************************************** Community page banner variable ******************************************/
                	/******************************************************************************************************************************************/
          			var communityBannerString =
	                    '<div class="darkShadeOverlay roundedTopCorners" style="height:200px;">'+
	                    '</div>'+
	                    '<div class="darkShadeOverlay roundedBottomCorners" style="height:50px;margin-top:5px;">'+
	                    '</div>'+
	                    '<div id="communityBannerBox" class="masonryBox communityFontsize col4">'+
	                      '<table   style="width:100%">'+
	                        '<tr>'+
	                          '<td style="padding : 30px;width:30%">'+
	                            '<div id="communityBanner" class="col3">'+
	                              '<img class="communityBannerPhoto" src="${community.bannerUrl}">'+
	                              '<div class="border joinCircle_CP">'+
	                                '<div class="circleFiller">'+
	                                  '<span class="joinTextStyle"> Join </span>'+
	                                '</div>'+
	                              '</div>'+
	                            '</div> '+
	                          '</td>'+
	                          '<td style="padding : 0px 0px 0px 0px;">'+
	                            '<table style="width:100%;height:100%;">'+
	                              "<tr>"+
	                                '<td style="padding:40px 0px 60px 65px;">'+
	                                  '<div id="communityNameBox">'+
	                                      '<span id="communityName">${community.name}</span>'+
	                                  '</div>'+
	                                '</td>'+
	                              '</tr>'+
	                              '<tr>'+
	                                '<td  style="padding : 10px 30px 0px 0px;">'+
	                                  '<div id="communityLinks">'+
	                                    '<div id="anucana_menu">'+
	                                      '<ul>'+
	                                          '<li><a class="current" id="homeLink">Home</a></li>'+
	                                          '<li><a id="membersLink">Members</a></li>'+
	                                          '<li><a href="${pageContext.request.contextPath}/event/unmanaged/home?communityId=${community.communityId}">Events</a></li>'+
	                                      '</ul>'       +
	                                    '</div>' +
	                                  '</div>'+
	                                '</td>'+
	                              '</tr>'+
	                              '<tr>'+
	                                '<td  style="padding : 10px 15px 10px 80px;">'+
	                                    '<div id="memberSearch" class="ui-widget" style="float:right;display:none;">'+
	                                      '<input id="searchMember_keyword" placeholder="Search Members">'+
	                                    '</div>'+
	                                '</td>'+
	                              '</tr>'+
	                            '</table>'+
	                          '</td>'+
	                        '</tr>'+
	                      '</table>'+
	                    '</div>';
                	
	                	/**************************************************************** Community description variable ******************************************/
	                	/******************************************************************************************************************************************/
			          	var communityDescString = 
	                    '<div id="communityDescBlock" class="masonryBox roundedCorners communityWhiteBox" style="margin:20px 0 20px 0;">'+
	                      '<div class="pad10 blueHeader14">'+
	                        '<span>About the Community</span>'+
	                      '</div>'+
	                      '<div class="triPadBottom10">'+
	                        '<div id="communityDescText">${community.about}</div>'+
	                      '</div>'+
	                    '</div>';
                	
	                	/**************************************************************** Upcoming events variable ************************************************/
	                	/******************************************************************************************************************************************/
			           var upcomingEventsString = "";
                           <c:if test="${not empty events}">
                           upcomingEventsString = upcomingEventsString + 
				        	 '<div id="upcomingEvents" class="masonryBox verticalMargin20 roundedCorners col3 communityWhiteBox">'+
			                   '<div class="pad10">'+
			                     '<span class="blueHeader14">Upcoming Events</span>'+
			                   '</div>'+
			                   
			                 <c:forEach items="${events}" var="event">
				                   '<div class="sidePad10">'+
				                     '<div class="verticalPad10 upcomingEventSeparator">'+
				                       '<table width="100%">'+
				                         '<tr>'+
				                           '<td width="10%">'+
				                             '<div class="eventCalendarIcon">'+
				                               '<div class="eventCalendarMonth">${event.eventDateBreakup.month}</div>'+
				                               '<div class="eventCalendarDay">${event.eventDateBreakup.date}</div>'+
				                             '</div>'+
				                           '</td>'+
				                           '<td width="70%">'+
				                             '<div class="upcomingEventTitle">${event.name}</div>'+
				                             '<div>${event.shortDesc}</div>'+
				                           '</td>'+
				                           '<td width="20%">'+
				                             '<div class="upcomingEventAttendButton">'+
				                             	'<a class="inline" href="#inline_content${event.eventId}"><button type="button" class="blueButton verySmallButton">Attend</button></a>' + 
				                             '</div>'+
				                           '</td>'+
				                         '</tr>'+
				                       '</table>'+
				                     '</div>'+
				                 '</div>'+
		                       </c:forEach>
				                 
			               '</div>';
                       	 </c:if>
                       	 
                         <!-- Build the event list json object for light box  -->
                          var upcomingEventsObj = {"events":[
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
		                       	]};	                          
	                       	 

		                	/**************************************************************** Community contact details variable **************************************/
		                	/******************************************************************************************************************************************/
				          	var contactUsString = 
		                    '<div id="contactInfoBlock" class="masonryBox roundedCorners col3 communityWhiteBox" style="margin:20px 0 20px 0;">'+
		                      '<div class="pad10">'+
		                        '<span class="webSymbol blueOnWhite font15">@</span>'+
		                        '<span class="blueHeader14">Get in touch</span>'+
		                      '</div>'+
		                      '<div class="sidePad10"  >'+
		                        '<table id="contactDetails">'+
		                          '<tr>'+
		                            '<td><b>Email</b></td>'+
		                            '<td><a href="#"><span id="communityEmail">${community.email}</span></a></td>'+
		                          '</tr>'+
		                          '<tr>'+
		                            '<td><b>Contact</b></td>'+
		                            '<td><span id="communityContactNum">${community.phone}</span></td>'+
		                          '</tr>'+
		                        '</table>'+
		                      '</div>'+
		                    '</div>';
                </script>
                
                  <div id="container" style="overflow: hidden;" class="masonry">
                  </div> <!-- End of masonry container -->
                  
				  <div id="lightBoxesContainer"></div>                  
                </div>
                <span id="communities_LoadMoreMembersSpan" style="display:none;">
                    <button type="button" id="moreMembers" class="blueButton bigButton">Load more members</button>
                </span> 
            </div> <!-- end of grey_wrapper -->
        </div> <!-- end of anucana_main -->
        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" style="height:130px" > </div>
        <!-- This div holds Block 6 -->
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
	</div> <!-- end of anucana_outer_wrapper -->

<script type='text/javascript' src='/web/static/js/jquery1.9.1.min.js'></script>
<script type='text/javascript' src='/web/static/js/jquery-ui.js'></script>
<script type='text/javascript' src='/web/static/js/masonry.pkgd.js'></script>
<script type='text/javascript' src='/web/static/js/imagesloaded.pkgd.js'></script>
<script type='text/javascript' defer src='/web/static/js/jquery.flexslider.js'></script>
<script type='text/javascript' src='/web/static/js/anucana-util.js'></script>
<script src="/web/static/js/jquery.colorbox.js"></script>

  <script type="text/javascript">
  
  	var subscribersListAPI = "${pageContext.request.contextPath}/community/unmanaged/${community.communityId}/subscribers";

	$(window).load(function() {
	
	var $container = $('.masonry');
        $container.empty();
        var boxList = $();
		
        // Global variable to count the number of dynamic boxes loaded on this page so far
        var dynamicBoxesLoaded = 0;
        var profileDisplayPageNumber = 1;

        boxList = appendCommunityBannerElement(boxList);
        boxList = appendCommunityHomeBoxElements(boxList);
        appendCommunityPostElements("", boxList);

        // parse the pre build json and append light box divs
    	$.each(upcomingEventsObj.events, function(i, eventData) {
           	var lightBoxElement = getEventLightBox(eventData.eventId, eventData);
           	$('#lightBoxesContainer').append(lightBoxElement);
       	});
        
        
        $('#moreMembers').click(function(){
          	var boxList = $();
          	
          	var data = "pageNumber="+profileDisplayNumber;
          	var search = $.get(subscribersListAPI,data,null,"json");

          	search.done(function(response){
	          	appendMemberElements(response.subscribers, boxList);
	          	profileDisplayPageNumber++;
	          	if(response.nextPage){
	              	$('#communities_LoadMoreMembersSpan').css("display","block");
	          	}else{
	          		$('#communities_LoadMoreMembersSpan').css("display","none");
	          	}
			});
			search.fail(function(event){
				$(".errorMsg").text(" An error ocurred while processing !");
			});
        });

        $('#membersLink').click(function(){
          	$(".masonryBox:not(#communityBannerBox)").remove();
          	$('#memberSearch').css("display","block");
          	var boxList = $();
          	
          	profileDisplayNumber = 1;
          	var data = "pageNumber="+profileDisplayNumber;
          	var search = $.get(subscribersListAPI,data,null,"json");

          	search.done(function(response){
	          	appendMemberElements(response.subscribers, boxList);
	          	profileDisplayPageNumber++;
	          	if(response.nextPage){
	              	$('#communities_LoadMoreMembersSpan').css("display","block");
	          	}else{
	          		$('#communities_LoadMoreMembersSpan').css("display","none");
	          	}
			});
			search.fail(function(event){
				$(".errorMsg").text(" An error ocurred while processing !");
			});
        });

        $('#homeLink').click(function(){
          	$(".masonryBox:not(#communityBannerBox)").remove();
          	var boxList = $();
          	boxList = appendCommunityHomeBoxElements(boxList);
          	boxList = appendCommunityPostElements("",boxList);
          	$('#communities_LoadMoreMembersSpan').css("display","none");
          	$('#memberSearch').css("display","none");
        });

        function appendCommunityHomeBoxElements(boxList){
	          boxList = boxList.add($($.parseHTML(communityDescString)));
    	      boxList = boxList.add($($.parseHTML(upcomingEventsString)));
        	  boxList = boxList.add($($.parseHTML(contactUsString)));
          	  return boxList;
        }

        function appendCommunityBannerElement(boxList){      
            boxList = boxList.add($($.parseHTML(communityBannerString)));
            return boxList;
        }
        
        // This method appends newly generated masonry boxes to the masonry container
        function appendCommunityPostElements(responseJSON, boxList){
          var lastLoadedCount = dynamicBoxesLoaded;
          $container = $container.append( boxList );
          $('.masonry').imagesLoaded( function() {
            // images have loaded
            $container.masonry( 'appended', boxList )
                .masonry( 'reloadItems' )
                .masonry({
                  itemSelector: '.masonryBox',
                  columnWidth: 60,
                  isAnimated: true,
                  gutter:20
                });
            });

          return boxList;
        }

        // This method appends newly generated masonry boxes to the masonry container
        function appendMemberElements(responseJSON, boxList){
          var lastLoadedCount = dynamicBoxesLoaded;
          
          $.each(responseJSON, function(i, userProfile) {
        	console.log(userProfile);  
        	var profileURL = "${pageContext.request.contextPath}/profile/unmanaged/" + userProfile.userId;
            var boxElement = getProfileBox(i + lastLoadedCount,profileURL, userProfile);
            boxList = boxList.add($(boxElement));
            dynamicBoxesLoaded++;
          });

          $container = $container.append( boxList );
          
          $('.masonry').imagesLoaded( function() {
            // images have loaded
            $container.masonry( 'appended', boxList )
                .masonry('reloadItems')
                .masonry({
                  itemSelector: '.masonryBox',
                  columnWidth: 60,
                  isAnimated: true,
                  gutter:20
                });
            });
          return boxList;
        }

        $(".inline").colorbox({inline:true, width:"50%", initialWidth: 100, initialHeight: 50});
	});

  </script>

</body>
</html>
