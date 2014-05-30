<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana</title>
	<link href="${contentsBaseURL}/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="${contentsBaseURL}/css/flexslider.css" type="text/css" media="screen" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
</head>
<body>


<div id="anucana_outer_wrapper">
	<%@ include file="fragments/headerContentGuest.jsp" %>
	<%@ include file="fragments/sideButtonsGuest.jsp" %>
    <!--Block 4 - This block holds slider, signup form and data content -->
	<div id="anucana_wrapper" class="wrapper_1020">
        <div id="anucana_main">
        	<div id="featured_project_box">
    			<div class="flexslider">
    			  <ul class="slides">
    				<li>
    				<img src="${contentsBaseURL}/images/kitchen_adventurer_cheesecake_brownie.jpg" />
    				</li>
    				<li>
    				<img src="${contentsBaseURL}/images/kitchen_adventurer_lemon.jpg" />
    				</li>
    				<li>
    				<img src="${contentsBaseURL}/images/kitchen_adventurer_donut.jpg" />
    				</li>
    				<li>
    				<img src="${contentsBaseURL}/images/kitchen_adventurer_caramel.jpg" />
    				</li>
    			  </ul>
    			</div>
            </div> <!-- end of featured project -->

            <div id="anucana_registration">
                <h2>Get Started - It's free.</h2>
                <p class="description">Registration takes less than 2 minutes.</p>
                <sf:form action="login/registerNewUser" method="post" modelAttribute="newUserLogin">
	                <table>
	                    <tbody>
	                        <tr>
	                            <td><sf:input path="firstName" id="firstname" placeholder="First name" /></td>
	                            <td style="padding-left:11px;"><sf:input path="lastName" id="lastname" placeholder="Last name" /></td>
	                        </tr>
	                        <tr>
	                            <td colspan="2"><sf:input path="username" id="reg_email" placeholder="Email address" /></td>
	                        </tr>
	                        <tr>
	                            <td colspan="2"><sf:password path="password" id="reg_pass" placeholder="Password (6 or more characters)" /></td>
	                        </tr>
	                        <tr><td colspan="2"><input id="signup_submit" type="submit" value="Join Now" /></td></tr>
	                    </tbody>
	                </table>
                </sf:form>
                <div>
                <p id="reg_policy" >By joining anucana, you agree to anucana's
                    <a href="http://www.anucana.com">User Agreement</a>
                    ,
                    <a href="http://www.anucana.com">Privacy Policy</a>
                    and
                    <a href="http://www.anucana.com">Cookie Policy</a>
                    .
                </p>
                </div>
            </div>

        </div> <!-- end of main -->
        <div id="anucana_content">
        
        	<div class="content_box cb_last">
            	
                <div class="col_w300 col_first">
                	<h2>Communities</h2>
                    <p align="justify"><em>anucana is lorem ipsum <a href="http://www.anucana.com" target="_parent">anucana.com</a> for everyone. Take a tour at anucana.</em></p>
                    <p align="justify">Validate <a href="http://validator.w3.org/check?uri=referer" rel="nofollow">XHTML</a> &amp; <a href="http://jigsaw.w3.org/css-validator/check/referer" rel="nofollow">CSS</a>. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam non diam nec nisl ultrices pulvinar non in eros. Aenean eu lectus vel nulla auctor congue. Nam dui enim, faucibus placerat pharetra at, venenatis eget arcu. Maecenas facilisis <a href="#">consequat</a> diam non accumsan.</p>
                  <p align="justify">Nam ligula lacus, sodales consectetur blandit non, pellentesque non erat. Ut nec eros vel leo placerat auctor. Nulla facilisi. Suspendisse est risus, tincidunt non luctus vel, <a href="#">scelerisque</a> in lorem. Nulla fringilla convallis molestie.</p>
                    <a href="#" class="more"><span>+</span>Read More</a>
                </div>
                
                <div class="col_w300">

                	<h2>Forums</h2>
                    <p align="justify">Fusce lacinia orci at nisi. Suspendisse at nisi nec diam pretium tincidunt. Ut vitae felis eu lectus ultrices varius. Aliquam lacus turpis, dapibus eget, tincidunt eu, lobortis et, magna. Integer pellentesque dignissim diam. Quisque ornare pulvinar lorem.</p>

                    <ul class="tmo_list">
                        <li><a href="http://www.anucana.com/page/6">Quisque in diam a justo condimentum</a></li>
                        <li><a href="http://www.anucana.com/page/5">Morbi sed nulla ac est cursus</a></li>
                        <li><a href="http://www.anucana.com/page/4">Curabitur ullamcorper nibh</a></li>
                        <li><a href="http://www.anucana.com/page/3">Aenean eu lectus vel nulla auctor</a></li>  
                        <li><a href="http://www.anucana.com/page/2">Ut nec eros vel leo placerat</a></li> 
                        <li><a href="http://www.anucana.com/page/1">Etiam non diam nec nisl ultrices pulvinar</a></li>
                        <li><a href="http://www.flashmo.com">Free Flash Templates</a></li>
                    </ul>

                    <a href="#" class="more"><span>+</span>Details</a>

                </div>
                
                <div class="col_w300 col_last">

               	  <h2>Latest Updates</h2>

                    <ul id="news_box">

                        <li>
                            <span class="date">OCT 26, 2048</span>
                            <h6><a href="#">Etiam non diam nec nisl ultrices pulvinar</a></h6>
                            <p> Curabitur eleifend congue leo. Donec a purus vel purus sollicitudin placerat. Nunc at sem. Sed pellentesque placerat augue. </p>
                        </li>

                        <li>
                            <span class="date">OCT 18, 2048</span>
                            <h6><a href="#">Suspendisse hendrerit turpis id augue</a></h6>
                            <p> Etiam et neque. Donec dapibus viverra est. Maecenas dignissim, quam a posuere scelerisque, ligula arcu dictum turpis, id tempus turpis erat at nulla. </p>
                        </li>

                        <li>
                            <span class="date">OCT 14, 2048</span>
                            <h6><a href="#">Donec a purus vel purus sollicitudin placerat</a></h6>
                            <p>Mauris pede nisl, placerat nec, lobortis vitae, dictum sed, neque. Morbi adipiscing dapibus nisl, laoreet sollicitudin tellus tempus eu vehicula nisl.</p>
                        </li>

                    </ul>
                    
                    <a href="#" class="more"><span>+</span>View More</a>
                    
                </div>
                
                <div class="cleaner"></div>
            </div>
        </div> <!-- end of content -->
		<%@ include file="fragments/footerContent.jsp" %>
	</div> <!-- end of wrapper -->
</div> <!-- end of outer wrapper -->

	<script type='text/javascript' src='${contentsBaseURL}/js/logging.js'></script>
	<!-- jQuery -->
	<script src="${contentsBaseURL}/js/jquery1.9.1.min.js"></script>
	<!-- FlexSlider -->
	<script defer src="${contentsBaseURL}/js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function() {
			$('.flexslider').flexslider({
				animation: "slide"
			});
		});
	</script>
</body>
</html>
