<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="anucana" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | profile</title>
	<link href="${contentsBaseURL}/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/profile-style.css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/style.css" />
	<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/colorbox.css" />
	<link rel="stylesheet" href="${contentsBaseURL}/css/jcrop/jquery.Jcrop.css" type="text/css" />
	<link rel="stylesheet" href="${contentsBaseURL}/css/flexslider.css" type="text/css" media="screen" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>	

	<div id="anucana_outer_wrapper">
		<%@ include file="fragments/headerContent.jsp" %>
		<%@ include file="fragments/sideButtons.jsp" %>

		<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper" class="greyLinen_background">

                <div style="margin-top:10px;">
                  <div id="container" style="overflow: hidden; position: relative;">
                      <div class="darkShadeOverlay roundedTopCorners" style="height:200px;">
                      </div>
                      <div class="darkShadeOverlay roundedBottomCorners" style="height:50px;margin-top:5px;">
                      </div>
                      <div id="profileBannerBox" class="communityFontsize col4">
                        <table style="width:100%">
                          <tr>
                            <td style="padding:30px;width:30%">
                              <div id="profilePicBlock">
                                <img id="profilePic" class="profilePicImage" src="${userProfile.profileImageUrl}" />
                                <anucana:upload-image posturl="profile/managed/imageUpload/${userProfile.userId}" accessId="${userProfile.userId}" src="${userProfile.profileImageUrl}" mode="profile" dummy="${userProfile.dummyImage}"></anucana:upload-image>	
                              </div> 
                            </td>
                            <td style="position:relative;">
                              <div style="position:absolute; top: 30px;">
                                <table>
                                 
                                  <tr>
                                    <td style="padding:10px 0px 20px 65px;">
                                      <div id="profileNameBox">
                               			  <anucana:edit-image accessId="${userProfile.userId}" properties="firstName lastName"></anucana:edit-image>
                                          <span class="profileBannerText">
                                            <span id="firstName">${userProfile.firstName}</span>&nbsp;
                                            <span id="lastName">${userProfile.lastName}</span>
                                          </span>
                                          
                                      </div>
                                    </td>
                                  </tr>
                                 
                                  <tr>
                                    <td style="padding:5px 0px 10px 65px;">
                                      <div id="companyNameBox">

                               			  <anucana:edit-image accessId="${userProfile.userId}" properties="professionalHeadline"></anucana:edit-image>
                                          <span class="profileBannerText">
											<em>
	                                            <span id="professionalHeadline" class="tooltip" title="<b>Enter your Professional Headline.</b><br/><br/><span class='tooltipExample'>eg. Experienced Transportation Executive, Web Designer and Information Architect, Visionary Entrepreneur and Investor.</span>">
	                                           		<c:choose>
	                                           			<c:when test="${not empty  fn:trim(userProfile.profileHeading)}">
	                                           				<c:out value="${userProfile.profileHeading}"></c:out>
	                                           			</c:when>
	                                           			<c:otherwise>
	                                           				<c:out value="Your Professional Headline"></c:out>
	                                           			</c:otherwise>
	                                           		</c:choose>
	                                            </span>
                                            </em>
                                          </span>
                                          
                                      </div>
                                    </td>
                                  </tr>
                                  
                                  
                                  <tr>
                                    <td style="padding:5px 0px 10px 65px;">
                                      <div id="industryInfoBox">
                                          
										  <anucana:edit-image accessId="${userProfile.userId}" properties="industryName"></anucana:edit-image>                                          
                                          <span class="profileBannerText">
	                                           	<em>
		                                            <span class="tooltip industryAutoComplete" id="industryName" title="<b>Enter your Industry Name.</b><br/><br/><span class='tooltipExample'>eg. Information Technology and Services">
			                                           		<c:choose>
			                                           			<c:when test="${not empty  fn:trim(userProfile.industryName)}">
			                                           				<c:out value="${userProfile.industryName}"></c:out>
			                                           			</c:when>
			                                           			<c:otherwise>
			                                           				<c:out value="Your Industry Name"></c:out>
			                                           			</c:otherwise>
			                                           		</c:choose>
		                                            </span>
                                            	</em>
                                            <input type="hidden" id="industryCd" value="${userProfile.industryCd}"/>
                                          </span>
                                      </div>
                                    </td>
                                  </tr>
                                  
                                </table>
                              </div>
                              <c:if test="${first_time_login}">
	                              <div style="float:right; padding-right:10px; position: absolute; top: 38px; right: 5px;">
	                                <a href="${contentsBaseURL}/CommunitySearch.html">Skip this step</a>
	                              </div>
	                              <c:remove var="first_time_login" scope="session"/>
                              </c:if>
                              
                            </td>
                          </tr>
                        </table>
                      </div>
                  </div>


                  <div id="accordion">
                      <div>
                          <h3 class="blueHeader14"><a href="#">My Contact Info</a></h3>
                          <div id="contactInfoAccordian">
                            
                              <h3>
                                <span>Phone Number</span>
                                <span id="phoneNumberDisplay">7503254033</span>
                                <span><a href="">Edit</a></span>
                              </h3>
                              <div>
                                <input type="text" id="phoneNumberInput" value="7503254033" />
                                <button type="button" id="savePhoneButton" class="blueButton smallButton">Save</button>
                              </div>
                              <h3>
                                <span>Primary Email</span>
                                <span id="priEmailDisplay">simran_joy16@yahoo.co.in</span>
                                <span><a href="">Edit</a></span>
                              </h3>
                              <div>
                                <input type="text" id="primaryEmailInput" value="simran_joy16@yahoo.co.in" />
                                <button type="button" id="savePriEmailButton" class="blueButton smallButton">Save</button>
                              </div>
                              <h3>
                                <span>Contact Email</span>
                                <span id="contactEmailDisplay">simran_joy16@yahoo.co.in</span>
                                <span><a href="">Edit</a></span>
                              </h3>
                              <div>
                                <input type="text" id="contactEmailInput" value="simran_joy16@yahoo.co.in" />
                                <button type="button" id="saveContactEmailButton" class="blueButton smallButton">Save</button>
                              </div>
                              <h3>
                                <span>Address</span>
                                <span>House No. 000, Sector 15, Gurgaon, Haryana.</span>
                                <span><a href="">Edit</a></span>
                              </h3>
                              <div id="addressAccBox">
                                <input type="text" id="pincode"  placeholder="Pincode"/>
                                <span class="webSymbol blueOnWhite font20 cursorPointer" id="pincodeButton">V</span>
                                <div id="locationOptions" class="hidden">
                                  <ul>
                                    <li>
                                      <input name="locationRadio" type="radio" id="loc1" val="1"/>
                                      <label for="loc1">Gurgaon, Haryana</label>
                                    </li>
                                    <li>
                                      <input name="locationRadio" type="radio" id="loc2" val="2"/>
                                      <label for="loc2">Noida, UP</label>
                                    </li>
                                    <li>
                                      <input name="locationRadio" type="radio" id="loc3" val="3"/>
                                      <label for="loc3">Delhi</label>
                                    </li>
                                  </ul>
                                </div>

                                <input type="text" id="addressLine1Input" class="mediumLengthBox" value="House No. 000," placeholder="Address Line 1"/>
                                <input type="text" id="addressLine2Input" class="mediumLengthBox" value="Sector 15," placeholder="Address Line 2"/>
                                <div id="selectedLocation" class="lightGreyHighlight mediumLengthBox hidden">
                                  
                                </div>
                                <div>
                                  <button type="button" id="saveContactEmailButton" class="blueButton smallButton">Save</button>
                                </div>
                              </div>
                          </div>
                      </div>
                      <div id="myCommunitiesAcc">
                          <h3 class="blueHeader14"><a href="#">My Communities</a></h3>
                          <div>
                            <h5><b>
                              <div>
                                <a href="${contentsBaseURL}/CommunitySearch.html">Find more communities.</a>
                              </div>
                              <div class="hidden">
                                <a href="${contentsBaseURL}/CommunitySearch.html">Find Communities.</a>
                              </div>
                              </b>
                            </h5>
                              <div id="container01" style="margin-top:20px;overflow: hidden;" class="masonry">

                              </div>
                          </div>
                      </div>
                      <div>

                          <h3 class="blueHeader14"><a href="#">About Me</a></h3>
                          <div>
							<anucana:edit-image accessId="${userProfile.userId}" properties="aboutMeContent" style="text-align:right;padding-bottom:10px;display:block;" mode="span-blue"></anucana:edit-image>
                            <div id="aboutMeContent">
                              A seasoned software programmer with extensive work experience in architecture, design and development of complex and large sized projects.<br><br>
                              - Sun Certified developer for Java Web services (SCDJWS Certified). Sun Certified Java Programmer ( SCJP 1.4 Certified )<br><br>
                              - Proficiency in object oriented programming and design patterns. Strong in Core Java, RDBMS, data modeling, XML processing, Web services.<br><br>
                              - Domain knowledge of banking and financial industry especially trading and risk management, custody, corporate actions and SWIFT<br><br>
                              - Passionate in public speaking, training, mentoring and knowledge management.<br><br>
                              Specialties: Java / J2EE<br><br>
                            </div>
                        </div>
                      </div>
                  </div>
                </div>
            </div> <!-- end of grey_wrapper -->

        </div> <!-- end of anucana_main -->
	    <div id="emptyPad" style="height: 130px"></div>
	    <%@ include file="fragments/footerContent.jsp" %>
	    </div>
    </div>
    
  <script type='text/javascript' src='${contentsBaseURL}/js/logging.js'></script>
  <script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery-ui.js"></script>
  <script src="${contentsBaseURL}/js/masonry.pkgd.js"></script>
  <script src="${contentsBaseURL}/js/imagesloaded.pkgd.js"></script>
  <script defer src="${contentsBaseURL}/js/jquery.flexslider.js"></script>
  <script src="${contentsBaseURL}/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery.colorbox.js"></script>

  <script type="text/javascript">
	$(window).load(function() {

			$.getJSON("${pageContext.request.contextPath}/util/unmanaged/group/industry_type_cd",function(jsonData){
	    		$( "#industryName" ).autocomplete({
	    			source: jsonData.typeList,
	            	focus: function() {
	                	$(".ui-autocomplete").addClass("custom-onhover");
	            	},
					select: function( event, ui) {
						$("#industryCd").val(ui.item.typeCode);
					}
	    		}).data( "ui-autocomplete" )._resizeMenu = function() {
	       			$("#ui-id-1").css("height","300px").css("overflow","hidden");
	       		};
       		});
		
    		
    		
         $( ".tooltip" ).tooltip({
            tooltipClass: "custom-tooltip-styling",
            show: null,
            position: {
            my: "left middle",
            at: "right middle"
            },
            open: function( event, ui ) {
            ui.tooltip.animate({ top: ui.tooltip.position().top + 10 }, "fast" );
            },
            content: function() {
              return $(this).attr('title');
            }
        });

         function showErrorMessage(field, my1, my2, at1, at2, message, errorClass){
              $(field).addClass(errorClass);
              $(field).attr('title',message);
              $(field).tooltip({
                tooltipClass: "error-tooltip-styling",
              show: null,
              position: {
              my: my1+" "+my2,
              at: at1+" "+at2
              },
              content: function() {
                return $(this).attr('title');
              }
            });
            $(field).tooltip('open');
          
         }

        

        function refreshMasonry(){
              $container.masonry({
                itemSelector: '.masonryBox',
                columnWidth: 50,
                isAnimated: true,
                gutter:26
              });
        }


        $(function() {
            var $acc = $("#accordion > div, #contactInfoAccordian").accordion({ header: "> h3", 
              collapsible: true, 
              active: false, 
              heightStyle: "content"
            });
            $("#accordion > div:last-child").accordion('option', 'active', 0);

            $( "#myCommunitiesAcc" ).on( "accordionactivate", function( event, ui ) {
              refreshMasonry();
            } );
        })

        $('#anucana_outer_wrapper').on("click", "#pincodeButton", function() {
            $('#locationOptions').removeClass('hidden');
        });


        $('#anucana_outer_wrapper').on("click", "#locationOptions", function() {
            var selectedLocation = $('input[type="radio"][name="locationRadio"]:checked + label').text();
            $('#locationOptions').addClass('hidden');
            $('#selectedLocation').removeClass('hidden');
            $('#selectedLocation').text(selectedLocation);
        });


        /* Validation methods of contactInfoAccordian input fields start here.. This code can be further streamlined */

        $('#anucana_outer_wrapper').on("click", "#savePhoneButton", function() {
          // Call the static phone number validation here -----
          var updatedValue = $('#phoneNumberInput').val();
          if(! checkNullOrEmpty(updatedValue)){
            showErrorMessage($('#phoneNumberInput'), "right", "middle", "left-20", "middle", "Please enter valid phone number", 'errorInputbox');
            return false;
          }
          else{
            $('#phoneNumberInput').removeAttr('title').removeClass('errorInputbox');
          }
          $('#phoneNumberDisplay').text(updatedValue);
          $("#contactInfoAccordian").accordion({active: false}).click();
        });

       $('#anucana_outer_wrapper').on("click", "#savePriEmailButton", function() {
          // Call the static email validations here -----
          var updatedValue = $('#primaryEmailInput').val();
          if(! checkNullOrEmpty(updatedValue)){
            showErrorMessage($('#primaryEmailInput'), "right", "middle", "left-20", "middle", "Please enter valid email number", 'errorInputbox');
            return false;
          }
          else{
            $('#primaryEmailInput').removeAttr('title').removeClass('errorInputbox');
          }
          $('#priEmailDisplay').text(updatedValue);
          $("#contactInfoAccordian").accordion({active: false}).click();
        });

        $('#anucana_outer_wrapper').on("click", "#saveContactEmailButton", function() {
          // Call the static email validations here -----
          var updatedValue = $('#contactEmailInput').val();
          if(!checkNullOrEmpty(updatedValue)){
            showErrorMessage($('#contactEmailInput'), "right", "middle", "left-20", "middle", "Please enter valid email number", 'errorInputbox');
            return false;
          }else{
            $('#contactEmailInput').removeAttr('title').removeClass('errorInputbox');
          }
          $('#contactEmailDisplay').text(updatedValue);
          $("#contactInfoAccordian").accordion({active: false}).click();
        });

 
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

        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.
        function ajaxCall(){
          var responseJSON = [
          {"trainer":"Mark","eventName":"Relics of Python","eventDate":"26-Mar-2014", "startTime":"03:30PM","duration":"180 min", "eventVenue":"Hayat Hotel", "imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna blabber on {eventName}" ,  "impIndex":"6", "membershipStatus": "false"},
          {"trainer":"Tony","eventName":"Relics of PHP","eventDate":"22-Apr-2014", "startTime":"05:30PM","duration":"180 min", "eventVenue":"Regals Residency","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}" ,  "impIndex":"6", "membershipStatus": "true"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"6", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"6", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"6", "membershipStatus": "false"},
          {"trainer":"Brian","eventName":"Relics of Ruby","eventDate":"25-May-2014", "startTime":"01:30PM","duration":"180 min" ,"eventVenue":"Lutyens","imgSrc":"${contentsBaseURL}/images/featured_project.jpg", "shortDesc":"{trainerNameMarkup} is gonna dance on {eventNameMarkup}" , "longDescription":"Its a long desc. {trainerName} is gonna dance on {eventName}" ,  "impIndex":"6", "membershipStatus": "false"}
          ];

          return responseJSON;
        }

        // Global variable to count the number of dynamic boxes loaded on this page so far
        var dynamicBoxesLoaded = 0;
        var $container = $('.masonry');

        //Below dummy json object will be replaced by the dynamically fetched json.
        var responseJSONN = ajaxCall();
        appendMasonryElements(responseJSONN);


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
                  itemSelector: '.community_box',
                  columnWidth: 60,
                  isAnimated: true,
                  gutter:20
                });
            });
        }


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
          '<div id="dynamicBox{boxIndex}" class="community_box col{impIndex}">'+
            '<div class="communityBoxLabel">'+
              '<a href="CommunityPage.html">'+
                '<img class="communityBoxPhoto" src={imageSource}>'+
              '</a>'+
              '<div class="border joinCircle_CSR '+ backgroundColor +'">'+
                '<div class="circleFiller">'+
                  '<span class="'+ joinCircleClass +'">'+ joinCircleText +'</span>'+
                '</div>'+
              '</div>'+
            '</div>'+
            '<div  style="background:white;padding:5px;">'+
                '<p style="color:black;">{shortDesc}</p>'+
            '</div>'+
          '</div>';

          var trainerNameMarkupString = '<span class="trainerName">{trainerName}</span>';
          var eventNameMarkupString = '<span class="eventName">{eventName}</span>';


          dynamicDivMarkupString = dynamicDivMarkupString.split(boxIndexMatcher).join((index+lastLoadedCount));
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


          $(".inline").colorbox({inline:true, width:"50%", initialWidth: 100, initialHeight: 100});

          function checkNullOrEmpty(fieldValue){
              if (fieldValue == null || fieldValue.length==0){
                return false;
              }
              return true;
          }




          function validateProperties(props){
	          var prop1 = props[0];
	          var prop2 = props[1];
	          
	          if( prop1 == "firstName" && prop2 == "lastName"){
	        	  var firstNameValue = $("#"+prop1).text();
	              var lastNameValue = $("#"+prop2).text();
	              var valid1 = checkNullOrEmpty(firstNameValue);
	              if (!valid1){
	        	        showErrorMessage(firstName,"right","bottom","left+50","top-10","Please enter First Name", 'errorSpanOnGrey');
	              }
	              else{
	    	      		$(firstName).removeAttr('title').removeClass('errorSpanOnGrey');
	              }
	
	              var valid2 = checkNullOrEmpty(lastNameValue);
	              if (! valid2){
		                showErrorMessage(lastName,"left","bottom","right-50","top-10","Please enter Last Name", 'errorSpanOnGrey')
	              }
	              else{
		                $(lastName).removeAttr('title').removeClass('errorSpanOnGrey');;
	              }
	              return (valid1 && valid2);
	          }else{
	         	  return true;
	          }
           }



           function showHideIcons(icon1, icon2){
              $(icon1).addClass('hidden');
              $(icon2).removeClass('hidden');
            }

            function activateReadWriteMode(textDiv, editIcon, saveIcon){
              $(textDiv).attr('contenteditable','true');
              showHideIcons(editIcon, saveIcon);
            }

            function activateReadOnlyMode(textDiv, editIcon, saveIcon){
              $(textDiv).removeAttr('contenteditable');
              showHideIcons(saveIcon, editIcon); 
            }
			
            $(".editasync").on("click", function() {
				var $this = $(this);

				var saveProps = $this.parent().attr("data-props").split(" ");
            	$.each(saveProps,function(index,value){
            		activateReadWriteMode($("#" + value), $this, $this.siblings());	
            	}); 
              
            });
            
			$(".saveasync").on("click",function(){
				var $this = $(this);
				var saveProps = $this.parent().attr("data-props").split(" ");
				var valid = validateProperties(saveProps);
	             if(valid){
	            	$.each(saveProps,function(index,value){
	            		activateReadOnlyMode($("#" + value), $this.siblings(), $this);	
	            	}); 
	              }
			});
			
            $('#anucana_outer_wrapper').on("click", "#editCommunityEmail", function() {
              activateReadWriteMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));
            });

            $('#anucana_outer_wrapper').on("click", "#saveCommunityEmail", function() {
              activateReadOnlyMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));
            });


        // This method appends newly generated masonry boxes to the masonry container
        function appendMemberElements(responseJSON, boxList){
          var lastLoadedCount = dynamicBoxesLoaded;
          $.each(responseJSON, function(i, eventData) {
            var boxElement = getMemberBoxElement(i, lastLoadedCount, eventData);
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


        // Generates a random importance index
        function getRandomImpIndex() {
          var iRand = Math.random();
          var impIndex = iRand > 0.85 ? 1 : iRand > 0.6 ? 2 : iRand > 0.35 ? 3 : 3;
          return impIndex;
        }


        /* This method is completely configurable wrt. the box html template to be picked from the properties file. Non configurable alternate code can be refered at the end of this script tag.
        */
        function getMemberBoxElement(index, lastLoadedCount, eventData) {
          
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
          '<div id="dynamicBox{boxIndex}" class="masonryBox community_box verticalMargin20 col{impIndex}" style="background:white;">'+
            '<span style="float:left;width:40%">'+
              '<a href="#inline_content{boxIndex}">'+
                '<img class="memberBoxPhoto" src={imageSource}>'+
              '</a>'+
            '</span>'+
            '<p style="overflow:hidden;padding:5px;">'+
                '{shortDesc}'+
            '</p>'+
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

 

        $(function() {
          var availableTags = [
          "Harsimranjit Singh",
          "Arvind Srivastva",
          "Jyoti Verma",
          "Anuj Garg",
          "Aarti Mukkar",
          "Rakesh Kapoor",
          "Srinivasan",
          "Ramanujan",
          "Drishti Khanna",
          "Ujwal Chawdhary",
          "Shruti Kakkar",
          "Mohit Khurana"
          ];
          $( "#searchMember_keyword" ).autocomplete({
          source: availableTags
          });
        });

        $('.border').click(function(){
          //Make an ajax call here to join this particular community, and in case success is returned, execute the below code.
          $(this).css("background-color","#009DDB");
          $(".joinTextStyle", this).removeClass("joinTextStyle").addClass("icon").text(".");
        });
	});

  </script>

</body>
</html>
