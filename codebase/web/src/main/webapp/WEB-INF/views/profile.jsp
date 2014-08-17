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
	<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
      <!-- Fancy fields css files -->
  <link href="${contentsBaseURL}/fancyfields/fancyfields.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="/web/static/css/colorbox.css" />
	<link rel="stylesheet" href="/web/static/css/jcrop/jquery.Jcrop.css" type="text/css" />
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
                                          <span class="profileBannerText">
                                            <table>
                                              <tr>
                                                <td class='editIconsTd'><anucana:edit-image accessId="${userProfile.userId}" properties="firstName lastName"></anucana:edit-image></td>
                                                <td><span id="firstNameReadOnly" class="tooltip" title="Click <img src='${contentsBaseURL}/images/edit-pen-icon-white.png'> icon to edit you name.">${userProfile.firstName}</span><input id="firstName" placeholder="First Name" value="${userProfile.firstName}" class="hidden"/></td>
                                                <td><span id="lastNameReadOnly" class="tooltip" title="Click <img src='${contentsBaseURL}/images/edit-pen-icon-white.png'> icon to edit you name.">${userProfile.lastName}</span><input id="lastName" placeholder="Last Name"  value="${userProfile.lastName}" class="hidden"/></td>
                                              </tr>
                                            </table>
                                          </span>
                                      </div>
                                    </td>
                                  </tr>
                                  <tr>
                                    <td style="padding:5px 0px 10px 65px;">
                                      <div id="companyNameBox">
                                          <span class="profileBannerText">
                                              <table>
                                                <tr>
                                                  <td class='editIconsTd'>
                                                    <anucana:edit-image accessId="${userProfile.userId}" properties="profileHeading"></anucana:edit-image>
                                                  </td>

                                                  <td>
                                                    <span id="profileHeadingReadOnly" class="tooltip" title="<b>Click <img src='${contentsBaseURL}/images/edit-pen-icon-white.png'> icon to enter your Professional Headline.</b><br/><br/><span class='tooltipExample'>eg. Experienced Transportation Executive, Web Designer and Information Architect, Visionary Entrepreneur and Investor.</span>">
                                                      <c:choose>
                                                        <c:when test="${not empty  fn:trim(userProfile.profileHeading)}">
                                                          <c:out value="${userProfile.profileHeading}"></c:out>
                                                        </c:when>
                                                        <c:otherwise>
                                                          <em><c:out value="Your Professional Headline"></c:out></em>
                                                        </c:otherwise>
                                                      </c:choose>
                                                    </span>
                                                    <input id="profileHeading" style="width:335px;" value="${userProfile.profileHeading}" class="hidden" placeholder="Your Professional Headline"/>
                                                  </td>
                                                </tr>
                                              </table>
                                          </span>
                                      </div>
                                    </td>
                                  </tr>
                                  <tr>
                                    <td style="padding:5px 0px 10px 65px;">

                                      <div id="industryInfoBox">
                                          <span class="profileBannerText">
                                              <table>
                                                <tr>
                                                  <td class='editIconsTd'><anucana:edit-image accessId="${userProfile.userId}" properties="industryCd"></anucana:edit-image></td>
                                                  <td>
                                                      <span id="industryDropDownReadOnly" class="tooltip" title="Click <img src='${contentsBaseURL}/images/edit-pen-icon-white.png'> icon to enter your Industry name">
                                                            <c:choose>
                                                              <c:when test="${not empty  fn:trim(userProfile.industryName)}">
                                                                <c:out value="${userProfile.industryName}"></c:out>
                                                              </c:when>
                                                              <c:otherwise>
                                                                <em><c:out value="Enter Industry Name"></c:out></em>
                                                              </c:otherwise>
                                                            </c:choose>
                                                      </span>
                                                      
                                                        <select id="industryCd" class="hidden"> 
                                                          <c:choose>
                                                            <c:when test="${not empty  fn:trim(userProfile.industryName)}">
                                                              <option value="${userProfile.industryCd}">${userProfile.industryName}</option> 
                                                            </c:when>
                                                            <c:otherwise>
                                                              <option value="">Pick Industry Name</option> 
                                                            </c:otherwise>
                                                          </c:choose>                        
                                                        </select>
                                                      
                                                  </td>
                                                </tr>
                                              </table>
	                                            <!--span class="tooltip industryAutoComplete " id="industryName" title="<b>Enter your Industry Name.</b><br/><br/><span class='tooltipExample'>eg. Information Technology and Services">
	                                           		<c:choose>
	                                           			<c:when test="${not empty  fn:trim(userProfile.industryName)}">
	                                           				<c:out value="${userProfile.industryName}"></c:out>
	                                           			</c:when>
	                                           			<c:otherwise>
	                                           				<c:out value="Your Industry Name"></c:out>
	                                           			</c:otherwise>
	                                           		</c:choose>
	                                            </span-->
                                            	
                                            	<input type="hidden" id="industryCd" value="${userProfile.industryCd}"/>
                                          </span>
                                      </div>
                                    </td>
                                  </tr>
                                </table>
                              </div>
                              <c:if test="${first_time_login}">
	                              <div style="float:right; padding-right:10px; position: absolute; top: 38px; right: 5px;">
	                                <a href="${pageContext.request.contextPath}/community/unmanaged/search">Skip this step</a>
	                              </div>
	                              <c:remove var="first_time_login" scope="session"/>
                              </c:if>
                              
                            </td>
                          </tr>
                        </table>
                      </div>
                  </div>


                  <div id="accordion" class="startsUgly">
                      <div>
                          <h3 class="blueHeader14"><a href="#">My Contact Info</a></h3>
                          <div id="contactInfoAccordian">
							  	
                              <!-- Phone number  -->
                              <h3>
                                <span>Phone Number</span>
                                <span id="phoneNumberDisplay"><c:out value="${userProfile.phonenumber}"></c:out>&nbsp;</span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              
                                <div id="phoneNoAccBox" data-props="phonenumber phoneType phonenumberAccess">
                                  <c:if test="${editMode}">
                                    <table>
                                      <tr>
                                        <td align="right" style="color:#555555">Phone #&nbsp;</td>
                                        <td><input type="text" id="phonenumber" value="${userProfile.phonenumber}" /><br/></td>
                                      </tr>
                                      <tr>
                                        <td align="right" style="color:#555555">Phone type&nbsp;</td>
                                        <td>
                                          <select id="phoneType">
                                             <c:forEach items="${phoneTypes}" var="phoneType">
                                              <option value="${phoneType.typeCode}" 
                                                <c:if test="${phoneType.typeCode eq userProfile.phoneType}">
                                                  selected
                                                </c:if> 
                                              >
                            					<c:out value="${phoneType.typeDescription}"></c:out>
                                              </option>
                                             </c:forEach>
                                          </select>
                                        </td>
                                      </tr>
                                      <tr>
                                        <td align="right" style="color:#555555">Visible to&nbsp;</td>
                                        <td>
                                          <select id="phonenumberAccess">
                                             <c:forEach items="${accessCodes}" var="accessCode">
                                              <option value="${accessCode.typeCode}"
                                                <c:if test="${accessCode.typeCode eq userProfile.phonenumberAccess}">
                                                  <c:out value="selected"></c:out>
                                                </c:if> 
                                              >
                                                <c:out value="${accessCode.typeDescription}"></c:out>
                                              </option>
                                             </c:forEach>
                                          </select>
                                        </td>
                                      </tr>
                                    </table>
                                    <input type="button" id="savePhoneButton" class="blueButton smallButton saveasync" value="Save"></input>

                                    <span style="background-color:#6FBA54; color:#FFFFFF; padding:3px 3px 5px; margin-left:5px; display:none" class="roundedCorners successMsg">
                                        <span class="webSymbol">&nbsp;.</span> Saved Sucessfully !&nbsp;
                                    </span> 
                                </c:if>  
                              </div>
                              
                              
                              <!-- Contact Email  -->
                              <h3>
                                <span>Contact Email</span>
                                <span id="contactEmailDisplay"><c:out value="${userProfile.emailId}"></c:out></span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              <div id="emailAccBox" data-props="emailId emailAccess">
                                <c:if test="${editMode}">
                                  <table>
                                    <tr>
                                      <td align="right" style="color:#555555">Contact Email #&nbsp;</td>
                                      <td><input type="text" id="emailId" value="${userProfile.emailId}"/><br/></td>
                                    </tr>
                                    <tr>
                                      <td align="right" style="color:#555555">Visible to&nbsp;</td>
                                      <td>
                                        <select id="emailAccess">
	                                         <c:forEach items="${accessCodes}" var="accessCode">
	                                         	<option value="${accessCode.typeCode}"
	                                         		<c:if test="${accessCode.typeCode eq userProfile.emailAccess}">
	                                         			<c:out value="selected"></c:out>
	                                         		</c:if> 
	                                         	>
	                                         		<c:out value="${accessCode.typeDescription}"></c:out>
	                                         	</option>
	                                         </c:forEach>
                                        </select>
                                      </td>
                                    </tr>
                                  </table>
                                  <input type="button" id="saveContactEmailButton" class="blueButton smallButton saveasync" value="Save"></input>

                                  <span style="background-color:#6FBA54; color:#FFFFFF; padding:3px 3px 5px; margin-left:5px; display:none" class="roundedCorners successMsg">
                                        <span class="webSymbol">&nbsp;.</span> Saved Sucessfully !&nbsp;
                                  </span> 
                                </c:if>  
                              </div>


    	                         
                              <!-- Messenger  -->
                              <h3>
                                <span>Messenger</span>
                                <span id="messengerDisplay">
                                	<c:if test="${not empty userProfile.messenger}">
										<c:out value="${userProfile.messenger}"></c:out>@<c:out value="${userProfile.messengerTypeDescription}"></c:out>
                                	</c:if>
                                &nbsp;</span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              
                               <div id="messengerAccBox" data-props="messenger messengerType messengerAccess">
                              	<c:if test="${editMode}">
                                  <table>
                                    <tr>
                                      <td align="right" style="color:#555555">Messenger #&nbsp;</td>
                                      <td><input type="text" id="messenger" value="${userProfile.messenger}"/><br/></td>
                                    </tr>
                                    <tr>
                                      <td align="right" style="color:#555555">Messenger type&nbsp;</td>
                                      <td>
                                        <select id="messengerType">
	                                         <c:forEach items="${messengerTypes}" var="messengerType">
	                                         	<option value="${messengerType.typeCode}"
	                                        		<c:if test="${messengerType.typeCode eq userProfile.messengerType}">
	                                        			<c:out value="selected"></c:out>
	                                        		</c:if> 
	                                         	>
	                                         		<c:out value="${messengerType.typeDescription}"></c:out>
	                                         	</option>
	                                         </c:forEach>
                                        </select>
                                      </td>
                                    </tr>
                                    <tr>
                                      <td align="right" style="color:#555555">Visible to&nbsp;</td>
                                      <td>
                                        <select id="messengerAccess">
	                                         <c:forEach items="${accessCodes}" var="accessCode">
	                                         	<option value="${accessCode.typeCode}"
	                                         		<c:if test="${accessCode.typeCode eq userProfile.messengerAccess}">
	                                         			<c:out value="selected"></c:out>
	                                         		</c:if> 
	                                         	>
	                                         		<c:out value="${accessCode.typeDescription}"></c:out>
	                                         	</option>
	                                         </c:forEach>
                                        </select>
                                      </td>
                                    </tr>
                                  </table>
                                  <input type="button" id="saveMessengerButton" class="blueButton smallButton saveasync" value="Save"></input>
                                  <span style="background-color:#6FBA54; color:#FFFFFF; padding:3px 3px 5px; margin-left:5px; display:none" class="roundedCorners successMsg">
                                        <span class="webSymbol">&nbsp;.</span> Saved Sucessfully !&nbsp;
                                  </span> 
	                              </c:if>  
    	                         </div>
                              
                              <!-- Address  -->
                              <h3>
                                <span>Address</span>
                                <span><c:out value="${userProfile.addressDescription}"></c:out></span>
                                <span><c:if test="${editMode}"><a href="">Edit</a></c:if></span>
                              </h3>
                              
                              <div id="addressAccBox" data-props="pincodeId addressLine1 addressLine2 addressAccess">
                              	<c:if test="${editMode}">
	                                <input type="text" id="pincode" value="${userProfile.pinCode}" placeholder="Pincode"/>
	                                <input type="hidden" id="pincodeId" value="${userProfile.pincodeId}"></input>
	                                <span class="webSymbol blueOnWhite font20 cursorPointer" id="pincodeButton">V</span>
	                                
	                                <div id="locationOptions" style="max-height: 200px; overflow: auto;"></div>

	                                <input type="text" id="addressLine1" class="mediumLengthBox" value="${userProfile.addressLine1}" placeholder="Address Line 1"/>
	                                <input type="text" id="addressLine2" class="mediumLengthBox" value="${userProfile.addressLine2}" placeholder="Address Line 2"/>
	                                
	                                <c:choose>
	                                	<c:when test="${not empty userProfile.pincodeId}">
			                                <div id="selectedLocation" class="lightGreyHighlight mediumLengthBox">
												<label for="${userProfile.pincodeId}">${userProfile.pincodeIdDescription}</label>			                                
			                                </div>
	                                	</c:when>
	                                	<c:otherwise>
			                                <div id="selectedLocation" class="lightGreyHighlight mediumLengthBox hidden"></div>
	                                	</c:otherwise>
	                                </c:choose>
                                	
                                    <select id="addressAccess">
                                      <c:forEach items="${accessCodes}" var="accessCode">
                                      	<option value="${accessCode.typeCode}"
                                      		<c:if test="${accessCode.typeCode eq userProfile.addressAccess}">
                                      			<c:out value="selected"></c:out>
                                      		</c:if> 
                                      	>
                                      		<c:out value="${accessCode.typeDescription}"></c:out>
                                      	</option>
                                      </c:forEach>
                                    </select>
                                    <input type="button" id="savePhoneButton" class="blueButton smallButton saveasync" value="Save"></input>

                                  <span style="background-color:#6FBA54; color:#FFFFFF; padding:3px 3px 5px; margin-left:5px; display:none" class="roundedCorners successMsg">
                                        <span class="webSymbol">&nbsp;.</span> Saved Sucessfully !&nbsp;
                                  </span> 
	                              </c:if>  
                              </div>
                          </div>
                      </div>
                      <div id="myCommunitiesAcc">
                          <h3 class="blueHeader14"><a href="#">My Communities</a></h3>
                          <div>
                            <h5>
                            	<b>
                                <a href="${pageContext.request.contextPath}/community/unmanaged/search">Find more communities.</a>
                              </b>
                            </h5>
                              <div id="container01" style="margin-top:20px;overflow: hidden;" class="masonry"></div>
                          </div>
                      </div>
                      <div>
                          <h3 class="blueHeader14"><a href="#">About Me</a></h3>
                          <div>
	                          <c:if test="${empty summaryRowsCount}">
		                          <c:set var="summaryRowsCount" value="5"></c:set>
	                          </c:if>
							  <anucana:edit-image accessId="${userProfile.userId}" properties="summary" style="text-align:right;padding-bottom:10px;display:block;" mode="span-blue"></anucana:edit-image>
							  <textarea readonly id="summary" rows="${summaryRowsCount + 5}" style="width: 100%;border: none" data-default-height="10px" data-animated="false">
								  <c:out value="${userProfile.summary}"></c:out>
							  </textarea>
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
    
  <script src="/web/static/js/jquery1.9.1.min.js"></script>
  <script src="/web/static/js/jquery-ui.js"></script>
  <script src="/web/static/js/masonry.pkgd.js"></script>
  <script src="/web/static/js/imagesloaded.pkgd.js"></script>
  <script src="/web/static/js/jquery.flexslider.js"></script>
  <script src="/web/static/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="/web/static/js/jquery.colorbox.js"></script>
  <script src="/web/static/js/anucana-util.js" type="text/javascript"></script>
  <script src="/web/static/js/jquery.textarea.autoresize.js"></script>
      <!-- Fancy fields js file -->
  <script src="${contentsBaseURL}/fancyfields/fancyfields-1.2.min.js" type="text/javascript"></script>
    <!-- Fancy fields add-on for custom scroll bar -->
  <script src="${contentsBaseURL}/fancyfields/fancyfields.csb.min.js" type="text/javascript"></script>

	<!--------------------  Java script for all modes ---------------------->

	<script type="text/javascript">
	    $(document).ready(function() {
	      $(".startsUgly").show();
	
	      $(".ui-accordion-header").click(function() {
	        $('.error-tooltip-styling').hide();
	      });
	    });
    
		(function() {
	    	var $acc = $("#accordion > div, #contactInfoAccordian").accordion({ header: "> h3", 
	  			collapsible: true, 
	    		active: false, 
	    		heightStyle: "content"
	    	});
	    	$("#accordion > div:last-child").accordion('option', 'active', 0);

	    	var $masonry = $('.masonry');
            $("#myCommunitiesAcc").on( "accordionactivate", function( event, ui ) {
            	$masonry.masonry({itemSelector: '.masonryBox',columnWidth: 50,isAnimated: true,gutter:26});
            });
            
		 	function loadCommunities(){
		    	var search = $.get("${pageContext.request.contextPath}/community/unmanaged/subscribedBy/${userProfile.userId}",null,null,"json");
	    		search.done(function(communities){
				  	  var boxList = $();
			          $.each(communities.communityList, function(i, community) {
			        	var communityURL = "${pageContext.request.contextPath}/community/unmanaged/" + community.communityId;  
				      	var boxElement = getCommunityBox(i, community.userSubscribed,community.bannerUrl,community.communityId,community.about,communityURL);
			          	boxList = boxList.add($(boxElement));
			          });

	  		  		  $masonry = $masonry.append( boxList );
			          $masonry.imagesLoaded( function() {
				      	$masonry.masonry( 'appended', boxList ).masonry({ itemSelector: '.community_box',columnWidth: 100,isAnimated: true,gutter:20 });
		         	  });
				});
				search.fail(function(event){
					$(".errorMsg").text(" An error ocurred while processing !");
				});
		 	}
	   	 	
		 	loadCommunities();
		})();
	</script>
	
  <noscript>
    <style type="text/css">.startsUgly { display: block; }</style>
  </noscript>
	
