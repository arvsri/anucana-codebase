    <!--This block holds the 'Hello Member' drop down -->
    <div id="anucana_headTop" class="wrapper_1020">
        <!-- start of login block -->
        <div id="loginBlock">
            <div id="login_member">
                <div id="flip"><b>${sessionScope['scopedTarget.defaultUserSessionData'].firstName} ${sessionScope['scopedTarget.defaultUserSessionData'].lastName}</b></div>
                <div id="panel">
                    <ul>
                        <li>Profile</li>
                        <li><a href="${pageContext.request.contextPath}/community/searchView">My Communities</a></li>
                        <li><a href="${pageContext.request.contextPath}/logout">Log Out</a></li>
                    </ul>
                </div> 
            </div>
        </div> <!-- end of login block -->
    </div> <!-- end of anucana_headTop block -->


    <!--This block holds the header stripe having weblinks on it -->
    <div id="anucana_headStripe" >
        <div class="wrapper_1020">
            <div id="site_title">
                <a href="http://www.anucana.com">.</a> <!-- Tag line can be written inside this anchor tag -->
            </div> <!-- end of site_title -->
            
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
