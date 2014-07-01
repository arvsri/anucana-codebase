<%-- 

 Edit Image Tag. It supports 
 1. Rendering of edit image only if user is authenticated or authorized
 2. Modes Supported :
 	a. span-white ( default )
 	a. span-blue
 	a. simple-white  
 	 
--%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<%@ attribute name="mode" description="Please see the documentation to understand the modes suppoted. Default is span-white" required="false"%>
<%@ attribute name="properties" description="data properties to be made editable" required="false" %>
<%@ attribute name="accessId" description="user id to be authenticated against" required="true" %>
<%@ attribute name="style" description="style to be applied" required="false" %>

<security:authorize url="/**/managed/**" var="isAuthenticated"></security:authorize>
<c:if test="${isAuthenticated}">
	<security:authentication property="principal.userId" var="userId"/>
	<c:if test="${userId == accessId}">
           <%-- Decide on the image --%>
          <c:choose>
          		<c:when test="${not empty mode && mode == 'span-blue'}">
					<c:set var="image" value="edit-pen-icon-blue.png"></c:set>
					<c:set var="imageClass" value="darkBlueOnWhite"></c:set>
          		</c:when>
          		<c:otherwise>
					<c:set var="image" value="edit-pen-icon-white.png"></c:set>
          		</c:otherwise>
          </c:choose>

           <c:choose>
           		<c:when test="${not empty mode && mode == 'simple-white'}">
           			<img src="${contentsBaseURL}/images/${image}" />
           		</c:when>
           		<c:otherwise>
		         <span class="cursorPointer" style="${style}" data-props="${properties}">
		             <span class="webSymbol font20 hidden saveasync ${imageClass}" >.</span>
		             <img class="editasync" src="${contentsBaseURL}/images/${image}" />
		         </span>
           		</c:otherwise>
           </c:choose>
           <c:set var="editMode" value="true" scope="request"></c:set>
	</c:if>
</c:if>
