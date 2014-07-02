<%-- 

 Upload Image Tag. It supports 
 1. Image upload functionality at anucana
 2. Modes Supported :
 	a. profile ( default )
 	b. community
 	c. event
 	d. gallery  
 	 
--%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<%@ attribute name="mode" description="Please see the documentation to understand the modes suppoted. Default is profile" required="true"%>
<%@ attribute name="accessId" description="user id to be authenticated against" required="true" %>
<%@ attribute name="posturl" description="url for image upload" required="true" %>
<%@ attribute name="src" description="image source url" required="true" %>
<%@ attribute name="dummy" description="Is the image source dummy ? default is false" required="false" %>


<security:authorize url="/**/managed/**" var="isAuthenticated"></security:authorize>

<c:if test="${isAuthenticated}">
      <c:choose>
      		<c:when test="${not empty mode && mode == 'profile'}">


      			<%-- Implementation of profile mode--%>
				<security:authentication property="principal.userId" var="userId"/>

				<c:if test="${userId == accessId}">

                      <a class="inline" id="imageUploader" href="#inline_content">
                        <img  src="${contentsBaseURL}/images/edit-pen-icon-white.png" />
                      </a>


					  <!-- This contains the hidden content for modal window -->
					  <div style="display:none">
					    <div id="inline_content" class="lightBox">
					      	<div class="centered">
					        	<span id="imageUploadError" style="color:red;font-weight: bold;font-family: sans-serif; font-size: 16px;"></span>
					      	</div>
					    
					      	<div class="crop-image-wrapper">
					        	<img id="cropMe" src="" style="width:400px; margin:50px;" />
					    		<button id="imageDrop" onclick="document.getElementById('uploadFileInput').click()" title="Click Here">Upload image</button>    	
					      	</div>
					    
					      	<div class="centered">
					        	<h4>Select a portion of image above and save it as Profile picture</h4>
					      	</div>
					      
					       	<div id="bottomBar"  class="centered">
					       		<input id="uploadFileInput" type="file" name="datafile" size="40" />
					       		<input type="button" value="Upload Image" id="uploadImageButton" class="blueButton smallButton" tabindex="1" onclick="document.getElementById('uploadFileInput').click()" />
					       		<input id="cropButton" type="button" value="Save Image" style="display:none;" class="blueButton smallButton hidden" ></input>
					      	</div>
						  </div>
					 	</div>
                      
                      
					  <script type="text/javascript">
						  var uploadImage = function() {
							  	var x = 0;
							  	var y = 0;
							  	var x2 = 0;
							  	var y2 = 0;
							  	var h = 0;
							  	var w = 0;
							  	
							  	var uploadSuccess = false;
							  
						        $(".inline").colorbox({inline:true});
						        
						        $(document).on("cbox_cleanup", function(){
						        	if(uploadSuccess){
							          	location.reload();
						        	}
						         });
						        
						        // html 5 form data 
							  	formdata = false;
						        
						        <c:choose>
						        	<c:when test="${not empty dummy && dummy == 'true'}">
							            $("#cropMe").hide();
						        	</c:when>
						        	<c:otherwise>
							          	$("#imageDrop").css("display","none");
							          	$("#cropMe").load( function(){
							            	$(".inline").colorbox.resize();
							          	}).attr('src', "${src}");
							          	$("#uploadImageButton").attr("value","Change Image");
						        	</c:otherwise>
						        </c:choose>
						        
						        $("#uploadFileInput").change(function() {
						
						        	if (window.FormData) {
						    		    formdata = new FormData();
						    		}
							       	if(!formdata){
							       		$("#imageUploadError").text("You are using an old browser. Our image upload functionality might not work properly");
							       		return;
							       	}
							       	formdata.append("image", this.files[0]);
							       	
							   	    $.ajax({
										headers: { "Accept" : "application/json; charset=utf-8"},
										type: "POST",
										url: "${posturl}",
										data: formdata,
										processData: false,
									    contentType: false,
										dataType: "json",
						
										beforeSend: function( xhr ) {
								          	$("#imageDrop").html('<div>loading ... </div><div class="loader bubblingG"><span id="bubblingG_1"></span><span id="bubblingG_2"></span><span id="bubblingG_3"></span></div>').show();
								          	$("#imageUploadError").text("");
								          	$("#cropMe").hide();
								            $(".inline").colorbox.resize();
								            uploadSuccess = false;
										},					
										success: function(response){
											var obj = eval(response);

											if(obj.errormsg){
												handleImageUploadError(obj.errormsg);
											}else if(response.viewError != undefined && response.viewError.fieldErrors != undefined && response.viewError.fieldErrors.length != 0){
												// handle error first
												var errormsg = ""
												$.each(response.viewError.fieldErrors,function( key, value ){
													errormsg = errormsg + "\n" + value.errorMessage;
												});
												handleImageUploadError(errormsg);
											}else{
												$("#cropMe").attr("src", obj.imgURL).show();
												$("#imageDrop").text("Upload image").hide();
												$("#imageUploadError").text("");
									          	
									            $('#cropMe').Jcrop({
									                addClass: 'jcrop-centered', // Adds 'jcrop-centered' css class on the image handled by jcrop. 
									                setSelect: [0, 160, 160, 0], // Sets a default crop selection before user clicks on image.
									                aspectRatio: 1/1,              // Adds an aspect ratio of 1:1 as we want a square selection.
									                onSelect : function(cord){
									                	x = cord.x;
									                	y = cord.y;
									                	x2 = cord.x2;
									                	y2 = cord.y2;
									                	w = cord.w;
									                	h = cord.h;
									                }
									            });
									            
									            $("#uploadImageButton").attr("value","Change Image");
									            $("#cropButton").show();
									            $(".inline").colorbox.resize();
									            
									            uploadSuccess = true;
											}
										},
										error: function(response){
											handleImageUploadError("Error occurred while uploading the image.");
										}
									});
						        });
						        
						   	 	$("#cropButton").on("click",function(){
						   	 		var cropCords = "x="+x+"&y="+y+"&x2="+x2+"&y2="+y2+"&h="+h+"&w="+w;
							   	    $.ajax({
										headers: { "Accept" : "application/json; charset=utf-8"},
										type: "POST",
										url: "${posturl}?imageCrop=true",
										data:  cropCords,
										processData: false,
										dataType: "json",
						
										success: function(response){
											var obj = eval(response);
											if(obj.errormsg){
												$("#imageUploadError").text(obj.errormsg);
											}else if(response.viewError != undefined && response.viewError.fieldErrors != undefined && response.viewError.fieldErrors.length != 0){
												// handle error first
												var errormsg = ""
												$.each(response.viewError.fieldErrors,function( key, value ){
													errormsg = errormsg + "\n" + value.errorMessage;
												});
												$("#imageUploadError").text(errormsg);
											}else{
												location.reload();
											}
										},
										error: function(response){
											handleImageUploadError("Error occurred while uploading the image.");
										}
									});
						   	 		
						   	 	});
						
						        
						   	    function handleImageUploadError(errorMessage){
						   	      	$("#imageDrop").text("Upload image").show();
						   	      	$("#cropMe").hide();
						   	      	$("#imageUploadError").text(errorMessage);
						   	        $(".inline").colorbox.resize();
						   	      	uploadSuccess = false;
						   	    }
						
							};
					  </script>
				</c:if>
      		</c:when>
      		<c:otherwise>
      			<%-- Implementation of other modes TODO --%>
      		</c:otherwise>
      </c:choose>
</c:if>
