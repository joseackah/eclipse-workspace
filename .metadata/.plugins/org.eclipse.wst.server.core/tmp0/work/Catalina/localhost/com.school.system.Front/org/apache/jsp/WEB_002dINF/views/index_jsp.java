/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-07-29 18:02:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("a:link{\r\n");
      out.write("color: red;\r\n");
      out.write("}\r\n");
      out.write("a:visited{\r\n");
      out.write("color: green;\r\n");
      out.write("}\r\n");
      out.write("li:hover{\r\n");
      out.write("background-color: green;\r\n");
      out.write("transition: 5s;\r\n");
      out.write("color: red;\r\n");
      out.write("}\r\n");
      out.write(".article{\r\n");
      out.write("padding: 2em;\r\n");
      out.write("color: white;\r\n");
      out.write("animation: mymove 5s infinite;\r\n");
      out.write("position: relative;\r\n");
      out.write("}\r\n");
      out.write("@keyframes mymove{\r\n");
      out.write("from{background-color: red;\r\n");
      out.write("}\r\n");
      out.write("to{background-color: blue;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("h3:before{\r\n");
      out.write("content: '\\260E';}\r\n");
      out.write("\r\n");
      out.write(".aside{\r\n");
      out.write("padding: 2em;\r\n");
      out.write("color: white;\r\n");
      out.write("position: relative;\r\n");
      out.write("animation-name: myaside;\r\n");
      out.write("animation: myaside 6s infinite;\r\n");
      out.write("}\r\n");
      out.write("@keyframes myaside{\r\n");
      out.write("from{background-color: green;}\r\n");
      out.write("to {background-color: rgb(145,74,152);}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/index.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>HOME</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"body\" style=\"background-color:gold;\">\r\n");
      out.write(" <div id='firstHeader' class='firstHeader' name='firstHeader'>\r\n");
      out.write("        \r\n");
      out.write("        <h1 style=\"text-align:center; font-size: 80px;\"><ins>Bernice's International Preparatory School <p>(<abbr title=\"Bernice's International Preparatory School\">BIPS</abbr>)</p></ins></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/general/logIn\">ADMIN</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/general/teacherLogin\">TEACHER</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/general/parentLogin\">PARENT</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br />\r\n");
      out.write("<h1 style='text-align: center; font-size: 70px;'>Welcome to Bernice's Preparatory School Website</h1>\r\n");
      out.write("<br/> <br/>\r\n");
      out.write(" <p style=\"text-align:center\"> <h2 style=\"text-align:center\" >  </h2></p> <br /> <br />\r\n");
      out.write(" \r\n");
      out.write(" <section style=\"display:flex-center; width:100%; text-align:center;\">\r\n");
      out.write(" <article class=\"article\" style=\"display:;display:inline-block; width:40%; border: 1px solid green; background-color:red;\">\r\n");
      out.write("  <header style=\"display:center;\"> <h1 style=\"text-align:center;\"> <ins> Our Vision</ins></h1> <br/>\r\n");
      out.write("   <p  style=\"padding: 5px; margin: 10px;\"><h2> Our vision is to develop well rounded, confident and responsible individuals who aspire to achieve their full potential. We will do this by providing a welcoming, happy, safe, and supportive learning environment in which everyone is equal and all achievements are celebrated. </h2></p> <br/>\r\n");
      out.write("</header> \r\n");
      out.write("</article><br /> <br /><br /> <br /><br /> <br /><br /> <br />\r\n");
      out.write("<aside class=\"aside\" style=\"display:inline-block; width:40%; background-color:green;  height: 50%;\" >\r\n");
      out.write("<article >\r\n");
      out.write("\r\n");
      out.write("<header> <h2> <ins> Our Mission</ins></h2></header> <br/>\r\n");
      out.write("<h2> <p style=\"padding: 10px; margin: 10px;\"> We are dedicated to a continuing tradition of excellence in an ever-changing world. Within a safe and supportive environment, we provide a relevant, high-quality education and prepare our diverse student body for future endeavors. We honor achievement and promote pride in ourselves, in our school, and in our community. </p></h2>\r\n");
      out.write("</article>\r\n");
      out.write("</aside>\r\n");
      out.write("</section>\r\n");
      out.write("<br /> <br/> <br/>\r\n");
      out.write("\r\n");
      out.write("<footer id=\"mainFooter\"  style=\"text-align:center; color:white; align-content:center; background-color:rgb(23, 45, 67); width:85%; margin:50px; margin-left:90px; padding: 50px; justify: center;\">\r\n");
      out.write("<h3>Contact Us: 0207173313</h3>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}