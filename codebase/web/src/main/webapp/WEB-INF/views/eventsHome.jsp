<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>anucana | events</title>

<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
<link href="${contentsBaseURL}/css/jquery-ui.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="${contentsBaseURL}/css/flexslider.css" type="text/css" media="screen" />
<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/style.css" />
<link rel="stylesheet" href="${contentsBaseURL}/css/colorbox.css" />
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
                          
                          <table  width="100%">
                            <tr>
                              <td width="70%">
                                <select id="communitiesDropDown" tabindex="1">                         
                                  <option value="Java">Java</option> 
                                  <option value="Dot Net">Dot Net</option> 
                                  <option value="JQuery">JQuery</option> 
                                  <option value="Unix">Unix</option> 
                                </select>
                              </td>
                              <td>
                                <select id="locationDropDown" tabindex="2">                         
                                  <option value="Java">Gurgaon</option> 
                                  <option value="Dot Net">Faridabad</option> 
                                  <option value="JQuery">New Delhi</option> 
                                  <option value="Unix">Noida</option> 
                                </select>
                              </td>
                              <td>
                                <select id="timeFrameDropDown" tabindex="3">                         
                                  <option value="Java">Weekly</option> 
                                  <option value="Dot Net">Monthly</option> 
                                  <option value="JQuery">Yearly</option>
                                </select>
                              </td>
                            </tr>
                          </table>    
                        </div>

                      <div id="container" style="margin-top:20px;overflow: hidden;" class="masonry">

                      </div>
                      <div id="lightBoxesContainer">
                        
                      </div>
                    </div>
  
                </div> <!-- end of grey_wrapper -->
                <span class="centered">
                    <button type="button" id="more" class="blueButton bigButton">Load more events</button>
                </span>            
            
            </div> <!-- end of anucana_main -->


        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->
        <div id="emptyPad" > </div>
	    <%@ include file="fragments/footerContent.jsp" %>

    </div> <!-- end of anucana_wrapper -->
  </div> <!-- end of outer wrapper -->



  <!-- jQuery -->
  <script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery-ui.js"></script>
  <script src="${contentsBaseURL}/js/masonry.pkgd.js"></script>
  <script src="${contentsBaseURL}/js/imagesloaded.pkgd.js"></script>
  <script src="${contentsBaseURL}/js/jquery.colorbox.js"></script>
    <!-- Fancy fields js & css files -->
  <script src="${contentsBaseURL}/fancyfields/fancyfields-1.2.min.js" type="text/javascript"></script>

  <!-- Fancy fields add-on for custom scroll bar -->
  <script src="${contentsBaseURL}/fancyfields/fancyfields.csb.min.js" type="text/javascript"></script>

  <script type="text/javascript">

    $(document).ready(function(){
        $('#events_link').addClass('active');

        /* Arvind : Pick the below mentioned matcher patterns from a properties file. Same properties file should be refered to embed these matcher patters in the description text while saving this event description in the DB. eg. In our properties file it should look something like -  
          msg.trainerNameMatcher = {trainerName} 

        So while fetching its value here, in case of struts it can be done as -
          var trainerNameMatcher = <s:text name="msg.confirm"/>

        Below hard coded values of matchers & dynamicDivMarkupString should be replaced with dynamic code.
        */

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
    //  var responseJSONN = getAjaxData("${pageContext.request.contextPath}/event/unmanaged/search?communityId=1&pincode=122001&timeFilter=MONTH&startIndex=1&endIndex=2");

        callAjax("${pageContext.request.contextPath}/event/unmanaged/search?communityId=1&pincode=122001&timeFilter=MONTH&startIndex=1&endIndex=2","appendMasonryElements");

        function callAjax(urlString, method){
          $.ajax({
            url: urlString,
            dataType: "json",          
            success: function(response){
              appendMasonryElements(response.eventList);
            }
          });
        }


      

      $('#dropDownBar').fancyfields();

      // Arvind : Code Snippet# D1. This function is just to include the htmls. Not needed in jsp.

          /*
          // Arvind : Unleash this piece of code when using jsps. Remove code snippet# D2, while uncommenting this code. This piece of code can be moved to a common location. eg. header.jsp if one exists.
            if ( $('#blog_page').length ) {
              // exists
            } else if ( $('#discuss_page').length ) {
              // exists
            } else if ( $('#events_page').length ) {
              $('#events_link').addClass('active');
            } else{
              // doesn't exist
            }
          */

            // Arvind : Code Snippet# D3. Event binding using .on() in below two blocks is just to facilitate the dynamic loading of htmls here using jQuery this binding need not to be done in the jsp where jsp inclusion isn't dynamic. Simple .click() function may be used while working with jsps.

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




        jQuery('#more').click(function(){
          //Below dummy json object will be replaced by the dynamically fetched json.
          var responseJSON = getAjaxData("${pageContext.request.contextPath}/event/unmanaged/search?communityId=1&pincode=122001&timeFilter=MONTH&startIndex=1&endIndex=2");
          appendMasonryElements(responseJSON);
        });




        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.
        function ajaxCall(){
          var responseJSON = [
          {"trainer":"Mark","eventName":"Relics of Python","eventDate":"26-Mar-2014", "startTime":"03:30PM","duration":"180 min", "eventVenue":"Hayat Hotel", "imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna blabber on {eventName}" ,  "impIndex":"2"},
          {"trainer":"Tony","eventName":"Relics of PHP","eventDate":"22-Apr-2014", "startTime":"05:30PM","duration":"180 min", "eventVenue":"Regals Residency","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}" ,  "impIndex":"2"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"2"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"2"}
          ];

          return responseJSON;
        }


        // This method appends newly generated masonry boxes to the masonry container
        function appendMasonryElements(responseJSON){
          var lastLoadedCount = dynamicBoxesLoaded;
          var boxList = $();
          $.each(responseJSON, function(i, eventData) {
            var boxElement = getBoxElement(i, lastLoadedCount, eventData);
            var lightBoxElement = getLightboxdiv(i, lastLoadedCount, eventData);
            boxList = boxList.add($(boxElement));
            $('#lightBoxesContainer').append(lightBoxElement);
            dynamicBoxesLoaded++;
          });

          $container = $container.append( boxList );

          $('.masonry').imagesLoaded( function() {
            // images have loaded
            $container.masonry( 'appended', boxList )
                .masonry({
                  itemSelector: '.box',
                  columnWidth: 100,
                  isAnimated: true,
                  gutter:20
                });

          });

          // Apply colorBox styling to all generated masonry boxes, to support lightbox display on click.
          $(".inline").colorbox({inline:true, width:"50%", initialWidth: 100, initialHeight: 50});
        }


        // Generates a random importance index
        function getRandomImpIndex() {
          var iRand = Math.random();
          var impIndex = iRand > 0.85 ? 1 : iRand > 0.6 ? 2 : iRand > 0.35 ? 3 : 3;
          return impIndex;
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
          '<div id="dynamicBox{boxIndex}" class="box col{impIndex}">'+
            '<a class="inline" href="#inline_content{boxIndex}">'+
              '<img class="photo" src={imageSource}>'+
            '</a>'+
            '<div  style="background:white;">'+
                '<p style="color:black;">{shortDesc}</p>'+
            '</div>'+
          '</div>';

          var trainerNameMarkupString = '<span class="trainerName">{trainerName}</span>';
          var eventNameMarkupString = '<span class="eventName">{eventName}</span>';


          dynamicDivMarkupString= dynamicDivMarkupString.split(boxIndexMatcher).join((index+lastLoadedCount));
          dynamicDivMarkupString = dynamicDivMarkupString.replace(impIndexMatcher, impIndex);
          dynamicDivMarkupString = dynamicDivMarkupString.replace(imageSourceMatcher, eventData.bannerUrl);

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


        function getLightboxdiv(index, lastLoadedCount, eventData){

            var lightboxDivString = 
              '<div style="display:none">' +
                '<div id="inline_content{boxIndex}" class="lightBox">' +
                  '<h4 id="headline" >{eventName}</h4>' +
                  '<div id="leftContent"  style="float:left; width:30%;">' +
                    '<img class="photo" src="{imageSource}" >' +
                  '</div>' +
                  '<div id="rightContent" style="padding-left:20px;overflow: hidden;">' +
                    '<table>' +
                      '<tr>' +
                        '<th>Date</th>' +
                        '<td>{eventDate}</td>' +
                      '</tr>' +
                      '<tr>' +
                        '<th>Starts</th>' +
                        '<td>{eventStartTime}</td>' +
                      '</tr>' +
                      '<tr>' +
                        '<th>Duration</th>' +
                        '<td>{eventDuration}</td>' +
                      '</tr>' +
                      '<tr>' +
                        '<th>Venue</th>' +
                        '<td>{eventVenue}</td>' +
                      '</tr>' +
                      '<tr>' +
                        '<th>Speaker</th>' +
                        '<td>{trainerName}</td>' +
                      '</tr>' +
                      '<tr>' +
                        '<th>Synopsis</th>' +
                        '<td>{longDesc}</td>' +
                      '</tr>' +
                    '</table>' +
                  '</div>' +
                  '<div id="bottomBar"  class="centered">' +
                    '<input type="button" value="Book my seat" id="bookingButton" class="blueButton smallButton" tabindex="1" >' +
                    '</input>' +
                  '</div>' +
                '</div>' +
              '</div>';

              var longDesc = eventData.longDesc;
              longDesc = longDesc.replace(trainerNameMatcher, eventData.trainer);
              longDesc = longDesc.replace(eventNameMatcher, eventData.eventName);

              lightboxDivString = lightboxDivString.replace(longDescMatcher, longDesc);
              lightboxDivString = lightboxDivString.replace(boxIndexMatcher, (index+lastLoadedCount));
              lightboxDivString = lightboxDivString.replace(eventNameMatcher, eventData.eventName);
              lightboxDivString = lightboxDivString.replace(imageSourceMatcher, eventData.bannerUrl);
              lightboxDivString = lightboxDivString.replace(eventDateMatcher, eventData.eventDate);
              lightboxDivString = lightboxDivString.replace(eventStartTimeMatcher, eventData.startTime);
              lightboxDivString = lightboxDivString.replace(eventDurationMatcher, eventData.duration);
              lightboxDivString = lightboxDivString.replace(eventVenueMatcher, eventData.eventVenue);
              lightboxDivString = lightboxDivString.replace(trainerNameMatcher, eventData.trainer);        
        
              var lightboxDivHTML = $.parseHTML( lightboxDivString );

              return lightboxDivHTML;
        }

      });
  </script>

<!-- This contains the hidden content for modal window -->
  <div style="display:none">
    <div id="inline_content" class="lightBox">
      <h4 id="headline" >Myths of JQuery</h4>
      <div id="leftContent"  style="float:left; width:30%;">
        <img class='photo' src="${contentsBaseURL}/images/featured_project.jpg" />
      </div>
      <div id="rightContent" style="padding-left:20px;overflow: hidden;">
        <table>
          <tr>
            <th>Date</th>
            <td>05-30-2014</td>
          </tr>
          <tr>
            <th>Starts</th>
            <td>01:30 PM</td>
          </tr>
          <tr>
            <th>Duration</th>
            <td>180 minutes</td>
          </tr>
          <tr>
            <th>Speaker</th>
            <td>Mark Treynor</td>
          </tr>
          <tr>
            <th>Synopsis</th>
            <td>In these 3 hours Mark is gonna bust all yours myths of JQuery.</td>
          </tr>
        </table>

      </div>
      <div id="bottomBar"  class="centered">
        <input type="button" value="Book my seat" id="bookingButton" class="blueButton smallButton" tabindex="1"></input>
      </div>
    </div>
  </div>
</body>
</html>
