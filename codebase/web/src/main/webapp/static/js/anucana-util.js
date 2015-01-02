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
          '<div  style="background:background:rgb(255,255,255,0.5);padding:5px;">'+
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
		  	'<div style="padding:5px 5px 5px 5px;background:' + getOutlineColor(eventData) + '">' + 
			'<a class="inline" href="#inline_content' + dynamicBoxIndex +'">'+
			  '<img class="photo" src=' + eventData.bannerUrl +'>'+
			'</a>'+
			'<div style="background:white;">'+
				'<p style="color:black;">' + eventData.shortDesc +'</p>'+
			'</div>'+
			'</div>'+
		  '</div>';

	  // More details may be added to event description viz. Date, Time etc on similar lines of trainerName & eventName as above.
	  var dynamicDivHTML = $.parseHTML( dynamicDivMarkupString );
	  return dynamicDivHTML;
}

function getOutlineColor(eventData){
	if(eventData == 'undefined' || eventData.bookedByUser == 'undefined' || eventData.activeEvent == "undefined"){
		return "white";
	}
	if(eventData.bookedByUser == "true"){
		return "green";
	}else if(eventData.activeEvent == "true"){
		return "yellow";
	}else{
		return "grey";
	}
	
}


// ------------------------ Events light box ( popup box ) ----------------------------------------------//
function getEventLightBox(dynamicBoxIndex,eventBookingURL,eventData){
	
	var bottomBar = "";	
	if(eventData.activeEvent == "true"){
		bottomBar = 
			'<div id="bottomBar"  class="centered">' +
				'<form action="'+ eventBookingURL +'" method="get">'+
					'<input type="hidden" value="'+ eventData.eventId +'" name="eventId" />' +
					'<input type="submit" value="Book my seat" id="bookingButton" class="blueButton smallButton" tabindex="1" />' +
				'</form>'+
			'</div>';
	}else{
		bottomBar = '<br/><div style="text-align:right;font-style: italic;font-weight: bold;">( seat booking for this event will start very soon .. stay tuned )</div>';
	}
	
	var pincode = "";
	if(eventData.pinCode != 'undefined' && eventData.pinCode.trim() != '' ){
		pincode = ' Pincode - ' + eventData.pinCode;
	}
	console.log(pincode);
	
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
				'<td>' + eventData.eventDateBreakup.hour +' : ' + eventData.eventDateBreakup.minute + ' ' +eventData.eventDateBreakup.amOrPm +'</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Duration</th>' +
				'<td>' + eventData.durationInMinutes + ' Minutes' + '</td>' +
			  '</tr>' +
			  '<tr>' +
				'<th>Venue</th>' +
				'<td>' + eventData.addressLine1 + ' ' + eventData.addressLine2 + pincode + '</td>' +
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
		  '</div>' + bottomBar + 
		'</div>' +
	  '</div>';
	
	var lightboxDivHTML = $.parseHTML(lightboxDivString);
	return lightboxDivHTML;
}

