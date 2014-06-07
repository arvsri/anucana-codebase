<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>anucana</title>

<link href="${contentsBaseURL}/css/jquery-ui.css" rel="stylesheet" type="text/css" />
<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="${contentsBaseURL}/css/flexslider.css" type="text/css" media="screen" />
<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body class="fontBlack">

<div id="anucana_outer_wrapper">

	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

    <!--Block 4 - This block holds Search Community form and search results -->
	<div id="anucana_wrapper" class="wrapper_1020">
        
        <div id="anucana_main">
            <div id="grey_wrapper" class="greyLinen_background">



                <div style="margin-top:10px;">
                  <div id="container" style="margin-top:20px;overflow: hidden;" class="masonry">

                    <div id="communityBannerBox" class="masonryBox communityFontsize col3">
                      <div id="communityNameBox" class="darkShadeOverlay">
                          <p class="font18">
                            <span id="communityName">Social Media</span>
                            <span class="editIconRightAlign">
                              <span id="saveCommunityName" class="webSymbol font20 hidden">.</span>
                              <img id="editCommunityName" src="${contentsBaseURL}/images/edit-pen-icon-white.png">
                            </span>
                          </p>
                      </div>

                      <div id="communityBanner">
                        <img class="communityBoxPhoto" src="${contentsBaseURL}/images/communityPic.jpg">
                        <div class="border joinCircle_CP">
                          <div class="circleFiller">
                            <span class="joinTextStyle"> Join </span>
                          </div>
                        </div>
                      </div> 

                      <div id="membersBriefBox" class="darkShadeOverlay">
                          <p>
                            <span class="font18">Members</span><span style="float:right;"><a href="">View All</a></span>
                          </p>
                          <div class="membersMasonry">
                            
                          </div>
                      </div>
                    </div>


                    <div id="communityDescBlock" class="masonryBox roundedCorners communityWhiteBox" style="margin-bottom:20px;">
                      <div class="pad10 blueHeader14">
                        <span>About the Community</span>
                        <span class="editIconRightAlign">
                          <span id="saveCommunityDesc" class="webSymbol hidden">.</span>
                          <img id="editCommunityDesc" src="${contentsBaseURL}/images/edit-pen-icon-blue.png">
                        </span>
                      </div>
                      <div class="triPadBottom10">
                        <div id="communityDescText">
                          This is a heavily moderated/curated community talking about all possible uses of Social Media for business and promotion. This community may have one of the highest moderation bars of any community on Anucana, but we do this to provide the best value for our members. Only active members may post, be sure to get active in at least one of our communities before posting yourself! (See links below) By taking part in this community, you agree to abide by the Community Policy.
                        </div>
                      </div>

                    </div>

                    <div id="contactInfoBlock" class="masonryBox roundedCorners col3 communityWhiteBox" style="margin-bottom:20px;">
                      <div class="pad10">
                        <span class="webSymbol blueOnWhite font15">@</span>
                        <span class="blueHeader14">Get in touch</span>
                      </div>
                      <div class="sidePad10"  >
                        <table id="contactDetails">
                          <tr>
                            <td><b>Email</b></td>
                            <td><a href="#"><span id="communityEmail">socialmedia@anucana.com</span></a></td>
                            <td>
                              <span class="cursorPointer blueOnWhite">
                                <span id="saveCommunityEmail"  class="webSymbol hidden">.</span>
                                <img id="editCommunityEmail" src="${contentsBaseURL}/images/edit-pen-icon-blue.png"/>
                              </span>
                            </td>
                          </tr>

                          <tr>
                            <td><b>Contact</b></td>
                            <td><span id="communityContactNum">7503254033</span></td>
                            <td>
                              <span class="cursorPointer blueOnWhite">
                                <span id="saveCommunityContactNum" class="webSymbol hidden">.</span>
                                <img id="editCommunityContactNum" src="${contentsBaseURL}/images/edit-pen-icon-blue.png"/>
                              </span>
                            </td>
                          </tr>
                        </table>
                      </div>

                    </div>

                    <div id="upcomingEvents" class="masonryBox verticalMargin20 roundedCorners col3 communityWhiteBox">
                      <div class="pad10">
                        <span class="webSymbol blueOnWhite font20">P</span>
                        <span class="blueHeader14">Upcoming Events</span>
                      </div>
                      <div class="sidePad10">
                        <div class="verticalPad10">
                          <table width="100%">
                            <tr>
                              <td width="10%">
                                <div class="eventCalendarIcon">
                                  <div class="eventCalendarMonth">Mar</div>
                                  <div class="eventCalendarDay">24</div>
                                </div>
                              </td>
                              <td width="70%">
                                <div class="upcomingEventTitle">Relics of PHP</div>
                                <div>Tony is gonna rahul gandhi on Relics of PHP</div>
                              </td>
                              <td width="20%">
                                <div class="upcomingEventAttendButton">
                                  <button type="button" id="openEvent" class="blueButton verySmallButton">Attend</button>
                                </div>
                              </td>
                            </tr>
                          </table>
                        </div>
                        <div class="verticalPad10 upcomingEventSeparator">
                          <table width="100%">
                            <tr>
                              <td width="10%">
                                <div class="eventCalendarIcon">
                                  <div class="eventCalendarMonth">Mar</div>
                                  <div class="eventCalendarDay">29</div>
                                </div>
                              </td>
                              <td width="70%">
                                <div class="upcomingEventTitle">Relics of Ruby</div>
                                <div>Brian is gonna dance on Relics of Ruby</div>
                              </td>
                              <td width="20%">
                                <div class="upcomingEventAttendButton">
                                  <button type="button" id="openEvent" class="blueButton verySmallButton">Attend</button>
                                </div>
                              </td>
                            </tr>
                          </table>
                        </div>
                    </div>
                  </div>

                </div>
                <span id="communities_LoadMoreSpan">
                    <button type="button" id="more" class="blueButton bigButton">Load more events</button>
                </span> 
            </div> <!-- end of grey_wrapper -->

        </div> <!-- end of anucana_main -->

        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" style="height:130px" > </div>
		<%@ include file="fragments/footerContent.jsp" %>
       
    </div> <!-- end of anucana_wrapper -->
	</div> <!-- end of anucana_outer_wrapper -->


