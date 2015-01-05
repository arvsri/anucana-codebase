<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>anucana | communities</title>
<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/colorbox.css" />
<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
<style type="text/css">
	.emptyBox{
		width: 60%;
	}
	.communitySearchBox{
		float:right;
		margin-right:0px;
		padding-right: 0px;
	}
	.authenticationErrorBox{
		padding:20px 20px 20px 20px;
	}
	
</style>
</head>
<body>

<div id="anucana_outer_wrapper">

	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
	
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper">
				   <div class="emptyBox"></div>
                   <div class="communitySearchBox bottomline">
                   		<form action="#" method="post" id="communitySearchForm">
	                       	<div class="ui-widget">
	                           	<input type="text" name="keywords" id="searchCommunity_keyword" placeholder="eg. Java, JQuery, Spring"></input>
	                           	<input type="submit" class="button grey_button" value="Filter"></input>
	                           	<input type="hidden" name="pageNumber" value="1"></input>
	                         </div>
		                   	<div class="errorMsg"></div>
         				</form>
                   </div>
				<br/><br/>
                <div style="margin-top:10px;">
                  <p class="description" id="searchedCommunityCount"></p>
                  <div id="container" style="margin-top:20px;overflow: hidden;" class="masonry"></div>                  
                </div>
                <span id="communities_LoadMoreSpan" style="display: none;">
                    <button type="button" id="more" class="bigButton">Load more events</button>
                </span> 
                        
            </div> <!-- end of grey_wrapper -->
        </div> <!-- end of anucana_main -->


	<div id="emptyPad"></div>
	<%@ include file="fragments/footerContent.jsp" %>
       
    </div> <!-- end of anucana_wrapper -->
	</div> <!-- end of anucana_outer_wrapper -->


	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/masonry.pkgd.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.js"></script>
	<script type='text/javascript' src='${pageContext.request.contextPath}/static/js/anucana-util.js'></script>
	<script type='text/javascript' src="${pageContext.request.contextPath}/static/js/jquery.colorbox.js"></script>	
	

	<script type="text/javascript">
	$(function() {
		$('#communitiesLink').addClass('current');
		
		var searchAPI = "${pageContext.request.contextPath}/community/unmanaged/searchPaginated";
		var subscribeAPI = "${pageContext.request.contextPath}/community/managed/{communityId}/subscribe";
		var communityIdMatcher = "{communityId}";
		
		var dynamicBoxesLoaded = 0; 
		var numberOfCommunities = 0;
		var $masonry = $('.masonry');
		
	 	var availableTags = [
           <c:forEach items="${keywords}" var="keyword">
	  	   		"${keyword}",
           </c:forEach>
  			""];	
    	$( "#searchCommunity_keyword" ).autocomplete({source: availableTags});
	  
	  	$(document).ready(function(){

	  		$("#communitySearchForm").submit(function(event){
				event.preventDefault();

				// reset the masonary 
				$masonry.empty();
				dynamicBoxesLoaded = 0;
				$masonry.masonry( 'destroy');
				
				$("input[name=resultCount]").val(dynamicBoxesLoaded);
				
				// hide the load more buton
				$("#communities_LoadMoreSpan").hide();
				$("#more").removeClass("blackButton").addClass("blueButton");
				doSearch();
	  		});
	  });
	  
	  function doSearch(){
			var form = $("#communitySearchForm");
	    	var search = $.post(searchAPI,form.serialize(),null,"json");

	    	search.done(function(communities){
				appendMasonryElements(communities.communityList);
			});
			search.fail(function(event){
				$(".errorMsg").text(" An error ocurred while processing !");
			});
	  }	  
	  
	  function appendMasonryElements(responseJSON){
		  
          var lastLoadedCount = dynamicBoxesLoaded;
          var boxList = $();

          $.each(responseJSON, function(i, community) {
          	var communityURL = "${pageContext.request.contextPath}/community/unmanaged/" + community.communityId;  
            var boxElement = getCommunityBox(i + lastLoadedCount, community.userSubscribed,community.bannerUrl,community.communityId,community.about,communityURL);
            boxList = boxList.add($(boxElement));
            dynamicBoxesLoaded++;
          });

          $masonry = $masonry.append( boxList );
		  		
          $masonry.imagesLoaded( function() {
            // images have loaded
            $masonry.masonry( 'appended', boxList )
                .masonry({ itemSelector: '.community_box',columnWidth: 100,isAnimated: true,gutter:20 });
          });
          $("input[name=resultCount]").val(dynamicBoxesLoaded);
          
		  if(dynamicBoxesLoaded < numberOfCommunities){
		  	$("#communities_LoadMoreSpan").show();
		  }
		  if(dynamicBoxesLoaded >= numberOfCommunities){
			$("#more").removeClass("blueButton").addClass("blackButton");
		  }
          

          $(".border").on('click',function(){
        	  	var $this = $(this);
        	    var communityId = $this.parent().parent().find("input[name=communityId]").val();
        	    var communitySubscribeAPI = subscribeAPI.replace(communityIdMatcher, communityId);
				var subscribePosting = $.post(communitySubscribeAPI,null,null,"json");
				
				subscribePosting.done(function(data){
					if(typeof data.userLogin !== 'undefined'){
						 // user has not logged in, show the dialog for login
						$.colorbox(
							{html:"" +
				        	   		"<div class='authenticationErrorBox'><img src='${contentsBaseURL}/images/icons/login_error_black.png'/>" + 
									"<p class='description' >We could not authenticate you as a genuine user. May be you have not logged in yet !</br>" +  
									"Please <a href='${pageContext.request.contextPath}/loginHome'>Click here</a> to login.</p></div>",
							height:"150px"		
							});
						 
					}else{
						// subscribe to the community
						$(".errorMsg").text("");
						$this.css("background-color","#009DDB");
						$this.children().find(".joinTextStyle").replaceWith( "<i class='fa fa-check icon blueOnWhite'></i>" );
					}
				});
				
				subscribePosting.always(function(data){
					console.log(data);
				});
				subscribePosting.fail(function(event){
					$(".errorMsg").text(" An error ocurred while processing !");
				});
          });
      }
	  
	  	jQuery('#more').click(function(){
			doSearch();
      	});

     	/**************************************************************** Community description variable ******************************************/
     	/***************************************************************************************************************************************/
	    var responseObject = {"communityList":[
 		   <c:forEach items="${communityList}" var="community" varStatus="loop">
 	   			<c:if test="${loop.index != 0}"><c:out value=","></c:out></c:if>	                        	   
  				{"communityId":"${community.communityId}",
  				"userSubscribed":${community.userSubscribed},
  				"bannerUrl":"${community.bannerUrl}",
  				"about":"<spring:escapeBody javaScriptEscape='true'>${community.about}</spring:escapeBody>"}
 			</c:forEach>
		]};
      
      	appendMasonryElements(responseObject.communityList);
	})();
  </script>

</body>
</html>
