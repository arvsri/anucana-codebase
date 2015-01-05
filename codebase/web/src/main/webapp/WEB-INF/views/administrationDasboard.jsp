<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | admin dashboard</title>
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/images/icons/favicon.ico" />
</head>
<body>
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
          <div id="anucana_main">

	        	<div class="bottomLine">
					<form action="" method="post" >
	                    <table style="width:100%;">
                            <tr>
                            	<td width="20%" style="text-align: right; padding-top: 20px"><p class="description">Search Community : </p></td>
                                <td width="40%"><input type="text" style="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Community Search String" name="searchString"></input></td>
                                <td width="10%" colspan="2"><input type="submit" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" name="submit" value="Search" style="margin-top:15px;" /></td>
								<td width="30%" style="text-align: center;"><a href="${pageContext.request.contextPath}/community/managed/edit/0">( Start a new community )</a>&nbsp;</td>                                
                            </tr>
                            
                            <tr>
                            	<td width="20%"><input type="hidden" name="action" value="SearchCommunities"></input></td>
                                <td width="80%" colspan="3">
                                    <c:if test="${action == 'SearchCommunities'}">
                                       <c:choose>
                                         <c:when test="${not empty communities}">
                                         	<c:forEach items="${communities}" var="community">
                                         		<a href="${pageContext.request.contextPath}/community/managed/edit/${community.communityId}">${community.name}</a>&nbsp;
                                         	</c:forEach>
                                         </c:when>
                                         <c:otherwise>
	                                         <span class="inlineError">Sorry!, no results found</span>
                                         </c:otherwise>
                                       </c:choose>
                                    </c:if>
                                </td>
							</tr>
	                    </table>
                    </form>
	            </div> <!-- end of featured project -->
          
	        	<div class="bottomLine">
					<form action="" method="post" >
	                    <table style="width:100%;">
                            <tr>
                            	<td width="20%" style="text-align: right;; padding-top: 20px"><p class="description">Search Events : </p></td>
                                <td width="40%"><input type="text" style="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Event Search String" name="searchString"></input></td>
                                <td width="10%"><input type="submit" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" name="submit" value="Search" style="margin-top:15px;" /></td>
								<td width="30%" style="text-align: center;"><a href="${pageContext.request.contextPath}/event/managed/edit/0">( Create a new event )</a>&nbsp;</td>                                
                            </tr>
                            
                            <tr>
                            	<td width="20%"><input type="hidden" name="action" value="SearchEvents"></input></td>
                                <td width="80%" colspan="3">
                                    <c:if test="${action == 'SearchEvents'}">
                                       <c:choose>
                                         <c:when test="${not empty events}">
                                         	<c:forEach items="${events}" var="event">
                                         		<a href="${pageContext.request.contextPath}/event/managed/edit/${event.eventId}">${event.name}</a>&nbsp;
                                         	</c:forEach>
                                         </c:when>
                                         <c:otherwise>
	                                         <span class="inlineError">Sorry!, no results found</span>
                                         </c:otherwise>
                                       </c:choose>
                                    </c:if>
                                </td>
							</tr>
	                    </table>
                    </form>
	            </div> <!-- end of featured project -->

          
	        	<div class="bottomLine">
					<form action="" method="post" >
	                    <table style="width:100%;">
                            <tr>
                            	<td width="20%" style="text-align: right;padding-top: 20px"><p class="description">Search Coupon : </p></td>
                                <td width="40%"><input type="text" style="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Coupon Code Search String" name="searchString"></input></td>
                                <td width="10%"><input type="submit" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" name="submit" value="Search" style="margin-top:15px;" /></td>
                                <td width="30%" style="text-align: center;"><a href="${pageContext.request.contextPath}/coupon/managed/edit/0">( Create a new coupon )</a>&nbsp;</td>
                            </tr>
                            
                            <tr>
                            	<td width="20%"><input type="hidden" name="action" value="SearchCoupons"></input></td>
                                <td width="80%" colspan="3">
                                    <c:if test="${action == 'SearchCoupons'}">
                                       <c:choose>
                                         <c:when test="${not empty coupons}">
                                         	<c:forEach items="${coupons}" var="coupon">
                                         		<a href="${pageContext.request.contextPath}/coupon/managed/edit/${coupon.couponId}">${coupon.couponCode}</a>&nbsp;
                                         	</c:forEach>
                                         </c:when>
                                         <c:otherwise>
	                                         <span class="inlineError">Sorry!, no results found</span>
                                         </c:otherwise>
                                       </c:choose>
                                    </c:if>
                                </td>
							</tr>
	                    </table>
                    </form>
	            </div> <!-- end of featured project -->
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
</body>
</html>