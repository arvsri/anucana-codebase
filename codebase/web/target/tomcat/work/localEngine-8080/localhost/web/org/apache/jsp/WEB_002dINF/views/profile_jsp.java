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
    _jspx_dependants.add("/WEB-INF/views/fragments/sideButtons.jsp");
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.release();
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
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>anucana</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/colorbox.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jcrop/jquery.Jcrop.css\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
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
      out.write("\t<");
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t");
      out.write("    <!--Block 3 - This block holds left side stripe of buttons -->\r\n");
      out.write("    <div id=\"side_menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"\" id=\"blog_link\"></a></li>\r\n");
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
      out.write("                        <table   style=\"width:100%\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td style=\"padding : 30px;width:30%\">\r\n");
      out.write("                              <div id=\"profilePicBlock\">\r\n");
      out.write("                                <img id=\"profilePic\" class=\"profilePicImage\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/profile_dummy.png\">\r\n");
      out.write("                                <a class=\"inline\" id=\"imageUploader\" href=\"#inline_content\">\r\n");
      out.write("                                  <img  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-white.png\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                              </div> \r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td style=\"position:relative;\">\r\n");
      out.write("                              <div style=\"position:absolute; top: 30px;\">\r\n");
      out.write("                                <table>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding:10px 0px 20px 65px;\">\r\n");
      out.write("                                      <div id=\"profileNameBox\">\r\n");
      out.write("                                          <span class=\"cursorPointer\" id=\"editProfileNameIcon\">\r\n");
      out.write("                                            <span id=\"saveProfileName\" class=\"webSymbol font20 hidden\">.</span>\r\n");
      out.write("                                            <img id=\"editProfileName\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-white.png\">\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                          <span class=\"profileBannerText\">\r\n");
      out.write("                                            <span id=\"firstName\">Arvind</span>&nbsp;\r\n");
      out.write("                                            <span id=\"lastName\">Srivastva</span>\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding:5px 0px 10px 65px;\">\r\n");
      out.write("                                      <div id=\"companyNameBox\">\r\n");
      out.write("                                          <span class=\"cursorPointer\" id=\"editCompanyNameIcon\">\r\n");
      out.write("                                            <span id=\"saveCompanyName\" class=\"webSymbol font15 hidden\">.</span>\r\n");
      out.write("                                            <img id=\"editCompanyName\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-white.png\">\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                          <span class=\"profileBannerText\">\r\n");
      out.write("                                            <span id=\"professionalHeadline\" class=\"tooltip\" title=\"<b>Enter your Professional Headline.</b><br/><br/><span class='tooltipExample'>eg. Experienced Transportation Executive, Web Designer and Information Architect, Visionary Entrepreneur and Investor.</span>\"><em>Your Professional Headline</em></span>\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding:5px 0px 10px 65px;\">\r\n");
      out.write("                                      <div id=\"industryInfoBox\">\r\n");
      out.write("                                          <span class=\"cursorPointer\" id=\"editIndustryInfoIcon\">\r\n");
      out.write("                                            <span id=\"saveIndustryInfo\" class=\"webSymbol font15 hidden\">.</span>\r\n");
      out.write("                                            <img id=\"editIndustryInfo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-white.png\">\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                          <span class=\"profileBannerText\">\r\n");
      out.write("                                            <span class=\"tooltip industryAutoComplete\" id=\"industryName\" title=\"<b>Enter your Industry Name.</b><br/><br/><span class='tooltipExample'>eg. Information Technology and Services\"><em>Your Industry Name</em></span>\r\n");
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
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <div id=\"accordion\">\r\n");
      out.write("                      <div>\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">My Contact Info</a></h3>\r\n");
      out.write("                          <div id=\"contactInfoAccordian\">\r\n");
      out.write("                            \r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Phone Number</span>\r\n");
      out.write("                                <span id=\"phoneNumberDisplay\">7503254033</span>\r\n");
      out.write("                                <span><a href=\"\">Edit</a></span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              <div>\r\n");
      out.write("                                <input type=\"text\" id=\"phoneNumberInput\" value=\"7503254033\" />\r\n");
      out.write("                                <button type=\"button\" id=\"savePhoneButton\" class=\"blueButton smallButton\">Save</button>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Primary Email</span>\r\n");
      out.write("                                <span id=\"priEmailDisplay\">simran_joy16@yahoo.co.in</span>\r\n");
      out.write("                                <span><a href=\"\">Edit</a></span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              <div>\r\n");
      out.write("                                <input type=\"text\" id=\"primaryEmailInput\" value=\"simran_joy16@yahoo.co.in\" />\r\n");
      out.write("                                <button type=\"button\" id=\"savePriEmailButton\" class=\"blueButton smallButton\">Save</button>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Contact Email</span>\r\n");
      out.write("                                <span id=\"contactEmailDisplay\">simran_joy16@yahoo.co.in</span>\r\n");
      out.write("                                <span><a href=\"\">Edit</a></span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              <div>\r\n");
      out.write("                                <input type=\"text\" id=\"contactEmailInput\" value=\"simran_joy16@yahoo.co.in\" />\r\n");
      out.write("                                <button type=\"button\" id=\"saveContactEmailButton\" class=\"blueButton smallButton\">Save</button>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <h3>\r\n");
      out.write("                                <span>Address</span>\r\n");
      out.write("                                <span>House No. 000, Sector 15, Gurgaon, Haryana.</span>\r\n");
      out.write("                                <span><a href=\"\">Edit</a></span>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                              <div id=\"addressAccBox\">\r\n");
      out.write("                                <input type=\"text\" id=\"pincode\"  placeholder=\"Pincode\"/>\r\n");
      out.write("                                <span class=\"webSymbol blueOnWhite font20 cursorPointer\" id=\"pincodeButton\">V</span>\r\n");
      out.write("                                <div id=\"locationOptions\" class=\"hidden\">\r\n");
      out.write("                                  <ul>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                      <input name=\"locationRadio\" type=\"radio\" id=\"loc1\" val=\"1\"/>\r\n");
      out.write("                                      <label for=\"loc1\">Gurgaon, Haryana</label>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                      <input name=\"locationRadio\" type=\"radio\" id=\"loc2\" val=\"2\"/>\r\n");
      out.write("                                      <label for=\"loc2\">Noida, UP</label>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                      <input name=\"locationRadio\" type=\"radio\" id=\"loc3\" val=\"3\"/>\r\n");
      out.write("                                      <label for=\"loc3\">Delhi</label>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                  </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" id=\"addressLine1Input\" class=\"mediumLengthBox\" value=\"House No. 000,\" placeholder=\"Address Line 1\"/>\r\n");
      out.write("                                <input type=\"text\" id=\"addressLine2Input\" class=\"mediumLengthBox\" value=\"Sector 15,\" placeholder=\"Address Line 2\"/>\r\n");
      out.write("                                <div id=\"selectedLocation\" class=\"lightGreyHighlight mediumLengthBox hidden\">\r\n");
      out.write("                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                  <button type=\"button\" id=\"saveContactEmailButton\" class=\"blueButton smallButton\">Save</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div id=\"myCommunitiesAcc\">\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">My Communities</a></h3>\r\n");
      out.write("                          <div>\r\n");
      out.write("                            <h5><b>\r\n");
      out.write("                              <div>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/CommunitySearch.html\">Find more communities.</a>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"hidden\">\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/CommunitySearch.html\">Find Communities.</a>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              </b>\r\n");
      out.write("                            </h5>\r\n");
      out.write("                              <div id=\"container01\" style=\"margin-top:20px;overflow: hidden;\" class=\"masonry\">\r\n");
      out.write("\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div>\r\n");
      out.write("\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">About Me</a></h3>\r\n");
      out.write("                          <div>\r\n");
      out.write("                            <div class=\"cursorPointer\" style=\"text-align:right;padding-bottom:10px;\" id=\"editAboutMeIcon\">\r\n");
      out.write("                              <span id=\"saveAboutMeDesc\" class=\"webSymbol darkBlueOnWhite font15 hidden\" title=\"Save\">.</span>\r\n");
      out.write("                              <img id=\"editAboutMeDesc\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/edit-pen-icon-blue.png\" title=\"Edit\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"aboutMeContent\">\r\n");
      out.write("                              A seasoned software programmer with extensive work experience in architecture, design and development of complex and large sized projects.<br><br>- Sun Certified developer for Java Web services (SCDJWS Certified). Sun Certified Java Programmer ( SCJP 1.4 Certified )<br><br>- Proficiency in object oriented programming and design patterns. Strong in Core Java, RDBMS, data modeling, XML processing, Web services.<br><br>- Domain knowledge of banking and financial industry especially trading and risk management, custody, corporate actions and SWIFT<br><br>- Passionate in public speaking, training, mentoring and knowledge management.<br><br>Specialties: Java / J2EE<br><br>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- end of grey_wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end of anucana_main -->\r\n");
      out.write("\t    <div id=\"emptyPad\" style=\"height: 130px\"></div>\r\n");
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
      out.write("\t    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  <script type='text/javascript' src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/logging.js'></script>\r\n");
      out.write("  <!-- jQuery -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery1.9.1.min.js\"></script>\r\n");
      out.write("  <!-- jQuery-ui -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-ui.js\"></script>\r\n");
      out.write("  <!-- masonry pluggin-->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/masonry.pkgd.js\"></script>\r\n");
      out.write("  <!-- images loaded pluggin-->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/imagesloaded.pkgd.js\"></script>\r\n");
      out.write("  <!-- FlexSlider -->\r\n");
      out.write("  <script defer src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.flexslider.js\"></script>\r\n");
      out.write("  <!-- Jcrop pluggin-->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jcrop/jquery.Jcrop.min.js\"></script>\r\n");
      out.write("  <!-- lightbox pluggin -->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.colorbox.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(function() {\r\n");
      out.write("          var availableTags = [\r\n");
      out.write("          \"Software\",\r\n");
      out.write("          \"Healthcare\",\r\n");
      out.write("          \"Automobile\",\r\n");
      out.write("          \"Marketing\",\r\n");
      out.write("          \"Broadcasting\",\r\n");
      out.write("          \"Education\",\r\n");
      out.write("          \"Electronics\",\r\n");
      out.write("          \"Textiles\",\r\n");
      out.write("          \"Electrical\",\r\n");
      out.write("          \"Food & Agriculture\",\r\n");
      out.write("          \"Garment Industry\",\r\n");
      out.write("          \"Analytics\"\r\n");
      out.write("          ];\r\n");
      out.write("          $( \"#industryName\" ).autocomplete({\r\n");
      out.write("            source: availableTags,\r\n");
      out.write("            focus: function () {\r\n");
      out.write("                  $(\".ui-autocomplete\").addClass(\"custom-onhover\");\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("          });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         $( \".tooltip\" ).tooltip({\r\n");
      out.write("            tooltipClass: \"custom-tooltip-styling\",\r\n");
      out.write("            show: null,\r\n");
      out.write("            position: {\r\n");
      out.write("            my: \"left middle\",\r\n");
      out.write("            at: \"right middle\"\r\n");
      out.write("            },\r\n");
      out.write("            open: function( event, ui ) {\r\n");
      out.write("            ui.tooltip.animate({ top: ui.tooltip.position().top + 10 }, \"fast\" );\r\n");
      out.write("            },\r\n");
      out.write("            content: function() {\r\n");
      out.write("              return $(this).attr('title');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("         function showErrorMessage(field, my1, my2, at1, at2, message, errorClass){\r\n");
      out.write("              $(field).addClass(errorClass);\r\n");
      out.write("              $(field).attr('title',message);\r\n");
      out.write("              $(field).tooltip({\r\n");
      out.write("                tooltipClass: \"error-tooltip-styling\",\r\n");
      out.write("              show: null,\r\n");
      out.write("              position: {\r\n");
      out.write("              my: my1+\" \"+my2,\r\n");
      out.write("              at: at1+\" \"+at2\r\n");
      out.write("              },\r\n");
      out.write("              content: function() {\r\n");
      out.write("                return $(this).attr('title');\r\n");
      out.write("              }\r\n");
      out.write("            });\r\n");
      out.write("            $(field).tooltip('open');\r\n");
      out.write("          \r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        function refreshMasonry(){\r\n");
      out.write("              $container.masonry({\r\n");
      out.write("                itemSelector: '.masonryBox',\r\n");
      out.write("                columnWidth: 50,\r\n");
      out.write("                isAnimated: true,\r\n");
      out.write("                gutter:26\r\n");
      out.write("              });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(function() {\r\n");
      out.write("            var $acc = $(\"#accordion > div, #contactInfoAccordian\").accordion({ header: \"> h3\", \r\n");
      out.write("              collapsible: true, \r\n");
      out.write("              active: false, \r\n");
      out.write("              heightStyle: \"content\"\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#accordion > div:last-child\").accordion('option', 'active', 0);\r\n");
      out.write("\r\n");
      out.write("            $( \"#myCommunitiesAcc\" ).on( \"accordionactivate\", function( event, ui ) {\r\n");
      out.write("              refreshMasonry();\r\n");
      out.write("            } );\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        $('#anucana_outer_wrapper').on(\"click\", \"#pincodeButton\", function() {\r\n");
      out.write("            $('#locationOptions').removeClass('hidden');\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $('#anucana_outer_wrapper').on(\"click\", \"#locationOptions\", function() {\r\n");
      out.write("            var selectedLocation = $('input[type=\"radio\"][name=\"locationRadio\"]:checked + label').text();\r\n");
      out.write("            $('#locationOptions').addClass('hidden');\r\n");
      out.write("            $('#selectedLocation').removeClass('hidden');\r\n");
      out.write("            $('#selectedLocation').text(selectedLocation);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /* Validation methods of contactInfoAccordian input fields start here.. This code can be further streamlined */\r\n");
      out.write("\r\n");
      out.write("        $('#anucana_outer_wrapper').on(\"click\", \"#savePhoneButton\", function() {\r\n");
      out.write("          // Call the static phone number validation here -----\r\n");
      out.write("          var updatedValue = $('#phoneNumberInput').val();\r\n");
      out.write("          if(! checkNullOrEmpty(updatedValue)){\r\n");
      out.write("            showErrorMessage($('#phoneNumberInput'), \"right\", \"middle\", \"left-20\", \"middle\", \"Please enter valid phone number\", 'errorInputbox');\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("          else{\r\n");
      out.write("            $('#phoneNumberInput').removeAttr('title').removeClass('errorInputbox');\r\n");
      out.write("          }\r\n");
      out.write("          $('#phoneNumberDisplay').text(updatedValue);\r\n");
      out.write("          $(\"#contactInfoAccordian\").accordion({active: false}).click();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("       $('#anucana_outer_wrapper').on(\"click\", \"#savePriEmailButton\", function() {\r\n");
      out.write("          // Call the static email validations here -----\r\n");
      out.write("          var updatedValue = $('#primaryEmailInput').val();\r\n");
      out.write("          if(! checkNullOrEmpty(updatedValue)){\r\n");
      out.write("            showErrorMessage($('#primaryEmailInput'), \"right\", \"middle\", \"left-20\", \"middle\", \"Please enter valid email number\", 'errorInputbox');\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("          else{\r\n");
      out.write("            $('#primaryEmailInput').removeAttr('title').removeClass('errorInputbox');\r\n");
      out.write("          }\r\n");
      out.write("          $('#priEmailDisplay').text(updatedValue);\r\n");
      out.write("          $(\"#contactInfoAccordian\").accordion({active: false}).click();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('#anucana_outer_wrapper').on(\"click\", \"#saveContactEmailButton\", function() {\r\n");
      out.write("          // Call the static email validations here -----\r\n");
      out.write("          var updatedValue = $('#contactEmailInput').val();\r\n");
      out.write("          if(! checkNullOrEmpty(updatedValue)){\r\n");
      out.write("            showErrorMessage($('#contactEmailInput'), \"right\", \"middle\", \"left-20\", \"middle\", \"Please enter valid email number\", 'errorInputbox');\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("          else{\r\n");
      out.write("            $('#contactEmailInput').removeAttr('title').removeClass('errorInputbox');\r\n");
      out.write("          }\r\n");
      out.write("          $('#contactEmailDisplay').text(updatedValue);\r\n");
      out.write("          $(\"#contactInfoAccordian\").accordion({active: false}).click();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        /* Arvind : Pick the below mentioned matcher patterns from a properties file. Same properties file should be refered to embed these matcher patters in the description text while saving this event description in the DB. eg. In our properties file it should look something like -  \r\n");
      out.write("          msg.trainerNameMatcher = {trainerName} \r\n");
      out.write("\r\n");
      out.write("        So while fetching its value here, in case of struts it can be done as -\r\n");
      out.write("          var trainerNameMatcher = <s:text name=\"msg.confirm\"/>\r\n");
      out.write("\r\n");
      out.write("        Below hard coded values of matchers & dynamicDivMarkupString should be replaced with dynamic code.\r\n");
      out.write("        */\r\n");
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
      out.write("\r\n");
      out.write("        // Arvind : Dummy ajax call method. Remove this method when the actual ajax call is coded.\r\n");
      out.write("        function ajaxCall(){\r\n");
      out.write("          var responseJSON = [\r\n");
      out.write("          {\"trainer\":\"Mark\",\"eventName\":\"Relics of Python\",\"eventDate\":\"26-Mar-2014\", \"startTime\":\"03:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Hayat Hotel\", \"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna blabber on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna blabber on {eventName}\" ,  \"impIndex\":\"6\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Tony\",\"eventName\":\"Relics of PHP\",\"eventDate\":\"22-Apr-2014\", \"startTime\":\"05:30PM\",\"duration\":\"180 min\", \"eventVenue\":\"Regals Residency\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna rahul gandhi on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna rahul gandhi on {eventName}\" ,  \"impIndex\":\"6\", \"membershipStatus\": \"true\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"6\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"6\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"6\", \"membershipStatus\": \"false\"},\r\n");
      out.write("          {\"trainer\":\"Brian\",\"eventName\":\"Relics of Ruby\",\"eventDate\":\"25-May-2014\", \"startTime\":\"01:30PM\",\"duration\":\"180 min\" ,\"eventVenue\":\"Lutyens\",\"imgSrc\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\", \"shortDesc\":\"{trainerNameMarkup} is gonna dance on {eventNameMarkup}\" , \"longDescription\":\"Its a long desc. {trainerName} is gonna dance on {eventName}\" ,  \"impIndex\":\"6\", \"membershipStatus\": \"false\"}\r\n");
      out.write("          ];\r\n");
      out.write("\r\n");
      out.write("          return responseJSON;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Global variable to count the number of dynamic boxes loaded on this page so far\r\n");
      out.write("        var dynamicBoxesLoaded = 0;\r\n");
      out.write("        var $container = $('.masonry');\r\n");
      out.write("\r\n");
      out.write("        //Below dummy json object will be replaced by the dynamically fetched json.\r\n");
      out.write("        var responseJSONN = ajaxCall();\r\n");
      out.write("        appendMasonryElements(responseJSONN);\r\n");
      out.write("\r\n");
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
      out.write("                  itemSelector: '.community_box',\r\n");
      out.write("                  columnWidth: 60,\r\n");
      out.write("                  isAnimated: true,\r\n");
      out.write("                  gutter:20\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("          '<div id=\"dynamicBox{boxIndex}\" class=\"community_box col{impIndex}\">'+\r\n");
      out.write("            '<div class=\"communityBoxLabel\">'+\r\n");
      out.write("              '<a href=\"CommunityPage.html\">'+\r\n");
      out.write("                '<img class=\"communityBoxPhoto\" src={imageSource}>'+\r\n");
      out.write("              '</a>'+\r\n");
      out.write("              '<div class=\"border joinCircle_CSR '+ backgroundColor +'\">'+\r\n");
      out.write("                '<div class=\"circleFiller\">'+\r\n");
      out.write("                  '<span class=\"'+ joinCircleClass +'\">'+ joinCircleText +'</span>'+\r\n");
      out.write("                '</div>'+\r\n");
      out.write("              '</div>'+\r\n");
      out.write("            '</div>'+\r\n");
      out.write("            '<div  style=\"background:white;padding:5px;\">'+\r\n");
      out.write("                '<p style=\"color:black;\">{shortDesc}</p>'+\r\n");
      out.write("            '</div>'+\r\n");
      out.write("          '</div>';\r\n");
      out.write("\r\n");
      out.write("          var trainerNameMarkupString = '<span class=\"trainerName\">{trainerName}</span>';\r\n");
      out.write("          var eventNameMarkupString = '<span class=\"eventName\">{eventName}</span>';\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          dynamicDivMarkupString = dynamicDivMarkupString.split(boxIndexMatcher).join((index+lastLoadedCount));\r\n");
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
      out.write("\r\n");
      out.write("        //Below dummy json object will be replaced by the dynamically fetched json.\r\n");
      out.write("        //var communityMembersJSONN = ajaxCallFetchPosts();\r\n");
      out.write("       // $container.empty();\r\n");
      out.write("        //var boxList = $();\r\n");
      out.write("        //boxList = appendCommunityBannerElement(boxList);\r\n");
      out.write("        //boxList = appendCommunityHomeBoxElements(boxList);\r\n");
      out.write("        //appendCommunityPostElements(communityMembersJSONN, boxList);\r\n");
      out.write("\r\n");
      out.write("        $(\".inline\").colorbox({inline:true, width:\"50%\", initialWidth: 100, initialHeight: 100});\r\n");
      out.write("          /*\r\n");
      out.write("          // Arvind : Unleash this piece of code when using jsps. Remove code snippet# D2, while uncommenting this code. This piece of code can be moved to a common location. eg. header.jsp if one exists.\r\n");
      out.write("            if ( $('#blog_page').length ) {\r\n");
      out.write("              // exists\r\n");
      out.write("            } else if ( $('#discuss_page').length ) {\r\n");
      out.write("              // exists\r\n");
      out.write("            } else if ( $('#events_page').length ) {\r\n");
      out.write("              $('#events_link').addClass('active');\r\n");
      out.write("            } else{\r\n");
      out.write("              // doesn't exist\r\n");
      out.write("            }\r\n");
      out.write("          */\r\n");
      out.write("\r\n");
      out.write("            function checkNullOrEmpty(fieldValue){\r\n");
      out.write("                if (fieldValue == null || fieldValue.length==0){\r\n");
      out.write("                  return false;\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            function validateProfileName(firstName, lastName){\r\n");
      out.write("              //alert('firstName and lastName -'+$(firstName).text()+'**'+$(lastName).text());\r\n");
      out.write("              firstNameValue = $(firstName).text();\r\n");
      out.write("              lastNameValue = $(lastName).text();\r\n");
      out.write("\r\n");
      out.write("              var valid1 = checkNullOrEmpty(firstNameValue);\r\n");
      out.write("              if (! valid1){\r\n");
      out.write("                showErrorMessage(firstName,\"right\",\"bottom\",\"left+50\",\"top-10\",\"Please enter First Name\", 'errorSpanOnGrey');\r\n");
      out.write("              }\r\n");
      out.write("              else{\r\n");
      out.write("                $(firstName).removeAttr('title').removeClass('errorSpanOnGrey');\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              var valid2 = checkNullOrEmpty(lastNameValue);\r\n");
      out.write("              if (! valid2){\r\n");
      out.write("                showErrorMessage(lastName,\"left\",\"bottom\",\"right-50\",\"top-10\",\"Please enter Last Name\", 'errorSpanOnGrey')\r\n");
      out.write("              }\r\n");
      out.write("              else{\r\n");
      out.write("                $(lastName).removeAttr('title').removeClass('errorSpanOnGrey');;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              return (valid1 && valid2);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            function showHideIcons(icon1, icon2){\r\n");
      out.write(" /*             $container.masonry({\r\n");
      out.write("                itemSelector: '.masonryBox',\r\n");
      out.write("                columnWidth: 60,\r\n");
      out.write("                isAnimated: true,\r\n");
      out.write("                gutter:20\r\n");
      out.write("              });\r\n");
      out.write("*/\r\n");
      out.write("              $(icon1).addClass('hidden');\r\n");
      out.write("              $(icon2).removeClass('hidden');\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function activateReadWriteMode(textDiv, editIcon, saveIcon){\r\n");
      out.write("              $(textDiv).attr('contenteditable','true');\r\n");
      out.write("              showHideIcons(editIcon, saveIcon);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function activateReadOnlyMode(textDiv, editIcon, saveIcon){\r\n");
      out.write("              $(textDiv).removeAttr('contenteditable');\r\n");
      out.write("              showHideIcons(saveIcon, editIcon); \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#professionalHeadline\", function() {\r\n");
      out.write("              activateReadWriteMode($('#professionalHeadline'), $('#editCompanyName'), $('#saveCompanyName'));\r\n");
      out.write("              //activateReadWriteMode($('#designation'), $('#editCompanyName'), $('#saveCompanyName'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#editCompanyName\", function() {\r\n");
      out.write("              activateReadWriteMode($('#professionalHeadline'), $('#editCompanyName'), $('#saveCompanyName'));\r\n");
      out.write("              //activateReadWriteMode($('#designation'), $('#editCompanyName'), $('#saveCompanyName'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#saveCompanyName\", function() {\r\n");
      out.write("              activateReadOnlyMode($('#professionalHeadline'), $('#editCompanyName'), $('#saveCompanyName'));\r\n");
      out.write("              //activateReadOnlyMode($('#designation'), $('#editCompanyName'), $('#saveCompanyName'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#editProfileName\", function() {\r\n");
      out.write("              activateReadWriteMode($('#firstName'), $('#editProfileName'), $('#saveProfileName'));\r\n");
      out.write("              activateReadWriteMode($('#lastName'), $('#editProfileName'), $('#saveProfileName'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#saveProfileName\", function() {\r\n");
      out.write("             var valid = validateProfileName($('#firstName'), $('#lastName'));\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            if(valid){\r\n");
      out.write("               activateReadOnlyMode($('#firstName'), $('#editProfileName'), $('#saveProfileName'));\r\n");
      out.write("               activateReadOnlyMode($('#lastName'), $('#editProfileName'), $('#saveProfileName'));\r\n");
      out.write("             }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#industryName\", function() {\r\n");
      out.write("              activateReadWriteMode($('#industryLocation'), $('#editIndustryInfo'), $('#saveIndustryInfo'));\r\n");
      out.write("              activateReadWriteMode($('#industryName'), $('#editIndustryInfo'), $('#saveIndustryInfo'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#editIndustryInfo\", function() {\r\n");
      out.write("              activateReadWriteMode($('#industryLocation'), $('#editIndustryInfo'), $('#saveIndustryInfo'));\r\n");
      out.write("              activateReadWriteMode($('#industryName'), $('#editIndustryInfo'), $('#saveIndustryInfo'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#saveIndustryInfo\", function() {\r\n");
      out.write("              activateReadOnlyMode($('#industryLocation'), $('#editIndustryInfo'), $('#saveIndustryInfo'));\r\n");
      out.write("              activateReadOnlyMode($('#industryName'), $('#editIndustryInfo'), $('#saveIndustryInfo'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#editCommunityEmail\", function() {\r\n");
      out.write("              activateReadWriteMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#saveCommunityEmail\", function() {\r\n");
      out.write("              activateReadOnlyMode($('#communityEmail'), $('#editCommunityEmail'), $('#saveCommunityEmail'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#editAboutMeDesc\", function() {\r\n");
      out.write("              activateReadWriteMode($('#aboutMeContent'), $('#editAboutMeDesc'), $('#saveAboutMeDesc'));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#anucana_outer_wrapper').on(\"click\", \"#saveAboutMeDesc\", function() {\r\n");
      out.write("              activateReadOnlyMode($('#aboutMeContent'), $('#editAboutMeDesc'), $('#saveAboutMeDesc'));\r\n");
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
      out.write("        // This method appends newly generated masonry boxes to the masonry container\r\n");
      out.write("        function appendMemberElements(responseJSON, boxList){\r\n");
      out.write("          var lastLoadedCount = dynamicBoxesLoaded;\r\n");
      out.write("          $.each(responseJSON, function(i, eventData) {\r\n");
      out.write("            var boxElement = getMemberBoxElement(i, lastLoadedCount, eventData);\r\n");
      out.write("            boxList = boxList.add($(boxElement));\r\n");
      out.write("            dynamicBoxesLoaded++;\r\n");
      out.write("          });\r\n");
      out.write("\r\n");
      out.write("          $container = $container.append( boxList );\r\n");
      out.write("\r\n");
      out.write("          $('.masonry').imagesLoaded( function() {\r\n");
      out.write("            // images have loaded\r\n");
      out.write("            $container.masonry( 'appended', boxList )\r\n");
      out.write("                .masonry('reloadItems')\r\n");
      out.write("                .masonry({\r\n");
      out.write("                  itemSelector: '.masonryBox',\r\n");
      out.write("                  columnWidth: 60,\r\n");
      out.write("                  isAnimated: true,\r\n");
      out.write("                  gutter:20\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            return boxList;\r\n");
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
      out.write("        function getMemberBoxElement(index, lastLoadedCount, eventData) {\r\n");
      out.write("          \r\n");
      out.write("         //Fetch impIndex to decide the dimentions based on importance of this element box. \r\n");
      out.write("         var impIndex = eventData.impIndex;\r\n");
      out.write("          // In case no impIndex is sent with an Event\r\n");
      out.write("          if(impIndex == null || impIndex == \"\"){\r\n");
      out.write("            impIndex = getRandomImpIndex();\r\n");
      out.write("          }\r\n");
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
      out.write("          '<div id=\"dynamicBox{boxIndex}\" class=\"masonryBox community_box verticalMargin20 col{impIndex}\" style=\"background:white;\">'+\r\n");
      out.write("            '<span style=\"float:left;width:40%\">'+\r\n");
      out.write("              '<a href=\"#inline_content{boxIndex}\">'+\r\n");
      out.write("                '<img class=\"memberBoxPhoto\" src={imageSource}>'+\r\n");
      out.write("              '</a>'+\r\n");
      out.write("            '</span>'+\r\n");
      out.write("            '<p style=\"overflow:hidden;padding:5px;\">'+\r\n");
      out.write("                '{shortDesc}'+\r\n");
      out.write("            '</p>'+\r\n");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        $(function() {\r\n");
      out.write("          var availableTags = [\r\n");
      out.write("          \"Harsimranjit Singh\",\r\n");
      out.write("          \"Arvind Srivastva\",\r\n");
      out.write("          \"Jyoti Verma\",\r\n");
      out.write("          \"Anuj Garg\",\r\n");
      out.write("          \"Aarti Mukkar\",\r\n");
      out.write("          \"Rakesh Kapoor\",\r\n");
      out.write("          \"Srinivasan\",\r\n");
      out.write("          \"Ramanujan\",\r\n");
      out.write("          \"Drishti Khanna\",\r\n");
      out.write("          \"Ujwal Chawdhary\",\r\n");
      out.write("          \"Shruti Kakkar\",\r\n");
      out.write("          \"Mohit Khurana\"\r\n");
      out.write("          ];\r\n");
      out.write("          $( \"#searchMember_keyword\" ).autocomplete({\r\n");
      out.write("          source: availableTags\r\n");
      out.write("          });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.border').click(function(){\r\n");
      out.write("          //Make an ajax call here to join this particular community, and in case success is returned, execute the below code.\r\n");
      out.write("          $(this).css(\"background-color\",\"#009DDB\");\r\n");
      out.write("          $(\".joinTextStyle\", this).removeClass(\"joinTextStyle\").addClass(\"icon\").text(\".\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#uploadFileInput\").change(function() {\r\n");
      out.write("          var imgUrl = uploadSelectedFile();\r\n");
      out.write("          $(\"#cropMe\").attr(\"src\",imgUrl); \r\n");
      out.write("          $(\"#imageDrop\").css(\"display\",\"none\");\r\n");
      out.write("          $('#cropMe').Jcrop({\r\n");
      out.write("              addClass: 'jcrop-centered', // Adds 'jcrop-centered' css class on the image handled by jcrop. \r\n");
      out.write("              setSelect: [0, 160, 160, 0], // Sets a default crop selection before user clicks on image.\r\n");
      out.write("              aspectRatio: 1/1              // Adds an aspect ratio of 1:1 as we want a square selection.\r\n");
      out.write("          });\r\n");
      out.write("          $(\".inline\").colorbox.resize();\r\n");
      out.write("          $(\"#uploadImageButton\").attr(\"value\",\"Change Image\");\r\n");
      out.write("          $(\"#cropButton\").show();\r\n");
      out.write("          //$(\"#cropButton\").removeClass(\"hidden\");\r\n");
      out.write("         // $(\"#cropButton\").css(\"display\",\"block\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function uploadSelectedFile(){\r\n");
      out.write("          //perform the upload logic here and return back the server path of uploaded image(eg. images/profilePic.jpg).\r\n");
      out.write("          return \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/arvsri.png\";\r\n");
      out.write("        }\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  <!-- This contains the hidden content for modal window -->\r\n");
      out.write("  <div style=\"display:none\">\r\n");
      out.write("    <div id=\"inline_content\" class=\"lightBox\">\r\n");
      out.write("      <div class=\"crop-image-wrapper\">\r\n");
      out.write("        <img id=\"cropMe\" src=\"\" style=\"width:100%; margin:50px;\">\r\n");
      out.write("        <button id=\"imageDrop\" onclick=\"document.getElementById('uploadFileInput').click()\" title=\"Click Here\">Upload image</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"centered\">\r\n");
      out.write("        <h4>Select a portion of image above and save it as Profile picture</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"bottomBar\"  class=\"centered\">\r\n");
      out.write("\r\n");
      out.write("      <!--input id=\"uploadImage\" type=\"file\" /-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <input id=\"uploadFileInput\" type=\"file\" name=\"datafile\" size=\"40\">\r\n");
      out.write("        <input type=\"button\" value=\"Upload Image\" id=\"uploadImageButton\" class=\"blueButton smallButton\" tabindex=\"1\" onclick=\"document.getElementById('uploadFileInput').click()\"></input>\r\n");
      out.write("        <input id=\"cropButton\" type=\"button\" value=\"Save Image\" style=\"display:none;\" class=\"blueButton smallButton hidden\" ></input>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
    // /WEB-INF/views/profile.jsp(4,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/profile.jsp(4,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/profile.jsp(92,30) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${first_time_login}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                              <div style=\"float:right; padding-right:10px; position: absolute; top: 38px; right: 5px;\">\r\n");
        out.write("\t                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/CommunitySearch.html\">Skip this step</a>\r\n");
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
    // /WEB-INF/views/profile.jsp(96,31) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fremove_005f0.setVar("first_time_login");
    // /WEB-INF/views/profile.jsp(96,31) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fremove_005f0.setScope("session");
    int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
    if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
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
