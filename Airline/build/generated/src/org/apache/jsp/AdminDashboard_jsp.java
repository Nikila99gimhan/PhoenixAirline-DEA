package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Admin.User;
import java.util.ArrayList;
import java.util.List;

public final class AdminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("\t<head>\n");
      out.write("             ");

            String userid=(String)session.getAttribute("name");
            if(userid==null)
            {
                response.sendRedirect("Login.jsp");
                return;
            }
            
      out.write("\n");
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
      out.write("             Admin Dashboard <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#manageUsers\">\n");
      out.write("              <span data-feather=\"user\"></span>\n");
      out.write("              Manage Users\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#searchflght\">\n");
      out.write("              <span data-feather=\"search\"></span>\n");
      out.write("              Search Flight details\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#searchTickets\">\n");
      out.write("              <span data-feather=\"search\"></span>\n");
      out.write("              Search Ticket Details\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#userActivity\">\n");
      out.write("              <span data-feather=\"send\"></span>\n");
      out.write("             User Activity\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#updateuser\">\n");
      out.write("              <span data-feather=\"user\"></span>\n");
      out.write("             Update User\n");
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
      out.write("        <h1 class=\"h2\">Admin Dashboard</h1>\n");
      out.write("        <div class=\"btn-toolbar mb-2 mb-md-0\">\n");
      out.write("          <div class=\"btn-group mr-2\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("        <div id=\"manageUsers\">\n");
      out.write("         \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("          <h2>View Users</h2>\n");
      out.write("        ");
 String userType = "All";
        try{
              userType = request.getAttribute("userType").toString();
        }catch (Exception e) {
                        System.out.println("");
        }
       
        
        
        
      out.write("\n");
      out.write("        <form action=\"FilterUsers\" id=\"userType\">\n");
      out.write("\n");
      out.write("            <label>Filter users</label>\n");
      out.write("            <select name=\"userType\" class=\"btn btn-sm btn-outline-secondary dropdown-toggle\" >\n");
      out.write("                ");
 if (userType.equals("All")) { 
      out.write("\n");
      out.write("                <option selected value=\"All\">All</option>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                <option value=\"All\">All</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                ");
 if (userType.equals("Clients")) { 
      out.write("\n");
      out.write("                <option selected value=\"Clients\">Clients</option>\n");
      out.write("                ");
 } else { 
      out.write(" \n");
      out.write("                <option value=\"Clients\">Clients</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 if (userType.equals("Staff01")) { 
      out.write("\n");
      out.write("                <option selected value=\"Staff01\">Staff01</option>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                <option value=\"Staff01\">Staff01</option>\n");
      out.write("\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 if (userType.equals("Staff02")) { 
      out.write("\n");
      out.write("                <option selected value=\"Staff02\">Staff02</option>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                <option  value=\"Staff02\">Staff02</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Search\" class=\"btn btn-sm btn-outline-secondary\"/>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("        <h2>Search Results</h2>\n");
      out.write("        <table border=\"0\" class=\"table table-striped table-sm\">\n");
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
                        List results = (List) request.getAttribute("result");
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
      out.write("\n");
      out.write("                        <form action=\"UserProfile\"><button value=\"");
out.println(((ArrayList) user).get(0));
      out.write("\" class=\"btn btn-sm btn-outline-secondary\" name=\"UID\">View Profile</button></form></td>\n");
      out.write("                </tr> ");

                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                
      out.write(" \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("             ");

                    try {
                      
                        User user=(User)request.getAttribute("userdetails");
                        
                       
                          
      out.write("\n");
      out.write("        <h2>User Profile :");
   out.println(user.getFirstName()+" "+user.getLastName());
      out.write("</h2>\n");
      out.write("        <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("           \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>User ID</td>\n");
      out.write("                    <td>");
  out.println(user.getUserId());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First name</td>\n");
      out.write("                    <td>");
   out.println(user.getFirstName());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last name</td>\n");
      out.write("                    <td>");
  out.println(user.getLastName());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>grade id</td>\n");
      out.write("                    <td>");
  out.println(user.getUserId());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>email</td>\n");
      out.write("                    <td>");
  out.println(user.getEmail());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>User type</td>\n");
      out.write("                    <td>");
  out.println(user.getUserType());
                 
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td><a href=\"samplepage.jsp\"> <input type=\"submit\" value=\"Back\" class=\"btn btn-sm btn-outline-secondary\"/></a></td>\n");
      out.write("                     <td><form action=\"AdminDashboard.jsp\"><a class=\"nav-link\" href=\"#updateuser\"><button \n");
      out.write("          class=\"btn btn-sm btn-outline-secondary\" value=\"");
session.setAttribute("userdetails", user);
      out.write("\">Update Grade</button></a></form></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("                \n");
      out.write("              ");

                    } catch (Exception e) {
                        System.out.println("");
                    }
              
      out.write("\n");
      out.write("             \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div id=\"searchflght\">\n");
      out.write("          <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <div class=\"table-responsive\">\n");
      out.write("           <h2>Search Flights</h2>  \n");
      out.write("           <form action=\"SearchFlights\" method=\"POST\">\n");
      out.write("             <table border=\"0\">\n");
      out.write("               \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"destination\" value=\"\" class=\"form-control\" /></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Search\" class=\"btn btn-sm btn-outline-secondary\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("           \n");
      out.write("           <br><br>\n");
      out.write("            <h2>Flight Search Results</h2>\n");
      out.write("        <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Flight Number</th>\n");
      out.write("                    <th>Departure</th>\n");
      out.write("                    <th>Return</th>\n");
      out.write("                    <th>Airport</th>\n");
      out.write("                    <th>Destination</th>\n");
      out.write("                    <th>Economy eats</th>\n");
      out.write("                    <th>Business Seats</th>\n");
      out.write("                </tr>  \n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");

                    
                    try {
                        List results = (List) request.getAttribute("flightResult");
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
      out.write("                     <td>");
 out.println(((ArrayList) user).get(3));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(4));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(5));
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(((ArrayList) user).get(6));
      out.write("\n");
      out.write("                      </td>\n");
      out.write("                </tr> ");

                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                
      out.write(" \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div id=\"searchTickets\">\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <div class=\"table-responsive\">\n");
      out.write("             <h2>Search Tickets</h2>  \n");
      out.write("            <form action=\"SearchTickets\">\n");
      out.write("                 <form action=\"SearchFligths\" method=\"POST\">\n");
      out.write("             <table border=\"0\">\n");
      out.write("               \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"ticketId\" value=\"\" class=\"form-control\" /></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Search\" class=\"btn btn-sm btn-outline-secondary\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("          \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("        \n");
      out.write("         <div id=\"userActivity\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("          <h2>User Activities</h2>\n");
      out.write("           <form action=\"\">\n");
      out.write("             <input type=\"submit\" value=\"view activities\" class=\"btn btn-sm btn-outline-secondary\"/>\n");
      out.write("        \n");
      out.write("         <div class=\"table-responsive\">\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div id=\"updateuser\">\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <div class=\"table-responsive\">\n");
      out.write("               \n");
      out.write("              \n");
      out.write("              ");

                    try {
                      
                        User userdetail=(User)session.getAttribute("userdetails");
                        
                       
                          
      out.write("\n");
      out.write("        <h1>Update User Profile :");
   out.println(userdetail.getFirstName()+" "+userdetail.getLastName());
      out.write("</h1>\n");
      out.write("        <table border=\"0\" class=\"table table-striped table-sm\">\n");
      out.write("           \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>User ID</td>\n");
      out.write("                    <td>");
  out.println(userdetail.getUserId());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First name</td>\n");
      out.write("                    <td>");
   out.println(userdetail.getFirstName());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last name</td>\n");
      out.write("                    <td>");
  out.println(userdetail.getLastName());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>email</td>\n");
      out.write("                    <td>");
  out.println(userdetail.getEmail());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>grade id</td>\n");
      out.write("                    <td><select name=\"gradeId\"  class=\"btn btn-sm btn-outline-secondary dropdown-toggle\">\n");
      out.write("                            <option value=\"C01\">C01</option>\n");
      out.write("                            <option value=\"S01\">S01</option>\n");
      out.write("                            <option value=\"S02\">S02</option>\n");
      out.write("                             <option value=\"A01\">A02</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td>User type</td>\n");
      out.write("                    <td><select name=\"userType\"  class=\"btn btn-sm btn-outline-secondary dropdown-toggle\">\n");
      out.write("                            <option value=\"client\">client</option>\n");
      out.write("                            <option value=\"staff one\">staff one</option>\n");
      out.write("                            <option value=\"staff two\">staff two</option>\n");
      out.write("                             <option value=\"Admin\">Admin</option>\n");
      out.write("                            \n");
      out.write("                        </select></td>");
 
               
                      

                    } catch (Exception e) {
                        System.out.println("");
                    }
                 
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                 <tr >\n");
      out.write("                     <td colspan=\"2\"> <input type=\"submit\" value=\"Update\" class=\"btn btn-sm btn-outline-secondary\"/></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
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
