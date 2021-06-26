

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js"  lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Phoenix Airlines - Mange Booking</title>
        	<!-- META DATA -->
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

		<!--font-family-->
		<link href="https://fonts.googleapis.com/css?family=Rufina:400,700" rel="stylesheet" />

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900" rel="stylesheet" />

		<!-- TITLE OF SITE -->
		<title>Travel</title>

		<!-- favicon img -->
		<link rel="shortcut icon" type="image/icon" href="assets/logo/favicon.png"/>

		<!--font-awesome.min.css-->
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!--animate.css-->
		<link rel="stylesheet" href="assets/css/animate.css" />

		<!--hover.css-->
		<link rel="stylesheet" href="assets/css/hover-min.css">

		<!--datepicker.css-->
		<link rel="stylesheet"  href="assets/css/datepicker.css" >

		<!--owl.carousel.css-->
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
		<link rel="stylesheet" href="assets/css/owl.theme.default.min.css"/>

		<!-- range css-->
        <link rel="stylesheet" href="assets/css/jquery-ui.min.css" />

		<!--bootstrap.min.css-->
		<link rel="stylesheet" href="assets/css/bootstrap.min.css" />

		<!-- bootsnav -->
		<link rel="stylesheet" href="assets/css/bootsnav.css"/>

		<!--style.css-->
		<link rel="stylesheet" href="assets/css/style.css" />

		<!--responsive.css-->
		<link rel="stylesheet" href="assets/css/responsive.css" />

		
    </head>
     <body>
       
        
                <!-- main-menu Start -->
                <header class="top-area">
                    <div class="header-area">
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-2">
                                    <div class="logo">
                                        <a href="index.html">
                                            Pheonix<span>Airlines</span>
                                        </a>
                                    </div><!-- /.logo-->
                                </div><!-- /.col-->
                                <div class="col-sm-10">
                                    <div class="main-menu">
                                    
                                        <!-- Brand and toggle get grouped for better mobile display -->
                                        <div class="navbar-header">
                                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                                <i class="fa fa-bars"></i>
                                            </button><!-- / button-->
                                        </div><!-- /.navbar-header-->
                                        <div class="collapse navbar-collapse">		  
                                            <div class="smooth-menu">	  
                                                <ul class="nav navbar-nav navbar-right">
                                                    <li><a href="home.jsp">home</a></li>
										<li><a href="book.jsp">Book</a></li>
										<li><a href="#">Manage </a></li>
										<li><a href="Experiance.jsp">Experience</a></li>
										<li><a href="Login.jsp">Login</a></li></ul>
                                                </div>
                                        </div><!-- /.navbar-collapse -->
                                    </div><!-- /.main-menu-->
                                </div><!-- /.col-->
                            </div><!-- /.row -->
                            <div class="home-border"></div><!-- /.home-border-->
                        </div><!-- /.container-->
                    </div><!-- /.header-area -->
        
                </header><!-- /.top-area-->
                <!-- main-menu End -->
        
                
                    
                <!--about-us start -->
                <section id="home" class="about-us">
                    <div class="container">
                        <div class="about-us-content">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="single-about-us">
                                        <div class="about-us-txt">
                                            <center>
                                            <h3>
                                                Search Results 
                                            </h3>
                                            </center>
                                           
                                        </div>
<table class="table table-striped table-dark">
  <thead>
    <tr>
     
      <th scope="col">Flight ID</th>
      <th scope="col">Departure Date</th>
      <th scope="col">Return Date</th>
      <th scope="col">From</th>
      <th scope="col">To</th>
      
    </tr>
    <%
        String airport = request.getParameter("from");
        String dep =request.getParameter("departure");
        String retn = request.getParameter("return");
        String destination = request.getParameter("to");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenix_airline","root","");
            String sql = "SELECT * FROM flight where airport='"+airport+"' and departure='"+dep+"' and returnd='"+retn+"' and destination='"+destination+"'  " ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            
            while(rs.next())
            
            {
                
           
       
        %>
 
    
  </thead>
  <tbody>
    <tr>
      
      <td><%=rs.getString("flight_no")%></td>
      <td><%=rs.getString("departure")%></td>
      <td><%=rs.getString("returnd")%></td>
      <td><%=rs.getString("airport")%></td>
      <td><%=rs.getString("destination")%></td>
      
        
      <%
          }
}catch (Exception ex)
{
ex.printStackTrace();

}
          
      
      
      %>
      
      
  
          
    </tr>
    
  </tbody>
