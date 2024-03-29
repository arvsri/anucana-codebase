	<%-- 
		Sub fragment.Just a header stripe and nothing else
		Shouldn't be used directly in a fragment
	--%>

    <!--This block holds the header stripe having weblinks on it -->
    <div id="anucana_headStripe" >
        <div class="wrapper_1020">
            <div id="site_title">
                <a href="/">.</a> 
            </div>
            
            <div id="anucana_menu">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/" id="homeLink">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/unmanaged/aboutUs" id="aboutUsLink">About Us</a></li>
                    <li><a href="${pageContext.request.contextPath}/community/unmanaged/home" id="communitiesLink">Communities</a></li>
                    <!-- 
                    <li><a href="${pageContext.request.contextPath}/unmanaged/gallary">Gallery</a></li>
                     -->
                    <li><a href="${pageContext.request.contextPath}/unmanaged/contactUs" id="contactUsLink">Contact Us</a></li>
                </ul>       
            </div> <!-- end of anucana_menu -->

            <div class="cleaner"></div>

        </div>  <!-- end of wrapper_1020 -->
    </div>   <!-- end of headStripe -->