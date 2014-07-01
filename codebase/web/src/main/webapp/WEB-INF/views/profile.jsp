<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="anucana" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<c:set var="editMode" value="false" scope="request"></c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | profile</title>
	<link href="${contentsBaseURL}/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/colorbox.css" />
	<link rel="stylesheet" href="${contentsBaseURL}/css/jcrop/jquery.Jcrop.css" type="text/css" />
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
							  	
                              <!-- Phone number  -->
                              <h3>
                                <span>Phone Number</span>
                                <span id="phoneNumberDisplay">7503254033</span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              <div>
                              	<c:if test="${editMode}">
	                                <input type="text" id="phoneNumberInput" value="7503254033" />
	                                <button type="button" id="savePhoneButton" class="blueButton smallButton">Save</button>
	                            </c:if>    
                              </div>

                              <!-- Contact Email  -->
                              <h3>
                                <span>Contact Email</span>
                                <span id="contactEmailDisplay">simran_joy16@yahoo.co.in</span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              <div>
                              	<c:if test="${editMode}">
	                                <input type="text" id="contactEmailInput" value="simran_joy16@yahoo.co.in" />
	                                <button type="button" id="saveContactEmailButton" class="blueButton smallButton">Save</button>
	                            </c:if>    
                              </div>
                              
                              <!-- Messenger  -->
                              <h3>
                                <span>Messenger</span>
                                <span id="messengerDisplay">arvsri@skype</span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              <div>
                              		<c:if test="${editMode}">
                                		<input type="text" id="messengerInput" value="arvsri@skype" />
                                		<button type="button" id="saveMessengerButton" class="blueButton smallButton">Save</button>
                              		</c:if>  
                              </div>
                              
                              <!-- Address  -->
                              <h3>
                                <span>Address</span>
                                <span>House No. 000, Sector 15, Gurgaon, Haryana.</span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              
                              <div id="addressAccBox">
                              	<c:if test="${editMode}">
	                                <input type="text" id="pincode"  placeholder="Pincode"/>
	                                <span class="webSymbol blueOnWhite font20 cursorPointer" id="pincodeButton">V</span>
	                                <div id="locationOptions" style="max-height: 200px; overflow: auto; "></div>
	
	                                <input type="text" id="addressLine1Input" class="mediumLengthBox" value="House No. 000," placeholder="Address Line 1"/>
	                                <input type="text" id="addressLine2Input" class="mediumLengthBox" value="Sector 15," placeholder="Address Line 2"/>
	                                <div id="selectedLocation" class="lightGreyHighlight mediumLengthBox hidden">
	                                  
	                                </div>
	                                <div>
	                                  <button type="button" id="saveContactEmailButton" class="blueButton smallButton">Save</button>
	                                </div>
	                              </c:if>  
                              </div>
                          </div>
                      </div>
                      <div id="myCommunitiesAcc">
                          <h3 class="blueHeader14"><a href="#">My Communities</a></h3>
                          <div>
                            <h5><b>
                                <a href="${contentsBaseURL}/CommunitySearch.html">Find more communities.</a>
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
	    <div id="emptyPad"></div>
	    <%@ include file="fragments/footerContent.jsp" %>
	    </div>
    </div>
    
  <script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery-ui.js"></script>
  <script src="${contentsBaseURL}/js/masonry.pkgd.js"></script>
  <script src="${contentsBaseURL}/js/imagesloaded.pkgd.js"></script>
  <script defer src="${contentsBaseURL}/js/jquery.flexslider.js"></script>
  <script src="${contentsBaseURL}/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery.colorbox.js"></script>

<!--------------------  Java script for all modes --------------------------------->

	<script type="text/javascript">
		(function() {
	    	var $acc = $("#accordion > div, #contactInfoAccordian").accordion({ header: "> h3", 
	  			collapsible: true, 
	    		active: false, 
	    		heightStyle: "content"
	    	});
	    	$("#accordion > div:last-child").accordion('option', 'active', 0);
		})();
	</script>
	
	
<!--------------------  Java script for edit Mode --------------------------------->	
<c:if test="${editMode}">
  <script type="text/javascript">
	$(document).ready(function() {

		$.getJSON("${pageContext.request.contextPath}/util/unmanaged/group/industry_type_cd",function(jsonData){
	    		$( "#industryName" ).autocomplete({
	    			source: jsonData.typeList,
	            	focus: function() {
	                	$(".ui-autocomplete").addClass("custom-onhover");
	            	},
					select: function( event, ui) {
						$("#industryCd").val(ui.item.typeCode);
					}
	    		}).data("ui-autocomplete")._resizeMenu = function() {
	       			$("#ui-id-1").css("height","300px").css("overflow","hidden");
	       		};
       	});
		
		// Execute the upload image function
		if(typeof uploadImage !== 'undefined'){
			uploadImage();		
		}
    	
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
         
         
        $('#pincodeButton').on("click", function() {
        	$('#locationOptions').html("").removeClass('hidden');
        	$('#selectedLocation').addClass('hidden');
        	
        	var pincode =  $("#pincode").val();
			console.log(pincode);
        	if(!checkNullOrEmpty(pincode)){
        		return;
        	}
        	
        	$.getJSON("${pageContext.request.contextPath}/util/unmanaged/pincode/"+pincode,function(jsonData){
        		var html = "<ul>";
        		$.each(jsonData.postalCodeList,function(index,value){
        			html = html + "<li><input name='locationRadio' type='radio' id='" + value.id + "' val='" + value.id + "'/><label for='" + value.id + "'>" 
        			+ value.office + ", "+ value.district + ", "+ value.state + "</label></li>"
        		});
        		html = html + "</ul>"
				console.log(html);
        		$('#locationOptions').html(html);
        	});
        });


        $('#anucana_outer_wrapper').on("click", "#locationOptions", function() {
            var selectedLocation = $('input[type="radio"][name="locationRadio"]:checked + label').text();
        	if(!checkNullOrEmpty(selectedLocation)){
        		return;
        	}
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

        
       $('#anucana_outer_wrapper').on("click", "#saveMessengerButton", function() {
          // Call the static email validations here -----
          var updatedValue = $('#messengerInput').val();
          if(! checkNullOrEmpty(updatedValue)){
            showErrorMessage($('#messengerInput'), "right", "middle", "left-20", "middle", "Please enter valid instant messenger id", 'errorInputbox');
            return false;
          }
          else{
            $('#messengerInput').removeAttr('title').removeClass('errorInputbox');
          }
          $('#messengerDisplay').text(updatedValue);
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
	              }else{
	    	      		$(firstName).removeAttr('title').removeClass('errorSpanOnGrey');
	              }
	
	              var valid2 = checkNullOrEmpty(lastNameValue);
	              if (! valid2){
		                showErrorMessage(lastName,"left","bottom","right-50","top-10","Please enter Last Name", 'errorSpanOnGrey')
	              }else{
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

			
	});

  </script>
</c:if>
</body>
</html>
