package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:trim", org.apache.taglibs.standard.functions.Functions.class, "trim", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/views/fragments/headerContent.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/sideButtons.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/footerContent.jsp");
    _jspx_dependants.add("/WEB-INF/tags/upload-image.tag");
    _jspx_dependants.add("/WEB-INF/tags/edit-image.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>anucana | profile</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/anucana_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/custom_fonts.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/colorbox.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jcrop/jquery.Jcrop.css\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/favicon.ico\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\t\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"anucana_outer_wrapper\">\r\n");
      out.write("\t\t");
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
      out.write("\r\n");
      out.write("\t\t");
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
      out.write("/events/unmanaged/home\" id=\"events_link\"></a></li>\r\n");
      out.write("        </ul>  \r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"anucana_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("        <div id=\"anucana_main\">\r\n");
      out.write("            <div id=\"grey_wrapper\" class=\"greyLinen_background\">\r\n");
      out.write("\r\n");
      out.write("                <div style=\"margin-top:10px;\">\r\n");
      out.write("                  <div id=\"container\" style=\"overflow: hidden; position: relative;\">\r\n");
      out.write("                      <div class=\"darkShadeOverlay roundedTopCorners\" style=\"height:200px;\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"darkShadeOverlay roundedBottomCorners\" style=\"height:50px;margin-top:5px;\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div id=\"profileBannerBox\" class=\"communityFontsize col4\">\r\n");
      out.write("                        <table style=\"width:100%\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td style=\"padding:30px;width:30%\">\r\n");
      out.write("                              <div id=\"profilePicBlock\">\r\n");
      out.write("                                <img id=\"profilePic\" class=\"profilePicImage\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.profileImageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t                                ");
      if (_jspx_meth_anucana_005fupload_002dimage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              </div> \r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td style=\"position:relative;\">\r\n");
      out.write("                              <div style=\"position:absolute; top: 30px;\">\r\n");
      out.write("                                <table>\r\n");
      out.write("                                 \r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding:10px 0px 20px 65px;\">\r\n");
      out.write("                                      <div id=\"profileNameBox\">\r\n");
      out.write("                               \t\t\t  ");
      if (_jspx_meth_anucana_005fedit_002dimage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                          <span class=\"profileBannerText\">\r\n");
      out.write("                                            <span id=\"firstName\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>&nbsp;\r\n");
      out.write("                                            <span id=\"lastName\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                          \r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding:5px 0px 10px 65px;\">\r\n");
      out.write("                                      <div id=\"companyNameBox\">\r\n");
      out.write("\r\n");
      out.write("                               \t\t\t  ");
      if (_jspx_meth_anucana_005fedit_002dimage_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                          <span class=\"profileBannerText\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<em>\r\n");
      out.write("\t                                            <span id=\"profileHeading\" class=\"tooltip \" title=\"<b>Enter your Professional Headline.</b><br/><br/><span class='tooltipExample'>eg. Experienced Transportation Executive, Web Designer and Information Architect, Visionary Entrepreneur and Investor.</span>\">\r\n");
      out.write("\t                                           \t\t");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                                            </span>\r\n");
      out.write("                                            </em>\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                          \r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding:5px 0px 10px 65px;\">\r\n");
      out.write("                                      <div id=\"industryInfoBox\">\r\n");
      out.write("                                          \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  ");
      if (_jspx_meth_anucana_005fedit_002dimage_005f2(_jspx_page_context))
        return;
      out.write("                                          \r\n");
      out.write("                                          <span class=\"profileBannerText\">\r\n");
      out.write("\t                                           \t<em>\r\n");
      out.write("\t\t                                            <span class=\"tooltip industryAutoComplete \" id=\"industryName\" title=\"<b>Enter your Industry Name.</b><br/><br/><span class='tooltipExample'>eg. Information Technology and Services\">\r\n");
      out.write("\t\t                                           \t\t");
      if (_jspx_meth_c_005fchoose_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t                                            </span>\r\n");
      out.write("                                            \t</em>\r\n");
      out.write("                                            \t<input type=\"hidden\" id=\"industryCd\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.industryCd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              \r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <div id=\"accordion\">\r\n");
      out.write("                      <div>\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">My Contact Info</a></h3>\r\n");
      out.write("                          <div id=\"contactInfoAccordian\">\r\n");
      out.write("\t\t\t\t\t\t\t  \t\r\n");
      out.write("                              <!-- Phone number  -->\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Phone Number</span>\r\n");
      out.write("                                <span id=\"phoneNumberDisplay\">");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                                <span>");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              \r\n");
      out.write("                                <div id=\"contactInfoAccBox\" data-props=\"phonenumber phoneType phonenumberAccess\">\r\n");
      out.write("\t                              \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("                              </div>\r\n");
      out.write("                              \r\n");
      out.write("                              \r\n");
      out.write("                              <!-- Contact Email  -->\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Contact Email</span>\r\n");
      out.write("                                <span id=\"contactEmailDisplay\">");
      if (_jspx_meth_c_005fout_005f8(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                                <span>");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              <div id=\"contactInfoAccBox\" data-props=\"emailId emailAccess\">\r\n");
      out.write("                              \t");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("    \t                        </div>\r\n");
      out.write("    \t                         \r\n");
      out.write("    \t                         \r\n");
      out.write("                              <!-- Messenger  -->\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Messenger</span>\r\n");
      out.write("                                <span id=\"messengerDisplay\">\r\n");
      out.write("                                \t");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <span>");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              \r\n");
      out.write("                               <div id=\"contactInfoAccBox\" data-props=\"messenger messengerType messengerAccess\">\r\n");
      out.write("                              \t");
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("    \t                         </div>\r\n");
      out.write("                              \r\n");
      out.write("                              <!-- Address  -->\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Address</span>\r\n");
      out.write("                                <span>");
      if (_jspx_meth_c_005fout_005f17(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                                <span>");
      if (_jspx_meth_c_005fif_005f13(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              \r\n");
      out.write("                              <div id=\"addressAccBox\" data-props=\"pincodeId addressLine1 addressLine2 addressAccess\">\r\n");
      out.write("                              \t");
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div id=\"myCommunitiesAcc\">\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">My Communities</a></h3>\r\n");
      out.write("                          <div>\r\n");
      out.write("                            <h5>\r\n");
      out.write("                            \t<b>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/community/managed/search\">Find more communities.</a>\r\n");
      out.write("                              </b>\r\n");
      out.write("                            </h5>\r\n");
      out.write("                              <div id=\"container01\" style=\"margin-top:20px;overflow: hidden;\" class=\"masonry\"></div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div>\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">About Me</a></h3>\r\n");
      out.write("                          <div>\r\n");
      out.write("\t                          ");
      if (_jspx_meth_c_005fif_005f16(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  ");
      if (_jspx_meth_anucana_005fedit_002dimage_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  <textarea readonly id=\"summary\" rows=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${summaryRowsCount + 5}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"width: 100%;border: none\" data-default-height=\"10px\" data-animated=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  ");
      if (_jspx_meth_c_005fout_005f20(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  </textarea>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- end of grey_wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end of anucana_main -->\r\n");
      out.write("\t    <div id=\"emptyPad\"></div>\r\n");
      out.write("\t    \t");
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
      out.write("\t    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-ui.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/masonry.pkgd.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/imagesloaded.pkgd.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.flexslider.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jcrop/jquery.Jcrop.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.colorbox.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.textarea.autoresize.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--------------------  Java script for all modes --------------------------------->\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t(function() {\r\n");
      out.write("\t    \tvar $acc = $(\"#accordion > div, #contactInfoAccordian\").accordion({ header: \"> h3\", \r\n");
      out.write("\t  \t\t\tcollapsible: true, \r\n");
      out.write("\t    \t\tactive: false, \r\n");
      out.write("\t    \t\theightStyle: \"content\"\r\n");
      out.write("\t    \t});\r\n");
      out.write("\t    \t$(\"#accordion > div:last-child\").accordion('option', 'active', 0);\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!--------------------  Java script for edit Mode --------------------------------->\t\r\n");
      if (_jspx_meth_c_005fif_005f17(_jspx_page_context))
        return;
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
    // /WEB-INF/views/profile.jsp(6,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/profile.jsp(6,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/profile.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("editMode");
    // /WEB-INF/views/profile.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(7,0) 'false'",_el_expressionfactory.createValueExpression("false",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(7,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("request");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
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
    // /WEB-INF/views/fragments/headerContent.jsp(20,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(22,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(22,111) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(35,10) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/login/authAndloginUser", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/fragments/headerContent.jsp(35,10) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setMethod("post");
    // /WEB-INF/views/fragments/headerContent.jsp(35,10) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(39,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("username");
    // /WEB-INF/views/fragments/headerContent.jsp(39,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setTabindex("1");
    // /WEB-INF/views/fragments/headerContent.jsp(39,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/views/fragments/headerContent.jsp(39,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setId("email");
    // /WEB-INF/views/fragments/headerContent.jsp(39,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "name", new String("email"));
    // /WEB-INF/views/fragments/headerContent.jsp(39,30) null
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
    // /WEB-INF/views/fragments/headerContent.jsp(42,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setPath("password");
    // /WEB-INF/views/fragments/headerContent.jsp(42,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setTabindex("2");
    // /WEB-INF/views/fragments/headerContent.jsp(42,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setId("pass");
    // /WEB-INF/views/fragments/headerContent.jsp(42,30) null
    _jspx_th_sf_005fpassword_005f0.setDynamicAttribute(null, "name", new String("pass"));
    // /WEB-INF/views/fragments/headerContent.jsp(42,30) null
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

  private boolean _jspx_meth_anucana_005fupload_002dimage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  anucana:upload-image
    org.apache.jsp.tag.web.upload_002dimage_tag _jspx_th_anucana_005fupload_002dimage_005f0 = new org.apache.jsp.tag.web.upload_002dimage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_anucana_005fupload_002dimage_005f0);
    _jspx_th_anucana_005fupload_002dimage_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/profile.jsp(41,33) name = posturl type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setPosturl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("profile/managed/imageUpload/${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(41,33) name = accessId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setAccessId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(41,33) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setSrc((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.profileImageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(41,33) name = mode type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setMode("profile");
    // /WEB-INF/views/profile.jsp(41,33) name = dummy type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setDummy((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.dummyImage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_anucana_005fupload_002dimage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_anucana_005fupload_002dimage_005f0);
    return false;
  }

  private boolean _jspx_meth_anucana_005fedit_002dimage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  anucana:edit-image
    org.apache.jsp.tag.web.edit_002dimage_tag _jspx_th_anucana_005fedit_002dimage_005f0 = new org.apache.jsp.tag.web.edit_002dimage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f0);
    _jspx_th_anucana_005fedit_002dimage_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/profile.jsp(51,36) name = accessId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f0.setAccessId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(51,36) name = properties type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f0.setProperties("firstName lastName");
    _jspx_th_anucana_005fedit_002dimage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f0);
    return false;
  }

  private boolean _jspx_meth_anucana_005fedit_002dimage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  anucana:edit-image
    org.apache.jsp.tag.web.edit_002dimage_tag _jspx_th_anucana_005fedit_002dimage_005f1 = new org.apache.jsp.tag.web.edit_002dimage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f1);
    _jspx_th_anucana_005fedit_002dimage_005f1.setJspContext(_jspx_page_context);
    // /WEB-INF/views/profile.jsp(64,36) name = accessId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f1.setAccessId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(64,36) name = properties type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f1.setProperties("profileHeading");
    _jspx_th_anucana_005fedit_002dimage_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent(null);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                           \t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                                           \t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                                           \t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/views/profile.jsp(69,47) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty  fn:trim(userProfile.profileHeading)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                           \t\t\t\t");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                                           \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/views/profile.jsp(70,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.profileHeading}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                           \t\t\t\t");
        if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fotherwise_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                                           \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/views/profile.jsp(73,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue(new String("Your Professional Headline"));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_anucana_005fedit_002dimage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  anucana:edit-image
    org.apache.jsp.tag.web.edit_002dimage_tag _jspx_th_anucana_005fedit_002dimage_005f2 = new org.apache.jsp.tag.web.edit_002dimage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f2);
    _jspx_th_anucana_005fedit_002dimage_005f2.setJspContext(_jspx_page_context);
    // /WEB-INF/views/profile.jsp(87,12) name = accessId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f2.setAccessId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(87,12) name = properties type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f2.setProperties("industryName industryCd");
    _jspx_th_anucana_005fedit_002dimage_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent(null);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                                           \t\t\t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                                           \t\t\t");
        if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                                           \t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    // /WEB-INF/views/profile.jsp(92,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty  fn:trim(userProfile.industryName)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                                           \t\t\t\t");
        if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                                           \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /WEB-INF/views/profile.jsp(93,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.industryName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                                           \t\t\t\t");
        if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fotherwise_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                                           \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
    // /WEB-INF/views/profile.jsp(96,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue(new String("Your Industry Name"));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/profile.jsp(108,30) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${first_time_login}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                              <div style=\"float:right; padding-right:10px; position: absolute; top: 38px; right: 5px;\">\r\n");
        out.write("\t                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/community/managed/search\">Skip this step</a>\r\n");
        out.write("\t                              </div>\r\n");
        out.write("\t                              ");
        if (_jspx_meth_c_005fremove_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                              ");
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

  private boolean _jspx_meth_c_005fremove_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_005fremove_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fremove_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/profile.jsp(112,31) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fremove_005f0.setVar("first_time_login");
    // /WEB-INF/views/profile.jsp(112,31) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fremove_005f0.setScope("session");
    int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
    if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent(null);
    // /WEB-INF/views/profile.jsp(130,62) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.phonenumber}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/profile.jsp(131,38) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"\">Edit</a>");
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

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/views/profile.jsp(135,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                  <table>\r\n");
        out.write("\t                                    <tr>\r\n");
        out.write("\t                                      <td align=\"right\" style=\"color:#555555\">Phone #&nbsp;</td>\r\n");
        out.write("\t                                      <td><input type=\"text\" id=\"phonenumber\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.phonenumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /><br/></td>\r\n");
        out.write("\t                                    </tr>\r\n");
        out.write("\t                                    <tr>\r\n");
        out.write("\t                                      <td align=\"right\" style=\"color:#555555\">Phone type&nbsp;</td>\r\n");
        out.write("\t                                      <td>\r\n");
        out.write("\t                                        <select id=\"phoneType\">\r\n");
        out.write("\t\t                                         ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                                        </select>\r\n");
        out.write("\t                                      </td>\r\n");
        out.write("\t                                    </tr>\r\n");
        out.write("\t                                    <tr>\r\n");
        out.write("\t                                      <td align=\"right\" style=\"color:#555555\">Visible to&nbsp;</td>\r\n");
        out.write("\t                                      <td>\r\n");
        out.write("\t                                        <select id=\"phonenumberAccess\">\r\n");
        out.write("\t\t                                         ");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                                        </select>\r\n");
        out.write("\t                                      </td>\r\n");
        out.write("\t                                    </tr>\r\n");
        out.write("\t                                  </table>\r\n");
        out.write("\t                                  <input type=\"button\" id=\"savePhoneButton\" class=\"blueButton smallButton saveasync\" value=\"Save\"></input>\r\n");
        out.write("\t                              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/views/profile.jsp(145,43) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(145,43) '${phoneTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${phoneTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(145,43) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("phoneType");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t                                         \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phoneType.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("\t\t                                         \t\t");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(" \r\n");
          out.write("\t\t                                        \t>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t                                         \t</option>\r\n");
          out.write("\t\t                                         ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/profile.jsp(147,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phoneType.typeCode eq userProfile.phoneType}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                                         \t\t\tselected\r\n");
        out.write("\t\t                                         \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/profile.jsp(151,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phoneType.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/views/profile.jsp(161,43) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(161,43) '${accessCodes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessCodes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(161,43) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("accessCode");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t                                         \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t                                         \t\t");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write(" \r\n");
          out.write("\t\t                                         \t>\r\n");
          out.write("\t\t                                         \t\t");
          if (_jspx_meth_c_005fout_005f7(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t                                         \t</option>\r\n");
          out.write("\t\t                                         ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/profile.jsp(163,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode eq userProfile.phonenumberAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                                         \t\t\t");
        if (_jspx_meth_c_005fout_005f6(_jspx_th_c_005fif_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t                                         \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/profile.jsp(164,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue(new String("selected"));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/profile.jsp(167,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
    if (_jspx_th_c_005fout_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f8.setParent(null);
    // /WEB-INF/views/profile.jsp(182,63) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.emailId}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
    if (_jspx_th_c_005fout_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /WEB-INF/views/profile.jsp(183,38) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"\">Edit</a>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    // /WEB-INF/views/profile.jsp(186,31) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                  <table>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                      <td align=\"right\" style=\"color:#555555\">Contact Email #&nbsp;</td>\r\n");
        out.write("                                      <td><input type=\"text\" id=\"emailId\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.emailId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/><br/></td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                      <td align=\"right\" style=\"color:#555555\">Visible to&nbsp;</td>\r\n");
        out.write("                                      <td>\r\n");
        out.write("                                        <select id=\"emailAccess\">\r\n");
        out.write("\t                                         ");
        if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                      </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                  </table>\r\n");
        out.write("                                  <input type=\"button\" id=\"saveContactEmailButton\" class=\"blueButton smallButton saveasync\" value=\"Save\"></input>\r\n");
        out.write("\t                              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/views/profile.jsp(196,42) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(196,42) '${accessCodes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessCodes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(196,42) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("accessCode");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                                         \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t                                         \t\t");
          if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write(" \r\n");
          out.write("\t                                         \t>\r\n");
          out.write("\t                                         \t\t");
          if (_jspx_meth_c_005fout_005f10(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("\t                                         \t</option>\r\n");
          out.write("\t                                         ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/profile.jsp(198,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode eq userProfile.emailAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                         \t\t\t");
        if (_jspx_meth_c_005fout_005f9(_jspx_th_c_005fif_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write("\r\n");
        out.write("\t                                         \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    // /WEB-INF/views/profile.jsp(199,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f9.setValue(new String("selected"));
    int _jspx_eval_c_005fout_005f9 = _jspx_th_c_005fout_005f9.doStartTag();
    if (_jspx_th_c_005fout_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/profile.jsp(202,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f10 = _jspx_th_c_005fout_005f10.doStartTag();
    if (_jspx_th_c_005fout_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent(null);
    // /WEB-INF/views/profile.jsp(218,33) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userProfile.messenger}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f11(_jspx_th_c_005fif_005f8, _jspx_page_context))
          return true;
        out.write('@');
        if (_jspx_meth_c_005fout_005f12(_jspx_th_c_005fif_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /WEB-INF/views/profile.jsp(219,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.messenger}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f11 = _jspx_th_c_005fout_005f11.doStartTag();
    if (_jspx_th_c_005fout_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /WEB-INF/views/profile.jsp(219,59) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.messengerTypeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f12 = _jspx_th_c_005fout_005f12.doStartTag();
    if (_jspx_th_c_005fout_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent(null);
    // /WEB-INF/views/profile.jsp(222,38) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"\">Edit</a>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent(null);
    // /WEB-INF/views/profile.jsp(226,31) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                  <table>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                      <td align=\"right\" style=\"color:#555555\">Messenger #&nbsp;</td>\r\n");
        out.write("                                      <td><input type=\"text\" id=\"messenger\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.messenger}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/><br/></td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                      <td align=\"right\" style=\"color:#555555\">Messenger type&nbsp;</td>\r\n");
        out.write("                                      <td>\r\n");
        out.write("                                        <select id=\"messengerType\">\r\n");
        out.write("\t                                         ");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fif_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                      </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                      <td align=\"right\" style=\"color:#555555\">Visible to&nbsp;</td>\r\n");
        out.write("                                      <td>\r\n");
        out.write("                                        <select id=\"messengerAccess\">\r\n");
        out.write("\t                                         ");
        if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                      </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                  </table>\r\n");
        out.write("                                  <input type=\"button\" id=\"saveMessengerButton\" class=\"blueButton smallButton saveasync\" value=\"Save\"></input>\r\n");
        out.write("\t                              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
    // /WEB-INF/views/profile.jsp(236,42) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(236,42) '${messengerTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${messengerTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(236,42) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("messengerType");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                                         \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messengerType.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t                                        \t\t");
          if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write(" \r\n");
          out.write("\t                                         \t>\r\n");
          out.write("\t                                         \t\t");
          if (_jspx_meth_c_005fout_005f14(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\r\n");
          out.write("\t                                         \t</option>\r\n");
          out.write("\t                                         ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/profile.jsp(238,43) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messengerType.typeCode eq userProfile.messengerType}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                        \t\t\t");
        if (_jspx_meth_c_005fout_005f13(_jspx_th_c_005fif_005f11, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\r\n");
        out.write("\t                                        \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
    // /WEB-INF/views/profile.jsp(239,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f13.setValue(new String("selected"));
    int _jspx_eval_c_005fout_005f13 = _jspx_th_c_005fout_005f13.doStartTag();
    if (_jspx_th_c_005fout_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/profile.jsp(242,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messengerType.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f14 = _jspx_th_c_005fout_005f14.doStartTag();
    if (_jspx_th_c_005fout_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
    // /WEB-INF/views/profile.jsp(252,42) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(252,42) '${accessCodes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessCodes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(252,42) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("accessCode");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                                         \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t                                         \t\t");
          if (_jspx_meth_c_005fif_005f12(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write(" \r\n");
          out.write("\t                                         \t>\r\n");
          out.write("\t                                         \t\t");
          if (_jspx_meth_c_005fout_005f16(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write("\r\n");
          out.write("\t                                         \t</option>\r\n");
          out.write("\t                                         ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /WEB-INF/views/profile.jsp(254,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode eq userProfile.messengerAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                         \t\t\t");
        if (_jspx_meth_c_005fout_005f15(_jspx_th_c_005fif_005f12, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        out.write("\r\n");
        out.write("\t                                         \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
    // /WEB-INF/views/profile.jsp(255,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f15.setValue(new String("selected"));
    int _jspx_eval_c_005fout_005f15 = _jspx_th_c_005fout_005f15.doStartTag();
    if (_jspx_th_c_005fout_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /WEB-INF/views/profile.jsp(258,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f16 = _jspx_th_c_005fout_005f16.doStartTag();
    if (_jspx_th_c_005fout_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f17.setParent(null);
    // /WEB-INF/views/profile.jsp(272,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.addressDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f17 = _jspx_th_c_005fout_005f17.doStartTag();
    if (_jspx_th_c_005fout_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent(null);
    // /WEB-INF/views/profile.jsp(273,38) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"\">Edit</a>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent(null);
    // /WEB-INF/views/profile.jsp(277,31) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                                <input type=\"text\" id=\"pincode\"  placeholder=\"Pincode\"/>\r\n");
        out.write("\t                                <input type=\"hidden\" id=\"pincodeId\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.pincodeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"></input>\r\n");
        out.write("\t                                <span class=\"webSymbol blueOnWhite font20 cursorPointer\" id=\"pincodeButton\">V</span>\r\n");
        out.write("\t                                <div id=\"locationOptions\" style=\"max-height: 200px; overflow: auto; \"></div>\r\n");
        out.write("\t\r\n");
        out.write("\t                                <input type=\"text\" id=\"addressLine1\" class=\"mediumLengthBox\" value=\"House No. 000,\" placeholder=\"Address Line 1\"/>\r\n");
        out.write("\t                                <input type=\"text\" id=\"addressLine2\" class=\"mediumLengthBox\" value=\"Sector 15,\" placeholder=\"Address Line 2\"/>\r\n");
        out.write("\t                                <div id=\"selectedLocation\" class=\"lightGreyHighlight mediumLengthBox hidden\"></div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\r\n");
        out.write("                                    <select id=\"addressAccess\">\r\n");
        out.write("                                      ");
        if (_jspx_meth_c_005fforEach_005f5(_jspx_th_c_005fif_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </select>\r\n");
        out.write("\t                                <button type=\"button\" id=\"saveContactEmailButton\" class=\"blueButton smallButton saveasync\">Save</button>\r\n");
        out.write("\t                              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f14);
    // /WEB-INF/views/profile.jsp(288,38) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(288,38) '${accessCodes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessCodes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/profile.jsp(288,38) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("accessCode");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                      \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                      \t\t");
          if (_jspx_meth_c_005fif_005f15(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write(" \r\n");
          out.write("                                      \t>\r\n");
          out.write("                                      \t\t");
          if (_jspx_meth_c_005fout_005f19(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                      \t</option>\r\n");
          out.write("                                      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/views/profile.jsp(290,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeCode eq userProfile.addressAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                      \t\t\t");
        if (_jspx_meth_c_005fout_005f18(_jspx_th_c_005fif_005f15, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                      \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f15);
    // /WEB-INF/views/profile.jsp(291,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f18.setValue(new String("selected"));
    int _jspx_eval_c_005fout_005f18 = _jspx_th_c_005fout_005f18.doStartTag();
    if (_jspx_th_c_005fout_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/views/profile.jsp(294,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessCode.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f19 = _jspx_th_c_005fout_005f19.doStartTag();
    if (_jspx_th_c_005fout_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent(null);
    // /WEB-INF/views/profile.jsp(317,27) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty summaryRowsCount}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                          ");
        if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fif_005f16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t                          ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f16);
    // /WEB-INF/views/profile.jsp(318,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("summaryRowsCount");
    // /WEB-INF/views/profile.jsp(318,28) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/profile.jsp(318,28) '5'",_el_expressionfactory.createValueExpression("5",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_anucana_005fedit_002dimage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  anucana:edit-image
    org.apache.jsp.tag.web.edit_002dimage_tag _jspx_th_anucana_005fedit_002dimage_005f3 = new org.apache.jsp.tag.web.edit_002dimage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f3);
    _jspx_th_anucana_005fedit_002dimage_005f3.setJspContext(_jspx_page_context);
    // /WEB-INF/views/profile.jsp(320,9) name = accessId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f3.setAccessId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/profile.jsp(320,9) name = properties type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f3.setProperties("summary");
    // /WEB-INF/views/profile.jsp(320,9) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f3.setStyle("text-align:right;padding-bottom:10px;display:block;");
    // /WEB-INF/views/profile.jsp(320,9) name = mode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fedit_002dimage_005f3.setMode("span-blue");
    _jspx_th_anucana_005fedit_002dimage_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_anucana_005fedit_002dimage_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f20.setParent(null);
    // /WEB-INF/views/profile.jsp(322,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.summary}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f20 = _jspx_th_c_005fout_005f20.doStartTag();
    if (_jspx_th_c_005fout_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent(null);
    // /WEB-INF/views/profile.jsp(360,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  <script type=\"text/javascript\">\r\n");
        out.write("\t$(document).ready(function() {\r\n");
        out.write("\t\t$('textarea').autoresize();\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t// industry code auto complete\r\n");
        out.write("\t\t$.getJSON(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/util/unmanaged/group/industry_type_cd\",function(jsonData){\r\n");
        out.write("    \t\t$( \"#industryName\" ).autocomplete({\r\n");
        out.write("    \t\t\tsource: jsonData.typeList,\r\n");
        out.write("            \tfocus: function(event, ui) {\r\n");
        out.write("                \t$(\".ui-autocomplete\").addClass(\"custom-onhover\");\r\n");
        out.write("            \t},\r\n");
        out.write("\t\t\t\tselect: function( event, ui) {\r\n");
        out.write("\t\t\t\t\t$(\"#industryCd\").val(ui.item.typeCode);\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("    \t\t});\r\n");
        out.write("       \t});\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t// Execute the upload image function\r\n");
        out.write("\t\tif(typeof uploadImage !== 'undefined'){\r\n");
        out.write("\t\t\tuploadImage();\t\t\r\n");
        out.write("\t\t}\r\n");
        out.write("    \t\r\n");
        out.write("\t\t// helper tool tip\r\n");
        out.write("        $( \".tooltip\" ).tooltip({\r\n");
        out.write("            tooltipClass: \"custom-tooltip-styling\",\r\n");
        out.write("            show: null,\r\n");
        out.write("            position: {\r\n");
        out.write("        \t    my: \"left middle\",\r\n");
        out.write("    \t        at: \"right middle\"\r\n");
        out.write("            },\r\n");
        out.write("            open: function( event, ui ) {\r\n");
        out.write("\t            ui.tooltip.animate({ top: ui.tooltip.position().top + 10 }, \"fast\" );\r\n");
        out.write("            },\r\n");
        out.write("            content: function() {\r\n");
        out.write("              return $(this).attr('title');\r\n");
        out.write("            }\r\n");
        out.write("        });\r\n");
        out.write("\t\t\r\n");
        out.write("         function activateReadWriteMode(textDiv, editIcon, saveIcon){\r\n");
        out.write("            $(textDiv).attr('contenteditable','true');\r\n");
        out.write("           \tshowHideIcons(editIcon, saveIcon);\r\n");
        out.write("           \t\r\n");
        out.write("           \tif(textDiv.is(\"textarea\")){\r\n");
        out.write("           \t\ttextDiv.attr(\"readonly\",false);\r\n");
        out.write("           \t\ttextDiv.css({ \"border\": \"1px solid\"});\r\n");
        out.write("           \t}\r\n");
        out.write("         }\r\n");
        out.write("\r\n");
        out.write("         function activateReadOnlyMode(textDiv, editIcon, saveIcon){\r\n");
        out.write("            $(textDiv).removeAttr('contenteditable');\r\n");
        out.write("           \tshowHideIcons(saveIcon, editIcon);\r\n");
        out.write("           \t\r\n");
        out.write("           \tif(textDiv.is(\"textarea\")){\r\n");
        out.write("           \t\ttextDiv.attr(\"readonly\",true);\r\n");
        out.write("           \t\ttextDiv.css({ \"border\": \"none\"});\r\n");
        out.write("           \t}\r\n");
        out.write("         }\r\n");
        out.write("\t\t\t\r\n");
        out.write("         $(\".editasync\").on(\"click\", function() {\r\n");
        out.write("\t\t\tvar $this = $(this);\r\n");
        out.write("\t\t\tvar saveProps = $this.parent().attr(\"data-props\").split(\" \");\r\n");
        out.write("         \t$.each(saveProps,function(index,value){\r\n");
        out.write("         \t\tactivateReadWriteMode($(\"#\" + value), $this, $this.siblings());\t\r\n");
        out.write("         \t}); \r\n");
        out.write("           \r\n");
        out.write("         });\r\n");
        out.write("         \r\n");
        out.write("        /* Identify the property and gets is relevent value for submission*/\r\n");
        out.write("        function propVal(propertyId){\r\n");
        out.write("        \tvar $prop = $(\"#\"+propertyId);\r\n");
        out.write("        \tif($prop == 'undefined' || $prop == 'null' || $prop == \"\"){\r\n");
        out.write("        \t\treturn \"\";\r\n");
        out.write("        \t}else if($prop.is(\"span\") || $prop.is(\"div\")){\r\n");
        out.write("        \t\treturn $prop.text().trim();\r\n");
        out.write("        \t}else if($prop.is(\"input\")){\r\n");
        out.write("        \t\treturn $prop.val()\r\n");
        out.write("        \t}else if($prop.is(\"select\")){\r\n");
        out.write("        \t\treturn $(\"#\"+propertyId + \" option:selected\").val();\r\n");
        out.write("        \t}else{\r\n");
        out.write("        \t\treturn $(\"#\"+propertyId).val();\r\n");
        out.write("        \t}\r\n");
        out.write("        } \r\n");
        out.write("         \r\n");
        out.write("\t\t$(\".saveasync\").on(\"click\",function(){\r\n");
        out.write("\t\t\tvar $this = $(this);\r\n");
        out.write("\t\t\tvar saveProps = $this.parent().attr(\"data-props\").split(\" \");\r\n");
        out.write("\r\n");
        out.write("\t\t\t var submitData = new String(\"\");\r\n");
        out.write("\t\t\t \r\n");
        out.write("          \t $.each(saveProps,function(index,saveProp){\r\n");
        out.write("          \t\t var value = encodeURIComponent(propVal(saveProp));\r\n");
        out.write("          \t\t if(checkNullOrEmpty(submitData)){\r\n");
        out.write("          \t\t\tsubmitData = submitData.concat(\"&\");\r\n");
        out.write("          \t\t }\r\n");
        out.write("          \t\tsubmitData = submitData.concat(saveProp).concat(\"=\").concat(value); \r\n");
        out.write("          \t});\r\n");
        out.write("\t          \t \r\n");
        out.write("          \t $.ajax({\r\n");
        out.write("\t\t\t\ttype: \"post\",\r\n");
        out.write("  \t\t\t\turl: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/profile/managed/update/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userProfile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\r\n");
        out.write("  \t\t\t\tdata: submitData,\r\n");
        out.write("\t\t\t\tdataType: \"json\",\r\n");
        out.write("  \t\t\t\tbeforeSend: function( xhr ) {\r\n");
        out.write("  \t\t\t\t\t// clear all the errors\r\n");
        out.write("\t\t\t\t\t$(\".errorSpanOnGrey\").removeAttr('title').removeClass(\"errorSpanOnGrey\");\r\n");
        out.write("\t\t\t\t\t$(\".errorInputbox\").removeAttr('title').removeClass(\"errorInputbox\");\r\n");
        out.write("  \t\t\t\t},\t\t\t\t\t\r\n");
        out.write("  \t\t\t\tsuccess: function(response){\r\n");
        out.write("  \t\t\t\t\tvar obj = eval(response);\r\n");
        out.write("  \t\t\t\t\tif(obj.errormsg){\r\n");
        out.write("  \t\t\t\t\t\tshowError(saveProps[0],obj.errormsg);\r\n");
        out.write("  \t\t\t\t\t}else if(response.viewError != undefined && response.viewError.fieldErrors != undefined && response.viewError.fieldErrors.length != 0){\r\n");
        out.write("  \t\t\t\t\t\t// handle error first\r\n");
        out.write("  \t\t\t\t\t\tvar errormsg = \"\"\r\n");
        out.write("  \t\t\t\t\t\t$.each(response.viewError.fieldErrors,function( key, value ){\r\n");
        out.write("  \t\t\t\t\t\t\tshowError(saveProps[key],value.errorMessage);\r\n");
        out.write("  \t\t\t\t\t\t});\r\n");
        out.write("  \t\t\t\t\t\tshowError(saveProps[0],errormsg);\r\n");
        out.write("  \t\t\t\t\t}else{\r\n");
        out.write("  \t\t            \t$.each(saveProps,function(index,value){\r\n");
        out.write("  \t\t            \t\tactivateReadOnlyMode($(\"#\" + value), $this.siblings(), $this);\t\r\n");
        out.write("  \t\t            \t});\r\n");
        out.write("  \t\t            \t// refresh the page if its the first name or last name which has been updated\r\n");
        out.write("  \t\t            \t$.each(saveProps,function( key, value ){\r\n");
        out.write("  \t\t            \t\tif(saveProps[key] == \"firstName\" || saveProps[key] == \"lastName\"){\r\n");
        out.write("  \t\t            \t\t\tdocument.location = \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/profile/managed/\";\r\n");
        out.write("  \t\t            \t\t}\r\n");
        out.write("  \t\t            \t});\r\n");
        out.write("  \t\t\t\t\t}\r\n");
        out.write("  \t\t\t\t},\r\n");
        out.write("  \t\t\t\terror: function(response){\r\n");
        out.write("  \t\t\t\t\tshowError(saveProps[0],\"Error occurred while saving ! Please try again after some time\");\r\n");
        out.write("  \t\t\t\t}\r\n");
        out.write("   \t\t\t});\r\n");
        out.write("\t\t});\r\n");
        out.write("         \r\n");
        out.write("\t\tfunction showError(property,errorMsg){\r\n");
        out.write("\t\t\tif(errorMsg == \"\"){\r\n");
        out.write("\t\t\t\tif(property == \"firstName\" || property == \"lastName\"){\r\n");
        out.write("\t\t\t\t\t$(\"#\" + property).removeAttr('title').removeClass(\"errorSpanOnGrey\");\r\n");
        out.write("\t\t\t\t}else{\r\n");
        out.write("\t\t\t\t\t$(\"#\" + property).removeAttr('title').removeClass(\"errorInputbox\");\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t\treturn;\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tif(property == \"firstName\"){\r\n");
        out.write("\t\t\t\tdisplayError(new String(\"\").concat(\"#\").concat(property),\"right\",\"bottom\",\"left+50\",\"top-10\",errorMsg,\"errorSpanOnGrey\");\r\n");
        out.write("\t\t\t}else if(property == \"lastName\"){\r\n");
        out.write("\t\t\t\tdisplayError(new String(\"\").concat(\"#\").concat(property),\"right\",\"bottom\",\"left+50\",\"top-10\",errorMsg, \"errorSpanOnGrey\");\t\t\t\t\r\n");
        out.write("\t\t\t}else{\t\t\t\t\r\n");
        out.write("\t\t\t\tdisplayError(new String(\"\").concat(\"#\").concat(property),\"right\", \"middle\", \"left-20\", \"middle\", errorMsg, \"errorInputbox\");\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\t\r\n");
        out.write("            function displayError(field, my1, my2, at1, at2, message, errorClass){\r\n");
        out.write("                $(field).addClass(errorClass);\r\n");
        out.write("                $(field).attr('title',message);\r\n");
        out.write("                $(field).tooltip({\r\n");
        out.write("                \t\ttooltipClass: \"error-tooltip-styling\",\r\n");
        out.write("            \t    \tshow: null,\r\n");
        out.write("                \t\tposition: {\r\n");
        out.write("                \t\t\tmy: my1+\" \"+my2,\r\n");
        out.write("                \t\t\tat: at1+\" \"+at2\r\n");
        out.write("                \t\t},\r\n");
        out.write("                \t\tcontent: function() {\r\n");
        out.write("                  \t\t\treturn $(this).attr('title');\r\n");
        out.write("                \t\t}\r\n");
        out.write("              \t});\r\n");
        out.write("                $(field).tooltip('open');\r\n");
        out.write("            }\r\n");
        out.write("\t\t}\r\n");
        out.write("\t\t\r\n");
        out.write("        $('#pincodeButton').on(\"click\", function() {\r\n");
        out.write("        \t$('#locationOptions').html(\"\").removeClass('hidden');\r\n");
        out.write("        \t$('#selectedLocation').addClass('hidden');\r\n");
        out.write("        \t\r\n");
        out.write("        \tvar pincode =  $(\"#pincode\").val();\r\n");
        out.write("        \tif(!checkNullOrEmpty(pincode)){\r\n");
        out.write("        \t\tshowError(\"pincode\",\"Please enter your pin code\");\r\n");
        out.write("        \t\treturn;\r\n");
        out.write("        \t}\r\n");
        out.write("        \t\r\n");
        out.write("        \t$.getJSON(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/util/unmanaged/pincode/\"+pincode,function(jsonData){\r\n");
        out.write("            \tif(!checkNullOrEmpty(jsonData)){\r\n");
        out.write("            \t\tshowError(\"pincode\",\"Please enter a valid code\");\r\n");
        out.write("            \t\treturn;\r\n");
        out.write("            \t}\r\n");
        out.write("        \t\tvar html = \"<ul>\";\r\n");
        out.write("        \t\t$.each(jsonData.postalCodeList,function(index,value){\r\n");
        out.write("        \t\t\thtml = html + \"<li><input name='locationRadio' type='radio' value='\" + value.id + \"'/><label for='\" + value.id + \"'>\" \r\n");
        out.write("        \t\t\t+ value.office + \", \"+ value.district + \", \"+ value.state + \"</label></li>\"\r\n");
        out.write("        \t\t});\r\n");
        out.write("        \t\thtml = html + \"</ul>\"\r\n");
        out.write("        \t\t$('#locationOptions').html(html);\r\n");
        out.write("        \t});\r\n");
        out.write("        });\r\n");
        out.write("\r\n");
        out.write("        $('#anucana_outer_wrapper').on(\"click\", \"#locationOptions\", function() {\r\n");
        out.write("            var selectedLocation = $('input[type=\"radio\"][name=\"locationRadio\"]:checked + label').text();\r\n");
        out.write("            $('#pincodeId').val($('input[type=\"radio\"][name=\"locationRadio\"]:checked').val())\r\n");
        out.write("            $('#locationOptions').addClass('hidden');\r\n");
        out.write("            $('#selectedLocation').removeClass('hidden');\r\n");
        out.write("            $('#selectedLocation').text(selectedLocation);\r\n");
        out.write("        });\r\n");
        out.write("        \r\n");
        out.write("        function checkNullOrEmpty(fieldValue){\r\n");
        out.write("           if (fieldValue == null || fieldValue.length==0){\r\n");
        out.write("               return false;\r\n");
        out.write("           }\r\n");
        out.write("           return true;\r\n");
        out.write("        }\r\n");
        out.write("        \r\n");
        out.write("        function showHideIcons(icon1, icon2){\r\n");
        out.write("           \t$(icon1).addClass('hidden');\r\n");
        out.write("           \t$(icon2).removeClass('hidden');\r\n");
        out.write("        }\r\n");
        out.write("\t});\r\n");
        out.write("\r\n");
        out.write("  </script>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f17);
    return false;
  }
}