</table>
       </div>
                                    <div class="about-btn">
                                        <button  onclick="window.location.href='./Login.jsp'"  class="about-view">
                                                    Book Now
                                                </button>
                                            </div>
                                </div><!--/.col-->
                                <div class="col-sm-0">
                                    <div class="single-about-us">
                                        
                                    </div><!--/.single-about-us-->
                                </div><!--/.col-->
                            </div><!--/.row-->
                        </div><!--/.about-us-content-->
                    </div><!--/.container-->
        
                </section><!--/.about-us-->
                <!--about-us end -->

                <!-- footer-copyright start -->
<footer  class="footer-copyright">
    <div class="container">
        <div class="footer-content">
            <div class="row">

                <div class="col-sm-3">
                    <div class="single-footer-item">
                        <div class="footer-logo">
                            <a href="index.html">
                                tour<span>Nest</span>
                            </a>
                            <p>
                                best travel agency
                            </p>
                        </div>
                    </div><!--/.single-footer-item-->
                </div><!--/.col-->

                <div class="col-sm-3">
                    <div class="single-footer-item">
                        <h2>link</h2>
                        <div class="single-footer-txt">
                            <p><a href="#">home</a></p>
                            <p><a href="#">destination</a></p>
                            <p><a href="#">spacial packages</a></p>
                            <p><a href="#">special offers</a></p>
                            <p><a href="#">blog</a></p>
                            <p><a href="#">contacts</a></p>
                        </div><!--/.single-footer-txt-->
                    </div><!--/.single-footer-item-->

                </div><!--/.col-->

                <div class="col-sm-3">
                    <div class="single-footer-item">
                        <h2>popular destination</h2>
                        <div class="single-footer-txt">
                            <p><a href="#">china</a></p>
                            <p><a href="#">venezuela</a></p>
                            <p><a href="#">brazil</a></p>
                            <p><a href="#">australia</a></p>
                            <p><a href="#">london</a></p>
                        </div><!--/.single-footer-txt-->
                    </div><!--/.single-footer-item-->
                </div><!--/.col-->

                <div class="col-sm-3">
                    <div class="single-footer-item text-center">
                        <h2 class="text-left">contacts</h2>
                        <div class="single-footer-txt text-left">
                            <p>+1 (300) 1234 6543</p>
                            <p class="foot-email"><a href="#">info@tnest.com</a></p>
                            <p>North Warnner Park 336/A</p>
                            <p>Newyork, USA</p>
                        </div><!--/.single-footer-txt-->
                    </div><!--/.single-footer-item-->
                </div><!--/.col-->

            </div><!--/.row-->

        </div><!--/.footer-content-->
        <hr>
        <div class="foot-icons ">
            <ul class="footer-social-links list-inline list-unstyled">
                <li><a href="#" target="_blank" class="foot-icon-bg-1"><i class="fa fa-facebook"></i></a></li>
                <li><a href="#" target="_blank" class="foot-icon-bg-2"><i class="fa fa-twitter"></i></a></li>
                <li><a href="#" target="_blank" class="foot-icon-bg-3"><i class="fa fa-instagram"></i></a></li>
            </ul>
            <p>&copy; 2017 <a href="https://www.themesine.com">ThemeSINE</a>. All Right Reserved</p>

        </div><!--/.foot-icons-->
        <div id="scroll-Top">
            <i class="fa fa-angle-double-up return-to-top" id="scroll-top" data-toggle="tooltip" data-placement="top" title="" data-original-title="Back to Top" aria-hidden="true"></i>
        </div><!--/.scroll-Top-->
    </div><!-- /.container-->

</footer><!-- /.footer-copyright-->
<!-- footer-copyright end -->










    <script src="assets/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->

		<!--modernizr.min.js-->
		<script  src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>


		<!--bootstrap.min.js-->
		<script  src="assets/js/bootstrap.min.js"></script>

		<!-- bootsnav js -->
		<script src="assets/js/bootsnav.js"></script>

		<!-- jquery.filterizr.min.js -->
		<script src="assets/js/jquery.filterizr.min.js"></script>

		<script  src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>

		<!--jquery-ui.min.js-->
        <script src="assets/js/jquery-ui.min.js"></script>

        <!-- counter js -->
		<script src="assets/js/jquery.counterup.min.js"></script>
		<script src="assets/js/waypoints.min.js"></script>

		<!--owl.carousel.js-->
        <script  src="assets/js/owl.carousel.min.js"></script>

        <!-- jquery.sticky.js -->
		<script src="assets/js/jquery.sticky.js"></script>

        <!--datepicker.js-->
        <script  src="assets/js/datepicker.js"></script>

		<!--Custom JS-->
		<script src="assets/js/custom.js"></script>
</body>
</html>
