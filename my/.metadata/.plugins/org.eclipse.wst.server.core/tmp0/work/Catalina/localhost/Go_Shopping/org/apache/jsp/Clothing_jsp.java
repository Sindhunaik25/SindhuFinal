/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2018-12-08 07:26:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Clothing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <style>\r\n");
      out.write("    .header{\r\n");
      out.write("        font-family: 'Lucida Sans';\r\n");
      out.write("        color: darkred;\r\n");
      out.write("        font-size: 50px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .table{\r\n");
      out.write("        max-height: 60%;\r\n");
      out.write("        max-width: 80%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .td{\r\n");
      out.write("text-align: center;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write(".Clothing{\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("    background-color:lightblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style></head>\r\n");
      out.write("<header><center><h1>\r\n");
      out.write("        Clothing  \r\n");
      out.write("</h1>  </center>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write(" <div class=\"Clothing\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\" align=\"center\" >\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    <td >\r\n");
      out.write("  <a href=\"cart.html\"><img src=\"pics/k7.jpg\" width=\"400\" height=\"400\">\r\n");
      out.write("   </a> </td>\r\n");
      out.write("   \r\n");
      out.write("    <td> <a href=\"cart.html\"><img src=\"pics/k6.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><center>\r\n");
      out.write("        Cost:Rs.1000\r\n");
      out.write("    </center></td>\r\n");
      out.write("   \r\n");
      out.write("            <td><center>\r\n");
      out.write("                Cost:Rs.1250\r\n");
      out.write("            </center></td>\r\n");
      out.write("    \r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("        <td>\r\n");
      out.write("                <a href=\"cart.html\">    <img src=\"pics/kurti1.jpeg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td><a href=\"cart.html\"><img src=\"pics/kurti2.jpeg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("            <td><center>\r\n");
      out.write("                Cost:Rs.700\r\n");
      out.write("            </center></td>\r\n");
      out.write("           \r\n");
      out.write("                    <td><center>\r\n");
      out.write("                        Cost:Rs.670\r\n");
      out.write("                    </center></td>\r\n");
      out.write("            \r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("    <tr>\r\n");
      out.write("            <td><a href=\"cart.html\">\r\n");
      out.write("                <img src=\"pics/top3.jpg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td><a href=\"cart.html\"><img src=\"pics/s1.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("                <td><center>\r\n");
      out.write("                    Cost:Rs.1799\r\n");
      out.write("                </center></td>\r\n");
      out.write("               \r\n");
      out.write("                        <td><center>\r\n");
      out.write("                            Cost:Rs.499\r\n");
      out.write("                        </center></td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("                <td><a href=\"cart.html\">\r\n");
      out.write("                    <img src=\"pics/jeans1.jpg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td><a href=\"cart.html\"><img src=\"pics/jeans2.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                    <td><center>\r\n");
      out.write("                        Cost:Rs.1999\r\n");
      out.write("                    </center></td>\r\n");
      out.write("                   \r\n");
      out.write("                            <td><center>\r\n");
      out.write("                                Cost:Rs.1299\r\n");
      out.write("                            </center></td>\r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("            <tr>\r\n");
      out.write("                    <td><a href=\"cart.html\">\r\n");
      out.write("                        <img src=\"pics/k5.jpg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><a href=\"cart.html\"><img src=\"pics/k4.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                        <td><center>\r\n");
      out.write("                            Cost:Rs.399\r\n");
      out.write("                        </center></td>\r\n");
      out.write("                       \r\n");
      out.write("                                <td><center>\r\n");
      out.write("                                    Cost:Rs.399\r\n");
      out.write("                                </center></td>\r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                <tr>\r\n");
      out.write("                        <td><a href=\"cart.html\">\r\n");
      out.write("                            <img src=\"pics/k13.jpg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td><a href=\"cart.html\"><img src=\"pics/k14.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                            <td><center>\r\n");
      out.write("                                Cost:Rs.1000\r\n");
      out.write("                            </center></td>\r\n");
      out.write("                           \r\n");
      out.write("                                    <td><center>\r\n");
      out.write("                                        Cost:Rs.1167\r\n");
      out.write("                                    </center></td>\r\n");
      out.write("                            \r\n");
      out.write("                        </tr>\r\n");
      out.write("                       \r\n");
      out.write("                            \r\n");
      out.write("                    <tr>\r\n");
      out.write("                            <td><a href=\"cart.html\">\r\n");
      out.write("                                <img src=\"pics/j3.jpg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td><a href=\"cart.html\"><img src=\"pics/j4.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                                <td><center>\r\n");
      out.write("                                    Cost:Rs.999\r\n");
      out.write("                                </center></td>\r\n");
      out.write("                               \r\n");
      out.write("                                        <td><center>\r\n");
      out.write("                                            Cost:Rs.999\r\n");
      out.write("                                        </center></td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                        <tr>\r\n");
      out.write("                                <td><a href=\"cart.html\">\r\n");
      out.write("                                    <img src=\"pics/s10.jpg\" width=\"400\" height=\"400\"></a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td><a href=\"cart.html\"><img src=\"pics/s11.jpg\" width=\"400\" height=\"400\"></a></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                    <td><center>\r\n");
      out.write("                                        Cost:Rs.1999\r\n");
      out.write("                                    </center></td>\r\n");
      out.write("                                   \r\n");
      out.write("                                            <td><center>\r\n");
      out.write("                                                Cost:Rs.2100\r\n");
      out.write("                                            </center></td>\r\n");
      out.write("                                    \r\n");
      out.write("                                </tr>\r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
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
