package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>anucana | reserve your seat</title>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/anucana_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/favicon.ico\" />\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#personalInfoDiv{\r\n");
      out.write("\t\t\ttext-align:left; \r\n");
      out.write("\t\t\twidth:100%; \r\n");
      out.write("\t\t\tfloat:left;\r\n");
      out.write("\t\t\tpadding-left:20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#personalInfoTable tr td{\r\n");
      out.write("\t\t  padding: 4px;\r\n");
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
      out.write("\t<div id=\"anucana_outer_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("\t\t<div id=\"anucana_wrapper\" class=\"wrapper_1020\">\r\n");
      out.write("          <div id=\"anucana_main\">\r\n");
      out.write("            <div id=\"grey_wrapper\" class=\"greyLinen_background\">\r\n");
      out.write("                <div style=\"margin-top:10px;\">\r\n");
      out.write("\r\n");
      out.write("                  <div id=\"checkoutAccordion\">\r\n");
      out.write("\t\t\t\t\t  <div id=\"signUpAcc\">\r\n");
      out.write("\t\t\t\t\t\t  <h3 class=\"blueHeader14\"><a href=\"#\" id=\"signInLink\">Step 1 - Booking Details</a></h3>\r\n");
      out.write("                          <div id=\"personalInfoAccordian\">\r\n");
      out.write("                              <div id=\"personalInfoDiv\">\r\n");
      out.write("                                <table id=\"personalInfoTable\">\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Name</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>Arvind Srivastava</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Email</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>arvinds_friend@yahoo.co.in</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Phone</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div><input type=\"text\" value=\"9650733522\" /><input type=\"checkbox\" name=\"updatePhone\" checked=\"checked\" value=\"updatePhone\" /> Update this on my profile</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Community</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"community\" id=\"community\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Java Community</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Linux Community</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\" selected>Spring Framework</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\">Hibernate Community</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Event</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"event\" id=\"event\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Spring MVN</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Spring AOP</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\" selected>Spring Batch</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Number of seats</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"numberOfSeats\" id=\"numberOfSeats\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\" selected>1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                                <input style=\"margin-top:10px;\" class=\"blueButton bigButton\" type=\"button\" value=\"Book my seat\" tabindex=\"4\" />\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                          <h3 class=\"blueHeader14\"><a href=\"#\">Step 2 - Payment</a></h3>\r\n");
      out.write("\r\n");
      out.write("                          <div>\r\n");
      out.write("\r\n");
      out.write("                            <div style=\"text-align:left; width:50%; float:left;padding-left:20px;\">\r\n");
      out.write("                                <table id=\"ticketSummaryTable\">\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Event</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>Relics of PHP</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Venue</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>Anucana Bhavan, 7 Race Course Road</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Date</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>07-May-2014</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Time</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>10:30am</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Duration</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>180 min</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Seats</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td>1</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th>Total</th>\r\n");
      out.write("                                    <td>:</td>\r\n");
      out.write("                                    <td id=\"payAmount\">Rs. 1000.00</td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr id=\"discountRow\" style=\"display:none;\">\r\n");
      out.write("                                    <th></th>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td>Rs. 800.00 \r\n");
      out.write("                                      <span class=\"roundedCorners\" style=\"background-color:#6FBA54; color:#FFFFFF; padding:3px; margin-left:5px;\">\r\n");
      out.write("                                        <span class=\"webSymbol\">&nbsp;.</span> 20% discount applied&nbsp;\r\n");
      out.write("                                      </span>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              \r\n");
      out.write("\t\t\t\t\t\t\t  <div style=\"width:45%; float:right;\" id=\"bookingSummaryRightBlock\">\r\n");
      out.write("                                <table>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td style=\"padding-top:0px;\"><img class=\"photo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/featured_project.jpg\" /></td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                      <label for=\"couponCode\">Apply Coupon :</label>\r\n");
      out.write("                                      <input id=\"couponCode\" type=\"text\" placeholder=\"Enter Coupon Code\"/>\r\n");
      out.write("                                      <input id=\"applyCouponCode\" type=\"button\" class=\"blueButton verySmallButton\" value=\"Apply\" />\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr ><td><div style=\"color:#FF614D;\">This Coupon Code is Expired.</div></td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                              </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  <div  style=\"margin-top=50px; width:100%; float:left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"payment-tabs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#payment-tabs-1\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/payments/payu_money.png\"></img></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"payment-tabs-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Pay using <a href=\"https://www.payumoney.com/\">PayU Money</a>. Its easy, safe and fast.</p> <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentsBaseURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/payments/pay_modes.png\"></img>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Net payable amount : Rs. 1000</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input style=\"margin-top:10px;\" id=\"paymentSubmit\" class=\"blueButton bigButton\" type=\"button\" value=\"Pay Now\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- end of grey_wrapper -->\r\n");
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
      out.write("/unmanaged/contactUs\">Contact Us</a><br /><br />\r\n");
      out.write("    Copyright © 2048 <a href=\"#\">Your Company Name</a> | Designed by <a href=\"http://www.anucana.com\" target=\"_parent\">Anucana Designers</a>         \r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </div> <!-- end of anucana_wrapper -->\r\n");
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
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("        $(function() {\r\n");
      out.write("            var $acc = $(\"#checkoutAccordion > div\").accordion({ header: \"> h3\", \r\n");
      out.write("              collapsible: false, \r\n");
      out.write("              active: false, \r\n");
      out.write("              heightStyle: \"content\",\r\n");
      out.write("\t\t\t  beforeActivate: function (event, ui) {\r\n");
      out.write("\t\t        if($(event.currentTarget).attr('id') == 0){\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t         }\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"select\").on(\"change\",function(){\r\n");
      out.write("\t\t\t$(\".bookingSummary\").attr(\"id\",0);\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("        $('#applyCouponCode').click(function(){\r\n");
      out.write("          //Make an ajax call here to apply coupon code, and in case success is returned, display the discounted price else show error.\r\n");
      out.write("          $(\"#payAmount\").css(\"text-decoration\",\"line-through\");\r\n");
      out.write("          $(\"#discountRow\").show();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\t\t $(function() {\r\n");
      out.write("\t\t\t$(\"#payment-tabs\").tabs();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("  </script>\r\n");
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
    // /WEB-INF/views/bookEvent.jsp(8,0) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005feval_005f0.setExpression("@propertyConfigurer.getProperty('config.baseurl.contents')");
    // /WEB-INF/views/bookEvent.jsp(8,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