<script type='text/javascript' src='js/logging.js'></script>

  <!-- jQuery -->
  <script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
  
  <!-- jQuery-ui -->
  <script src="${contentsBaseURL}/js/jquery-ui.js"></script>

  <!-- masonry pluggin-->
  <script src="${contentsBaseURL}/js/masonry.pkgd.js"></script>

  <!-- images loaded pluggin-->
  <script src="${contentsBaseURL}/js/imagesloaded.pkgd.js"></script>

  <!-- FlexSlider -->
  <script defer src="${contentsBaseURL}/js/jquery.flexslider.js"></script>

  <script type="text/javascript">
	$(window).load(function() {

        // These few variables are declared global. These have usage in multiple functions here.
        // To be replaced within trainer/event span string.
        var trainerNameMatcher = "{trainerName}";
        var eventNameMatcher = "{eventName}";

        var boxIndexMatcher = "{boxIndex}";
        var impIndexMatcher = "{impIndex}";
        var imageSourceMatcher = "{imageSource}";
        var eventDateMatcher = "{eventDate}";
        var eventStartTimeMatcher = "{eventStartTime}";
        var eventDurationMatcher = "{eventDuration}";
        var eventVenueMatcher = "{eventVenue}";
        var longDescMatcher = "{longDesc}";
        

      // Global variable to count the number of dynamic boxes loaded on this page so far
      var dynamicBoxesLoaded = 0;
        var $container = $('.masonry');
        //Below dummy json object will be replaced by the dynamically fetched json.
        var membersResponseJSONN = getMembersAjaxCall();
        appendMemberMasonryElements(membersResponseJSONN);
        var communityFeedsResponseJSONN = ajaxCall();
        appendMasonryElements(communityFeedsResponseJSONN);
        
        

            function showHideIconAndRefreshMasonry(icon1, icon2){
              $container.masonry({
                itemSelector: '.masonryBox',
                columnWidth: 60,
                isAnimated: true,
                gutter:20
              });

              $(icon1).addClass('hidden');
              $(icon2).removeClass('hidden');

            }

            function activateReadWriteMode(textDiv, editIcon, saveIcon){
              $(textDiv).attr('contenteditable','true');
              showHideIconAndRefreshMasonry(editIcon, saveIcon);
            }

            function activateReadOnlyMode(textDiv, editIcon, saveIcon){
              $(textDiv).removeAttr('contenteditable');
              showHideIconAndRefreshMasonry(saveIcon, editIcon); 
            }

            $('#editCommunityDesc').click(function(){
              activateReadWriteMode($('#communityDescText'), $('#editCommunityDesc'), $('#saveCommunityDesc'));
            });

            $('#saveCommunityDesc').click(function(){
             activateReadOnlyMode($('#communityDescText'), $('#editCommunityDesc'), $('#saveCommunityDesc'));
            });

            $('#editCommunityName').click(function(){
              activateReadWriteMode($('#communityName'), $('#editCommunityName'), $('#saveCommunityName'));
            });

            $('#saveCommunityName').click(function(){
              activateReadOnlyMode($('#communityName'), $('#editCommunityName'), $('#saveCommunityName'));
            });

            $('#editCommunityEmail').click(function(){
              activateReadWriteMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));
            });

            $('#saveCommunityEmail').click(function(){
              activateReadOnlyMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));
            });

            $('#editCommunityContactNum').click(function(){
              activateReadWriteMode($('#communityContactNum'), $('#editCommunityContactNum'), $('#saveCommunityContactNum'));
            });

            $('#saveCommunityContactNum').click(function(){
              activateReadOnlyMode($('#communityContactNum'), $('#editCommunityContactNum'), $('#saveCommunityContactNum'));
            });

            // Arvind : Code Snippet# D3. Event binding using .on() in below two blocks is just to facilitate the dynamic loading of htmls here using jQuery this binding need not to be done in the jsp where jsp inclusion isn't dynamic. Simple .click() function may be used while working with jsps.

            // this function makes the top 'Hello member' menu to slide down.
            $('#anucana_outer_wrapper').on("click", "#flip", function() {
                if(! $("#panel").is(":visible")){
                    $("#panel").slideDown("fast");
                    $( "#member_arrow" ).attr( "src", "${contentsBaseURL}/img/up_arrow_grey6.png" );
                    $("#panel").focus();
                }
            });

            // slide up the 'Hello member' menu, if user clicks anywhere else on the page.
            $('#anucana_outer_wrapper').on("blur", "#panel", function() {
                $("#panel").slideUp("fast");
                $( "#member_arrow" ).attr( "src", "${contentsBaseURL}/img/down_arrow_grey6.png" );
            });




        jQuery('#more').click(function(){
          //Below dummy json object will be replaced by the dynamically fetched json.
          var responseJSON = ajaxCall();
          appendMasonryElements(responseJSON);
        });


        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.
        function getMembersAjaxCall(){
          var responseJSON = [
          {"trainer":"Mark","eventName":"Relics of Python","eventDate":"26-Mar-2014", "startTime":"03:30PM","duration":"180 min", "eventVenue":"Hayat Hotel", "imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna blabber on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Tony","eventName":"Relics of PHP","eventDate":"22-Apr-2014", "startTime":"05:30PM","duration":"180 min", "eventVenue":"Regals Residency","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}" ,  "impIndex":"3", "membershipStatus": "true"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Tony","eventName":"Relics of PHP","eventDate":"22-Apr-2014", "startTime":"05:30PM","duration":"180 min", "eventVenue":"Regals Residency","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}" ,  "impIndex":"3", "membershipStatus": "true"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Tony","eventName":"Relics of PHP","eventDate":"22-Apr-2014", "startTime":"05:30PM","duration":"180 min", "eventVenue":"Regals Residency","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}" ,  "impIndex":"3", "membershipStatus": "true"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"}
          ];

          return responseJSON;
        }


        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.
        function ajaxCall(){
          var responseJSON = [
          {"trainer":"Mark","eventName":"Relics of Python","eventDate":"26-Mar-2014", "startTime":"03:30PM","duration":"180 min", "eventVenue":"Hayat Hotel", "imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna blabber on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Tony","eventName":"Relics of PHP","eventDate":"22-Apr-2014", "startTime":"05:30PM","duration":"180 min", "eventVenue":"Regals Residency","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}" ,  "impIndex":"3", "membershipStatus": "true"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"3", "membershipStatus": "false"}
          ];

          return responseJSON;
        }



        // This method appends member masonry boxes to the member masonry container
        function appendMemberMasonryElements(responseJSON){
          //var lastLoadedCount = dynamicBoxesLoaded;
          var boxList = $();
          $.each(responseJSON, function(i, eventData) {
            var boxElement = getMemberBoxElement(i, eventData);
            boxList = boxList.add($(boxElement));
            //dynamicBoxesLoaded++;
          });

          var $memberContainer = $('.membersMasonry');
          $memberContainer = $memberContainer.append( boxList );

          $('.membersMasonry').imagesLoaded( function() {
            // images have loaded
            $memberContainer.masonry( 'appended', boxList )
                .masonry({
                  itemSelector: '.memberMasonryBox',
                  columnWidth: 40,
                  isAnimated: true, 
                  gutter:10
                });
            });
        }

        // This method appends newly generated masonry boxes to the masonry container
        function appendMasonryElements(responseJSON){
          var lastLoadedCount = dynamicBoxesLoaded;
          var boxList = $();
          $.each(responseJSON, function(i, eventData) {
            var boxElement = getBoxElement(i, lastLoadedCount, eventData);
            boxList = boxList.add($(boxElement));
            dynamicBoxesLoaded++;
          });

          $container = $container.append( boxList );

          $('.masonry').imagesLoaded( function() {
            // images have loaded
            $container.masonry( 'appended', boxList )
                .masonry({
                  itemSelector: '.masonryBox',
                  columnWidth: 60,
                  isAnimated: true,
                  gutter:20
                });
            });
        }


        // Generates a random importance index
        function getRandomImpIndex() {
          var iRand = Math.random();
          var impIndex = iRand > 0.85 ? 1 : iRand > 0.6 ? 2 : iRand > 0.35 ? 3 : 3;
          return impIndex;
        }


        /* This method is completely configurable wrt. the box html template to be picked from the properties file. Non configurable alternate code can be refered at the end of this script tag.
        */
        function getMemberBoxElement(index, eventData) {
          var dynamicDivMarkupString =           
          '<div id="dynamicMemberBox'+ index +'" class="memberMasonryBox verticalMargin5 col1">'+
            '<a href="#">'+
              '<img class="communityBoxPhoto" src="${contentsBaseURL}/images/memberPic.jpg">'+
            '</a>'+
          '</div>';
          return dynamicDivMarkupString;
        }


        /* This method is completely configurable wrt. the box html template to be picked from the properties file. Non configurable alternate code can be refered at the end of this script tag.
        */
        function getBoxElement(index, lastLoadedCount, eventData) {
          
         //Fetch impIndex to decide the dimentions based on importance of this element box. 
         var impIndex = eventData.impIndex;
          // In case no impIndex is sent with an Event
          if(impIndex == null || impIndex == ""){
            impIndex = getRandomImpIndex();
          }

          //Fetch membership status to decide which style class to be imparted to 'join' circular button
          var communityJoined = eventData.membershipStatus;
          var joinCircleClass;
          var joinCircleText;
          var backgroundColor;
          if(communityJoined == "true"){
            joinCircleClass = "icon";
            backgroundColor = "blueBackground";
            joinCircleText = ".";
          }
          else{
            joinCircleClass = "joinTextStyle";
            joinCircleText = "Join";
          }


        /* Arvind : Pick the below mentioned matcher patterns from a properties file. Same properties file should be refered to embed these matcher patters in the description text while saving this event description in the DB. eg. In our properties file it should look something like -  
          msg.trainerNameMatcher = {trainerName} 

        So while fetching its value here, in case of struts it can be done as -
          var trainerNameMatcher = <s:text name="msg.confirm"/>

        Below hard coded values of matchers & dynamicDivMarkupString should be replaced with dynamic code.
        */

          // To be replaced in the event desc string.
          var trainerNameMarkupMatcher = "{trainerNameMarkup}";
          var eventNameMarkupMatcher = "{eventNameMarkup}";
          var shortDescMatcher = "{shortDesc}";

          var dynamicDivMarkupString = 
          '<div id="dynamicBox{boxIndex}" class="masonryBox community_box verticalMargin20 col{impIndex}">'+
            '<a href="#inline_content{boxIndex}">'+
              '<img class="communityBoxPhoto" src={imageSource}>'+
            '</a>'+
            '<div  style="background:white;padding:5px;">'+
                '<p>{shortDesc}</p>'+
            '</div>'+
            '<div class="border '+ backgroundColor +'">'+
              '<div class="circleFiller">'+
                '<span class="'+ joinCircleClass +'">'+ joinCircleText +'</span>'+
              '</div>'+
            '</div>'+
          '</div>';

          var trainerNameMarkupString = '<span class="trainerName">{trainerName}</span>';
          var eventNameMarkupString = '<span class="eventName">{eventName}</span>';


          dynamicDivMarkupString= dynamicDivMarkupString.split(boxIndexMatcher).join((index+lastLoadedCount));
          dynamicDivMarkupString = dynamicDivMarkupString.replace(impIndexMatcher, impIndex);
          dynamicDivMarkupString = dynamicDivMarkupString.replace(imageSourceMatcher, eventData.imgSrc);

          var shortDesc = eventData.shortDesc;
          var trainerName = trainerNameMarkupString.replace(trainerNameMatcher, eventData.trainer);
          shortDesc = shortDesc.replace(trainerNameMarkupMatcher, trainerName);
          var eventName = eventNameMarkupString.replace(eventNameMatcher, eventData.eventName);
          shortDesc = shortDesc.replace(eventNameMarkupMatcher, eventName);

          
          // More details may be added to event description viz. Date, Time etc on similar lines of trainerName & eventName as above.

          dynamicDivMarkupString = dynamicDivMarkupString.replace(shortDescMatcher, shortDesc);
          var dynamicDivHTML = $.parseHTML( dynamicDivMarkupString );

          return dynamicDivHTML;
        }

        $('.border').click(function(){
          //Make an ajax call here to join this particular community, and in case success is returned, execute the below code.
          $(this).css("background-color","#009DDB");
          $(".joinTextStyle", this).removeClass("joinTextStyle").addClass("icon").text(".");
        });


	});

  </script>

</body>
</html>
