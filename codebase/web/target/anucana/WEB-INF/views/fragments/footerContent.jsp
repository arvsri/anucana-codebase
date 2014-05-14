<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<!--This block holds the footer content i.e. links etc -->
<div id="anucana_footer" class="centered">
    <a href="${contentsBaseURL}/index.html" class="current">Home</a> | <a href="${contentsBaseURL}/aboutus.html">About Us</a> | <a href="${contentsBaseURL}/services.html">Services</a> | <a href="${contentsBaseURL}/gallery.html">Gallery</a> | <a href="${contentsBaseURL}/contactus.html">Contact Us</a><br /><br />
    Copyright © 2048 <a href="#">Your Company Name</a> | Designed by <a href="http://www.anucana.com" target="_parent">Anucana Designers</a>         
</div>