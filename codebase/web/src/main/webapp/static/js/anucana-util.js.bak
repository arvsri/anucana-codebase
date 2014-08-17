// --- Utiltiy methods of anucana ---- //
// ------------------------ Community Box ----------------------------------------------//
function getCommunityBox(dynamicBoxIndex, isUserMemberOfCommunity,communityBanner,communityId,communityDesc,communityURL){
	if(communityDesc != null && communityDesc.length > 100){
		communityDesc = communityDesc.substring(0,100) + "...";
	}
	//Fetch membership status to decide which style class to be imparted to 'join' circular button
    var joinCircleClass = ""; var joinCircleText = ""; var backgroundColor = "";
    if(isUserMemberOfCommunity){
    	joinCircleClass = "icon";
        backgroundColor = "blueBackground";
        joinCircleText = ".";
    }else{
        joinCircleClass = "joinTextStyle";
        joinCircleText = "Join";
    }

    var dynamicDivMarkupString = 
    	'<div id="dynamicBox'+ dynamicBoxIndex +'" class="community_box col2">'+
    	'<input type="hidden" name="communityId" value="' + communityId + '">'+
          '<div class="communityBoxLabel">'+
	      	'<a href="'+communityURL+'">'+
	      		'<img class="communityBoxPhoto" src="'+ communityBanner + '">'+
	      	'</a>'+
            '<div class="border joinCircle_CSR '+ backgroundColor +'">'+
              '<div class="circleFiller">'+
              	'<span class="'+ joinCircleClass +'">'+ joinCircleText +'</span>'+
              '</div>'+
            '</div>'+
          '</div>'+
          '<div  style="background:white;padding:5px;">'+
          	'<p style="color:black;">' + communityDesc + '</p>'+
          '</div>'+
        '</div>';
    
    // More details may be added to event description viz. Date, Time etc on similar lines of trainerName & eventName as above.
    var dynamicDivHTML = jQuery.parseHTML(dynamicDivMarkupString);
    return dynamicDivHTML;
}

// ------------------------ Profile Box ----------------------------------------------//
function getProfileBox(dynamicBoxIndex,profileURL, userProfile){
	var dynamicDivMarkupString = 
	  '<div id="dynamicBox' + dynamicBoxIndex +'"" class="masonryBox community_box verticalMargin20 col2" style="background:white;">'+
		'<span style="float:left;width:40%">'+
		  '<a href=" '+ profileURL +'"">'+
			'<img class="memberBoxPhoto" src='+ userProfile.profileImageUrl + '>' +  
		  '</a>'+
		'</span>'+
		'<p style="overflow:hidden;padding:5px;">'+
			'<a href=" '+ profileURL +'""><span class="userName">'+ userProfile.firstName + " " + userProfile.lastName + '</span></a><br/><span class="profileHeading">'+ userProfile.profileHeading + '</span>'+
		'</p>'+
	  '</div>';
	var dynamicDivHTML = $.parseHTML( dynamicDivMarkupString );
	return dynamicDivHTML;
}


// ------------------------ Event Box ----------------------------------------------//
function getEventBox(dynamicBoxIndex, eventData) {
	  var dynamicDivMarkupString = 
	  '<div id="dynamicBox' + dynamicBoxIndex +'" class="box col' + eventData.importanceIndex +'">'+
		'<a class="inline" href="#inline_content' + dynamicBoxIndex +'">'+
		  '<img class="photo" src=' + eventData.bannerUrl +'>'+
		'</a>'+
		'<div  style="background:white;">'+
			'<p style="color:black;">' + eventData.shortDesc +'</p>'+
		'</div>'+
	  '</div>';

	  // More details may be added to event description viz. Date, Time etc on similar lines of trainerName & eventName as above.
	  var dynamicDivHTML = $.parseHTML( dynamicDivMarkupString );
	  return dynamicDivHTML;
}

// ------------------------ Events light box ( popup box ) ----------------------------------------------//
function getEventLightBox(dynamicBoxIndex, eventData){
	var lightboxDivString = 
	  '<div style="display:none">' +
		'<div id="inline_content' + dynamicBoxIndex +'" class="lightBox">' +
		  '<h4 id="headline" >' + eventData.name +'</h4>' +
		  '<div id="leftContent"  style="float:left; width:30%;">' +
			'<img class="photo" src="' + eventData.bannerUrl +'" >' +
		  '</div>' +
		  '<div id="rightContent" style="padding-left:20px;overflow: hidden;">' +
			'<table>' +
			  '<tr>' +
				'<th>Date</th>' +
				'<td>' + eventData.eventDateBreakup.date +' ' + eventData.eventDateBreakup.month +' ' + eventData.eventDateBreakup.year +'</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Starts</th>' +
				'<td>' + eventData.eventDateBreakup.hour +' : ' + eventData.eventDateBreakup.minute +'</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Duration</th>' +
				'<td>' + eventData.durationInMinutes +'</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Venue</th>' +
				'<td>' + eventData.addressLine1 + ' ' + eventData.addressLine2 + ' Pincode - ' + eventData.pinCode + '</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Speaker</th>' +
				'<td>' + eventData.speakerName +'</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Synopsis</th>' +
				'<td>' + eventData.longDesc +'</td>' +
			  '</tr>' +
			'</table>' +
		  '</div>' +
		  '<div id="bottomBar"  class="centered">' +
			'<form action="/web/booking/managed/bookEvent?eventId='+ eventData.eventId +'" method="get">'+
				'<input type="submit" value="Book my seat" id="bookingButton" class="blueButton smallButton" tabindex="1">' +
			'</form>'+
			'</input>' +
		  '</div>' +
		'</div>' +
	  '</div>';
	  var lightboxDivHTML = $.parseHTML(lightboxDivString);
	  return lightboxDivHTML;
}
