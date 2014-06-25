<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.blogs')" var="blogURL"></spring:eval>
    <!--Block 3 - This block holds left side stripe of buttons -->
    <div id="side_menu">
        <ul>
            <li><a href="${blogURL}" id="blog_link"></a></li>
            <li><a href="" id="discuss_link"></a></li>
            <li><a href="${pageContext.request.contextPath}/events/unmanaged/home" id="events_link"></a></li>
        </ul>  
    </div>