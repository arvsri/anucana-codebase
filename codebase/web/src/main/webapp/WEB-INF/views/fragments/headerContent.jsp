	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
	<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

    <!--This block holds the 'Hello Member' drop down -->
    <div id="anucana_headTop" class="wrapper_1020">
    	<security:authorize url="/**/managed/**" var="hasAccess"></security:authorize>
        <!-- start of login block -->
        <div id="loginBlock">
        	<c:choose>
        		<c:when test="${hasAccess}">
		            <div id="login_member">
		                <div id="flip"><b><security:authentication property="principal.firstName"/>&nbsp;<security:authentication property="principal.LastName"/></b></div>
		                <div id="panel">
		                    <ul>
		                        <li><a href="${pageContext.request.contextPath}/profile/managed/">My Profile</a></li> <%-- Shows the user profile page in edit mode --%>
		                        <li><a href="${pageContext.request.contextPath}/community/managed/search">My Communities</a></li><%-- Shows the community search page with already joined communities as default --%>
		                        <li><a href="${pageContext.request.contextPath}/events/managed/">My Events</a></li><%-- Shows the list of events for which user has made payment --%>
		                        <li><a href="${pageContext.request.contextPath}/settings/managed/changePassword">Change Password</a></li>
		                        <li><a href="${pageContext.request.contextPath}/settings/managed/logout">Log Out</a></li>
		                    </ul>
		                </div> 
		            </div>
        		</c:when>
        		<c:otherwise>
		      		<sf:form action="${pageContext.request.contextPath}/login/authAndloginUser" method="post" modelAttribute="userLogin">
			           	<table >
			                   <tr>
			                       <td>
			                           <sf:input path="username" tabindex="1" value="" id="email" name="email" placeholder="Email or Phone" />
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


    <!--This block holds the header stripe having weblinks on it -->
    <div id="anucana_headStripe" >
        <div class="wrapper_1020">
            <div id="site_title">
                <a href="${pageContext.request.contextPath}">.</a>
            </div>
            
            <div id="anucana_menu">
                <ul>
                    <li><a href="${contentsBaseURL}/index.html" class="current">Home</a></li>
                    <li><a href="${contentsBaseURL}/aboutus.html">About Us</a></li>
                    <li><a href="${contentsBaseURL}/services.html">Services</a></li>
                    <li><a href="${contentsBaseURL}/gallery.html">Gallery</a></li>
                    <li><a href="${contentsBaseURL}/contactus.html">Contact Us</a></li>
                </ul>       
            </div> <!-- end of anucana_menu -->

            <div class="cleaner"></div>

        </div>  <!-- end of wrapper_1020 -->
    </div>   <!-- end of headStripe -->
