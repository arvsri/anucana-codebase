<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="anucana" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | event edit</title>
	<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="/web/static/css/colorbox.css" />
	<link rel="stylesheet" href="/web/static/css/jcrop/jquery.Jcrop.css" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<style type="text/css">
		.eventBannerBlock{
			height: 300px;
			width: 100%;
		}
		.eventImage{
			height: inherit;
			width: inherit;
		}
		.editIcon{
			position: relative;
		}
	</style>
</head>
<body>
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
          <div id="anucana_main">
	        	<div id="editForm">
					<sf:form action="" method="post" modelAttribute="event">
						<input id="action" type="hidden" name="action" value="save"></input>                        
	                    <table style="width:100%;">
                            <tr>
                                <td colspan="3">
	                              <div class="eventBannerBlock">
	                                	<div class="editIcon">
											<security:authentication property="principal.userId" var="userId"/>
		                                	<anucana:upload-image posturl="${pageContext.request.contextPath}/event/managed/edit/image/${event.eventId}" src="${event.bannerUrl}" accessId="${userId}" mode="event"></anucana:upload-image>
	                                	</div>
	                                	<img class="eventImage" src="${event.bannerUrl}" />
	                              </div> 
                                </td>
                            </tr>

							<!-- Events date, duration and title -->
                            <tr>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Event Date</p></td>
                                <td width="20%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Duration</p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Event Title</p></td>
                            </tr>
                            <tr>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Event Date ( DD/MM/YYYY HH:mm )" path="eventDate"></sf:input></td>
                                <td width="20%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Duration ( in minutes )" path="durationInMinutes"></sf:input></td>
                                <td width="50%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Event Title" path="name"></sf:input></td>
                            </tr>
                            <tr>
								<td width="30%"><sf:errors path="eventDate" cssClass="inlineError" /></td>
								<td width="20%"><sf:errors path="durationInMinutes" cssClass="inlineError" /></td>
								<td width="50%"><sf:errors path="name" cssClass="inlineError" /></td>		                            
							</tr>
							
							<!-- Phone and phone type code -->
                            <tr>
                                <td colspan="2" width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Contact Number</p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Event Importance Index</p></td>
                            </tr>
                            <tr>
                                <td colspan="2" width="50%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:95%" placeholder="Event Contact Number" path="phone"></sf:input></td>
                                <td width="50%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="importanceIndex">
                                        <c:forEach items="${importanceIndices}" var="impIndex">
                                        	<option value="${impIndex}" 
                                        		<c:if test="${impIndex eq event.importanceIndex}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${impIndex}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                            </tr>
                            <tr>
								<td colspan="2" width="50%"><sf:errors path="phone" cssClass="inlineError" /></td>
								<td width="50%"><sf:errors path="importanceIndex" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Pincode Search and select -->
                            <tr>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Pincode</p></td>
                                <td width="20%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;"></p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Pincode area</p></td>
                            </tr>
                            <tr>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Pincode" path="pinCode"></sf:input></td>
                                <td width="20%"><button type="button" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" value="searchPincode" style="margin-top:15px;">Search</button></td>
                                <td width="50%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="pincodeId">
                                        <c:forEach items="${postalCodes}" var="postalCode">
                                        	<option value="${postalCode.id}" 
                                        		<c:if test="${postalCode.id eq event.pincodeId}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${postalCode.district}"></c:out> - <c:out value="${postalCode.office}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                            </tr>
                            <tr>
								<td width="30%"><sf:errors path="pinCode" cssClass="inlineError" /></td>
								<td width="20%"></td>
								<td width="50%"><sf:errors path="pincodeId" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Address lines -->
                            <tr>
                                <td colspan="2" width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Address Line - 1</p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Address Line - 2</p></td>
                            </tr>
                            <tr>
                                <td colspan="2" width="50%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:95%" placeholder="Address Line - 1" path="addressLine1"></sf:input></td>
                                <td width="50%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Address Line - 2" path="addressLine2"></sf:input></td>
                            </tr>
                            <tr>
								<td colspan="2" width="50%"><sf:errors path="addressLine1" cssClass="inlineError" /></td>
								<td width="50%"><sf:errors path="addressLine2" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Short description -->
                            <tr>
                                <td width="100%" colspan="3"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Short description</p></td>
                            </tr>
                            <tr>
                                <td width="100%" colspan="3"><sf:textarea rows="2" cssStyle="margin:10px 10px 10px 10px;height:60px;width:95%" placeholder="Short description" path="shortDesc"></sf:textarea></td>
                            </tr>
                            <tr>
								<td width="100%" colspan="3"><sf:errors path="shortDesc" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Long description -->
                            <tr>
                                <td width="100%" colspan="3"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Long description</p></td>
                            </tr>
                            <tr>
                                <td width="100%" colspan="3"><sf:textarea rows="5" cssStyle="margin:10px 10px 10px 10px;height:120px;width:95%" placeholder="Long description" path="longDesc"></sf:textarea></td>
                            </tr>
                            <tr>
								<td width="100%" colspan="3"><sf:errors path="longDesc" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Profile Search and select -->
                            <tr>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Event Speaker Search</p></td>
                                <td width="20%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;"></p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Event Speaker</p></td>
                            </tr>
                            <tr>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Search speaker by name" path="searchSpeakerCriteria"></sf:input></td>
                                <td width="20%"><button type="button" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" value="searchProfile" style="margin-top:15px;">Search</button></td>
                                <td width="50%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="speakerId">
                                        <c:forEach items="${profiles}" var="profile">
                                        	<option value="${profile.userId}" 
                                        		<c:if test="${profile.userId eq event.speakerId}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${profile.firstName}"></c:out> <c:out value="${profile.lastName}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                            </tr>
                            <tr>
								<td width="30%"></td>
								<td width="20%"></td>
								<td width="50%"><sf:errors path="speakerId" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Community Search and select -->
                            <tr>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Community Search</p></td>
                                <td width="20%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;"></p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Community</p></td>
                            </tr>
                            <tr>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Search community by name" path="communitySearchCriteria"></sf:input></td>
                                <td width="20%"><button type="button" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" value="searchCommunity" style="margin-top:15px;">Search</button></td>
                                <td width="50%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="communityId">
                                        <c:forEach items="${communities}" var="comm">
                                        	<option value="${comm.communityId}" 
                                        		<c:if test="${comm.communityId eq community.communityId}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${comm.name}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                            </tr>
                            <tr>
								<td width="30%"></td>
								<td width="20%"></td>
								<td width="50%"><sf:errors path="communityId" cssClass="inlineError" /></td>		                            
							</tr>

							<!-- Capacity, cost and status -->
                            <tr>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Event Capacity</p></td>
                                <td width="20%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Cost - Rupees</p></td>
                                <td width="50%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Status</p></td>
                            </tr>
                            <tr>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Event Seating Capacity" path="capacity"></sf:input></td>
                                <td width="20%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Cost ( in Rupees )" path="costInINR"></sf:input></td>
                                <td width="50%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="statusCd">
                                        <c:forEach items="${statusTypes}" var="statusType">
                                        	<option value="${statusType.typeCode}" 
                                        		<c:if test="${statusType.typeCode eq event.statusCd}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${statusType.typeDescription}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                            </tr>
                            <tr>
								<td width="30%"><sf:errors path="capacity" cssClass="inlineError" /></td>
								<td width="20%"><sf:errors path="costInINR" cssClass="inlineError" /></td>
								<td width="50%"><sf:errors path="statusCd" cssClass="inlineError" /></td>		                            
							</tr>
							
                            <tr>
                            	<td colspan="3">
				                    <sf:hidden path="eventId" />
                            		<input style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" style="margin-top:15px;" type="submit" value="Save" />
                            	</td>
                            </tr>
	                    </table>
                    </sf:form>
	            </div> <!-- end of featured project -->
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
    
  <script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery-ui.js"></script>
  <script src="${contentsBaseURL}/js/masonry.pkgd.js"></script>
  <script src="${contentsBaseURL}/js/imagesloaded.pkgd.js"></script>
  <script src="${contentsBaseURL}/js/jquery.flexslider.js"></script>
  <script src="${contentsBaseURL}/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="${contentsBaseURL}/js/jquery.colorbox.js"></script>
  <script type="text/javascript">
		$(document).ready(function() {
			// Execute the upload image function
			if(typeof uploadImage !== 'undefined'){
				uploadImage();		
			}
			
			$("button").on("click",function(event){
				$("#action").attr("value",$(this).attr("value"));
				$("form").submit();
			});
		});	
	</script>    
</body>
</html>