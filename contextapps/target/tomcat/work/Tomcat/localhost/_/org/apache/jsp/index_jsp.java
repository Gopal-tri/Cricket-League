/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-16 11:53:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<title>Duke : Soccer League App</title>\r\n");
      out.write("</head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<title>Duke's Soccer League: Home</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: Verdana, sans-serif;\r\n");
      out.write("\tmargin: 0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mySlides {\r\n");
      out.write("\tdisplay: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Slideshow container */\r\n");
      out.write(".slideshow-container {\r\n");
      out.write("\tmax-width: 1000px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Next & previous buttons */\r\n");
      out.write(".prev, .next {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\tpadding: 16px;\r\n");
      out.write("\tmargin-top: -22px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\ttransition: 0.6s ease;\r\n");
      out.write("\tborder-radius: 0 3px 3px 0;\r\n");
      out.write("\tuser-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Position the \"next button\" to the right */\r\n");
      out.write(".next {\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\tborder-radius: 3px 0 0 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On hover, add a black background color with a little bit see-through */\r\n");
      out.write(".prev:hover, .next:hover {\r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, 0.8);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Caption text */\r\n");
      out.write(".text {\r\n");
      out.write("\tcolor: #f2f2f2;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tpadding: 8px 12px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 8px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Number text (1/3 etc) */\r\n");
      out.write(".numbertext {\r\n");
      out.write("\tcolor: #f2f2f2;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tpadding: 8px 12px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("/* The dots/bullets/indicators */\r\n");
      out.write(".dot {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\theight: 15px;\r\n");
      out.write("\twidth: 15px;\r\n");
      out.write("\tmargin: 0 2px;\r\n");
      out.write("\tbackground-color: #bbb;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\ttransition: background-color 0.6s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active, .dot:hover {\r\n");
      out.write("\tbackground-color: #717171;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Fading animation */\r\n");
      out.write(".fade {\r\n");
      out.write("\t-webkit-animation-name: fade;\r\n");
      out.write("\t-webkit-animation-duration: 1.5s;\r\n");
      out.write("\tanimation-name: fade;\r\n");
      out.write("\tanimation-duration: 1.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@\r\n");
      out.write("-webkit-keyframes fade {\r\n");
      out.write("\tfrom {opacity: .4\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("\topacity: 1\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("@\r\n");
      out.write("keyframes fade {\r\n");
      out.write("\tfrom {opacity: .4\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("\topacity: 1\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On smaller screens, decrease text size */\r\n");
      out.write("@media only screen and (max-width: 300px) {\r\n");
      out.write("\t.prev, .next, .text {\r\n");
      out.write("\t\tfont-size: 11px\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/menu.jsp", out, false);
      out.write("</div>\r\n");
      out.write("\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/slider.jsp", out, false);
      out.write("</div>\r\n");
      out.write("\t<p>This is the Home page for Cricket IPL.</p>\r\n");
      out.write("\r\n");
      out.write("\t<h3>Players</h3>\r\n");
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href='/views/listleague.jsp'>List all leagues</a></li>\r\n");
      out.write("\t\t<li><a href='/views/registerleague.jsp'>Register for a league\r\n");
      out.write("\t\t\t\t(TBA)</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t<h3>League Administrator</h3>\r\n");
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href='/views/addleague.jsp'>Add a new league</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
