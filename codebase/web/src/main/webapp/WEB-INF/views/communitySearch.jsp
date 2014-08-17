<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>anucana | community search</title>

<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>

<div id="anucana_outer_wrapper">

	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>
	
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
            <div id="grey_wrapper">
                <div class="bottomLine">
                	<div id="anucana_searchCommunity">
                        <h3>Search a Community</h3>
                        <p class="description">Please enter a keyword to search a community.</p>
						<form action="#" method="post" id="communitySearchForm">
	                        <table>
	                            <tbody>
	                                <tr><td colspan="1"><div class="errorMsg"></div></td></tr>
	                                <tr>
	                                	<td><input type="hidden" name="pageNumber" value="1"></input></td>
	                                </tr>
	                                <tr>
	                                    <td>
	                                      <div class="ui-widget">
	                                      		<input type="text" name="keywords" id="searchCommunity_keyword" placeholder="eg. Java, JQuery, Spring"></input>
	                                      </div>
	                                    </td>
	                                    <td>
	                                   		<input type="submit" class="button grey_button" id="searchCommunity_search" tabindex="1" value="Search"></input>
	                                    </td>
	                                </tr>
	                            </tbody>
	                        </table>
						</form>
                    </div>
                </div>

                <div style="margin-top:10px;">
                  <p class="description" id="searchedCommunityCount"></p>
                  <div id="container" style="margin-top:20px;overflow: hidden;" class="masonry"></div>                  
                </div>
                <span id="communities_LoadMoreSpan" style="display: none;">
                    <button type="button" id="more" class="bigButton">Load more events</button>
                </span> 
                
				<div id="login-message" title="Unauthenticated User"style="display: none;">
	                <p class="description">We could not authenticate you as a genuine user. Please <a href="${pageContext.request.contextPath}/loginHome">Click here</a> to login.</p>
				</div>                
                
            </div> <!-- end of grey_wrapper -->
        </div> <!-- end of anucana_main -->


	<div id="emptyPad"></div>
	<%@ include file="fragments/footerContent.jsp" %>
       
    </div> <!-- end of anucana_wrapper -->
	</div> <!-- end of anucana_outer_wrapper -->


	<script type='text/javascript' src='${contentsBaseURL}/js/logging.js'></script>
	<script type="text/javascript" src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
	<script type="text/javascript" src="${contentsBaseURL}/js/jquery-ui.js"></script>
	<script type="text/javascript" src="${contentsBaseURL}/js/masonry.pkgd.js"></script>
	<script type="text/javascript" src="${contentsBaseURL}/js/imagesloaded.pkgd.js"></script>
	<script type='text/javascript' src='${contentsBaseURL}/js/anucana-util.js'></script>
	<script type='text/javascript' defer src="${contentsBaseURL}/js/jquery.flexslider.js"></script>
	

	<script type="text/javascript">
		var searchResultCountAPI = "${pageContext.request.contextPath}/community/unmanaged/searchResultCount";
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

	  		$("#flip").click(function(){
				$("#panel").slideToggle("fast");
			});
	  		
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
				
				// get the search result count
				var form = $(this);
				var searchCountPosting = $.post(searchResultCountAPI,form.serialize(),null,"json");

				searchCountPosting.done(function(data){
					$(".errorMsg").text("");
					if(data.integer == null || data.integer == "0"){
						$("#communities_LoadMoreSpan").hide();
						$("#searchedCommunityCount").text("No communities found ! Please modify your search.");
					}else{
						numberOfCommunities = data.integer;
						$("#searchedCommunityCount").text( numberOfCommunities + " communities found.");
						doSearch();
					}
				});
				searchCountPosting.fail(function(event){
					$(".errorMsg").text(" An error ocurred while processing !");
				});
	  		});
	  });
	  
	  function doSearch(){
			var form = $("form");
	    	var search = $.post(searchAPI,form.serialize(),null,"json");

	    	search.done(function(communities){
				appendMasonryElements(communities.communityList);
				if(dynamicBoxesLoaded < numberOfCommunities){
					$("#communities_LoadMoreSpan").show();
				}
				if(dynamicBoxesLoaded >= numberOfCommunities){
					$("#more").removeClass("blueButton").addClass("blackButton");
				}
				
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

          $(".border").on('click',function(){
        	  	var $this = $(this);
        	    var communityId = $this.parent().parent().find("input[name=communityId]").val();
        	    var communitySubscribeAPI = subscribeAPI.replace(communityIdMatcher, communityId);
				var subscribePosting = $.post(communitySubscribeAPI,null,null,"json");
				
				subscribePosting.done(function(data){
					if(typeof data.userLogin !== 'undefined'){
						 // user has not logged in, show the dialog for login
						 $("#login-message").dialog({
						 	modal: true,
						 	buttons: {
						 		Ok: function() {
						 			$( this ).dialog( "close" );
						 		}
						 	}
						});
					}else{
						// subscribe to the community
						$(".errorMsg").text("");
						$this.css("background-color","#009DDB");
						$this.children().find(".joinTextStyle").removeClass("joinTextStyle").addClass("icon").text(".");
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
      
      
  </script>

</body>
</html>
