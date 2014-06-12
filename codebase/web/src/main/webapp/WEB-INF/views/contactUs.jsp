<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<spring:eval expression="@propertyConfigurer.getProperty('config.contactus.email')" var="contactUsEmail"></spring:eval>
<spring:eval expression="@propertyConfigurer.getProperty('config.contactus.phone')" var="contactUsPhone"></spring:eval>
<spring:eval expression="@propertyConfigurer.getProperty('config.contactus.facebook.handle')" var="contactUsFacebook"></spring:eval>
<spring:eval expression="@propertyConfigurer.getProperty('config.contactus.twitter.handle')" var="contactUsTwitter"></spring:eval>
<spring:eval expression="@propertyConfigurer.getProperty('config.contactus.googleplus.handle')" var="contactUsGooglePlus"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | contact us</title>
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body id="contactUs_page">
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
          <div id="anucana_main">
	        	<div id="contactUsForm">
        			<h2>Contact Us</h2>
                    <p class="description">We are here to answer any questions you may have about anucana. Just send us a message in the form below and we'll respond as soon as possible.</p>
					<sf:form action="contactUs" method="post" modelAttribute="contactUs">                        
	                    <table style="width:100%;">
	                        <tbody>
	                            <tr>
	                                <td><sf:input cssStyle="margin-top:15px;height:25px;width:96%" id="contactUs_name" placeholder="Name" path="name"></sf:input></td>
	                                <td><sf:input cssStyle="margin-top:15px;height:25px;width:96%;float:right;" id="contactUs_email" placeholder="Email address" path="email"></sf:input></td>
	                            </tr>
	                    
	                            <tr>
	                                <td colspan="2"><sf:input cssStyle="margin-top:15px;width:100%;height:25px;" id="contactUs_subject" placeholder="Subject" path="subject"></sf:input></td>
	                            </tr>
	                            <tr>
	                                <td colspan="2"><sf:textarea cssStyle="margin-top:15px;width:100%;height:150px;" id="contactUs_message" path="message"></sf:textarea></td>
	                            </tr>
	                            <tr><td colspan="2"><input class="blueButton bigButton" style="margin-top:15px;" id="contactUs_submit" type="submit" value="Send" /></td></tr>
	                        </tbody>
	                    </table>
                    </sf:form>
	            </div> <!-- end of featured project -->
	            <div id="contactUsInfo">
	                <table>
	                    <tr>
	                        <td style="padding-bottom:30px;">
	                            <div class="blueHeader16" style="padding-bottom:5px;">Email</div>
	                            <div style="font-size:14px;"><a href="mailto:${contactUsEmail}" style="cursor: pointer;">${contactUsEmail}</a></div>
	                        </td>
	                    </tr>
	                    <tr>
	                        <td style="padding-bottom:30px;">
	                            <div class="blueHeader16" style="padding-bottom:5px;">Phone</div>
	                            <div style="font-size:14px;">${contactUsPhone}</div>
	                        </td>
	                    </tr>
	                    <tr>
	                        <td style="padding-bottom:30px;">
	                            <div class="blueHeader16" style="padding-bottom:5px;">Connect on Web</div>
	                            <div style="font-size:18px;">
	                                <a href="${contactUsFacebook}" target="_blank"><span class="webSymbol cursorPointer connect" style="padding:5px;">f</span></a> | 
	                                <a href="${contactUsTwitter}" target="_blank"><span class="webSymbol cursorPointer connect" style="padding:5px;">t</span></a> |
	                                <a href="${contactUsGooglePlus}" target="_blank"><span class="webSymbol cursorPointer connect" style="padding:5px;">g</span></a>                                
	                            </div>
	                        </td>
	                    </tr>
	                </table>
	            </div>
          </div> <!-- end of anucana_main -->
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
</body>
</html>
