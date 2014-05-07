// --- Utiltiy methods of anucana ---- //

function getBoxElement(dynamicBoxIndex, isUserMemberOfCommunity,communityBanner,communityId,communityDesc){
	
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
	      	'<a href="'+communityId+'">'+
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
