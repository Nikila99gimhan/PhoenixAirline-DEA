package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class StaffTwo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("    <meta name=\"generator\" content=\"Jekyll v4.1.1\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.5/examples/dashboard/\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"assetsD/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"dashboard.css\" rel=\"stylesheet\">\n");
      out.write("                <title>staff Grade Two Dashboard</title>\n");
      out.write("\n");
      out.write("\t</head>        \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <nav class=\"navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow\">\n");
      out.write("  <a class=\"navbar-brand col-md-3 col-lg-2 mr-0 px-3\" href=\"#\">Phoenix Airlines</a>\n");
      out.write("  <button class=\"navbar-toggler position-absolute d-md-none collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#sidebarMenu\" aria-controls=\"sidebarMenu\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("<!--  <input class=\"form-control form-control-dark w-100\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">-->\n");
      out.write("\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      \n");
      out.write("   \n");
      out.write("    </ul>\n");
      out.write("<ul class=\"navbar-nav \">\n");
      out.write("       \n");
      out.write("   \n");
      out.write("    </ul>\n");
      out.write("<ul class=\"navbar-nav \">\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("<ul class=\"navbar-nav\">\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("  <ul class=\"navbar-nav\">\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("<ul class=\"navbar-nav\">\n");
      out.write("    <li>\n");
      out.write("      <a class=\"nav-link\" href=\"home.jsp\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write(" <ul class=\"navbar-nav px-5 \">\n");
      out.write("        <li class=\"nav-item text-nowrap\">\n");
      out.write("            <a class=\"nav-link\"  href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("   \n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<ul class=\"navbar-nav px-5\">\n");
      out.write("    <li>\n");
      out.write("      <a class=\"nav-link\" href=\"Login.jsp\">Sign out</a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <nav id=\"sidebarMenu\" class=\"col-md-3 col-lg-2 d-md-block bg-light sidebar collapse\">\n");
      out.write("      <div class=\"sidebar-sticky pt-3\">\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"#\">\n");
      out.write("              <span data-feather=\"home\"></span>\n");
      out.write("              Dashboard <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#addFlights\">\n");
      out.write("              <span data-feather=\"send\"></span>\n");
      out.write("              Add Flights\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#searchflght\">\n");
      out.write("              <span data-feather=\"search\"></span>\n");
      out.write("              Search Flights\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#searchClient\">\n");
      out.write("              <span data-feather=\"refresh-ccw\"></span>\n");
      out.write("              Search Client\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#searchTicket\">\n");
      out.write("              <span data-feather=\"search\"></span>\n");
      out.write("              Search Ticket\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("   </div>\n");
      out.write(" \n");
      out.write("    <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-md-4\">\n");
      out.write("      <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\n");
      out.write("        <h1 class=\"h2\">staff Grade Two Dashboard</h1>\n");
      out.write("        <div class=\"btn-toolbar mb-2 mb-md-0\">\n");
      out.write("          <div class=\"btn-group mr-2\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("       <div id=\"addFlights\">\n");
      out.write("      <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("           <div class=\"table-responsive\">\n");
      out.write("               <h1>Add Flights</h1>\n");
      out.write("                 \n");
      out.write("        <form action=\"AddFlight\">\n");
      out.write("            <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Flight Number</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"FlightNumber\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Departure</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"departure\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <label>departure airport</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"depAirport\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <label>destination</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"destination\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>return</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"return\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Economical Class seats</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"ecoSeats\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Business Class seats</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"BuisSeats\" value=\"\" class=\"form-control\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\"  value=\"Add Flight\" class=\"btn btn-sm btn-outline-secondary\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div id=\"searchflght\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("         <h1>Search Flights</h1>\n");
      out.write("          <form action=\"ViewAllFlights\"><button class=\"btn btn-sm btn-outline-secondary\">View all Flights</button ></form>\n");
      out.write("          </br>\n");
      out.write("          \n");
      out.write("         <form action=\"SearchFlights\">\n");
      out.write("            \n");
      out.write("             <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("                 \n");
      out.write("                 <tbody>\n");
      out.write("                     \n");
      out.write("                     <tr>\n");
      out.write("                         <td>search by ID</td>\n");
      out.write("                         <td><input type=\"text\" name=\"FlightId\" class=\"form-control\"/></td>\n");
      out.write("                         <td><input type=\"submit\" value=\"Search\" class=\"btn btn-sm btn-outline-secondary\"/></td>\n");
      out.write("                     </tr>\n");
      out.write("                    \n");
      out.write("                 </tbody>\n");
      out.write("             </table>\n");
      out.write("\n");
      out.write("             \n");
      out.write("         </form>\n");
      out.write("          \n");
      out.write("          <h1>Flight Search Results</h1>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("                 \n");
      out.write("        <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Flight Number</th>\n");
      out.write("                    <th>Departure</th>\n");
      out.write("                    <th>Return</th>\n");
      out.write("                    <th>Airport</th>\n");
      out.write("                    <th>Destination</th>\n");
      out.write("                    <th>Economy Seats</th>\n");
      out.write("                    <th>Business seats</th>\n");
      out.write("                </tr>  \n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("        \n");
      out.write("        ");

                    
                    try {
                        List flightResults = (List) request.getAttribute("flightresult");
                        //Iterator it = results.iterator();
                        for (Object flight : flightResults) {
                
      out.write(" <tr>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(0));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(1));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(2));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(3));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(4));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(5));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) flight).get(6));
      out.write("</td>\n");
      out.write("                  </tr> \n");
      out.write("                         \n");
      out.write("                  ");

                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                
      out.write(" \n");
      out.write("                \n");
      out.write("                </tbody>\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("       </div>   \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"searchClient\">\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("           <div class=\"table-responsive\">\n");
      out.write("             <h1>Search Clients</h1>\n");
      out.write("                <form action=\"ViewAllUsers\"><button class=\"btn btn-sm btn-outline-secondary\">View all Users</button></form>\n");
      out.write("                 </br>\n");
      out.write("                <form action=\"SearchUser\">\n");
      out.write("                    <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("                        <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>search by ID</td>\n");
      out.write("                         <td><input type=\"text\" name=\"UserId\" class=\"form-control\"/></td>\n");
      out.write("                         <td><input type=\"submit\" value=\"Search\" class=\"btn btn-sm btn-outline-secondary\" /></td>\n");
      out.write("                     </tr>\n");
      out.write("                    \n");
      out.write("                         </tbody>\n");
      out.write("             </table>\n");
      out.write("\n");
      out.write("             \n");
      out.write("         </form>\n");
      out.write("        \n");
      out.write("           <h1>Client Search Results</h1>   \n");
      out.write("            <table border=\"0\" class=\"table table-striped table-sm\" >\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>User ID</th>\n");
      out.write("                    <th>First name</th>\n");
      out.write("                    <th>Last Name</th>\n");
      out.write("                    <th>User Type</th>\n");
      out.write("                </tr>  \n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");

                    int UID;
                    try {
                        List results = (List) request.getAttribute("usertResult");
                        //Iterator it = results.iterator();
                        for (Object user : results) {
                
      out.write(" <tr>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(0));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(1));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(2));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(3));
      out.write("</td>\n");
      out.write("                </tr> ");

                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                
      out.write(" \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("             \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("       <br>\n");
      out.write("       <br>\n");
      out.write("         \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("     \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("          <br>\n");
      out.write("            <br>          \n");
      out.write("                    \n");
      out.write("     <div id=\"searchTicket\">\n");
      out.write("         <br>\n");
      out.write("        <br>\n");
      out.write("       <div class=\"table-responsive\">\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("            \n");
      out.write("             <br>\n");
      out.write("            <br>\n");
      out.write("    </main>\n");
      out.write("   </div>  \n");
      out.write(" \n");
      out.write("\n");
      out.write("<script src=\"jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("      <script>window.jQuery || document.write('<script src=\"assets/js/vendor/jquery.slim.min.js\"><\\/script>');</script><script src=\"assetsD/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"feather.min.js\"></script>\n");
      out.write("        <script src=\"Chart.min.js\"></script>\n");
      out.write("        <script src=\"dashboard.js\"></script>\n");
      out.write(" </body>\n");
      out.write("                \n");
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
