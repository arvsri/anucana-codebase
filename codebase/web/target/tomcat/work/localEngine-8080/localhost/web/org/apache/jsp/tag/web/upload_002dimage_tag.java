package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_002dimage_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String mode;
  private java.lang.String accessId;
  private java.lang.String posturl;
  private java.lang.String src;
  private java.lang.String dummy;

  public java.lang.String getMode() {
    return this.mode;
  }

  public void setMode(java.lang.String mode) {
    this.mode = mode;
    jspContext.setAttribute("mode", mode);
  }

  public java.lang.String getAccessId() {
    return this.accessId;
  }

  public void setAccessId(java.lang.String accessId) {
    this.accessId = accessId;
    jspContext.setAttribute("accessId", accessId);
  }

  public java.lang.String getPosturl() {
    return this.posturl;
  }

  public void setPosturl(java.lang.String posturl) {
    this.posturl = posturl;
    jspContext.setAttribute("posturl", posturl);
  }

  public java.lang.String getSrc() {
    return this.src;
  }

  public void setSrc(java.lang.String src) {
    this.src = src;
    jspContext.setAttribute("src", src);
  }

  public java.lang.String getDummy() {
    return this.dummy;
  }

  public void setDummy(java.lang.String dummy) {
    this.dummy = dummy;
    jspContext.setAttribute("dummy", dummy);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);
    if( getMode() != null ) 
      _jspx_page_context.setAttribute("mode", getMode());
    if( getAccessId() != null ) 
      _jspx_page_context.setAttribute("accessId", getAccessId());
    if( getPosturl() != null ) 
      _jspx_page_context.setAttribute("posturl", getPosturl());
    if( getSrc() != null ) 
      _jspx_page_context.setAttribute("src", getSrc());
    if( getDummy() != null ) 
      _jspx_page_context.setAttribute("dummy", getDummy());

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_005feval_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f0 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    _jspx_th_spring_005feval_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005feval_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/upload-image.tag(16,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/tags/upload-image.tag(16,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setVar("contentsBaseURL");
    int[] _jspx_push_body_count_spring_005feval_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005feval_005f0 = _jspx_th_spring_005feval_005f0.doStartTag();
      if (_jspx_th_spring_005feval_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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

  private boolean _jspx_meth_security_005fauthorize_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/upload-image.tag(25,0) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setUrl("/**/managed/**");
    // /WEB-INF/tags/upload-image.tag(25,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setVar("isAuthenticated");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fvar_005furl_005fnobody.reuse(_jspx_th_security_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/upload-image.tag(27,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isAuthenticated}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_security_005fauthentication_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthentication_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/tags/upload-image.tag(29,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setProperty("principal.userId");
    // /WEB-INF/tags/upload-image.tag(29,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setVar("userId");
    int _jspx_eval_security_005fauthentication_005f0 = _jspx_th_security_005fauthentication_005f0.doStartTag();
    if (_jspx_th_security_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/tags/upload-image.tag(31,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId == accessId}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("           <a class=\"inline\" id=\"imageUploader\" href=\"#inline_content\">\r\n");
        out.write("           \t\t<img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("/images/edit-pen-icon-white.png\" />\r\n");
        out.write("           </a>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t  <!-- This contains the hidden content for modal window -->\r\n");
        out.write("\t\t  <div style=\"display:none\">\r\n");
        out.write("\t\t    <div id=\"inline_content\" class=\"lightBox\">\r\n");
        out.write("\t\t      \t<div class=\"centered\">\r\n");
        out.write("\t\t        \t<span id=\"imageUploadError\" style=\"color:red;font-weight: bold;font-family: sans-serif; font-size: 16px;\"></span>\r\n");
        out.write("\t\t      \t</div>\r\n");
        out.write("\t\t    \r\n");
        out.write("\t\t      \t<div class=\"crop-image-wrapper\">\r\n");
        out.write("\t\t        \t<img id=\"cropMe\" src=\"\" style=\"width:400px; margin:50px;\" />\r\n");
        out.write("\t\t    \t\t<button id=\"imageDrop\" onclick=\"document.getElementById('uploadFileInput').click()\" title=\"Click Here\">Upload image</button>    \t\r\n");
        out.write("\t\t      \t</div>\r\n");
        out.write("\t\t    \r\n");
        out.write("\t\t      \t<div class=\"centered\">\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t      \t</div>\r\n");
        out.write("\t\t      \r\n");
        out.write("\t\t       \t<div id=\"bottomBar\"  class=\"centered\">\r\n");
        out.write("\t\t       \t\t<input id=\"uploadFileInput\" type=\"file\" name=\"datafile\" size=\"40\" />\r\n");
        out.write("\t\t       \t\t<input type=\"button\" value=\"Upload Image\" id=\"uploadImageButton\" class=\"blueButton smallButton\" tabindex=\"1\" onclick=\"document.getElementById('uploadFileInput').click()\" />\r\n");
        out.write("\t\t       \t\t<input id=\"cropButton\" type=\"button\" value=\"Save Image\" style=\"display:none;\" class=\"blueButton smallButton hidden\" ></input>\r\n");
        out.write("\t\t      \t</div>\r\n");
        out.write("\t\t\t  </div>\r\n");
        out.write("\t\t \t</div>\r\n");
        out.write("                   \r\n");
        out.write("                   \r\n");
        out.write("\t\t  <script type=\"text/javascript\">\r\n");
        out.write("\t\t\t  var uploadImage = function() {\r\n");
        out.write("\t\t\t\t  \tvar x = 0;\r\n");
        out.write("\t\t\t\t  \tvar y = 0;\r\n");
        out.write("\t\t\t\t  \tvar x2 = 0;\r\n");
        out.write("\t\t\t\t  \tvar y2 = 0;\r\n");
        out.write("\t\t\t\t  \tvar h = 0;\r\n");
        out.write("\t\t\t\t  \tvar w = 0;\r\n");
        out.write("\t\t\t\t  \t\r\n");
        out.write("\t\t\t\t  \tvar uploadSuccess = false;\r\n");
        out.write("\t\t\t\t  \r\n");
        out.write("\t\t\t        $(\".inline\").colorbox({inline:true});\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t        $(document).on(\"cbox_cleanup\", function(){\r\n");
        out.write("\t\t\t        \tif(uploadSuccess){\r\n");
        out.write("\t\t\t\t          \tlocation.reload();\r\n");
        out.write("\t\t\t        \t}\r\n");
        out.write("\t\t\t         });\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t        // html 5 form data \r\n");
        out.write("\t\t\t\t  \tformdata = false;\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t        ");
        if (_jspx_meth_c_005fchoose_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t        $(\"#uploadFileInput\").change(function() {\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t        \tif (window.FormData) {\r\n");
        out.write("\t\t\t    \t\t    formdata = new FormData();\r\n");
        out.write("\t\t\t    \t\t}\r\n");
        out.write("\t\t\t\t       \tif(!formdata){\r\n");
        out.write("\t\t\t\t       \t\t$(\"#imageUploadError\").text(\"You are using an old browser. Our image upload functionality might not work properly\");\r\n");
        out.write("\t\t\t\t       \t\treturn;\r\n");
        out.write("\t\t\t\t       \t}\r\n");
        out.write("\t\t\t\t       \tformdata.append(\"image\", this.files[0]);\r\n");
        out.write("\t\t\t\t       \t\r\n");
        out.write("\t\t\t\t   \t    $.ajax({\r\n");
        out.write("\t\t\t\t\t\t\theaders: { \"Accept\" : \"application/json; charset=utf-8\"},\r\n");
        out.write("\t\t\t\t\t\t\ttype: \"POST\",\r\n");
        out.write("\t\t\t\t\t\t\turl: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${posturl}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\",\r\n");
        out.write("\t\t\t\t\t\t\tdata: formdata,\r\n");
        out.write("\t\t\t\t\t\t\tprocessData: false,\r\n");
        out.write("\t\t\t\t\t\t    contentType: false,\r\n");
        out.write("\t\t\t\t\t\t\tdataType: \"json\",\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\tbeforeSend: function( xhr ) {\r\n");
        out.write("\t\t\t\t\t          \t$(\"#imageDrop\").html('<div>loading ... </div><div class=\"loader bubblingG\"><span id=\"bubblingG_1\"></span><span id=\"bubblingG_2\"></span><span id=\"bubblingG_3\"></span></div>').show();\r\n");
        out.write("\t\t\t\t\t          \t$(\"#imageUploadError\").text(\"\");\r\n");
        out.write("\t\t\t\t\t          \t$(\"#cropMe\").hide();\r\n");
        out.write("\t\t\t\t\t            $(\".inline\").colorbox.resize();\r\n");
        out.write("\t\t\t\t\t            uploadSuccess = false;\r\n");
        out.write("\t\t\t\t\t\t\t},\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\tsuccess: function(response){\r\n");
        out.write("\t\t\t\t\t\t\t\tvar obj = eval(response);\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\tif(obj.errormsg){\r\n");
        out.write("\t\t\t\t\t\t\t\t\thandleImageUploadError(obj.errormsg);\r\n");
        out.write("\t\t\t\t\t\t\t\t}else if(response.viewError != undefined && response.viewError.fieldErrors != undefined && response.viewError.fieldErrors.length != 0){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t// handle error first\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar errormsg = \"\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$.each(response.viewError.fieldErrors,function( key, value ){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\terrormsg = errormsg + \"\\n\" + value.errorMessage;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t\t\thandleImageUploadError(errormsg);\r\n");
        out.write("\t\t\t\t\t\t\t\t}else{\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#cropMe\").attr(\"src\", obj.imgURL).show();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#imageDrop\").text(\"Upload image\").hide();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#imageUploadError\").text(\"\");\r\n");
        out.write("\t\t\t\t\t\t          \t\r\n");
        out.write("\t\t\t\t\t\t            $('#cropMe').Jcrop({\r\n");
        out.write("\t\t\t\t\t\t                addClass: 'jcrop-centered', // Adds 'jcrop-centered' css class on the image handled by jcrop. \r\n");
        out.write("\t\t\t\t\t\t                setSelect: [0, 160, 160, 0], // Sets a default crop selection before user clicks on image.\r\n");
        out.write("\t\t\t\t\t\t                aspectRatio: 1/1,              // Adds an aspect ratio of 1:1 as we want a square selection.\r\n");
        out.write("\t\t\t\t\t\t                onSelect : function(cord){\r\n");
        out.write("\t\t\t\t\t\t                \tx = cord.x;\r\n");
        out.write("\t\t\t\t\t\t                \ty = cord.y;\r\n");
        out.write("\t\t\t\t\t\t                \tx2 = cord.x2;\r\n");
        out.write("\t\t\t\t\t\t                \ty2 = cord.y2;\r\n");
        out.write("\t\t\t\t\t\t                \tw = cord.w;\r\n");
        out.write("\t\t\t\t\t\t                \th = cord.h;\r\n");
        out.write("\t\t\t\t\t\t                }\r\n");
        out.write("\t\t\t\t\t\t            });\r\n");
        out.write("\t\t\t\t\t\t            \r\n");
        out.write("\t\t\t\t\t\t            $(\"#uploadImageButton\").attr(\"value\",\"Change Image\");\r\n");
        out.write("\t\t\t\t\t\t            $(\"#cropButton\").show();\r\n");
        out.write("\t\t\t\t\t\t            $(\".inline\").colorbox.resize();\r\n");
        out.write("\t\t\t\t\t\t            \r\n");
        out.write("\t\t\t\t\t\t            uploadSuccess = true;\r\n");
        out.write("\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\terror: function(response){\r\n");
        out.write("\t\t\t\t\t\t\t\thandleImageUploadError(\"Error occurred while uploading the image.\");\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t        });\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t   \t \t$(\"#cropButton\").on(\"click\",function(){\r\n");
        out.write("\t\t\t   \t \t\tvar cropCords = \"x=\"+x+\"&y=\"+y+\"&x2=\"+x2+\"&y2=\"+y2+\"&h=\"+h+\"&w=\"+w;\r\n");
        out.write("\t\t\t\t   \t    $.ajax({\r\n");
        out.write("\t\t\t\t\t\t\theaders: { \"Accept\" : \"application/json; charset=utf-8\"},\r\n");
        out.write("\t\t\t\t\t\t\ttype: \"POST\",\r\n");
        out.write("\t\t\t\t\t\t\turl: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${posturl}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("?imageCrop=true\",\r\n");
        out.write("\t\t\t\t\t\t\tdata:  cropCords,\r\n");
        out.write("\t\t\t\t\t\t\tprocessData: false,\r\n");
        out.write("\t\t\t\t\t\t\tdataType: \"json\",\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\tsuccess: function(response){\r\n");
        out.write("\t\t\t\t\t\t\t\tvar obj = eval(response);\r\n");
        out.write("\t\t\t\t\t\t\t\tif(obj.errormsg){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#imageUploadError\").text(obj.errormsg);\r\n");
        out.write("\t\t\t\t\t\t\t\t}else if(response.viewError != undefined && response.viewError.fieldErrors != undefined && response.viewError.fieldErrors.length != 0){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t// handle error first\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar errormsg = \"\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$.each(response.viewError.fieldErrors,function( key, value ){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\terrormsg = errormsg + \"\\n\" + value.errorMessage;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#imageUploadError\").text(errormsg);\r\n");
        out.write("\t\t\t\t\t\t\t\t}else{\r\n");
        out.write("\t\t\t\t\t\t\t\t\tlocation.reload();\r\n");
        out.write("\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\terror: function(response){\r\n");
        out.write("\t\t\t\t\t\t\t\thandleImageUploadError(\"Error occurred while uploading the image.\");\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t   \t \t\t\r\n");
        out.write("\t\t\t   \t \t});\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t   \t    function handleImageUploadError(errorMessage){\r\n");
        out.write("\t\t\t   \t      \t$(\"#imageDrop\").text(\"Upload image\").show();\r\n");
        out.write("\t\t\t   \t      \t$(\"#cropMe\").hide();\r\n");
        out.write("\t\t\t   \t      \t$(\"#imageUploadError\").text(errorMessage);\r\n");
        out.write("\t\t\t   \t        $(\".inline\").colorbox.resize();\r\n");
        out.write("\t\t\t   \t      \tuploadSuccess = false;\r\n");
        out.write("\t\t\t   \t    }\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t};\r\n");
        out.write("\t\t  </script>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t      \t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      \t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      \t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/upload-image.tag(52,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty mode && mode == 'profile'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t        \t<h4>Select a portion of image above and save it as Profile picture</h4>\r\n");
        out.write("\t\t\t      \t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t      ");
        if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      \t\t\r\n");
        out.write("\t\t\t      \t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t      \t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t      \t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t      \t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/tags/upload-image.tag(57,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mode == 'community'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t        \t<h4>Select a portion of image above and save it as Community Banner</h4>\r\n");
        out.write("\t\t\t\t\t      \t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t        \t<h4>Select a portion of image above and save it as Event Banner</h4>\r\n");
        out.write("\t\t\t\t\t      \t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t        \t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t        \t");
        if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t        ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    // /WEB-INF/tags/upload-image.tag(101,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty dummy && dummy == 'true'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t            $(\"#cropMe\").hide();\r\n");
        out.write("\t\t\t        \t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t          \t$(\"#imageDrop\").css(\"display\",\"none\");\r\n");
        out.write("\t\t\t\t          \t$(\"#cropMe\").load( function(){\r\n");
        out.write("\t\t\t\t            \t$(\".inline\").colorbox.resize();\r\n");
        out.write("\t\t\t\t          \t}).attr('src', \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${src}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\");\r\n");
        out.write("\t\t\t\t          \t$(\"#uploadImageButton\").attr(\"value\",\"Change Image\");\r\n");
        out.write("\t\t\t        \t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }
}
