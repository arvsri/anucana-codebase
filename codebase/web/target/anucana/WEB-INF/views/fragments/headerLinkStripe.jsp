	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

    <div id="emptyPad" style="height:45px" > </div>

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