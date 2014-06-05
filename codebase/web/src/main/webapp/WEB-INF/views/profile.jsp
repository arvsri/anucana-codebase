<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana</title>
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/profile-style.css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="${contentsBaseURL}/css/style.css" />
	<link rel="stylesheet" type="text/css"href="${contentsBaseURL}/css/colorbox.css" />
	
</head>
<body>
	<div id="anucana_outer_wrapper">
		<%@ include file="fragments/headerContent.jsp" %>
		<%@ include file="fragments/sideButtonsGuest.jsp" %>
		<div id="anucana_wrapper" class="wrapper_1020">
		<div class="first_palate">
			<div class="profile-summary">
				<div class="profile-image">
					<img class="preview-picture" src="${contentsBaseURL}/images/arvsri.png" />
					<a class="edit-picture" href="#lightBoxContainer"><img src="${contentsBaseURL}/images/camera-icon.png" /></a>
					
					  <div style="display:none" >
							<div id="lightBoxContainer" >
								<div style="float:left; width:30%;">
									<img class='photo' src="${contentsBaseURL}/images/arvsri.png" />
								</div>
								<div style="padding-left:20px;overflow: hidden;">
									<div style="font-family: sans-serif;font-size: 13px;color: rgb(100,100,100);font-weight: bold;height: 40px; margin-top: 20px;">Upload Image</div>
									<div style="font-family: sans-serif;font-size: 12px;color: rgb(100,141,197);height: 30px;"> ( Supported image formats - JPEG, PNG, GIF. Prefered size should be 200 px * 200px with size not exceeding 500 kb ) </div>
									<div style="margin-top:20px;" >
									<div id="imageUploadError" class='errorMsg'>${imageuploaderror}</div>
										<form method="post" action="${pageContext.request.contextPath}/managed/profile/${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}/image" enctype="multipart/form-data" >
											<input type="file" name="image" />
											<input type="submit" value="Save my image" class="blueButton smallButton" />
										</form>	
									</div>
								</div>
							</div>	  
                      </div>
                      
				</div>

				<div class="profile-Intro">
					<div class="profile_h1"><a href="javascript:void(0);" id="profile_h1_edit"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a><span>${userProfileInfo.firstName} ${userProfileInfo.lastName}</span></div>
					<div class="profile_h2"><a href="javascript:void(0);" id="profile_h2_edit"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a><span id="updateProfileHeading">${userProfileInfo.profileHeading}</span></div>
					<div class="profile_h3"><a href="javascript:void(0);" id="profile_h3_edit"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a><span id="updateBasicIntro">${userProfileInfo.areaCd}, ${userProfileInfo.countryCd} | ${userProfileInfo.industryCd}</span></iv>
					<div class="profile_save"><button class="profile_edit_button save_button" name="save-exit">Edit Profile</button></div>

					<!-- Editable counter parts of each profile introduction headings -->
					<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
						<div class="profile_edit profile_h1_edit">
							<div class="edit_h1">Name</div>
							<div class="edit_input">
								<input type="text" name="firstName" value="${userProfileInfo.firstName}"></input>
								<input type="text" name="lastName" value="${userProfileInfo.lastName}"></input>
								<input type="hidden" name="updateUserName"></input>
							</div>
							<div class="edit_save">
								<input type="submit" class="save_button" value="Save" name="save" />
								<button class="cancel_button" name="cancel">Cancel</button>
								<div class="ajaxLoading"></div>
							</div>
						</div>
					</form>

					<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
						<div class="profile_edit profile_h2_edit">
							<div class="edit_h1">Your professional headline</div>
							<div class="edit_input">
								<input class="full" type="text" name="profileHeading" value="${userProfileInfo.profileHeading}"/>
							</div>
							<input type="hidden" name="updateProfile" value="updateProfileHeading"></input>
							<div class="edit_help_h1">Examples</div>
							<div class="edit_help_h2">Experienced Transportation Executive, Web Designer and Information Architect, Visionary Entrepreneur and Investor</div>
							<div class="edit_save">
								<input type="submit" class="save_button" value="Save" name="save" />
								<button class="cancel_button" name="cancel">Cancel</button>
								<div class="ajaxLoading"></div>
							</div>	
						</div>
					</form>

					<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
						<div class="profile_edit profile_h3_edit">
							<div class="edit_h1">Country</div>
							<input type="hidden" name="updateProfile" value="updateBasicIntro"></input>
							<div class="edit_input">
								<select class="full" name="countryCd">
									<option value="pleaseSelect">Please Select ..</option>
									<option value="india" selected >India</option>
									<option value="Pakistan">Pakistan</option>
								</select>
							</div>
							
							<div class="edit_h1">Postal Code</div>
							<div class="edit_input"><input class="full" type="text" name="areaCd" /></div>
							
							<div class="edit_h1">Location Name</div>
							<div class="edit_radio">
								<input type="radio" name="locations" />Gurgaon, Haryana<br>
								<input type="radio" name="locations" checked />Gurgaon
							</div>
	
							<div class="edit_h1">Industry</div>
							<div class="edit_input">
								<select name="industryCd"  class="full">
									<option value="pleaseSelect">Please Select ..</option>
									<option value="it" selected >Information Technology and Services</option>
									<option value="finance">Finance</option>
								</select>
							</div>
							<div class="edit_save">
								<input type="submit" class="save_button" value="Save" name="save" />
								<button class="cancel_button" name="cancel">Cancel</button>
								<div class="ajaxLoading"></div>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="contacts">
				<div class="contact_details">
					<p class="contact_h1">Visible to your community members</p>
					
					<div class="contact_row">
						<div class="contact_col">
							<div class="contact_h2"><span>Email</span></div>
							<div class="contact_h2">
								<a href="javascript:void(0);" id="contact_edit_emailadd"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a>
								<span id="updateEmail">${userProfileInfo.email}</span>
							</div>

							<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
								<div class="profile_edit contact_edit_emailadd">
									<div class="edit_h1">Email</div>
									<div class="edit_input">
										<input class="full" type="text" name="email" value="${userProfileInfo.email}"></input>
									</div>
									<input type="hidden" name="updatePrimaryInfo" value="updateEmail"></input>
									<div class="edit_save">
										<input type="submit" class="save_button" value="Save" name="save" />
										<button class="cancel_button" name="cancel">Cancel</button>
										<div class="ajaxLoading"></div>
									</div>
								</div>
							</form>	
						</div>	
						<div class="contact_col">
							<div class="contact_h2"><span>Phone</span></div>
							<div class="contact_h2">
								<a href="javascript:void(0);" id="contact_edit_phone"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a>
								+91-<span id="updatePhone">${userProfileInfo.phone}</span>
							</div>
							<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
								<div class="profile_edit contact_edit_phone">
									<div class="edit_h1">Phone</div>
									<div class="edit_input">
										<span class="contact_h2">+91-</span>
										<input type="text" name="phone" value="${userProfileInfo.phone}"></input>
										<select name="phoneTypeCd">
											<option value="home">Home</option>
											<option value="mobile" selected >Mobile</option>
											<option value="work">Work</option>
										</select>
									</div>
									<input type="hidden" name="updatePrimaryInfo" value="updatePhone"></input>
									<div class="edit_save">
										<input type="submit" class="save_button" value="Save" name="save" />
										<button class="cancel_button" name="cancel">Cancel</button>
										<div class="ajaxLoading"></div>
									</div>
								</div>
							</div>
						</form>	
					</div>	
					<div class="contact_row">
						<div class="contact_col">
							<div class="contact_h2"><span>IM</span></div>
							<div class="contact_h2">
								<a href="javascript:void(0);" id="contact_edit_im"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a>
								<span id="updateIM">${userProfileInfo.messenger}</span>
							</div>
							<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
								<div class="profile_edit contact_edit_im">
									<div class="edit_h1">Instant Messanger</div>
									<div class="edit_input">
										<input type="text" name="messenger" value="${userProfileInfo.messenger}"></input>
										<select name="messengerTypeCd">
											<option value="gtalk" >Gtalk</option>
											<option value="skype" selected>Skype</option>
											<option value="yahoo">Yahoo</option>
										</select>
									</div>
									<input type="hidden" name="updatePrimaryInfo" value="updateIM"></input>
									<div class="edit_save">
										<input type="submit" class="save_button" value="Save" name="save" />
										<button class="cancel_button" name="cancel">Cancel</button>
										<div class="ajaxLoading"></div>
									</div>
								</div>
							</form>	
						</div>	
						<div class="contact_col">
							<div class="contact_h2"><span>Address</span></div>
							<div class="contact_h2">
								<a href="javascript:void(0);" id="contact_edit_address"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a>
								<span id="updateAddress">${userProfileInfo.address}</span>
							</div>
							<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
								<div class="profile_edit contact_edit_address">
									<div class="edit_h1">Address</div>
									<div class="edit_input">
											<textarea rows="3" cols="30" name="address" value="${userProfileInfo.address}"></textarea>
									</div>
									<input type="hidden" name="updatePrimaryInfo" value="updateAddress"></input>
									<div class="edit_save">
										<input type="submit" class="save_button" value="Save" name="save" />
										<button class="cancel_button" name="cancel">Cancel</button>
										<div class="ajaxLoading"></div>
									</div>
								</div>
							</form>	
						</div>
					</div>	
				</div>
				<div class="contact_summary"><div class="contact_info_seg"><p>Contact Info</p></div>
					<!-- This is silly but I don't know how to do it right now -->
					<!-- Need to ensure when contact summary slides down, about me is pushed down also.-->
					<div class="about_me">
						<div class="about_me_heading">
							<div class="about_me_box"><p>About Me</p></div>
							<div class="about_me_edit_box"><a href="javascript:void(0);" id="about_me_content_edit"><img src="${contentsBaseURL}/images/edit-pen-icon.png" /></a></div>
						</div>
						<div class="about_me_content">
							<p id="updateAboutMe" class="profile_h3">${userProfileInfo.summary}</p>
						</div>
						<form action="${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}" method="post">
							<div class="profile_edit about_me_content_edit">
								<div class="edit_h1">About Me</div>
								<div class="edit_input">
									<textarea rows="10" cols="87" name="summary">${userProfileInfo.summary}</textarea>
								</div>
								<input type="hidden" name="updateProfile" value="updateAboutMe"></input>
								<div class="edit_save">
									<input type="submit" class="save_button" value="Save" name="save" />
									<button class="cancel_button" name="cancel">Cancel</button>
									<div class="ajaxLoading"></div>
								</div>	
							</div>
						</form>	
					</div>
				</div>
			</div>
		</div>
	    </div>
	    <div id="emptyPad" style="height: 500px"></div>
	    <%@ include file="fragments/footerContent.jsp" %>
	    
    </div>
  </div>
  <!-- jQuery -->
  <script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery.colorbox.js"></script>
  
  <!-- FlexSlider -->
  <script defer src="${contentsBaseURL}/js/jquery.flexslider.js"></script>
  <script type="text/javascript">
	$(window).load(function() {
	  $('.flexslider').flexslider({
		animation: "slide"
	  });
	  
  	  $(".edit-picture").colorbox({inline:true, width:"50%", initialWidth: 100, initialHeight: 50});
  	  
  	  if($("#imageUploadError").text().trim().length != 0 ){
  		$(".edit-picture").trigger("click");
  	  }
	  
	});

	$(document).ajaxStart(function(){
		$("div.ajaxLoading").text("loading ....")
	});

	$(document).ajaxComplete(function(){
		$("div.ajaxLoading").text("");
	});

	function setErrorMessage(container,message){
		container.find(".errorMsg").remove();
		container.find(".edit_input").before("<div class='errorMsg'>" + message + "</div>");
	}
	
	function refreshPage(){
		window.location.reload();
	}
	
    $(document).ready(function(){
		$("#flip").click(function(){
		  $("#panel").slideToggle("fast");
		});
      
		$("a").each(function(){
			var $this = $(this);
			var cssClass = "." + $this.attr("id");
			registerEvent($this,cssClass);
		});

		function registerEvent(eventPub, eventRec){
			$(eventPub).click(function(){
				$(".profile_edit").hide();
				$(eventRec).show();
			});
		}

		$(".cancel_button").click(function(event){
			event.preventDefault();
			var enclosingDiv = $(this).parent();
			enclosingDiv.siblings(".errorMsg").remove();
			$(enclosingDiv).parent().hide();
		});	

		var contactShown = false;
		$(".contact_details").hide();

		$(".contact_info_seg").click(function(){
			if(contactShown){
				$(".contact_details").slideUp();
				contactShown = false;
			}else{
				$(".contact_details").slideDown();
				contactShown = true;
			}
		});
		
		/* ..... ajax calls for posting request ..... */
		$(".profile-Intro form").submit(function(event){
			event.preventDefault();

			var form = $(this);
			var url = form.attr("action");

			var posting = $.post(url,form.serialize(),null,"json");
			posting.done(function(data){
				if(data.inError == true){
					setErrorMessage(form,data.errorMessages[0]);
					return;
				}
				// populate the data on the main page ( basic implementation. To be refined later )
				
				// get the input type=text and type=hidden from the form. set the value of input type=text 
				// into the value of span identified by id same as value of input type=hidden
				
				var documentTarget = form.find("input[type=hidden]").attr("value");
				var userInput = null;
				if(documentTarget == 'updateAboutMe' || documentTarget == 'updateAddress'){
					userInput = form.find("textarea").val();
				}else{
					userInput = form.find("input[type=text]").val();
				}
				
				$("#"+documentTarget).text(userInput);
				
				form.find(".profile_edit").hide();
				
				if(data.viewRefresh == true){
					refreshPage();
				}
			});
			posting.fail(function(event){
				setErrorMessage(form," An error ocurred while processing !");
			});
		});

    });

  </script>
</body>
</html>