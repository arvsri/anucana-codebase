package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/views/fragments/headerContent.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/sideButtonsGuest.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/footerContent.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>anucana</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/anucana_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/profile-style.css\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/favicon.ico\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/colorbox.css\" />\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"anucana_outer_wrapper\">\r\n");
      out.write("\t\t");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_spring_005feval_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--This block holds the 'Hello Member' drop down -->\r\n");
      out.write("    <div id=\"anucana_headTop\" class=\"wrapper_1020\">\r\n");
      out.write("    \t");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!-- start of login block -->\r\n");
      out.write("        <div id=\"loginBlock\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div> <!-- end of login block -->\r\n");
      out.write("    </div> <!-- end of anucana_headTop block -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--This block holds the header stripe having weblinks on it -->\r\n");
      out.write("    <div id=\"anucana_headStripe\" >\r\n");
      out.write("        <div class=\"wrapper_1020\">\r\n");
      out.write("            <div id=\"site_title\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">.</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"anucana_menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index.html\" class=\"current\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/aboutus.html\">About Us</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/services.html\">Services</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/gallery.html\">Gallery</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/contactus.html\">Contact Us</a></li>\r\n");
      out.write("                </ul>       \r\n");
      out.write("            </div> <!-- end of anucana_menu -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"cleaner\"></div>\r\n");
      out.write("\r\n");
      out.write("        </div>  <!-- end of wrapper_1020 -->\r\n");
      out.write("    </div>   <!-- end of headStripe -->\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("    <!--Block 3 - This block holds left side stripe of buttons -->\r\n");
      out.write("    <div id=\"side_menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"\" id=\"blog_link\"></a></li>\r\n");
      out.write("            <li><a href=\"\" id=\"discuss_link\"></a></li>\r\n");
      out.write("            <li><a href=\"\" id=\"events_link\"></a></li>\r\n");
      out.write("        </ul>  \r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("\t\t<div id=\"anucana_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("\t\t<div class=\"first_palate\">\r\n");
      out.write("\t\t\t<div class=\"profile-summary\">\r\n");
      out.write("\t\t\t\t<div class=\"profile-image\">\r\n");
      out.write("\t\t\t\t\t<img class=\"preview-picture\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/arvsri.png\" />\r\n");
      out.write("\t\t\t\t\t<a class=\"edit-picture\" href=\"#lightBoxContainer\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/camera-icon.png\" /></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  <div style=\"display:none\" >\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"lightBoxContainer\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"float:left; width:30%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class='photo' src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/arvsri.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"padding-left:20px;overflow: hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"font-family: sans-serif;font-size: 13px;color: rgb(100,100,100);font-weight: bold;height: 40px; margin-top: 20px;\">Upload Image</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"font-family: sans-serif;font-size: 12px;color: rgb(100,141,197);height: 30px;\"> ( Supported image formats - JPEG, PNG, GIF. Prefered size should be 200 px * 200px with size not exceeding 500 kb ) </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"margin-top:20px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"imageUploadError\" class='errorMsg'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imageuploaderror}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/managed/profile/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/image\" enctype=\"multipart/form-data\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Save my image\" class=\"blueButton smallButton\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t  \r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"profile-Intro\">\r\n");
      out.write("\t\t\t\t\t<div class=\"profile_h1\"><a href=\"javascript:void(0);\" id=\"profile_h1_edit\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"profile_h2\"><a href=\"javascript:void(0);\" id=\"profile_h2_edit\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a><span id=\"updateProfileHeading\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.profileHeading}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"profile_h3\"><a href=\"javascript:void(0);\" id=\"profile_h3_edit\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a><span id=\"updateBasicIntro\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.areaCd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.countryCd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.industryCd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></iv>\r\n");
      out.write("\t\t\t\t\t<div class=\"profile_save\"><button class=\"profile_edit_button save_button\" name=\"save-exit\">Edit Profile</button></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Editable counter parts of each profile introduction headings -->\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_edit profile_h1_edit\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_h1\">Name</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"firstName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"lastName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updateUserName\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_edit profile_h2_edit\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_h1\">Your professional headline</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"full\" type=\"text\" name=\"profileHeading\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.profileHeading}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updateProfile\" value=\"updateProfileHeading\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_help_h1\">Examples</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_help_h2\">Experienced Transportation Executive, Web Designer and Information Architect, Visionary Entrepreneur and Investor</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_edit profile_h3_edit\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_h1\">Country</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updateProfile\" value=\"updateBasicIntro\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"full\" name=\"countryCd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"pleaseSelect\">Please Select ..</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"india\" selected >India</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Pakistan\">Pakistan</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_h1\">Postal Code</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_input\"><input class=\"full\" type=\"text\" name=\"areaCd\" /></div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_h1\">Location Name</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"locations\" />Gurgaon, Haryana<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"locations\" checked />Gurgaon\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_h1\">Industry</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"industryCd\"  class=\"full\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"pleaseSelect\">Please Select ..</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"it\" selected >Information Technology and Services</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"finance\">Finance</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"contacts\">\r\n");
      out.write("\t\t\t\t<div class=\"contact_details\">\r\n");
      out.write("\t\t\t\t\t<p class=\"contact_h1\">Visible to your community members</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"contact_row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contact_col\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\"><span>Email</span></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" id=\"contact_edit_emailadd\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"updateEmail\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"profile_edit contact_edit_emailadd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_h1\">Email</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"full\" type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updatePrimaryInfo\" value=\"updateEmail\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contact_col\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\"><span>Phone</span></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" id=\"contact_edit_phone\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t+91-<span id=\"updatePhone\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"profile_edit contact_edit_phone\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_h1\">Phone</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"contact_h2\">+91-</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"phoneTypeCd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"home\">Home</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"mobile\" selected >Mobile</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"work\">Work</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updatePrimaryInfo\" value=\"updatePhone\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"contact_row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contact_col\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\"><span>IM</span></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" id=\"contact_edit_im\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"updateIM\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.messenger}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"profile_edit contact_edit_im\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_h1\">Instant Messanger</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"messenger\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.messenger}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"messengerTypeCd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"gtalk\" >Gtalk</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"skype\" selected>Skype</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"yahoo\">Yahoo</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updatePrimaryInfo\" value=\"updateIM\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contact_col\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\"><span>Address</span></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_h2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" id=\"contact_edit_address\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"updateAddress\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"profile_edit contact_edit_address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_h1\">Address</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea rows=\"3\" cols=\"30\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updatePrimaryInfo\" value=\"updateAddress\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"contact_summary\"><div class=\"contact_info_seg\"><p>Contact Info</p></div>\r\n");
      out.write("\t\t\t\t\t<!-- This is silly but I don't know how to do it right now -->\r\n");
      out.write("\t\t\t\t\t<!-- Need to ensure when contact summary slides down, about me is pushed down also.-->\r\n");
      out.write("\t\t\t\t\t<div class=\"about_me\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"about_me_heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"about_me_box\"><p>About Me</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"about_me_edit_box\"><a href=\"javascript:void(0);\" id=\"about_me_content_edit\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon.png\" /></a></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"about_me_content\">\r\n");
      out.write("\t\t\t\t\t\t\t<p id=\"updateAboutMe\" class=\"profile_h3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.summary}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.defaultUserSessionData'].loginNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"profile_edit about_me_content_edit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"edit_h1\">About Me</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"edit_input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea rows=\"10\" cols=\"87\" name=\"summary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfileInfo.summary}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"updateProfile\" value=\"updateAboutMe\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"edit_save\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"save_button\" value=\"Save\" name=\"save\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"cancel_button\" name=\"cancel\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"ajaxLoading\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div id=\"emptyPad\" style=\"height: 500px\"></div>\r\n");
      out.write("\t    ");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_spring_005feval_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--This block holds the footer content i.e. links etc -->\r\n");
      out.write("<div id=\"anucana_footer\" class=\"centered\">\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index.html\" class=\"current\">Home</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/aboutus.html\">About Us</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/services.html\">Services</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/gallery.html\">Gallery</a> | <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/contactus.html\">Contact Us</a><br /><br />\r\n");
      out.write("    Copyright © 2048 <a href=\"#\">Your Company Name</a> | Designed by <a href=\"http://www.anucana.com\" target=\"_parent\">Anucana Designers</a>         \r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- jQuery -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.colorbox.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <!-- FlexSlider -->\r\n");
      out.write("  <script defer src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.flexslider.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("\t  $('.flexslider').flexslider({\r\n");
      out.write("\t\tanimation: \"slide\"\r\n");
      out.write("\t  });\r\n");
      out.write("\t  \r\n");
      out.write("  \t  $(\".edit-picture\").colorbox({inline:true, width:\"50%\", initialWidth: 100, initialHeight: 50});\r\n");
      out.write("  \t  \r\n");
      out.write("  \t  if($(\"#imageUploadError\").text().trim().length != 0 ){\r\n");
      out.write("  \t\t$(\".edit-picture\").trigger(\"click\");\r\n");
      out.write("  \t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ajaxStart(function(){\r\n");
      out.write("\t\t$(\"div.ajaxLoading\").text(\"loading ....\")\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ajaxComplete(function(){\r\n");
      out.write("\t\t$(\"div.ajaxLoading\").text(\"\");\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction setErrorMessage(container,message){\r\n");
      out.write("\t\tcontainer.find(\".errorMsg\").remove();\r\n");
      out.write("\t\tcontainer.find(\".edit_input\").before(\"<div class='errorMsg'>\" + message + \"</div>\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction refreshPage(){\r\n");
      out.write("\t\twindow.location.reload();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("\t\t$(\"#flip\").click(function(){\r\n");
      out.write("\t\t  $(\"#panel\").slideToggle(\"fast\");\r\n");
      out.write("\t\t});\r\n");
      out.write("      \r\n");
      out.write("\t\t$(\"a\").each(function(){\r\n");
      out.write("\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\tvar cssClass = \".\" + $this.attr(\"id\");\r\n");
      out.write("\t\t\tregisterEvent($this,cssClass);\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction registerEvent(eventPub, eventRec){\r\n");
      out.write("\t\t\t$(eventPub).click(function(){\r\n");
      out.write("\t\t\t\t$(\".profile_edit\").hide();\r\n");
      out.write("\t\t\t\t$(eventRec).show();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(\".cancel_button\").click(function(event){\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\tvar enclosingDiv = $(this).parent();\r\n");
      out.write("\t\t\tenclosingDiv.siblings(\".errorMsg\").remove();\r\n");
      out.write("\t\t\t$(enclosingDiv).parent().hide();\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\r\n");
      out.write("\t\tvar contactShown = false;\r\n");
      out.write("\t\t$(\".contact_details\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t$(\".contact_info_seg\").click(function(){\r\n");
      out.write("\t\t\tif(contactShown){\r\n");
      out.write("\t\t\t\t$(\".contact_details\").slideUp();\r\n");
      out.write("\t\t\t\tcontactShown = false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\".contact_details\").slideDown();\r\n");
      out.write("\t\t\t\tcontactShown = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* ..... ajax calls for posting request ..... */\r\n");
      out.write("\t\t$(\".profile-Intro form\").submit(function(event){\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar form = $(this);\r\n");
      out.write("\t\t\tvar url = form.attr(\"action\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar posting = $.post(url,form.serialize(),null,\"json\");\r\n");
      out.write("\t\t\tposting.done(function(data){\r\n");
      out.write("\t\t\t\tif(data.inError == true){\r\n");
      out.write("\t\t\t\t\tsetErrorMessage(form,data.errorMessages[0]);\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t// populate the data on the main page ( basic implementation. To be refined later )\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// get the input type=text and type=hidden from the form. set the value of input type=text \r\n");
      out.write("\t\t\t\t// into the value of span identified by id same as value of input type=hidden\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar documentTarget = form.find(\"input[type=hidden]\").attr(\"value\");\r\n");
      out.write("\t\t\t\tvar userInput = null;\r\n");
      out.write("\t\t\t\tif(documentTarget == 'updateAboutMe' || documentTarget == 'updateAddress'){\r\n");
      out.write("\t\t\t\t\tuserInput = form.find(\"textarea\").val();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tuserInput = form.find(\"input[type=text]\").val();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#\"+documentTarget).text(userInput);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tform.find(\".profile_edit\").hide();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(data.viewRefresh == true){\r\n");
      out.write("\t\t\t\t\trefreshPage();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tposting.fail(function(event){\r\n");
      out.write("\t\t\t\tsetErrorMessage(form,\" An error ocurred while processing !\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    // /WEB-INF/views/profile.jsp(3,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/profile.jsp(3,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(4,1) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f1.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/fragments/headerContent.jsp(4,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(8,5) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setUrl("/**/managed/**");
    // /WEB-INF/views/fragments/headerContent.jsp(8,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setVar("hasAccess");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f0);
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
    // /WEB-INF/views/fragments/headerContent.jsp(12,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t            <div id=\"login_member\">\r\n");
        out.write("\t\t                <div id=\"flip\"><b>");
        if (_jspx_meth_security_005fauthentication_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_security_005fauthentication_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("</b></div>\r\n");
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
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/settings/managed/changePassword\">Change Password</a></li>\r\n");
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
    // /WEB-INF/views/fragments/headerContent.jsp(14,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(14,99) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f1.setProperty("principal.LastName");
    int _jspx_eval_security_005fauthentication_005f1 = _jspx_th_security_005fauthentication_005f1.doStartTag();
    if (_jspx_th_security_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f1);
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
        out.write("\t\t      \t\t<sf:form action=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/login/authAndloginUser\" method=\"post\" modelAttribute=\"userLogin\">\r\n");
        out.write("\t\t\t           \t<table >\r\n");
        out.write("\t\t\t                   <tr>\r\n");
        out.write("\t\t\t                       <td>\r\n");
        out.write("\t\t\t                           <sf:input path=\"username\" tabindex=\"1\" value=\"\" id=\"email\" name=\"email\" placeholder=\"Email or Phone\" />\r\n");
        out.write("\t\t\t                       </td>\r\n");
        out.write("\t\t\t                       <td>\r\n");
        out.write("\t\t\t                           <sf:password path=\"password\" tabindex=\"2\" id=\"pass\" name=\"pass\" placeholder=\"Password\" />\r\n");
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
        out.write("\t\t           \t</sf:form>\r\n");
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

  private boolean _jspx_meth_spring_005feval_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f2 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    _jspx_th_spring_005feval_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005feval_005f2.setParent(null);
    // /WEB-INF/views/fragments/footerContent.jsp(2,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f2.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/fragments/footerContent.jsp(2,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f2.setVar("contentsBaseURL");
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
