<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

    <!--This block holds the login menu -->
    <div id="anucana_headTop" class="wrapper_1020">
          	<!-- start of login block -->
          	<div id="loginBlock">
      		<sf:form action="${pageContext.request.contextPath}/login/authAndloginUser" method="post" modelAttribute="userLogin">
           	<table >
               	<tbody>
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
               </tbody>
           	</table>
			<div id="clear"></div>
          	</sf:form>
          	</div> <!-- end of login block -->
    </div> <!-- end of anucana_headTop block -->


    <!--Block 2 - This block holds the header stripe having weblinks on it -->
    <div id="anucana_headStripe" >
        <div class="wrapper_1020">
            <div id="site_title">
                <a href="${pageContext.request.contextPath}">.</a> 
            </div>
            
            <div id="anucana_menu">
                <ul>
                    <li><a href="index.html" class="current">Home</a></li>
                    <li><a href="aboutus.html">About Us</a></li>
                    <li><a href="services.html">Services</a></li>
                    <li><a href="gallery.html">Gallery</a></li>
                    <li><a href="contactus.html">Contact Us</a></li>
                </ul>       
            </div> <!-- end of anucana_menu -->

            <div class="cleaner"></div>

        </div>  <!-- end of wrapper_1020 -->
    </div>   <!-- end of headStripe -->

