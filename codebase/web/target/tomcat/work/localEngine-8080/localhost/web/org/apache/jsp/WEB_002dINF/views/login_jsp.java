package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/views/fragments/headerLinkStripe.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/sideButtonsGuest.jsp");
    _jspx_dependants.add("/WEB-INF/views/fragments/footerContent.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody.release();
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
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/favicon.ico\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"anucana_outer_wrapper\">\r\n");
      out.write("\t");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_spring_005feval_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"emptyPad\" style=\"height:45px\" > </div>\r\n");
      out.write("\r\n");
      out.write("    <!--This block holds the header stripe having weblinks on it -->\r\n");
      out.write("    <div id=\"anucana_headStripe\" >\r\n");
      out.write("        <div class=\"wrapper_1020\">\r\n");
      out.write("            <div id=\"site_title\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">.</a> \r\n");
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
      out.write("    </div>   <!-- end of headStripe -->");
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
      out.write("          <div id=\"anucana_main\" style=\"height:300px;\">\r\n");
      out.write("          \t<div id=\"grey_wrapper\">\r\n");
      out.write("                  <div style=\"margin-left:308px;\">\r\n");
      out.write("                   <h3 style=\"margin-top:40px;margin-bottom:40px;\">Login to anucana</h3>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_sf_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div> <!-- end of grey_wrapper -->\r\n");
      out.write("          </div> <!-- end of anucana_main -->\r\n");
      out.write("        <div id=\"emptyPad\" > </div>\r\n");
      out.write("\t\t");
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
      out.write("    </div> <!-- end of anucana_wrapper -->\r\n");
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
    // /WEB-INF/views/login.jsp(5,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/login.jsp(5,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/fragments/headerLinkStripe.jsp(2,1) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f1.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/fragments/headerLinkStripe.jsp(2,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_sf_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fform_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(22,6) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setAction("authAndloginUser");
    // /WEB-INF/views/login.jsp(22,6) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setMethod("post");
    // /WEB-INF/views/login.jsp(22,6) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f0.setModelAttribute("userLogin");
    int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
      if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                        \r\n");
          out.write("\t  \t                       <table width=\"100%\"> \r\n");
          out.write("\t\t                              <col width=\"10%\">\r\n");
          out.write("\t\t                              <col width=\"40%\">                 \r\n");
          out.write("\t\t                              <col width=\"50%\">\r\n");
          out.write("                              \t  \t   <tr>\r\n");
          out.write("\t                              \t\t\t<td colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t  \t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("                                  \t\t\t</td>\r\n");
          out.write("                              \t  \t   </tr>\t\r\n");
          out.write("                                  \t   <tr>\r\n");
          out.write("                                \t      <td colspan=\"2\">");
          if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                            \t      </tr>\r\n");
          out.write("                        \t          <tr>\r\n");
          out.write("                    \t                  <td colspan=\"2\">");
          if (_jspx_meth_sf_005fpassword_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                \t                  </tr>\r\n");
          out.write("            \t                      <tr>\r\n");
          out.write("        \t                              <td><input type=\"submit\" class=\"button grey_button\" id=\"logIn_submit\" tabindex=\"4\" value=\"Log In\" /></td>\r\n");
          out.write("    \t                                  <td style=\"padding:10px\"><a href=\"forgotPassword\">Forgot Password?</a></td>\r\n");
          out.write("\t                                  </tr>    \r\n");
          out.write("                                \t  <tr>\r\n");
          out.write("                            \t          <td>New to Anucana?</td>\r\n");
          out.write("                        \t              <td style=\"padding:10px\"><a href=\"registerNewUser\">Sign up now » </a></td>\r\n");
          out.write("                    \t              </tr>                                                          \r\n");
          out.write("        \t    \t           </table> \r\n");
          out.write("            \t       \t");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/login.jsp(29,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty SPRING_SECURITY_LAST_EXCEPTION}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inlineError\">");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
          return true;
        out.write("</div>\t\t\t\t\t\t\t\t\t  \r\n");
        out.write("\t\t\t\t\t\t\t\t\t  \t\t\t");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/login.jsp(30,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SPRING_SECURITY_LAST_EXCEPTION.message}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/login.jsp(35,55) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("username");
    // /WEB-INF/views/login.jsp(35,55) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setId("login_email");
    // /WEB-INF/views/login.jsp(35,55) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setCssClass("bigInputBox");
    // /WEB-INF/views/login.jsp(35,55) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("Email address"));
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
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_sf_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_sf_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/login.jsp(38,55) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setPath("password");
    // /WEB-INF/views/login.jsp(38,55) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setId("login_pass");
    // /WEB-INF/views/login.jsp(38,55) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fpassword_005f0.setCssClass("bigInputBox");
    // /WEB-INF/views/login.jsp(38,55) null
    _jspx_th_sf_005fpassword_005f0.setDynamicAttribute(null, "placeholder", new String("Password (6 or more characters)"));
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
      _005fjspx_005ftagPool_005fsf_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_sf_005fpassword_005f0);
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
