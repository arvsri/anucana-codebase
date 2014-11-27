<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | my bookings</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<style type="text/css">
		table{
		    table-layout: fixed;
		}
		td {
		    overflow: hidden;
		}		
		.tableCell{
			padding-left: 10px;
		}
		.blackHeader14{
			  color : black; font-weight : bold;font-size:14px;
		}
		.redHeader14{
			  color : red; font-weight : bold;font-size:14px;
		}
		
	</style>
</head>
<body>
<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
    <!--Block 4 - This block holds login form and error blocks -->
	<div id="anucana_wrapper" class="wrapper_1020">
            <div id="anucana_main" style="height:300px;">
	            <div id="grey_wrapper" class="greyLinen_background">
	                <div style="margin-top:10px;">
	                
	                <!-- page display global variables  -->
	                <script type="text/javascript">
		          	    var bookingSearchBox = 
	                    	'<div class="masonryBox roundedCorners communityWhiteBox" style="margin:10px 0 5px 0;width:100%"">'+
								'<form method="post" action="" id="bookingSearchForm">'+	                    	
	        	            		'<table width="100%"><tr>'+
	        	            		'<td width="50%"><input type="text"  name="searchString" style="width:100%;height:35px" placeholder="event name to search .." ></td>'+
	    	                		'<td width="20%"><input  type="submit" class="blueButton bigButton" value="Search"></td>' +
	    	                		'<td width="30%"><div class="blueHeader14"><a href="${pageContext.request.contextPath}/booking/managed/bookEvent">Reserve your seat(s) for a new event ?</a></div><td></tr></table>' +
	    	                	'</form>'+			
	                    	'</div>';
                
                         var userBookingsObj = {"bookings":[
   	                       	   <c:forEach items="${bookings}" var="booking" varStatus="loop">
   	                       	   		<c:if test="${loop.index != 0}"><c:out value=","></c:out></c:if>	                        	   
   		                        		{
   		                        		"userEventId":"${booking.userEventId}",
   		                        		"numberOfBookedSeats":"${booking.numberOfBookedSeats}",
   		                        		"payment":"${booking.payment}",
   		                        		"dateOfBooking":"${booking.dateOfBookingBreakUp.date}-${booking.dateOfBookingBreakUp.month}-${booking.dateOfBookingBreakUp.year}  ${booking.dateOfBookingBreakUp.hour}:${booking.dateOfBookingBreakUp.minute} ${booking.dateOfBookingBreakUp.amOrPm}",
   		                        		"event":{
   		                        			"eventId":"${booking.event.eventId}",
   			                        		"bannerUrl":"${booking.event.bannerUrl}",
   			                        		"eventDate":"${booking.event.eventDate}",
   			                        		"durationInMinutes":"${booking.event.durationInMinutes}",
   			                        		"eventDateBreakup":{"date":"${booking.event.eventDateBreakup.date}","month":"${booking.event.eventDateBreakup.month}",
   			                        							"year":"${booking.event.eventDateBreakup.year}","hour":"${booking.event.eventDateBreakup.hour}",
   			                        							"minute":"${booking.event.eventDateBreakup.minute}","amOrPm":"${booking.event.eventDateBreakup.amOrPm}"},
   			                        		"name":"${booking.event.name}",
   			                        		"phone":"${booking.event.phone}",
   			                        		"importanceIndex":"${booking.event.importanceIndex}",
   			                        		"shortDesc":"<spring:escapeBody javaScriptEscape='true'>${booking.event.shortDesc}</spring:escapeBody>",
   			                        		"longDesc":"<spring:escapeBody javaScriptEscape='true'>${booking.event.longDesc}</spring:escapeBody>",
   			                        		"pinCode":"${booking.event.pinCode}",
   			                        		"pincodeId":"${booking.event.pincodeId}",
   			                        		"addressLine1":"${booking.event.addressLine1}",
   			                        		"addressLine2":"${booking.event.addressLine2}",
   			                        		"communityId":"${booking.event.communityId}",
   			                        		"speakerId":"${booking.event.speakerId}",
   			                        		"speakerName":"${booking.event.speakerName}",
   			                        		"capacity":"${booking.event.capacity}",
   			                        		"costInINR":"${booking.event.costInINR}",
   			                        		"statusCd":"${booking.event.statusCd}"
   			                        		}
   		                        		}
   	                       		</c:forEach>
	                       	]};	                          

	                </script>
	                
	                  <div id="container" style="overflow: hidden;" class="masonry">
	                  </div> <!-- End of masonry container -->
	                  
	                </div>
	                <span id="LoadMoreBookings">
	                    <button type="button" id="moreBookings" class="blueButton bigButton">Load more bookings</button>
	                </span> 
	            </div> <!-- end of grey_wrapper -->
            </div> <!-- end of anucana_main -->

        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" style="height:100px" > </div>
	<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
  </div> <!-- end of outer wrapper -->
