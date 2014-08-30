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
	<title>anucana | community edit</title>
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/colorbox.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jcrop/jquery.Jcrop.css" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<style type="text/css">
		.communityBannerBlock{
			height: 300px;
			width: 100%;
		}
		.communityImage{
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
					<sf:form action="" method="post" modelAttribute="community">                        
	                    <table style="width:100%;">
	                        <tbody>
	                            <tr>
	                                <td colspan="2">
		                              <div class="communityBannerBlock">
		                                	<div class="editIcon">
												<security:authentication property="principal.userId" var="userId"/>
			                                	<anucana:upload-image posturl="${pageContext.request.contextPath}/community/managed/edit/image/${community.communityId}" src="${community.bannerUrl}" accessId="${userId}" mode="community"></anucana:upload-image>
		                                	</div>
		                                	<img class="communityImage" src="${community.bannerUrl}" />
		                              </div> 
	                                </td>
	                            </tr>
	                            
	                            <!-- Community name and date  -->
	                            <tr>
	                                <td width="40%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Community Name</p></td>
	                                <td width="60%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Community Foundation Date</p></td>
	                            </tr>
	                            <tr>
	                                <td width="40%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Community Name" path="name"></sf:input></td>
	                                <td width="60%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:95%" placeholder="Foundation Date ( DD/MM/YYYY )" path="foundationDate"></sf:input></td>
	                            </tr>
	                            <tr>
									<td width="40%"><sf:errors path="name" cssClass="inlineError" /></td>
									<td width="60%" style="padding-left:11px;"><sf:errors path="foundationDate" cssClass="inlineError" /></td>		                            
								</tr>
								
	                            <!-- Phone number and type  -->
	                            <tr>
	                                <td width="40%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Phone number</p></td>
	                                <td width="60%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Industry Type</p></td>
	                            </tr>
	                            <tr>
	                                <td width="40%"><sf:input style="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Community Contact Number" path="phone"></sf:input></td>
	                                <td width="60%">
                                        <select style="margin:10px 10px 10px 10px;height:30px;width:95%"  name="industryCd">
	                                         <c:forEach items="${industryCodes}" var="industryCode">
	                                         	<option value="${industryCode.typeCode}" 
	                                         		<c:if test="${industryCode.typeCode eq community.industryCd}">
	                                         			selected
	                                         		</c:if> 
	                                        	>
													<c:out value="${industryCode.typeDescription}"></c:out>
	                                         	</option>
	                                         </c:forEach>
                                        </select>
                                     </td>   
	                            </tr>
	                            <tr>
									<td width="40%"><sf:errors path="phone" cssClass="inlineError" /></td>
									<td width="60%" style="padding-left:11px;"><sf:errors path="industryCd" cssClass="inlineError" /></td>		                            
								</tr>
								
								
								<!-- Email address -->
	                            <tr>
	                                <td colspan="2" width="100%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Email Address</p></td>
	                            </tr>
	                            <tr>
	                                <td colspan="2" width="100%">
	                                	<sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:97%" placeholder="Community Email Address" path="email"></sf:input>
	                                </td>
	                            </tr>
		                        <tr>
		                        	<td colspan="2" width="100%"><sf:errors path="email" cssClass="inlineError"/></td>
		                        </tr>
		                        
								<!-- About the community -->
	                            <tr>
	                                <td colspan="2" width="100%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Community Summary</p></td>
	                            </tr>
	                            <tr>
	                                <td colspan="2" width="100%"><sf:textarea cssStyle="margin:10px 10px 10px 10px;height:150px;width:97%" placeholder="About the community" path="about"></sf:textarea></td>
	                            </tr>
		                        <tr>
		                        	<td colspan="2" width="100%"><sf:errors path="about" cssClass="inlineError"/></td>
		                        </tr>
		                        
								<!-- keywords -->
	                            <tr>
	                                <td colspan="2" width="100%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Keywords - to help us search the community</p></td>
	                            </tr>
	                            <tr>
	                                <td colspan="2" width="100%">
	                                	<sf:textarea cssStyle="margin:10px 10px 10px 10px;height:150px;width:97%" placeholder="Search Keywords ( comma separated )" path="keywords"></sf:textarea>
	                                </td>
	                            </tr>
		                        <tr>
		                        	<td colspan="2"><sf:errors path="keywords" cssClass="inlineError"/></td>
		                        </tr>
	                            <tr>
	                            	<td colspan="2">
					                    <sf:hidden path="communityId" />
	                            		<input class="blueButton bigButton" style="margin-bottom: 0px;margin-left: 10px; margin-top: 15px;" type="submit" value="Save" />
	                            	</td>
	                            </tr>
	                        </tbody>
	                    </table>
                    </sf:form>
	            </div> <!-- end of featured project -->
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
    
  <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/masonry.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery.flexslider.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery.colorbox.js"></script>
  <script type="text/javascript">
		$(document).ready(function() {
			// Execute the upload image function
			if(typeof uploadImage !== 'undefined'){
				uploadImage();		
			}
		});	
	</script>    
</body>
</html>
