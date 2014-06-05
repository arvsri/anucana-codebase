package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fhtmlEscape_005felement_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody;

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
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fhtmlEscape_005felement_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005ftabindex_005fplaceholder_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fhtmlEscape_005felement_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody.release();
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
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>anucana</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/anucana_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/favicon.ico\" />\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#anucana_registration{\r\n");
      out.write("\t\t\tfloat: none;\r\n");
      out.write("\t\t\tmargin: auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.inlineError {color:#FF614D;padding:0px;}\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"anucana_outer_wrapper\">\r\n");
      out.write("\t");
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
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("    <!--Block 3 - This block holds left side stripe of buttons -->\r\n");
      out.write("    <div id=\"side_menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"\" id=\"blog_link\"></a></li>\r\n");
      out.write("            <li><a href=\"\" id=\"discuss_link\"></a></li>\r\n");
      out.write("            <li><a href=\"\" id=\"events_link\"></a></li>\r\n");
      out.write("        </ul>  \r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("    <!--Block 4 - This block holds login form and error blocks -->\r\n");
      out.write("\t<div id=\"anucana_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("        <div id=\"anucana_main\">\r\n");
      out.write("           <div id=\"anucana_registration\">\r\n");
      out.write("                <h2>Get Started - It's free.</h2>\r\n");
      out.write("                <p class=\"description\">Registration takes less than 2 minutes.</p>\r\n");
      out.write("\t            ");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_005fform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sf_005fform_005f1.setParent(null);
      // /WEB-INF/views/register.jsp(29,13) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f1.setAction("registerNewUser");
      // /WEB-INF/views/register.jsp(29,13) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f1.setMethod("post");
      // /WEB-INF/views/register.jsp(29,13) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f1.setModelAttribute("userLogin");
      int[] _jspx_push_body_count_sf_005fform_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005fform_005f1 = _jspx_th_sf_005fform_005f1.doStartTag();
        if (_jspx_eval_sf_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t                <table>\r\n");
            out.write("\t                    <tbody>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                            <td>");
            if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("\t                            <td style=\"padding-left:11px;\">");
            if (_jspx_meth_sf_005finput_005f2(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("\t                        </tr>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                            <td>");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/register.jsp(37,33) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f0.setPath("firstName");
            // /WEB-INF/views/register.jsp(37,33) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</td><td style=\"padding-left:11px;\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/register.jsp(37,121) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f1.setPath("lastName");
            // /WEB-INF/views/register.jsp(37,121) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("\t                        </tr>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                        \t<td colspan=\"2\">");
            if (_jspx_meth_sf_005finput_005f3(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("\t                        </tr>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                        \t<td colspan=\"2\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fhtmlEscape_005felement_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/register.jsp(43,42) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f2.setHtmlEscape("false");
            // /WEB-INF/views/register.jsp(43,42) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f2.setElement("div");
            // /WEB-INF/views/register.jsp(43,42) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f2.setPath("username");
            // /WEB-INF/views/register.jsp(43,42) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fhtmlEscape_005felement_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f2);
            }
            out.write("</td>\r\n");
            out.write("\t                        </tr>\r\n");
            out.write("                        \t<tr>\r\n");
            out.write("                        \t\t<td colspan=\"2\">");
            if (_jspx_meth_sf_005fpassword_005f1(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                        \t</tr>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                        \t<td colspan=\"2\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/register.jsp(49,42) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f3.setPath("password");
            // /WEB-INF/views/register.jsp(49,42) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("\t                        </tr>\r\n");
            out.write("                        \t<tr>\r\n");
            out.write("                        \t\t<td colspan=\"2\">");
            if (_jspx_meth_sf_005fpassword_005f2(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
              return;
            out.write("</td>\r\n");
            out.write("                        \t</tr>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                        \t<td colspan=\"2\">");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
            // /WEB-INF/views/register.jsp(55,42) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f4.setPath("passwordVerify");
            // /WEB-INF/views/register.jsp(55,42) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</td>\r\n");
            out.write("\t                        </tr>\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                        \t<td colspan=\"2\"><input id=\"signup_submit\" type=\"submit\" value=\"Join Now\" /></td>\r\n");
            out.write("\t                        </tr>\r\n");
            out.write("\t                    </tbody>\r\n");
            out.write("\t                </table>\r\n");
            out.write("                ");
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
      out.write("                <p id=\"reg_policy\" >By joining anucana, you agree to anucana's\r\n");
      out.write("                    <a href=\"http://www.anucana.com\">User Agreement</a>\r\n");
      out.write("                    ,\r\n");
      out.write("                    <a href=\"http://www.anucana.com\">Privacy Policy</a>\r\n");
      out.write("                    and\r\n");
      out.write("                    <a href=\"http://www.anucana.com\">Cookie Policy</a>\r\n");
      out.write("                    .\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("       \t</div>\r\n");
      out.write("      </div> <!-- end of main -->\r\n");
      out.write("    <div id=\"emptyPad\" > </div>\r\n");
      out.write("\t");
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
      out.write("</div> \r\n");
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
    // /WEB-INF/views/register.jsp(4,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/register.jsp(4,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerContent.jsp(27,10) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/login/authAndloginUser", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/fragments/headerContent.jsp(27,10) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setMethod("post");
    // /WEB-INF/views/fragments/headerContent.jsp(27,10) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setModelAttribute("userLogin");
    int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
      if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t           \t<table >\r\n");
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
    // /WEB-INF/views/fragments/headerContent.jsp(31,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("username");
    // /WEB-INF/views/fragments/headerContent.jsp(31,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setTabindex("1");
    // /WEB-INF/views/fragments/headerContent.jsp(31,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/views/fragments/headerContent.jsp(31,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setId("email");
    // /WEB-INF/views/fragments/headerContent.jsp(31,30) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "name", new String("email"));
    // /WEB-INF/views/fragments/headerContent.jsp(31,30) null
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
    // /WEB-INF/views/fragments/headerContent.jsp(34,30) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setPath("password");
    // /WEB-INF/views/fragments/headerContent.jsp(34,30) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setTabindex("2");
    // /WEB-INF/views/fragments/headerContent.jsp(34,30) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setId("pass");
    // /WEB-INF/views/fragments/headerContent.jsp(34,30) null
    _jspx_th_sf_005fpassword_005f0.setDynamicAttribute(null, "name", new String("pass"));
    // /WEB-INF/views/fragments/headerContent.jsp(34,30) null
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

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/register.jsp(33,33) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f1.setPath("firstName");
    // /WEB-INF/views/register.jsp(33,33) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f1.setId("firstname");
    // /WEB-INF/views/register.jsp(33,33) null
    _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "placeholder", new String("First name"));
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
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/register.jsp(34,60) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f2.setPath("lastName");
    // /WEB-INF/views/register.jsp(34,60) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f2.setId("lastname");
    // /WEB-INF/views/register.jsp(34,60) null
    _jspx_th_sf_005finput_005f2.setDynamicAttribute(null, "placeholder", new String("Last name"));
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
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.reuse(_jspx_th_sf_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/register.jsp(40,42) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f3.setPath("username");
    // /WEB-INF/views/register.jsp(40,42) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f3.setId("reg_email");
    // /WEB-INF/views/register.jsp(40,42) null
    _jspx_th_sf_005finput_005f3.setDynamicAttribute(null, "placeholder", new String("Email Address"));
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
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fnobody.reuse(_jspx_th_sf_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005fpassword_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_sf_005fpassword_005f1 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_sf_005fpassword_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fpassword_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/register.jsp(46,42) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f1.setPath("password");
    // /WEB-INF/views/register.jsp(46,42) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f1.setId("reg_pass");
    // /WEB-INF/views/register.jsp(46,42) null
    _jspx_th_sf_005fpassword_005f1.setDynamicAttribute(null, "placeholder", new String("Password (6 or more characters)"));
    int[] _jspx_push_body_count_sf_005fpassword_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fpassword_005f1 = _jspx_th_sf_005fpassword_005f1.doStartTag();
      if (_jspx_th_sf_005fpassword_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005fpassword_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005fpassword_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005fpassword_005f1.doFinally();
      _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody.reuse(_jspx_th_sf_005fpassword_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005fpassword_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_sf_005fpassword_005f2 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_sf_005fpassword_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fpassword_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/register.jsp(52,42) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f2.setPath("passwordVerify");
    // /WEB-INF/views/register.jsp(52,42) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f2.setId("reg_pass_verify");
    // /WEB-INF/views/register.jsp(52,42) null
    _jspx_th_sf_005fpassword_005f2.setDynamicAttribute(null, "placeholder", new String("Password Repeat"));
    int[] _jspx_push_body_count_sf_005fpassword_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fpassword_005f2 = _jspx_th_sf_005fpassword_005f2.doStartTag();
      if (_jspx_th_sf_005fpassword_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005fpassword_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005fpassword_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005fpassword_005f2.doFinally();
      _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fnobody.reuse(_jspx_th_sf_005fpassword_005f2);
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
