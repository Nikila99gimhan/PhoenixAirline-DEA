package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class searchresultAddflight_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\"  lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Phoenix Airlines - Mange Booking</title>\n");
      out.write("        \t<!-- META DATA -->\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("\t\t<!--font-family-->\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Rufina:400,700\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t\t<!-- TITLE OF SITE -->\n");
      out.write("\t\t<title>Travel</title>\n");
      out.write("\n");
      out.write("\t\t<!-- favicon img -->\n");
      out.write("\t\t<link rel=\"shortcut icon\" type=\"image/icon\" href=\"assets/logo/favicon.png\"/>\n");
      out.write("\n");
      out.write("\t\t<!--font-awesome.min.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--animate.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/animate.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--hover.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/hover-min.css\">\n");
      out.write("\n");
      out.write("\t\t<!--datepicker.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\"  href=\"assets/css/datepicker.css\" >\n");
      out.write("\n");
      out.write("\t\t<!--owl.carousel.css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/owl.theme.default.min.css\"/>\n");
      out.write("\n");
      out.write("\t\t<!-- range css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/jquery-ui.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--bootstrap.min.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- bootsnav -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/bootsnav.css\"/>\n");
      out.write("\n");
      out.write("\t\t<!--style.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/style.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--responsive.css-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/responsive.css\" />\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("                <!-- main-menu Start -->\n");
      out.write("                <header class=\"top-area\">\n");
      out.write("                    <div class=\"header-area\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("                                    <div class=\"logo\">\n");
      out.write("                                        <a href=\"index.html\">\n");
      out.write("                                            Pheonix<span>Airlines</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div><!-- /.logo-->\n");
      out.write("                                </div><!-- /.col-->\n");
      out.write("                               \n");
      out.write("                            </div><!-- /.row -->\n");
      out.write("                            <div class=\"home-border\"></div><!-- /.home-border-->\n");
      out.write("                        </div><!-- /.container-->\n");
      out.write("                    </div><!-- /.header-area -->\n");
      out.write("        \n");
      out.write("                </header><!-- /.top-area-->\n");
      out.write("                <!-- main-menu End -->\n");
      out.write("        \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                <!--about-us start -->\n");
      out.write("                <section id=\"home\" class=\"about-us\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"about-us-content\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <div class=\"single-about-us\">\n");
      out.write("                                        <div class=\"about-us-txt\">\n");
      out.write("                                            <center>\n");
      out.write("                                            <h3>\n");
      out.write("                                                Search Results \n");
      out.write("                                            </h3>\n");
      out.write("                                            </center>\n");
      out.write("                                           \n");
      out.write("                                        </div>\n");
      out.write("<table class=\"table table-striped table-dark\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("     \n");
      out.write("      <th scope=\"col\">Flight ID</th>\n");
      out.write("      <th scope=\"col\">Departure Date</th>\n");
      out.write("      <th scope=\"col\">Return Date</th>\n");
      out.write("      <th scope=\"col\">From</th>\n");
      out.write("      <th scope=\"col\">To</th>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    ");

        String flightid = request.getParameter("flightID");
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenix_airline","root","");
            String sql = "SELECT * FROM flight where flight_no ='"+flightid+"'  " ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            
            
            while(rs.next())
            
            {
                
           
       
        
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      \n");
      out.write("      <td>");
      out.print(rs.getString("flight_no"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("departure"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("returnd"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("airport"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("destination"));
      out.write("</td>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      ");

          }
}catch (Exception ex)
{
ex.printStackTrace();

}
          
      
      
      
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  \n");
      out.write("          \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("       </div>\n");
      out.write("                                    <div class=\"about-btn\">\n");
      out.write("                                        <button  onclick=\"window.location.href='./DashbordGradeOne.jsp'\"  class=\"about-view\">\n");
      out.write("                                                    Back\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                </div><!--/.col-->\n");
      out.write("                                <div class=\"col-sm-0\">\n");
      out.write("                                    <div class=\"single-about-us\">\n");
      out.write("                                        \n");
      out.write("                                    </div><!--/.single-about-us-->\n");
      out.write("                                </div><!--/.col-->\n");
      out.write("                            </div><!--/.row-->\n");
      out.write("                        </div><!--/.about-us-content-->\n");
      out.write("                    </div><!--/.container-->\n");
      out.write("        \n");
      out.write("                </section><!--/.about-us-->\n");
      out.write("                <!--about-us end -->\n");
      out.write("\n");
      out.write("                <!-- footer-copyright start -->\n");
      out.write("<footer  class=\"footer-copyright\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"single-footer-item\">\n");
      out.write("                        <div class=\"footer-logo\">\n");
      out.write("                            <a href=\"index.html\">\n");
      out.write("                                tour<span>Nest</span>\n");
      out.write("                            </a>\n");
      out.write("                            <p>\n");
      out.write("                                best travel agency\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.single-footer-item-->\n");
      out.write("                </div><!--/.col-->\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"single-footer-item\">\n");
      out.write("                        <h2>link</h2>\n");
      out.write("                        <div class=\"single-footer-txt\">\n");
      out.write("                            <p><a href=\"#\">home</a></p>\n");
      out.write("                            <p><a href=\"#\">destination</a></p>\n");
      out.write("                            <p><a href=\"#\">spacial packages</a></p>\n");
      out.write("                            <p><a href=\"#\">special offers</a></p>\n");
      out.write("                            <p><a href=\"#\">blog</a></p>\n");
      out.write("                            <p><a href=\"#\">contacts</a></p>\n");
      out.write("                        </div><!--/.single-footer-txt-->\n");
      out.write("                    </div><!--/.single-footer-item-->\n");
      out.write("\n");
      out.write("                </div><!--/.col-->\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"single-footer-item\">\n");
      out.write("                        <h2>popular destination</h2>\n");
      out.write("                        <div class=\"single-footer-txt\">\n");
      out.write("                            <p><a href=\"#\">china</a></p>\n");
      out.write("                            <p><a href=\"#\">venezuela</a></p>\n");
      out.write("                            <p><a href=\"#\">brazil</a></p>\n");
      out.write("                            <p><a href=\"#\">australia</a></p>\n");
      out.write("                            <p><a href=\"#\">london</a></p>\n");
      out.write("                        </div><!--/.single-footer-txt-->\n");
      out.write("                    </div><!--/.single-footer-item-->\n");
      out.write("                </div><!--/.col-->\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"single-footer-item text-center\">\n");
      out.write("                        <h2 class=\"text-left\">contacts</h2>\n");
      out.write("                        <div class=\"single-footer-txt text-left\">\n");
      out.write("                            <p>+1 (300) 1234 6543</p>\n");
      out.write("                            <p class=\"foot-email\"><a href=\"#\">info@tnest.com</a></p>\n");
      out.write("                            <p>North Warnner Park 336/A</p>\n");
      out.write("                            <p>Newyork, USA</p>\n");
      out.write("                        </div><!--/.single-footer-txt-->\n");
      out.write("                    </div><!--/.single-footer-item-->\n");
      out.write("                </div><!--/.col-->\n");
      out.write("\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("        </div><!--/.footer-content-->\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"foot-icons \">\n");
      out.write("            <ul class=\"footer-social-links list-inline list-unstyled\">\n");
      out.write("                <li><a href=\"#\" target=\"_blank\" class=\"foot-icon-bg-1\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                <li><a href=\"#\" target=\"_blank\" class=\"foot-icon-bg-2\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                <li><a href=\"#\" target=\"_blank\" class=\"foot-icon-bg-3\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <p>&copy; 2017 <a href=\"https://www.themesine.com\">ThemeSINE</a>. All Right Reserved</p>\n");
      out.write("\n");
      out.write("        </div><!--/.foot-icons-->\n");
      out.write("        <div id=\"scroll-Top\">\n");
      out.write("            <i class=\"fa fa-angle-double-up return-to-top\" id=\"scroll-top\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"\" data-original-title=\"Back to Top\" aria-hidden=\"true\"></i>\n");
      out.write("        </div><!--/.scroll-Top-->\n");
      out.write("    </div><!-- /.container-->\n");
      out.write("\n");
      out.write("</footer><!-- /.footer-copyright-->\n");
      out.write("<!-- footer-copyright end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("\t\t<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("\n");
      out.write("\t\t<!--modernizr.min.js-->\n");
      out.write("\t\t<script  src=\"https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!--bootstrap.min.js-->\n");
      out.write("\t\t<script  src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- bootsnav js -->\n");
      out.write("\t\t<script src=\"assets/js/bootsnav.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- jquery.filterizr.min.js -->\n");
      out.write("\t\t<script src=\"assets/js/jquery.filterizr.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<script  src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!--jquery-ui.min.js-->\n");
      out.write("        <script src=\"assets/js/jquery-ui.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- counter js -->\n");
      out.write("\t\t<script src=\"assets/js/jquery.counterup.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/waypoints.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!--owl.carousel.js-->\n");
      out.write("        <script  src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- jquery.sticky.js -->\n");
      out.write("\t\t<script src=\"assets/js/jquery.sticky.js\"></script>\n");
      out.write("\n");
      out.write("        <!--datepicker.js-->\n");
      out.write("        <script  src=\"assets/js/datepicker.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!--Custom JS-->\n");
      out.write("\t\t<script src=\"assets/js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
