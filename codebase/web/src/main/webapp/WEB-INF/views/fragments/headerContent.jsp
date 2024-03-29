<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<%-- 
	Header Content. 
	User Login Form or User Settings based on weather user is authenticated or not
	To be used at most of the pages
--%>

	<jsp:useBean id="userLogin" scope="request" class="com.anucana.value.objects.UserLogin"></jsp:useBean>
    <!--This block holds the 'Hello Member' drop down -->
    <div id="anucana_headTop" class="wrapper_1020">
    	<security:authorize url="/**/managed/**" var="hasAccess"></security:authorize>
    	<security:authorize url="/**/event/managed/edit/**" var="hasModeratorAccess"></security:authorize>
    	<security:authorize url="/**/community/managed/edit/**" var="hasAdminAccess"></security:authorize>
    	
        <!-- start of login block -->
        <div id="loginBlock">
        	<c:choose>
        		<c:when test="${hasAccess}">
		            <div id="login_member">
		                <div id="flip">
					<b>&nbsp;&nbsp;<security:authentication property="principal.firstName"/>&nbsp;<security:authentication property="principal.LastName"/>&nbsp;&nbsp;</b>
					<img id="member_arrow" src="${contentsBaseURL}/img/down_arrow_grey6.png">
				</div>
		                <div id="panel" tabindex="-1">
		                    <ul>
		                        <li><a href="${pageContext.request.contextPath}/profile/managed/">My Profile</a></li> <%-- Shows the user profile page in edit mode --%>
		                        <li><a href="${pageContext.request.contextPath}/booking/managed/list">My Bookings</a></li><%-- Shows the list of bookings for which user has made payment --%>
								
		                        <c:if test="${hasAdminAccess}">
			                        <li><a href="${pageContext.request.contextPath}/admin/managed/dashboard">Admin Dashboard</a></li><%-- Show the administration dashboard, only to the administrators --%>
		                        </c:if>

		                        <li><a href="${pageContext.request.contextPath}/login/managed/updatePassword">Change Password</a></li>
		                        <li><a href="${pageContext.request.contextPath}/settings/managed/logout">Log Out</a></li>
		                    </ul>
		                </div> 
		            </div>
        		</c:when>
        		<c:otherwise>
		      		<sf:form action="${pageContext.request.contextPath}/login/authAndloginUser" method="post" modelAttribute="userLogin">
			           	<table>
			                   <tr>
			                       <td>
			                           <sf:input path="username" tabindex="1" id="email" name="email" placeholder="Email or Phone" />
			                       </td>
			                       <td>
			                           <sf:password path="password" tabindex="2" id="pass" name="pass" placeholder="Password" />
			                       </td>
			                       <td style="padding: 0;">
			                            <div id="forgotPasswordDiv"><a href="${pageContext.request.contextPath}/login/forgotPassword">Forgot?</a></div>
			                       </td>
				                   <td>
			    	                    <label for="u_0_l" id="loginbutton"><input type="submit" id="u_0_l" class="button grey_button" tabindex="4" value="Log In"></label>
				                   </td>
			                   </tr>
			           	</table>
		           	</sf:form>
        		</c:otherwise>
        	</c:choose>
        </div> <!-- end of login block -->
    </div> <!-- end of anucana_headTop block -->
	
	<jsp:include page="fragments/headerLinkStripe.jsp"></jsp:include>
	
  <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
  <script defer src="${pageContext.request.contextPath}/static/js/jquery.flexslider.js"></script>
  <script type="text/javascript">
		$(document).ready(function() {
			$(".startsUgly").show();
	    });
  
       $('#anucana_headTop').on("click", "#flip", function() {
           if(! $("#panel").is(":visible")){
               $("#panel").slideDown("fast");
               $( "#member_arrow" ).attr( "src", "${contentsBaseURL}/img/up_arrow_grey6.png" );
               $("#panel").focus();
           }
       });

       // slide up the 'Hello member' menu, if user clicks anywhere else on the page.
       $('#anucana_headTop').on("blur", "#panel", function() {
           $("#panel").slideUp("slow");
           $( "#member_arrow" ).attr( "src", "${contentsBaseURL}/img/down_arrow_grey6.png" );
       });
  </script>
	
