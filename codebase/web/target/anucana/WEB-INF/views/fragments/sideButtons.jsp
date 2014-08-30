<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.blogs')" var="blogURL"></spring:eval>
	<div style="position: absolute; top: 75px; left: -225px; width: 600px; padding: 10px; font-size: 24px; text-align: center; color: rgb(255, 255, 255); font-family: &quot;trebuchet ms&quot;,verdana,arial,sans-serif; transform: rotate(-45deg); -webkit-transform: rotate(-45deg); -ms-transform: rotate(-45deg); transform-origin: 50% 0px 0px; background-color: rgb(0, 0, 0); border: 1px solid rgb(170, 170, 170); z-index: 12; opacity: 0.5;">Beta</div>
    <!--Block 3 - This block holds left side stripe of buttons -->
    <div id="side_menu">
        <ul>
            <li><a href="${blogURL}" id="blog_link"></a></li>
            <li><a href="${pageContext.request.contextPath}/unmanaged/discussions" id="discuss_link"></a></li>
            <li><a href="${pageContext.request.contextPath}/event/unmanaged/home" id="events_link"></a></li>
        </ul>  
    </div>