package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/views/fragments/headerContent.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/sideButtons.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/footerContent.jsp");
    _jspx_dependants.add("/WEB-INF/tags/upload-image.tag");
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fhidden_0026_005fpath_005fnobody;

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
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fhidden_0026_005fpath_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>anucana | event edit</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/anucana_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/custom_fonts.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/colorbox.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/jcrop/jquery.Jcrop.css\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/images/icons/favicon.ico\" />\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.eventBannerBlock{\r\n");
      out.write("\t\t\theight: 300px;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.eventImage{\r\n");
      out.write("\t\t\theight: inherit;\r\n");
      out.write("\t\t\twidth: inherit;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.editIcon{\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  <script defer src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.flexslider.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\".startsUgly\").show();\r\n");
      out.write("\t    });\r\n");
      out.write("  \r\n");
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
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/unmanaged/discussions\" id=\"discuss_link\"></a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/event/unmanaged/home\" id=\"events_link\"></a></li>\r\n");
      out.write("        </ul>  \r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"anucana_outer_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("\t\t<div id=\"anucana_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("          <div id=\"anucana_main\">\r\n");
      out.write("\t        \t<div id=\"editForm\">\r\n");
      out.write("\t\t\t\t\t");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_005fform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sf_005fform_005f1.setParent(null);
      // /WEB-INF/views/event.jsp(42,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f1.setAction("");
      // /WEB-INF/views/event.jsp(42,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f1.setMethod("post");
      // /WEB-INF/views/event.jsp(42,5) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f1.setModelAttribute("event");
      int[] _jspx_push_body_count_sf_005fform_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005fform_005f1 = _jspx_th_sf_005fform_005f1.doStartTag();
        if (_jspx_eval_sf_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<input id=\"action\" type=\"hidden\" name=\"action\" value=\"save\"></input>                        \r\n");
            out.write("\t                    <table style=\"width:100%;\">\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td colspan=\"3\">\r\n");
            out.write("\t                              <div class=\"eventBannerBlock\">\r\n");
            out.write("\t                                \t<div class=\"editIcon\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_security_005fauthentication_005f2(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("\t\t                                \t");
            if (_jspx_meth_anucana_005fupload_002dimage_005f0(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("\t                                \t</div>\r\n");
            out.write("\t                                \t<img class=\"eventImage\" src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${event.bannerUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" />\r\n");
            out.write("\t                              </div> \r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Events date, duration and title -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Event Date</p></td>\r\n");
            out.write("                                <td width=\"20%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Duration</p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Event Title</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\">");
            if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"20%\">");
            if (_jspx_meth_sf_005finput_005f2(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"50%\">");
            if (_jspx_meth_sf_005finput_005f3(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"30%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(69,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f0.setPath("eventDate");
            // /WEB-INF/views/event.jsp(69,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f0.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f0 = _jspx_th_sf_005ferrors_005f0.doStartTag();
              if (_jspx_th_sf_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f0);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"20%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(70,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f1.setPath("durationInMinutes");
            // /WEB-INF/views/event.jsp(70,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f1.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f1 = _jspx_th_sf_005ferrors_005f1.doStartTag();
              if (_jspx_th_sf_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f1);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(71,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f2.setPath("name");
            // /WEB-INF/views/event.jsp(71,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f2.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f2 = _jspx_th_sf_005ferrors_005f2.doStartTag();
              if (_jspx_th_sf_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f2.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f2);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Phone and phone type code -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td colspan=\"2\" width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Contact Number</p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Event Importance Index</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td colspan=\"2\" width=\"50%\">");
            if (_jspx_meth_sf_005finput_005f4(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"50%\">\r\n");
            out.write("                                      <select style=\"margin:10px 10px 10px 10px;height:30px;width:90%\" name=\"importanceIndex\">\r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fforEach_005f0(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                      </select>\r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\" width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(96,36) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f3.setPath("phone");
            // /WEB-INF/views/event.jsp(96,36) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f3.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f3 = _jspx_th_sf_005ferrors_005f3.doStartTag();
              if (_jspx_th_sf_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f3);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(97,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f4.setPath("importanceIndex");
            // /WEB-INF/views/event.jsp(97,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f4.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f4 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f4 = _jspx_th_sf_005ferrors_005f4.doStartTag();
              if (_jspx_th_sf_005ferrors_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f4.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f4);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Pincode Search and select -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Pincode</p></td>\r\n");
            out.write("                                <td width=\"20%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\"></p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Pincode area</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\">");
            if (_jspx_meth_sf_005finput_005f5(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"20%\"><button type=\"button\" style=\"margin-bottom: 0px;margin-left: 10px;\" class=\"blueButton bigButton\" value=\"searchPincode\" style=\"margin-top:15px;\">Search</button></td>\r\n");
            out.write("                                <td width=\"50%\">\r\n");
            out.write("                                      <select style=\"margin:10px 10px 10px 10px;height:30px;width:90%\" name=\"pincodeId\">\r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fforEach_005f1(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                      </select>\r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"30%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f5.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(124,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f5.setPath("pinCode");
            // /WEB-INF/views/event.jsp(124,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f5.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f5 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f5 = _jspx_th_sf_005ferrors_005f5.doStartTag();
              if (_jspx_th_sf_005ferrors_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f5.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f5);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"20%\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f6.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(126,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f6.setPath("pincodeId");
            // /WEB-INF/views/event.jsp(126,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f6.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f6 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f6 = _jspx_th_sf_005ferrors_005f6.doStartTag();
              if (_jspx_th_sf_005ferrors_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f6.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f6);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Address lines -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td colspan=\"2\" width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Address Line - 1</p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Address Line - 2</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td colspan=\"2\" width=\"50%\">");
            if (_jspx_meth_sf_005finput_005f6(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"50%\">");
            if (_jspx_meth_sf_005finput_005f7(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\" width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f7 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f7.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(139,36) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f7.setPath("addressLine1");
            // /WEB-INF/views/event.jsp(139,36) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f7.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f7 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f7 = _jspx_th_sf_005ferrors_005f7.doStartTag();
              if (_jspx_th_sf_005ferrors_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f7.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f7);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f8 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f8.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(140,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f8.setPath("addressLine2");
            // /WEB-INF/views/event.jsp(140,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f8.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f8 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f8 = _jspx_th_sf_005ferrors_005f8.doStartTag();
              if (_jspx_th_sf_005ferrors_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f8[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f8.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f8.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f8);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Short description -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"100%\" colspan=\"3\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Short description</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"100%\" colspan=\"3\">");
            if (_jspx_meth_sf_005ftextarea_005f0(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"100%\" colspan=\"3\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f9 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f9.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(151,37) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f9.setPath("shortDesc");
            // /WEB-INF/views/event.jsp(151,37) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f9.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f9 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f9 = _jspx_th_sf_005ferrors_005f9.doStartTag();
              if (_jspx_th_sf_005ferrors_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f9[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f9.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f9.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f9);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Long description -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"100%\" colspan=\"3\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Long description</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"100%\" colspan=\"3\">");
            if (_jspx_meth_sf_005ftextarea_005f1(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"100%\" colspan=\"3\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f10 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f10.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(162,37) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f10.setPath("longDesc");
            // /WEB-INF/views/event.jsp(162,37) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f10.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f10 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f10 = _jspx_th_sf_005ferrors_005f10.doStartTag();
              if (_jspx_th_sf_005ferrors_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f10[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f10.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f10.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f10);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Profile Search and select -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Event Speaker Search</p></td>\r\n");
            out.write("                                <td width=\"20%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\"></p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Event Speaker</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\">");
            if (_jspx_meth_sf_005finput_005f8(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"20%\"><button type=\"button\" style=\"margin-bottom: 0px;margin-left: 10px;\" class=\"blueButton bigButton\" value=\"searchProfile\" style=\"margin-top:15px;\">Search</button></td>\r\n");
            out.write("                                <td width=\"50%\">\r\n");
            out.write("                                      <select style=\"margin:10px 10px 10px 10px;height:30px;width:90%\" name=\"speakerId\">\r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fforEach_005f2(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                      </select>\r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"30%\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"20%\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f11 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f11.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(191,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f11.setPath("speakerId");
            // /WEB-INF/views/event.jsp(191,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f11.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f11 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f11 = _jspx_th_sf_005ferrors_005f11.doStartTag();
              if (_jspx_th_sf_005ferrors_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f11[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f11.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f11.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f11);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Community Search and select -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Community Search</p></td>\r\n");
            out.write("                                <td width=\"20%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\"></p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Community</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\">");
            if (_jspx_meth_sf_005finput_005f9(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"20%\"><button type=\"button\" style=\"margin-bottom: 0px;margin-left: 10px;\" class=\"blueButton bigButton\" value=\"searchCommunity\" style=\"margin-top:15px;\">Search</button></td>\r\n");
            out.write("                                <td width=\"50%\">\r\n");
            out.write("                                      <select style=\"margin:10px 10px 10px 10px;height:30px;width:90%\" name=\"communityId\">\r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fforEach_005f3(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                      </select>\r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"30%\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"20%\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f12 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f12.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(220,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f12.setPath("communityId");
            // /WEB-INF/views/event.jsp(220,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f12.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f12 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f12 = _jspx_th_sf_005ferrors_005f12.doStartTag();
              if (_jspx_th_sf_005ferrors_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f12[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f12.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f12.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f12);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<!-- Capacity, cost and status -->\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Event Capacity</p></td>\r\n");
            out.write("                                <td width=\"20%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Cost - Rupees</p></td>\r\n");
            out.write("                                <td width=\"50%\"><p class=\"description\" style=\"margin-bottom: 0px;margin-left: 10px;\">Status</p></td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td width=\"30%\">");
            if (_jspx_meth_sf_005finput_005f10(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"20%\">");
            if (_jspx_meth_sf_005finput_005f11(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                                <td width=\"50%\">\r\n");
            out.write("                                      <select style=\"margin:10px 10px 10px 10px;height:30px;width:90%\" name=\"statusCd\">\r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fforEach_005f4(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                      </select>\r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("                            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"30%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f13 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f13.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(247,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f13.setPath("capacity");
            // /WEB-INF/views/event.jsp(247,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f13.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f13 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f13 = _jspx_th_sf_005ferrors_005f13.doStartTag();
              if (_jspx_th_sf_005ferrors_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f13[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f13.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f13.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f13);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"20%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f14 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f14.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(248,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f14.setPath("costInINR");
            // /WEB-INF/views/event.jsp(248,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f14.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f14 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f14 = _jspx_th_sf_005ferrors_005f14.doStartTag();
              if (_jspx_th_sf_005ferrors_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f14[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f14.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f14.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f14);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td width=\"50%\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f15 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f15.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/event.jsp(249,24) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f15.setPath("statusCd");
            // /WEB-INF/views/event.jsp(249,24) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f15.setCssClass("inlineError");
            int[] _jspx_push_body_count_sf_005ferrors_005f15 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f15 = _jspx_th_sf_005ferrors_005f15.doStartTag();
              if (_jspx_th_sf_005ferrors_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f15[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f15.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f15.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f15);
            }
            out.write("</td>\t\t                            \r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\r\n");
            out.write("                            <tr>\r\n");
            out.write("                            \t<td colspan=\"3\">\r\n");
            out.write("\t\t\t\t                    ");
            if (_jspx_meth_sf_005fhidden_005f0(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                            \t\t<input style=\"margin-bottom: 0px;margin-left: 10px;\" class=\"blueButton bigButton\" style=\"margin-top:15px;\" type=\"submit\" value=\"Save\" />\r\n");
            out.write("                            \t</td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("\t                    </table>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_sf_005fform_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005fform_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005fform_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005fform_005f1.doFinally();
        _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_sf_005fform_005f1);
      }
      out.write("\r\n");
      out.write("\t            </div> <!-- end of featured project -->\r\n");
      out.write("          </div> <!-- end of anucana_main -->\r\n");
      out.write("        </div>\r\n");
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
      out.write("/unmanaged/contactUs\">Contact Us</a>\r\n");
      out.write("    <br/><br/> copyright © 2014 <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">anucana consulting pvt. ltd.</a> | designed by <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">anucana designers</a>\r\n");
      out.write("    <br/><br/>         \r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </div> <!-- end of anucana_wrapper -->\r\n");
      out.write("    \r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-ui.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/masonry.pkgd.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/imagesloaded.pkgd.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.flexslider.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jcrop/jquery.Jcrop.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.colorbox.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t// Execute the upload image function\r\n");
      out.write("\t\t\tif(typeof uploadImage !== 'undefined'){\r\n");
      out.write("\t\t\t\tuploadImage();\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"button\").on(\"click\",function(event){\r\n");
      out.write("\t\t\t\t$(\"#action\").attr(\"value\",$(this).attr(\"value\"));\r\n");
      out.write("\t\t\t\t$(\"form\").submit();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t</script>    \r\n");
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
    // /WEB-INF/views/event.jsp(8,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/event.jsp(8,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t                <div id=\"flip\">\r\n");
        out.write("\t\t\t\t\t<b>&nbsp;&nbsp;");
        if (_jspx_meth_security_005fauthentication_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_security_005fauthentication_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;</b>\r\n");
        out.write("\t\t\t\t\t<img id=\"member_arrow\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/img/down_arrow_grey6.png\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t                <div id=\"panel\" tabindex=\"-1\">\r\n");
        out.write("\t\t                    <ul>\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/profile/managed/\">My Profile</a></li> ");
        out.write("\r\n");
        out.write("\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/booking/managed/list\">My Bookings</a></li>");
        out.write("\r\n");
        out.write("\t\t                        ");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                        ");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                        ");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t                        \r\n");
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
    // /WEB-INF/views/fragments/headerContent.jsp(26,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(26,83) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(33,26) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(36,26) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/fragments/headerContent.jsp(39,26) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasAdminAccess}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/coupon/managed/edit/0\">Create a coupon</a></li>");
        out.write("\r\n");
        out.write("\t\t                        ");
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
    // /WEB-INF/views/fragments/headerContent.jsp(50,10) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/login/authAndloginUser", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/fragments/headerContent.jsp(50,10) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setMethod("post");
    // /WEB-INF/views/fragments/headerContent.jsp(50,10) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(54,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("username");
    // /WEB-INF/views/fragments/headerContent.jsp(54,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setTabindex("1");
    // /WEB-INF/views/fragments/headerContent.jsp(54,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/views/fragments/headerContent.jsp(54,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setId("email");
    // /WEB-INF/views/fragments/headerContent.jsp(54,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "name", new String("email"));
    // /WEB-INF/views/fragments/headerContent.jsp(54,30) null
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
    // /WEB-INF/views/fragments/headerContent.jsp(57,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setPath("password");
    // /WEB-INF/views/fragments/headerContent.jsp(57,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setTabindex("2");
    // /WEB-INF/views/fragments/headerContent.jsp(57,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setId("pass");
    // /WEB-INF/views/fragments/headerContent.jsp(57,30) null
    _jspx_th_sf_005fpassword_005f0.setDynamicAttribute(null, "name", new String("pass"));
    // /WEB-INF/views/fragments/headerContent.jsp(57,30) null
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

  private boolean _jspx_meth_security_005fauthentication_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f2 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f2.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(49,11) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f2.setProperty("principal.userId");
    // /WEB-INF/views/event.jsp(49,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f2.setVar("userId");
    int _jspx_eval_security_005fauthentication_005f2 = _jspx_th_security_005fauthentication_005f2.doStartTag();
    if (_jspx_th_security_005fauthentication_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f2);
    return false;
  }

  private boolean _jspx_meth_anucana_005fupload_002dimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  anucana:upload-image
    org.apache.jsp.tag.web.upload_002dimage_tag _jspx_th_anucana_005fupload_002dimage_005f0 = new org.apache.jsp.tag.web.upload_002dimage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_anucana_005fupload_002dimage_005f0);
    _jspx_th_anucana_005fupload_002dimage_005f0.setJspContext(_jspx_page_context);
    _jspx_th_anucana_005fupload_002dimage_005f0.setParent(_jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(50,35) name = posturl type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setPosturl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/event/managed/edit/image/${event.eventId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/event.jsp(50,35) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setSrc((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${event.bannerUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/event.jsp(50,35) name = accessId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setAccessId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/event.jsp(50,35) name = mode type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_anucana_005fupload_002dimage_005f0.setMode("event");
    _jspx_th_anucana_005fupload_002dimage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_anucana_005fupload_002dimage_005f0);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(64,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f1.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(64,48) null
    _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "placeholder", new String("Event Date ( DD/MM/YYYY HH:mm )"));
    // /WEB-INF/views/event.jsp(64,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f1.setPath("eventDate");
    int[] _jspx_push_body_count_sf_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f1 = _jspx_th_sf_005finput_005f1.doStartTag();
      if (_jspx_th_sf_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(65,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f2.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(65,48) null
    _jspx_th_sf_005finput_005f2.setDynamicAttribute(null, "placeholder", new String("Duration ( in minutes )"));
    // /WEB-INF/views/event.jsp(65,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f2.setPath("durationInMinutes");
    int[] _jspx_push_body_count_sf_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f2 = _jspx_th_sf_005finput_005f2.doStartTag();
      if (_jspx_th_sf_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(66,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f3.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(66,48) null
    _jspx_th_sf_005finput_005f3.setDynamicAttribute(null, "placeholder", new String("Event Title"));
    // /WEB-INF/views/event.jsp(66,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f3.setPath("name");
    int[] _jspx_push_body_count_sf_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f3 = _jspx_th_sf_005finput_005f3.doStartTag();
      if (_jspx_th_sf_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(80,60) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f4.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:95%");
    // /WEB-INF/views/event.jsp(80,60) null
    _jspx_th_sf_005finput_005f4.setDynamicAttribute(null, "placeholder", new String("Event Contact Number"));
    // /WEB-INF/views/event.jsp(80,60) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f4.setPath("phone");
    int[] _jspx_push_body_count_sf_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f4 = _jspx_th_sf_005finput_005f4.doStartTag();
      if (_jspx_th_sf_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(83,40) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/event.jsp(83,40) '${importanceIndices}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${importanceIndices}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/event.jsp(83,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("impIndex");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${impIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("                                        \t\t");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(" \r\n");
          out.write("                                       \t\t>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                        \t</option>\r\n");
          out.write("                                        ");
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
    // /WEB-INF/views/event.jsp(85,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${impIndex eq event.importanceIndex}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t\t\tselected\r\n");
        out.write("                                        \t\t");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/event.jsp(89,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${impIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(107,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f5.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(107,48) null
    _jspx_th_sf_005finput_005f5.setDynamicAttribute(null, "placeholder", new String("Pincode"));
    // /WEB-INF/views/event.jsp(107,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f5.setPath("pinCode");
    int[] _jspx_push_body_count_sf_005finput_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f5 = _jspx_th_sf_005finput_005f5.doStartTag();
      if (_jspx_th_sf_005finput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f5.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(111,40) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/event.jsp(111,40) '${postalCodes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${postalCodes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/event.jsp(111,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("postalCode");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postalCode.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("                                        \t\t");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write(" \r\n");
          out.write("                                       \t\t>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write(' ');
          out.write('-');
          out.write(' ');
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                                        \t</option>\r\n");
          out.write("                                        ");
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
    // /WEB-INF/views/event.jsp(113,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postalCode.id eq event.pincodeId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t\t\tselected\r\n");
        out.write("                                        \t\t");
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

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/event.jsp(117,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postalCode.district}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/event.jsp(117,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postalCode.office}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f6 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f6.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(135,60) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f6.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:95%");
    // /WEB-INF/views/event.jsp(135,60) null
    _jspx_th_sf_005finput_005f6.setDynamicAttribute(null, "placeholder", new String("Address Line - 1"));
    // /WEB-INF/views/event.jsp(135,60) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f6.setPath("addressLine1");
    int[] _jspx_push_body_count_sf_005finput_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f6 = _jspx_th_sf_005finput_005f6.doStartTag();
      if (_jspx_th_sf_005finput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f6.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f7 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(136,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f7.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(136,48) null
    _jspx_th_sf_005finput_005f7.setDynamicAttribute(null, "placeholder", new String("Address Line - 2"));
    // /WEB-INF/views/event.jsp(136,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f7.setPath("addressLine2");
    int[] _jspx_push_body_count_sf_005finput_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f7 = _jspx_th_sf_005finput_005f7.doStartTag();
      if (_jspx_th_sf_005finput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f7.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_sf_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_sf_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(148,61) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005ftextarea_005f0.setRows("2");
    // /WEB-INF/views/event.jsp(148,61) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005ftextarea_005f0.setCssStyle("margin:10px 10px 10px 10px;height:60px;width:95%");
    // /WEB-INF/views/event.jsp(148,61) null
    _jspx_th_sf_005ftextarea_005f0.setDynamicAttribute(null, "placeholder", new String("Short description"));
    // /WEB-INF/views/event.jsp(148,61) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005ftextarea_005f0.setPath("shortDesc");
    int[] _jspx_push_body_count_sf_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005ftextarea_005f0 = _jspx_th_sf_005ftextarea_005f0.doStartTag();
      if (_jspx_th_sf_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_sf_005ftextarea_005f1 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_sf_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sf_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(159,61) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005ftextarea_005f1.setRows("5");
    // /WEB-INF/views/event.jsp(159,61) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005ftextarea_005f1.setCssStyle("margin:10px 10px 10px 10px;height:120px;width:95%");
    // /WEB-INF/views/event.jsp(159,61) null
    _jspx_th_sf_005ftextarea_005f1.setDynamicAttribute(null, "placeholder", new String("Long description"));
    // /WEB-INF/views/event.jsp(159,61) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005ftextarea_005f1.setPath("longDesc");
    int[] _jspx_push_body_count_sf_005ftextarea_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005ftextarea_005f1 = _jspx_th_sf_005ftextarea_005f1.doStartTag();
      if (_jspx_th_sf_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005ftextarea_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005ftextarea_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005ftextarea_005f1.doFinally();
      _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005ftextarea_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f8 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(172,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f8.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(172,48) null
    _jspx_th_sf_005finput_005f8.setDynamicAttribute(null, "placeholder", new String("Search speaker by name"));
    // /WEB-INF/views/event.jsp(172,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f8.setPath("searchSpeakerCriteria");
    int[] _jspx_push_body_count_sf_005finput_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f8 = _jspx_th_sf_005finput_005f8.doStartTag();
      if (_jspx_th_sf_005finput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f8.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(176,40) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/event.jsp(176,40) '${profiles}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${profiles}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/event.jsp(176,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("profile");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("                                        \t\t");
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write(" \r\n");
          out.write("                                       \t\t>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write(' ');
          if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("                                        \t</option>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/event.jsp(178,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.userId eq event.speakerId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t\t\tselected\r\n");
        out.write("                                        \t\t");
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

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/event.jsp(182,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.firstName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/event.jsp(182,56) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profile.lastName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f9 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(201,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f9.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(201,48) null
    _jspx_th_sf_005finput_005f9.setDynamicAttribute(null, "placeholder", new String("Search community by name"));
    // /WEB-INF/views/event.jsp(201,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f9.setPath("communitySearchCriteria");
    int[] _jspx_push_body_count_sf_005finput_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f9 = _jspx_th_sf_005finput_005f9.doStartTag();
      if (_jspx_th_sf_005finput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f9.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(205,40) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/event.jsp(205,40) '${communities}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${communities}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/event.jsp(205,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("comm");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comm.communityId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("                                        \t\t");
          if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write(" \r\n");
          out.write("                                       \t\t>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\r\n");
          out.write("                                        \t</option>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/event.jsp(207,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comm.communityId eq community.communityId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t\t\tselected\r\n");
        out.write("                                        \t\t");
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

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/event.jsp(211,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comm.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f10 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f10.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(230,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f10.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(230,48) null
    _jspx_th_sf_005finput_005f10.setDynamicAttribute(null, "placeholder", new String("Event Seating Capacity"));
    // /WEB-INF/views/event.jsp(230,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f10.setPath("capacity");
    int[] _jspx_push_body_count_sf_005finput_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f10 = _jspx_th_sf_005finput_005f10.doStartTag();
      if (_jspx_th_sf_005finput_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f10.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f11 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f11.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(231,48) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f11.setCssStyle("margin:10px 10px 10px 10px;height:30px;width:90%");
    // /WEB-INF/views/event.jsp(231,48) null
    _jspx_th_sf_005finput_005f11.setDynamicAttribute(null, "placeholder", new String("Cost ( in Rupees )"));
    // /WEB-INF/views/event.jsp(231,48) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f11.setPath("costInINR");
    int[] _jspx_push_body_count_sf_005finput_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f11 = _jspx_th_sf_005finput_005f11.doStartTag();
      if (_jspx_th_sf_005finput_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f11.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fcssStyle_005fnobody.reuse(_jspx_th_sf_005finput_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(234,40) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/event.jsp(234,40) '${statusTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${statusTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/event.jsp(234,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("statusType");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusType.typeCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("                                        \t\t");
          if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write(" \r\n");
          out.write("                                       \t\t>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f6(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write("\r\n");
          out.write("                                        \t</option>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /WEB-INF/views/event.jsp(236,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusType.typeCode eq event.statusCd}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t\t\tselected\r\n");
        out.write("                                        \t\t");
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

  private boolean _jspx_meth_c_005fout_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /WEB-INF/views/event.jsp(240,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusType.typeDescription}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_sf_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_sf_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fsf_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_sf_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/event.jsp(254,24) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fhidden_005f0.setPath("eventId");
    int[] _jspx_push_body_count_sf_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fhidden_005f0 = _jspx_th_sf_005fhidden_005f0.doStartTag();
      if (_jspx_th_sf_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_sf_005fhidden_005f0);
    }
    return false;
  }
}