<script type='text/javascript' src='${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/static/js/jquery-ui.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/static/js/masonry.pkgd.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.js'></script>
<script type='text/javascript' defer src='${pageContext.request.contextPath}/static/js/jquery.flexslider.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/static/js/anucana-util.js'></script>

  <script type="text/javascript">
  	
   	function getBookingSearchResultHeader(){
        var content = '<div class="masonryBox roundedCorners communityWhiteBox" style="margin:5px 0 5px 0;width:100%">'+
	    	'<table width="100%"><tr>'+
	    		'<td width=="25%"><div class="blueHeader14"><span class="tableCell">Event Name</span></div></td>'+ 
	    		'<td width=="25%"><div class="blueHeader14"><span class="tableCell">Date and time of event</span></div></td>'+
	    		'<td width=="25%"><div class="blueHeader14"><span class="tableCell">Date and time of booking</span></div></td>'+
	    		'<td width=="25%"><div class="blueHeader14"><span class="tableCell">View Receipt</span></div></td>'+
	    	 '</tr></table>'
	    '</div>';
  		return content;
  	}
   	
   	function getNoResultFoundMessage(){
        var content = '<div class="masonryBox roundedCorners communityWhiteBox" style="margin:5px 0 5px 0;width:100%">'+
        					'<div class="redHeader14"><span class="tableCell">Sorry !!, no bookings found.</span></div>' +
		    		  '</div>';
		return content;
   	}
  
  	function getBookingSearchResult(booking){
	  	var content = '<div class="masonryBox roundedCorners communityWhiteBox" style="margin:5px 0 5px 0;width:100%">'+
	  		'<table width="100%"><tr>'+
	  		'<td width=="25%"><div class="blackHeader14"><span class="tableCell">'+ booking.event.name +'</span></div></td>'+ 
	  		'<td width=="25%"><div class="blackHeader14"><span class="tableCell">'+ 
	  			booking.event.eventDateBreakup.date +'-'+ booking.event.eventDateBreakup.month + '-'+ booking.event.eventDateBreakup.year +'  '+ booking.event.eventDateBreakup.hour + ":"+ booking.event.eventDateBreakup.minute +' ' + booking.event.eventDateBreakup.amOrPm +  
	  		'</span></div></td>'+
	  		'<td width=="25%"><div class="blackHeader14"><span class="tableCell">'+ booking.dateOfBooking+ '</span></div></td>'+
	  		'<td width=="25%"><div class="blackHeader14"><span class="tableCell">'+ 
	  			'<a href="${pageContext.request.contextPath}/booking/managed/'+ booking.userEventId +'/receipt" target="_blank">View Receipt</a></span></div></td>'+
	  	 	'</tr></table>'
	  	'</div>';
	  	return content;
  	}
  	
  	
	$(window).load(function() {
		
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
		
        <c:choose>
	    	<c:when test="${nextPage}">
	    		$('#LoadMoreBookings').css("display","block");
	    	</c:when>
	    	<c:otherwise>
	    		$('#LoadMoreBookings').css("display","none");
	    	</c:otherwise>
	    </c:choose>
        
        
		var $container = $('.masonry');
        $container.empty();
        var boxList = $();
		
        // Global variable to count the number of dynamic boxes loaded on this page so far
        var dynamicBoxesLoaded = 0;
        var bookingsDisplayPageNumber=1;

        boxList = boxList.add($($.parseHTML(bookingSearchBox)));
        if(userBookingsObj.bookings.length > 0){
        	boxList = boxList.add($($.parseHTML(getBookingSearchResultHeader())));
            $.each(userBookingsObj.bookings, function(i, booking) {
               	var bookingResult = getBookingSearchResult(booking);
               	boxList = boxList.add($($.parseHTML(bookingResult)));
           	});
        }else{
        	boxList = boxList.add($($.parseHTML(getNoResultFoundMessage())));
        }
        
        appendElements("", boxList);

        $('#moreBookings').click(function(){
          	var boxList = $();
        
          	var data = ("#bookingSearchForm").serialize();
          	var data = data +  "&pageNumber="+profileDisplayNumber;
          	var search = $.get("${pageContext.request.contextPath}/booking/managed/list",data,null,"json");

          	search.done(function(response){
	          	appendMemberElements(response.bookings, boxList);
	          	bookingsDisplayPageNumber++;
	          	if(response.nextPage){
	              	$('#LoadMoreBookings').css("display","block");
	          	}else{
	          		$('#LoadMoreBookings').css("display","none");
	          	}
			});
			search.fail(function(event){
				$(".errorMsg").text(" An error ocurred while processing !");
			});
        });

        // This method appends newly generated masonry boxes to the masonry container
        function appendElements(responseJSON, boxList){
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
          $.each(responseJSON, function(i, booking) {
	            var boxElement = getBookingSearchResult(booking);
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
	});

  </script>

</body>
</html>