<!--------------------  Java script for edit Mode -------------------------------->	
<c:if test="${editMode}">
  <script type="text/javascript">
	$(document).ready(function() {
  		$('textarea').autoresize();

      $( "#profileHeading" ).keyup(function() {
        if (this.size >= 80) return;
        if (!this.savesize) this.savesize=this.size;
        this.size=Math.max(this.savesize,this.value.length);
      });
  		
  		// industry code auto complete
  		$.getJSON("${pageContext.request.contextPath}/util/unmanaged/group/industry_type_cd",function(jsonData){

      var selectTag = $("#industryCd");
      $.each(jsonData.typeList, function() {
          selectTag.append($("<option />").val(this.typeCode).text(this.typeDescription));
      });
    });
		
		// Execute the upload image function
		if(typeof uploadImage !== 'undefined'){
			uploadImage();		
		}
    	
		// helper tool tip
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
		
         function activateReadWriteMode(textDiv, editIcon, saveIcon){
            
           	showHideIcons(editIcon, saveIcon);

           	if(textDiv.is("textarea")){
              textDiv.attr('contenteditable','true');
           		textDiv.attr("readonly",false);
           		textDiv.css({ "border": "1px solid"});
           	}
            else{
              textDiv.show();
              textDiv.siblings().hide();
            }
         }

         function activateReadOnlyMode(textDiv, editIcon, saveIcon){
            
           	showHideIcons(saveIcon, editIcon);

           	if(textDiv.is("textarea")){
              textDiv.removeAttr('contenteditable');
           		textDiv.attr("readonly",true);
           		textDiv.css({ "border": "none"});
           	}
            else{
              textDiv.hide();
              textDiv.siblings().show();
            }
         }
			
         $(".editasync").on("click", function() {
			var $this = $(this);
			var saveProps = $this.parent().attr("data-props").split(" ");
         	$.each(saveProps,function(index,value){
         		activateReadWriteMode($("#" + value), $this, $this.siblings());	
         	}); 
           
         });


        /* Identify the property and unbind any tooltip if present*/
        function unbindTooltip(propertyId){
          if($( "#"+propertyId).data("tooltipset")){
            $( "#"+propertyId).tooltip( "destroy" ).data("tooltipset", false);
          }
        }

        /* Identify the property and gets is relevent value for submission*/
        function propVal(propertyId){
        	var $prop = $("#"+propertyId);
        	if($prop == 'undefined' || $prop == 'null' || $prop == ""){
        		return "";
        	}else if($prop.is("span") || $prop.is("div")){
        		return $prop.text().trim();
        	}else if($prop.is("input")){
        		return $prop.val()
        	}else if($prop.is("select")){
        		return $("#"+propertyId + " option:selected").val();
        	}else{
        		return $("#"+propertyId).val();
        	}
        } 
         
		$(".saveasync").on("click",function(){
			var $this = $(this);
			var saveProps = $this.parent().attr("data-props").split(" ");

			 var submitData = new String("");
			 
          	 $.each(saveProps,function(index,saveProp){
               unbindTooltip(saveProp);
          		 var value = encodeURIComponent(propVal(saveProp));
          		 if(checkNullOrEmpty(submitData)){
          			submitData = submitData.concat("&");
          		 }
          		submitData = submitData.concat(saveProp).concat("=").concat(value); 
          	});

             var divOverlayId = $this.parent();


            
             $(divOverlayId).css("position","relative").append('<div id="darkLayer" style="margin:0px !important" class="darkClass" style="display:block"><img src="${contentsBaseURL}/images/loading.gif" class="loading_circle" alt="loading" /></div>'); 

          	 $.ajax({
				type: "post",
  				url: "${pageContext.request.contextPath}/profile/managed/update/${userProfile.userId}",
  				data: submitData,
				dataType: "json",
  				beforeSend: function( xhr ) {
  					// clear all the errors       -- [HS] - This code shdn't be put here. Commented out. It removes all other error messages as well while saving details of a particular section.

					//$(".errorSpanOnGrey").removeAttr('title').removeClass("errorSpanOnGrey");
					//$(".errorInputbox").removeAttr('title').removeClass("errorInputbox");
  				},					
  				success: function(response){
  					var obj = eval(response);
            // TODO Please put comment here - Which condition these blocks cater to ?
  					if(obj.errormsg){
  						showError(saveProps[0],obj.errormsg);
  					}else if(response.viewError != undefined && response.viewError.fieldErrors != undefined && response.viewError.fieldErrors.length != 0){
  						// handle error first
  						var errormsg = ""
  						$.each(response.viewError.fieldErrors,function( key, value ){
  							//showError(saveProps[key],value.errorMessage);  -- using saveProps[key] always returns 0 in case of both first name and last name, hence binding the error message with first name always (even if msg is for last name.) [HS]
                showError(value.field,value.errorMessage);
  						});
  						//showError(saveProps[0],errormsg); -- This shdn't be here [HS] - This causes removal of red highlight by passing empty errormsg.
  					}else{
  		            	// refresh the page if its the first name or last name which has been updated
  		            	$.each(saveProps,function( key, value ){ 
						
							// Below block takes care of switching on read only mode only in case pencil/check combo icons are shown. 'websymbol' class is being used currently to identify such fields. If this style class is removed in future, make sure to update this code with a new class.
							if($this.hasClass('webSymbol')){
								activateReadOnlyMode($("#" + value), $this.siblings(), $this);
							}						
						
							// Below call to showError method passes empty errormsg to remove red highlight on success.
							showError(value,"");
							
  		            		if(value == "firstName" || value == "lastName"){
  		            			document.location = "${pageContext.request.contextPath}/profile/managed/";
  		            		}
                      else if(value == "profileHeading"){
                        displayValue = $('#'+value).val();
                        updateReadOnlyValue('profileHeadingReadOnly', displayValue, '<em>Your Professional Headline</em>');
                      }
                      else if(value == "industryCd"){
                        displayValue = $('#'+value+' option:selected').text();
                        updateReadOnlyValue('industryDropDownReadOnly', displayValue, '<em>Enter Industry Name</em>');
                      }
  		            	});

                    updateHeaderValue(divOverlayId);
                    
                    $(divOverlayId).find('.successMsg').show().delay(2000).fadeOut();
  					}
            $(divOverlayId).find('#darkLayer').remove();
            
  				},
  				error: function(response){
  					showError(saveProps[0],"Error occurred while saving ! Please try again after some time");
            $(divOverlayId).find('#darkLayer').remove();
  				}
   			});
		});


    // Updates the display value in the read only section when user modifies content.
    function updateReadOnlyValue(readOnlyDivId, displayValue, defaultValue){
        var readOnlyDiv = $('#'+readOnlyDivId);
        if($.trim(displayValue)!=''){
          readOnlyDiv.html(displayValue);
        } else{
          readOnlyDiv.html(defaultValue);
        }
    }


    // Updates the display value in header of accordions when user modifies content inside.
    function updateHeaderValue(accordionDiv){
        var divID = $(accordionDiv).attr('id');
        var displayValue = "";

        // Formulate value for phone number
        if(divID == 'phoneNoAccBox'){
          displayValue = $(accordionDiv).find('#phonenumber').val();
          $('#phoneNumberDisplay').html(displayValue+'&nbsp;');
        }

        // Formulate value for contact email
        if(divID == 'emailAccBox'){
          displayValue = $(accordionDiv).find('#emailId').val();
          $('#contactEmailDisplay').html(displayValue+'&nbsp;');
        }

        // Formulate value for messenger
        if(divID == 'messengerAccBox'){
          displayValue = $(accordionDiv).find('#messenger').val();
          $('#messengerDisplay').html(displayValue+'&nbsp;');
        }

        // Formulate value for address
        if(divID == 'addressAccBox'){
          var addressLine1 = $(accordionDiv).find('#addressLine1').val();
          var addressLine2 = $(accordionDiv).find('#addressLine2').val();
          displayValue = addressLine1 + ', ' + addressLine2;
          $('#addressDisplay').html(displayValue+'&nbsp;');
        }


    }

/*

      $('span').on('activate', function() {
          $(this).empty();
          var range, sel;
          if ( (sel = document.selection) && document.body.createTextRange) {
              range = document.body.createTextRange();
              range.moveToElementText(this);
              range.select();
          }
      });

      $('span').focus(function() {
          if (this.hasChildNodes() && document.createRange && window.getSelection) {
              $(this).empty();
              var range, sel;
              range = document.createRange();
              range.selectNodeContents(this);
              sel = window.getSelection();
              sel.removeAllRanges();
              sel.addRange(range);
          }
      });
       
       */  
		function showError(property,errorMsg){
			if(errorMsg == ""){
				if(property == "firstName" || property == "lastName"){
					$("#" + property).removeAttr('title').removeClass("errorSpanOnGrey");
				}else{
					$("#" + property).removeAttr('title').removeClass("errorInputbox");
				}
				return;
			}

			if(property == "firstName"){
				displayError(new String("").concat("#").concat(property),"right","bottom","left+50","top-10",errorMsg,"errorSpanOnGrey");
			}else if(property == "lastName"){
				displayError(new String("").concat("#").concat(property),"right","bottom","left+50","top-10",errorMsg, "errorSpanOnGrey");				
			}else{				
				displayError(new String("").concat("#").concat(property),"left", "middle", "right+20", "middle", errorMsg, "errorInputbox");
			}
			
            function displayError(field, my1, my2, at1, at2, message, errorClass){
                $(field).addClass(errorClass);
                $(field).attr('title',message);
                $(field).tooltip({
                   // track: true,
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
                $(field).tooltip('open').data("tooltipset", true);
            }
		}
		
        $('#pincodeButton').on("click", function() {
        	$('#locationOptions').html("").removeClass('hidden');
        	$('#selectedLocation').addClass('hidden');
        	
        	var pincode =  $("#pincode").val();
        	if(!checkNullOrEmpty(pincode)){
        		showError("pincode","Please enter your pin code");
        		return;
        	}
        	
        	$.getJSON("${pageContext.request.contextPath}/util/unmanaged/pincode/"+pincode,function(jsonData){
        		var html = "<ul>";
        		$.each(jsonData.postalCodeList,function(index,value){
        			html = html + "<li><input name='locationRadio' type='radio' value='" + value.id + "'/><label for='" + value.id + "'>" 
        			+ value.office + ", "+ value.district + ", "+ value.state + "</label></li>"
        		});
        		html = html + "</ul>"
        		$('#locationOptions').html(html);
        	});
        });

        $('#anucana_outer_wrapper').on("click", "#locationOptions", function() {
            var selectedLocation = $('input[type="radio"][name="locationRadio"]:checked + label').text();
            $('#pincodeId').val($('input[type="radio"][name="locationRadio"]:checked').val());
            $('#locationOptions').html("").addClass('hidden');
            $('#selectedLocation').removeClass('hidden');
            $('#selectedLocation').text(selectedLocation);
        });
        
        function checkNullOrEmpty(fieldValue){
           if (fieldValue == null || fieldValue.length==0){
               return false;
           }
           return true;
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
