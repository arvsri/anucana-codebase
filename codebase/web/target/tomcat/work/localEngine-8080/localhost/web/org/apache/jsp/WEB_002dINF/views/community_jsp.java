package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class community_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/views/fragments/headerContent.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/sideButtons.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/footerContent.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>anucana</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/anucana_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/favicon.ico\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"fontBlack\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"anucana_outer_wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005feval_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      com.anucana.value.objects.UserLogin userLogin = null;
      synchronized (request) {
        userLogin = (com.anucana.value.objects.UserLogin) _jspx_page_context.getAttribute("userLogin", PageContext.REQUEST_SCOPE);
        if (userLogin == null){
          userLogin = new com.anucana.value.objects.UserLogin();
          _jspx_page_context.setAttribute("userLogin", userLogin, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    <!--This block holds the 'Hello Member' drop down -->\r\n");
      out.write("    <div id=\"anucana_headTop\" class=\"wrapper_1020\">\r\n");
      out.write("    \t");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_security_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_security_005fauthorize_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("        <!-- start of login block -->\r\n");
      out.write("        <div id=\"loginBlock\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div> <!-- end of login block -->\r\n");
      out.write("    </div> <!-- end of anucana_headTop block -->\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragments/headerLinkStripe.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  <script defer src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.flexslider.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("       $('#anucana_headTop').on(\"click\", \"#flip\", function() {\r\n");
      out.write("           if(! $(\"#panel\").is(\":visible\")){\r\n");
      out.write("               $(\"#panel\").slideDown(\"fast\");\r\n");
      out.write("               $( \"#member_arrow\" ).attr( \"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/up_arrow_grey6.png\" );\r\n");
      out.write("               $(\"#panel\").focus();\r\n");
      out.write("           }\r\n");
      out.write("       });\r\n");
      out.write("\r\n");
      out.write("       // slide up the 'Hello member' menu, if user clicks anywhere else on the page.\r\n");
      out.write("       $('#anucana_headTop').on(\"blur\", \"#panel\", function() {\r\n");
      out.write("           $(\"#panel\").slideUp(\"fast\");\r\n");
      out.write("           $( \"#member_arrow\" ).attr( \"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/down_arrow_grey6.png\" );\r\n");
      out.write("       });\r\n");
      out.write("  </script>\r\n");
      out.write("\t\r\n");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_spring_005feval_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div style=\"position: absolute; top: 75px; left: -225px; width: 600px; padding: 10px; font-size: 24px; text-align: center; color: rgb(255, 255, 255); font-family: &quot;trebuchet ms&quot;,verdana,arial,sans-serif; transform: rotate(-45deg); -webkit-transform: rotate(-45deg); -ms-transform: rotate(-45deg); transform-origin: 50% 0px 0px; background-color: rgb(0, 0, 0); border: 1px solid rgb(170, 170, 170); z-index: 12; opacity: 0.5;\">Beta</div>\r\n");
      out.write("    <!--Block 3 - This block holds left side stripe of buttons -->\r\n");
      out.write("    <div id=\"side_menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${blogURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"blog_link\"></a></li>\r\n");
      out.write("            <li><a href=\"\" id=\"discuss_link\"></a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/event/unmanaged/home\" id=\"events_link\"></a></li>\r\n");
      out.write("        </ul>  \r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--Block 4 - This block holds Search Community form and search results -->\r\n");
      out.write("\t<div id=\"anucana_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"anucana_main\">\r\n");
      out.write("            <div id=\"grey_wrapper\" class=\"greyLinen_background\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div style=\"margin-top:10px;\">\r\n");
      out.write("                  <div id=\"container\" style=\"margin-top:20px;overflow: hidden;\" class=\"masonry\">\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"communityBannerBox\" class=\"masonryBox communityFontsize col3\">\r\n");
      out.write("                      <div id=\"communityNameBox\" class=\"darkShadeOverlay\">\r\n");
      out.write("                          <p class=\"font18\">\r\n");
      out.write("                            <span id=\"communityName\">Social Media</span>\r\n");
      out.write("                            <span class=\"editIconRightAlign\">\r\n");
      out.write("                              <span id=\"saveCommunityName\" class=\"webSymbol font20 hidden\">.</span>\r\n");
      out.write("                              <img id=\"editCommunityName\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-white.png\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                          </p>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                      <div id=\"communityBanner\">\r\n");
      out.write("                        <img class=\"communityBoxPhoto\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/communityPic.jpg\">\r\n");
      out.write("                        <div class=\"border joinCircle_CP\">\r\n");
      out.write("                          <div class=\"circleFiller\">\r\n");
      out.write("                            <span class=\"joinTextStyle\"> Join </span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div> \r\n");
      out.write("\r\n");
      out.write("                      <div id=\"membersBriefBox\" class=\"darkShadeOverlay\">\r\n");
      out.write("                          <p>\r\n");
      out.write("                            <span class=\"font18\">Members</span><span style=\"float:right;\"><a href=\"\">View All</a></span>\r\n");
      out.write("                          </p>\r\n");
      out.write("                          <div class=\"membersMasonry\">\r\n");
      out.write("                            \r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"communityDescBlock\" class=\"masonryBox roundedCorners communityWhiteBox\" style=\"margin-bottom:20px;\">\r\n");
      out.write("                      <div class=\"pad10 blueHeader14\">\r\n");
      out.write("                        <span>About the Community</span>\r\n");
      out.write("                        <span class=\"editIconRightAlign\">\r\n");
      out.write("                          <span id=\"saveCommunityDesc\" class=\"webSymbol hidden\">.</span>\r\n");
      out.write("                          <img id=\"editCommunityDesc\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-blue.png\">\r\n");
      out.write("                        </span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"triPadBottom10\">\r\n");
      out.write("                        <div id=\"communityDescText\">\r\n");
      out.write("                          This is a heavily moderated/curated community talking about all possible uses of Social Media for business and promotion. This community may have one of the highest moderation bars of any community on Anucana, but we do this to provide the best value for our members. Only active members may post, be sure to get active in at least one of our communities before posting yourself! (See links below) By taking part in this community, you agree to abide by the Community Policy.\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"contactInfoBlock\" class=\"masonryBox roundedCorners col3 communityWhiteBox\" style=\"margin-bottom:20px;\">\r\n");
      out.write("                      <div class=\"pad10\">\r\n");
      out.write("                        <span class=\"webSymbol blueOnWhite font15\">@</span>\r\n");
      out.write("                        <span class=\"blueHeader14\">Get in touch</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"sidePad10\"  >\r\n");
      out.write("                        <table id=\"contactDetails\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td><b>Email</b></td>\r\n");
      out.write("                            <td><a href=\"#\"><span id=\"communityEmail\">socialmedia@anucana.com</span></a></td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              <span class=\"cursorPointer blueOnWhite\">\r\n");
      out.write("                                <span id=\"saveCommunityEmail\"  class=\"webSymbol hidden\">.</span>\r\n");
      out.write("                                <img id=\"editCommunityEmail\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-blue.png\"/>\r\n");
      out.write("                              </span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td><b>Contact</b></td>\r\n");
      out.write("                            <td><span id=\"communityContactNum\">7503254033</span></td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              <span class=\"cursorPointer blueOnWhite\">\r\n");
      out.write("                                <span id=\"saveCommunityContactNum\" class=\"webSymbol hidden\">.</span>\r\n");
      out.write("                                <img id=\"editCommunityContactNum\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-blue.png\"/>\r\n");
      out.write("                              </span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"upcomingEvents\" class=\"masonryBox verticalMargin20 roundedCorners col3 communityWhiteBox\">\r\n");
      out.write("                      <div class=\"pad10\">\r\n");
      out.write("                        <span class=\"webSymbol blueOnWhite font20\">P</span>\r\n");
      out.write("                        <span class=\"blueHeader14\">Upcoming Events</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"sidePad10\">\r\n");
      out.write("                        <div class=\"verticalPad10\">\r\n");
      out.write("                          <table width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td width=\"10%\">\r\n");
      out.write("                                <div class=\"eventCalendarIcon\">\r\n");
      out.write("                                  <div class=\"eventCalendarMonth\">Mar</div>\r\n");
      out.write("                                  <div class=\"eventCalendarDay\">24</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                              <td width=\"70%\">\r\n");
      out.write("                                <div class=\"upcomingEventTitle\">Relics of PHP</div>\r\n");
      out.write("                                <div>Tony is gonna rahul gandhi on Relics of PHP</div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                              <td width=\"20%\">\r\n");
      out.write("                                <div class=\"upcomingEventAttendButton\">\r\n");
      out.write("                                  <button type=\"button\" id=\"openEvent\" class=\"blueButton verySmallButton\">Attend</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"verticalPad10 upcomingEventSeparator\">\r\n");
      out.write("                          <table width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td width=\"10%\">\r\n");
      out.write("                                <div class=\"eventCalendarIcon\">\r\n");
      out.write("                                  <div class=\"eventCalendarMonth\">Mar</div>\r\n");
      out.write("                                  <div class=\"eventCalendarDay\">29</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                              <td width=\"70%\">\r\n");
      out.write("                                <div class=\"upcomingEventTitle\">Relics of Ruby</div>\r\n");
      out.write("                                <div>Brian is gonna dance on Relics of Ruby</div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                              <td width=\"20%\">\r\n");
      out.write("                                <div class=\"upcomingEventAttendButton\">\r\n");
      out.write("                                  <button type=\"button\" id=\"openEvent\" class=\"blueButton verySmallButton\">Attend</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <span id=\"communities_LoadMoreSpan\">\r\n");
      out.write("                    <button type=\"button\" id=\"more\" class=\"blueButton bigButton\">Load more events</button>\r\n");
      out.write("                </span> \r\n");
      out.write("            </div> <!-- end of grey_wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end of anucana_main -->\r\n");
      out.write("\r\n");
      out.write("        <!--Block 5 - This block holds the padding space to keep the footer at bottom -->\r\n");
      out.write("        <div id=\"emptyPad\" style=\"height:130px\" > </div>\r\n");
      out.write("\t\t");
      out.write("<!--This block holds the footer content i.e. links etc -->\r\n");
      out.write("<div id=\"anucana_footer\" class=\"centered\">\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"current\">Home</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/unmanaged/aboutUs\">About Us</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/unmanaged/services\">Services</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/unmanaged/gallary\">Gallery</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/unmanaged/contactUs\">Contact Us</a><br /><br />\r\n");
      out.write("    Copyright © 2048 <a href=\"#\">Your Company Name</a> | Designed by <a href=\"http://www.anucana.com\" target=\"_parent\">Anucana Designers</a>         \r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("    </div> <!-- end of anucana_wrapper -->\r\n");
      out.write("\t</div> <!-- end of anucana_outer_wrapper -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='js/logging.js'></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- jQuery -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <!-- jQuery-ui -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- masonry pluggin-->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/masonry.pkgd.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- images loaded pluggin-->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/imagesloaded.pkgd.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- FlexSlider -->\r\n");
      out.write("  <script defer src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.flexslider.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("\r\n");
      out.write("        // These few variables are declared global. These have usage in multiple functions here.\r\n");
      out.write("        // To be replaced within trainer/event span string.\r\n");
      out.write("        var trainerNameMatcher = \"{trainerName}\";\r\n");
      out.write("        var eventNameMatcher = \"{eventName}\";\r\n");
      out.write("\r\n");
      out.write("        var boxIndexMatcher = \"{boxIndex}\";\r\n");
      out.write("        var impIndexMatcher = \"{impIndex}\";\r\n");
      out.write("        var imageSourceMatcher = \"{imageSource}\";\r\n");
      out.write("        var eventDateMatcher = \"{eventDate}\";\r\n");
      out.write("        var eventStartTimeMatcher = \"{eventStartTime}\";\r\n");
      out.write("        var eventDurationMatcher = \"{eventDuration}\";\r\n");
      out.write("        var eventVenueMatcher = \"{eventVenue}\";\r\n");
      out.write("        var longDescMatcher = \"{longDesc}\";\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      // Global variable to count the number of dynamic boxes loaded on this page so far\r\n");
      out.write("      var dynamicBoxesLoaded = 0;\r\n");
      out.write("        var $container = $('.masonry');\r\n");
      out.write("        //Below dummy json object will be replaced by the dynamically fetched json.\r\n");
      out.write("        var membersResponseJSONN = getMembersAjaxCall();\r\n");
      out.write("        appendMemberMasonryElements(membersResponseJSONN);\r\n");
      out.write("        var communityFeedsResponseJSONN = ajaxCall();\r\n");
      out.write("        appendMasonryElements(communityFeedsResponseJSONN);\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            function showHideIconAndRefreshMasonry(icon1, icon2){\r\n");
      out.write("              $container.masonry({\r\n");
      out.write("                itemSelector: '.masonryBox',\r\n");
      out.write("                columnWidth: 60,\r\n");
      out.write("                isAnimated: true,\r\n");
      out.write("                gutter:20\r\n");
      out.write("              });\r\n");
      out.write("\r\n");
      out.write("              $(icon1).addClass('hidden');\r\n");
      out.write("              $(icon2).removeClass('hidden');\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function activateReadWriteMode(textDiv, editIcon, saveIcon){\r\n");
      out.write("              $(textDiv).attr('contenteditable','true');\r\n");
      out.write("              showHideIconAndRefreshMasonry(editIcon, saveIcon);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function activateReadOnlyMode(textDiv, editIcon, saveIcon){\r\n");
      out.write("              $(textDiv).removeAttr('contenteditable');\r\n");
      out.write("              showHideIconAndRefreshMasonry(saveIcon, editIcon); \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $('#editCommunityDesc').click(function(){\r\n");
      out.write("              activateReadWriteMode($('#communityDescText'), $('#editCommunityDesc'), $('#saveCommunityDesc'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#saveCommunityDesc').click(function(){\r\n");
      out.write("             activateReadOnlyMode($('#communityDescText'), $('#editCommunityDesc'), $('#saveCommunityDesc'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#editCommunityName').click(function(){\r\n");
      out.write("              activateReadWriteMode($('#communityName'), $('#editCommunityName'), $('#saveCommunityName'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#saveCommunityName').click(function(){\r\n");
      out.write("              activateReadOnlyMode($('#communityName'), $('#editCommunityName'), $('#saveCommunityName'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#editCommunityEmail').click(function(){\r\n");
      out.write("              activateReadWriteMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#saveCommunityEmail').click(function(){\r\n");
      out.write("              activateReadOnlyMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#editCommunityContactNum').click(function(){\r\n");
      out.write("              activateReadWriteMode($('#communityContactNum'), $('#editCommunityContactNum'), $('#saveCommunityContactNum'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#saveCommunityContactNum').click(function(){\r\n");
      out.write("              activateReadOnlyMode($('#communityContactNum'), $('#editCommunityContactNum'), $('#saveCommunityContactNum'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // Arvind : Code Snippet# D3. Event binding using .on() in below two blocks is just to facilitate the dynamic loading of htmls here using jQuery this binding need not to be done in the jsp where jsp inclusion isn't dynamic. Simple .click() function may be used while working with jsps.\r\n");
      out.write("\r\n");
      out.write("            // this function makes the top 'Hello member' menu to slide down.\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#flip\", function() {\r\n");
      out.write("                if(! $(\"#panel\").is(\":visible\")){\r\n");
      out.write("                    $(\"#panel\").slideDown(\"fast\");\r\n");
      out.write("                    $( \"#member_arrow\" ).attr( \"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/up_arrow_grey6.png\" );\r\n");
      out.write("                    $(\"#panel\").focus();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // slide up the 'Hello member' menu, if user clicks anywhere else on the page.\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"blur\", \"#panel\", function() {\r\n");
      out.write("                $(\"#panel\").slideUp(\"fast\");\r\n");
      out.write("                $( \"#member_arrow\" ).attr( \"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/down_arrow_grey6.png\" );\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        jQuery('#more').click(function(){\r\n");
      out.write("          //Below dummy json object will be replaced by the dynamically fetched json.\r\n");
      out.write("          var responseJSON = ajaxCall();\r\n");
      out.write("          appendMasonryElements(responseJSON);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.\r\n");
      out.write("        function getMembersAjaxCall(){\r\n");
      out.write("          var responseJSON = [\r\n");
      out.write("          {\"trainer\":\"Mark\",\"eventName\":\"Relics of Python\",\"eventDate\":\"26-Mar-2014\", \"startTime\":\"03:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Hayat Hotel\", \"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna blabber on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Tony\",\"eventName\":\"Relics of PHP\",\"eventDate\":\"22-Apr-2014\", \"startTime\":\"05:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Regals Residency\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"true\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Tony\",\"eventName\":\"Relics of PHP\",\"eventDate\":\"22-Apr-2014\", \"startTime\":\"05:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Regals Residency\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"true\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Tony\",\"eventName\":\"Relics of PHP\",\"eventDate\":\"22-Apr-2014\", \"startTime\":\"05:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Regals Residency\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"true\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"}\r\n");
      out.write("          ];\r\n");
      out.write("\r\n");
      out.write("          return responseJSON;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.\r\n");
      out.write("        function ajaxCall(){\r\n");
      out.write("          var responseJSON = [\r\n");
      out.write("          {\"trainer\":\"Mark\",\"eventName\":\"Relics of Python\",\"eventDate\":\"26-Mar-2014\", \"startTime\":\"03:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Hayat Hotel\", \"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna blabber on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Tony\",\"eventName\":\"Relics of PHP\",\"eventDate\":\"22-Apr-2014\", \"startTime\":\"05:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Regals Residency\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"true\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"3\", \"membershipStatus\": \"false\"}\r\n");
      out.write("          ];\r\n");
      out.write("\r\n");
      out.write("          return responseJSON;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        // This method appends member masonry boxes to the member masonry container\r\n");
      out.write("        function appendMemberMasonryElements(responseJSON){\r\n");
      out.write("          //var lastLoadedCount = dynamicBoxesLoaded;\r\n");
      out.write("          var boxList = $();\r\n");
      out.write("          $.each(responseJSON, function(i, eventData) {\r\n");
      out.write("            var boxElement = getMemberBoxElement(i, eventData);\r\n");
      out.write("            boxList = boxList.add($(boxElement));\r\n");
      out.write("            //dynamicBoxesLoaded++;\r\n");
      out.write("          });\r\n");
      out.write("\r\n");
      out.write("          var $memberContainer = $('.membersMasonry');\r\n");
      out.write("          $memberContainer = $memberContainer.append( boxList );\r\n");
      out.write("\r\n");
      out.write("          $('.membersMasonry').imagesLoaded( function() {\r\n");
      out.write("            // images have loaded\r\n");
      out.write("            $memberContainer.masonry( 'appended', boxList )\r\n");
      out.write("                .masonry({\r\n");
      out.write("                  itemSelector: '.memberMasonryBox',\r\n");
      out.write("                  columnWidth: 40,\r\n");
      out.write("                  isAnimated: true, \r\n");
      out.write("                  gutter:10\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // This method appends newly generated masonry boxes to the masonry container\r\n");
      out.write("        function appendMasonryElements(responseJSON){\r\n");
      out.write("          var lastLoadedCount = dynamicBoxesLoaded;\r\n");
      out.write("          var boxList = $();\r\n");
      out.write("          $.each(responseJSON, function(i, eventData) {\r\n");
      out.write("            var boxElement = getBoxElement(i, lastLoadedCount, eventData);\r\n");
      out.write("            boxList = boxList.add($(boxElement));\r\n");
      out.write("            dynamicBoxesLoaded++;\r\n");
      out.write("          });\r\n");
      out.write("\r\n");
      out.write("          $container = $container.append( boxList );\r\n");
      out.write("\r\n");
      out.write("          $('.masonry').imagesLoaded( function() {\r\n");
      out.write("            // images have loaded\r\n");
      out.write("            $container.masonry( 'appended', boxList )\r\n");
      out.write("                .masonry({\r\n");
      out.write("                  itemSelector: '.masonryBox',\r\n");
      out.write("                  columnWidth: 60,\r\n");
      out.write("                  isAnimated: true,\r\n");
      out.write("                  gutter:20\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        // Generates a random importance index\r\n");
      out.write("        function getRandomImpIndex() {\r\n");
      out.write("          var iRand = Math.random();\r\n");
      out.write("          var impIndex = iRand > 0.85 ? 1 : iRand > 0.6 ? 2 : iRand > 0.35 ? 3 : 3;\r\n");
      out.write("          return impIndex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /* This method is completely configurable wrt. the box html template to be picked from the properties file. Non configurable alternate code can be refered at the end of this script tag.\r\n");
      out.write("        */\r\n");
      out.write("        function getMemberBoxElement(index, eventData) {\r\n");
      out.write("          var dynamicDivMarkupString =           \r\n");
      out.write("          '<div id=\"dynamicMemberBox'+ index +'\" class=\"memberMasonryBox verticalMargin5 col1\">'+\r\n");
      out.write("            '<a href=\"#\">'+\r\n");
      out.write("              '<img class=\"communityBoxPhoto\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/memberPic.jpg\">'+\r\n");
      out.write("            '</a>'+\r\n");
      out.write("          '</div>';\r\n");
      out.write("          return dynamicDivMarkupString;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /* This method is completely configurable wrt. the box html template to be picked from the properties file. Non configurable alternate code can be refered at the end of this script tag.\r\n");
      out.write("        */\r\n");
      out.write("        function getBoxElement(index, lastLoadedCount, eventData) {\r\n");
      out.write("          \r\n");
      out.write("         //Fetch impIndex to decide the dimentions based on importance of this element box. \r\n");
      out.write("         var impIndex = eventData.impIndex;\r\n");
      out.write("          // In case no impIndex is sent with an Event\r\n");
      out.write("          if(impIndex == null || impIndex == \"\"){\r\n");
      out.write("            impIndex = getRandomImpIndex();\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          //Fetch membership status to decide which style class to be imparted to 'join' circular button\r\n");
      out.write("          var communityJoined = eventData.membershipStatus;\r\n");
      out.write("          var joinCircleClass;\r\n");
      out.write("          var joinCircleText;\r\n");
      out.write("          var backgroundColor;\r\n");
      out.write("          if(communityJoined == \"true\"){\r\n");
      out.write("            joinCircleClass = \"icon\";\r\n");
      out.write("            backgroundColor = \"blueBackground\";\r\n");
      out.write("            joinCircleText = \".\";\r\n");
      out.write("          }\r\n");
      out.write("          else{\r\n");
      out.write("            joinCircleClass = \"joinTextStyle\";\r\n");
      out.write("            joinCircleText = \"Join\";\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /* Arvind : Pick the below mentioned matcher patterns from a properties file. Same properties file should be refered to embed these matcher patters in the description text while saving this event description in the DB. eg. In our properties file it should look something like -  \r\n");
      out.write("          msg.trainerNameMatcher = {trainerName} \r\n");
      out.write("\r\n");
      out.write("        So while fetching its value here, in case of struts it can be done as -\r\n");
      out.write("          var trainerNameMatcher = <s:text name=\"msg.confirm\"/>\r\n");
      out.write("\r\n");
      out.write("        Below hard coded values of matchers & dynamicDivMarkupString should be replaced with dynamic code.\r\n");
      out.write("        */\r\n");
      out.write("\r\n");
      out.write("          // To be replaced in the event desc string.\r\n");
      out.write("          var trainerNameMarkupMatcher = \"{trainerNameMarkup}\";\r\n");
      out.write("          var eventNameMarkupMatcher = \"{eventNameMarkup}\";\r\n");
      out.write("          var shortDescMatcher = \"{shortDesc}\";\r\n");
      out.write("\r\n");
      out.write("          var dynamicDivMarkupString = \r\n");
      out.write("          '<div id=\"dynamicBox{boxIndex}\" class=\"masonryBox community_box verticalMargin20 col{impIndex}\">'+\r\n");
      out.write("            '<a href=\"#inline_content{boxIndex}\">'+\r\n");
      out.write("              '<img class=\"communityBoxPhoto\" src={imageSource}>'+\r\n");
      out.write("            '</a>'+\r\n");
      out.write("            '<div  style=\"background:white;padding:5px;\">'+\r\n");
      out.write("                '<p>{shortDesc}</p>'+\r\n");
      out.write("            '</div>'+\r\n");
      out.write("            '<div class=\"border '+ backgroundColor +'\">'+\r\n");
      out.write("              '<div class=\"circleFiller\">'+\r\n");
      out.write("                '<span class=\"'+ joinCircleClass +'\">'+ joinCircleText +'</span>'+\r\n");
      out.write("              '</div>'+\r\n");
      out.write("            '</div>'+\r\n");
      out.write("          '</div>';\r\n");
      out.write("\r\n");
      out.write("          var trainerNameMarkupString = '<span class=\"trainerName\">{trainerName}</span>';\r\n");
      out.write("          var eventNameMarkupString = '<span class=\"eventName\">{eventName}</span>';\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          dynamicDivMarkupString= dynamicDivMarkupString.split(boxIndexMatcher).join((index+lastLoadedCount));\r\n");
      out.write("          dynamicDivMarkupString = dynamicDivMarkupString.replace(impIndexMatcher, impIndex);\r\n");
      out.write("          dynamicDivMarkupString = dynamicDivMarkupString.replace(imageSourceMatcher, eventData.imgSrc);\r\n");
      out.write("\r\n");
      out.write("          var shortDesc = eventData.shortDesc;\r\n");
      out.write("          var trainerName = trainerNameMarkupString.replace(trainerNameMatcher, eventData.trainer);\r\n");
      out.write("          shortDesc = shortDesc.replace(trainerNameMarkupMatcher, trainerName);\r\n");
      out.write("          var eventName = eventNameMarkupString.replace(eventNameMatcher, eventData.eventName);\r\n");
      out.write("          shortDesc = shortDesc.replace(eventNameMarkupMatcher, eventName);\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          // More details may be added to event description viz. Date, Time etc on similar lines of trainerName & eventName as above.\r\n");
      out.write("\r\n");
      out.write("          dynamicDivMarkupString = dynamicDivMarkupString.replace(shortDescMatcher, shortDesc);\r\n");
      out.write("          var dynamicDivHTML = $.parseHTML( dynamicDivMarkupString );\r\n");
      out.write("\r\n");
      out.write("          return dynamicDivHTML;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $('.border').click(function(){\r\n");
      out.write("          //Make an ajax call here to join this particular community, and in case success is returned, execute the below code.\r\n");
      out.write("          $(this).css(\"background-color\",\"#009DDB\");\r\n");
      out.write("          $(\".joinTextStyle\", this).removeClass(\"joinTextStyle\").addClass(\"icon\").text(\".\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005feval_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f0 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    _jspx_th_spring_005feval_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005feval_005f0.setParent(null);
    // /WEB-INF/views/community.jsp(3,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/community.jsp(3,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setVar("contentsBaseURL");
    int[] _jspx_push_body_count_spring_005feval_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005feval_005f0 = _jspx_th_spring_005feval_005f0.doStartTag();
      if (_jspx_th_spring_005feval_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005feval_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005feval_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005feval_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f1 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    _jspx_th_spring_005feval_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005feval_005f1.setParent(null);
    // /WEB-INF/views/fragments/headerContent.jsp(5,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f1.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/fragments/headerContent.jsp(5,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f1.setVar("contentsBaseURL");
    int[] _jspx_push_body_count_spring_005feval_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005feval_005f1 = _jspx_th_spring_005feval_005f1.doStartTag();
      if (_jspx_th_spring_005feval_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005feval_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005feval_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005feval_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f0.setParent(null);
    // /WEB-INF/views/fragments/headerContent.jsp(16,5) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setUrl("/**/managed/**");
    // /WEB-INF/views/fragments/headerContent.jsp(16,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setVar("hasAccess");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f1.setParent(null);
    // /WEB-INF/views/fragments/headerContent.jsp(17,5) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f1.setUrl("/**/event/managed/edit/**");
    // /WEB-INF/views/fragments/headerContent.jsp(17,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f1.setVar("hasModeratorAccess");
    int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
    if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f1);
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f2.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f2.setParent(null);
    // /WEB-INF/views/fragments/headerContent.jsp(18,5) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f2.setUrl("/**/community/managed/edit/**");
    // /WEB-INF/views/fragments/headerContent.jsp(18,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f2.setVar("hasAdminAccess");
    int _jspx_eval_security_005fauthorize_005f2 = _jspx_th_security_005fauthorize_005f2.doStartTag();
    if (_jspx_th_security_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        \t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        \t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(23,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t            <div id=\"login_member\">\r\n");
        out.write("\t\t                <div id=\"flip\"><b>&nbsp;&nbsp;");
        if (_jspx_meth_security_005fauthentication_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_security_005fauthentication_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;</b></div>\r\n");
        out.write("\t\t                <div id=\"panel\">\r\n");
        out.write("\t\t                    <ul>\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/profile/managed/\">My Profile</a></li> ");
        out.write("\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/community/managed/search\">My Communities</a></li>");
        out.write("\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/events/managed/\">My Events</a></li>");
        out.write("\r\n");
        out.write("\t\t                        ");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                        ");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/login/managed/updatePassword\">Change Password</a></li>\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/settings/managed/logout\">Log Out</a></li>\r\n");
        out.write("\t\t                    </ul>\r\n");
        out.write("\t\t                </div> \r\n");
        out.write("\t\t            </div>\r\n");
        out.write("        \t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthentication_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(25,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setProperty("principal.firstName");
    int _jspx_eval_security_005fauthentication_005f0 = _jspx_th_security_005fauthentication_005f0.doStartTag();
    if (_jspx_th_security_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthentication_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f1.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(25,111) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f1.setProperty("principal.LastName");
    int _jspx_eval_security_005fauthentication_005f1 = _jspx_th_security_005fauthentication_005f1.doStartTag();
    if (_jspx_th_security_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(31,26) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasModeratorAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/event/managed/edit/0\">Create Event</a></li>");
        out.write("\r\n");
        out.write("\t\t                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(34,26) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasAdminAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/community/managed/edit/0\">Start a community</a></li>");
        out.write("\r\n");
        out.write("\t\t                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t      \t\t");
        if (_jspx_meth_sf_005fform_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        \t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_sf_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(44,10) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/login/authAndloginUser", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/fragments/headerContent.jsp(44,10) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setMethod("post");
    // /WEB-INF/views/fragments/headerContent.jsp(44,10) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setModelAttribute("userLogin");
    int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
      if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t           \t<table>\r\n");
          out.write("\t\t\t                   <tr>\r\n");
          out.write("\t\t\t                       <td>\r\n");
          out.write("\t\t\t                           ");
          if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t                       </td>\r\n");
          out.write("\t\t\t                       <td>\r\n");
          out.write("\t\t\t                           ");
          if (_jspx_meth_sf_005fpassword_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t                       </td>\r\n");
          out.write("\t\t\t                       <td style=\"padding: 0;\">\r\n");
          out.write("\t\t\t                            <div id=\"forgotPasswordDiv\"><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/login/forgotPassword\">Forgot?</a></div>\r\n");
          out.write("\t\t\t                       </td>\r\n");
          out.write("\t\t\t\t                   <td>\r\n");
          out.write("\t\t\t    \t                    <label for=\"u_0_l\" id=\"loginbutton\"><input type=\"submit\" id=\"u_0_l\" class=\"button grey_button\" tabindex=\"4\" value=\"Log In\"></label>\r\n");
          out.write("\t\t\t\t                   </td>\r\n");
          out.write("\t\t\t                   </tr>\r\n");
          out.write("\t\t\t           \t</table>\r\n");
          out.write("\t\t           \t");
          int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_sf_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(48,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("username");
    // /WEB-INF/views/fragments/headerContent.jsp(48,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setTabindex("1");
    // /WEB-INF/views/fragments/headerContent.jsp(48,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/views/fragments/headerContent.jsp(48,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setId("email");
    // /WEB-INF/views/fragments/headerContent.jsp(48,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "name", new String("email"));
    // /WEB-INF/views/fragments/headerContent.jsp(48,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("Email or Phone"));
    int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
      if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_sf_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_sf_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(51,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setPath("password");
    // /WEB-INF/views/fragments/headerContent.jsp(51,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setTabindex("2");
    // /WEB-INF/views/fragments/headerContent.jsp(51,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setId("pass");
    // /WEB-INF/views/fragments/headerContent.jsp(51,30) null
    _jspx_th_sf_005fpassword_005f0.setDynamicAttribute(null, "name", new String("pass"));
    // /WEB-INF/views/fragments/headerContent.jsp(51,30) null
    _jspx_th_sf_005fpassword_005f0.setDynamicAttribute(null, "placeholder", new String("Password"));
    int[] _jspx_push_body_count_sf_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fpassword_005f0 = _jspx_th_sf_005fpassword_005f0.doStartTag();
      if (_jspx_th_sf_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.reuse(_jspx_th_sf_005fpassword_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f2 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    _jspx_th_spring_005feval_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005feval_005f2.setParent(null);
    // /WEB-INF/views/fragments/sideButtons.jsp(2,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f2.setExpression("@propertyConfigurer.getProperty('config.baseurl.blogs')");
    // /WEB-INF/views/fragments/sideButtons.jsp(2,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f2.setVar("blogURL");
    int[] _jspx_push_body_count_spring_005feval_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005feval_005f2 = _jspx_th_spring_005feval_005f2.doStartTag();
      if (_jspx_th_spring_005feval_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005feval_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005feval_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005feval_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f2);
    }
    return false;
  }
}
