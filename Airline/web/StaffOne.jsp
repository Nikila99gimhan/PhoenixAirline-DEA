
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>


<html>
    
	<head>
            
            <%
            String userid=(String)session.getAttribute("name");
            if(userid==null)
            {
                response.sendRedirect("Login.jsp");
                return;
            }
            %>
		<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
   

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/dashboard/">

    <!-- Bootstrap core CSS -->
<link href="assetsD/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">
                <title>staff Grade One Dashboard</title>

	</head>        
  
    
    <body>
    
   
                
                
                

   
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="#">Phoenix Airlines</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
<!--  <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">-->

    <ul class="navbar-nav">
      
   
    </ul>
<ul class="navbar-nav ">
       
   
    </ul>
<ul class="navbar-nav ">
     
    </ul>
<ul class="navbar-nav">
      
    </ul>
  <ul class="navbar-nav">
     
    </ul>

<ul class="navbar-nav">
    <li>
      <a class="nav-link" href="home.jsp">Home</a>
    </li>
    </ul>

 <ul class="navbar-nav px-5 ">
        <li class="nav-item text-nowrap">
            <a class="nav-link"  href="#">${name}</a>
          
        </li>
   
    </ul>
    

<ul class="navbar-nav px-5">
    <li>
      <a class="nav-link" href="Login.jsp">Sign out</a>
    </li>

  </ul>
</nav>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="sidebar-sticky pt-3">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" href="#">
              <span data-feather="home"></span>
              Dashboard <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="send"></span>
              Add Flight
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#searchflght">
              <span data-feather="search"></span>
              Search Flight
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#addTicket">
              <span data-feather="refresh-ccw"></span>
              Update Ticket
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#searchTicket">
              <span data-feather="search"></span>
              Search Ticket
            </a>
          </li>
          
        </ul>

        
      </div>
    </nav>
   </div>
 
    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Staff Grade One Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
          <div class="btn-group mr-2">
<!--            <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
            <button type="button" class="btn btn-sm btn-outline-secondary">Export</button>-->
          </div>
<!--          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
            <span data-feather="calendar"></span>
            This week
          </button>-->
        </div>
      </div>


       <div id="addflights" class="nav-link active">
       <form action="AddFlightServlet" method="POST">
           <div class="table-responsive">
            <table border="0" class="table table-striped table-sm" >
                <h2>ADD FLIGHT</h2>
               <tbody>
                    <tr>
                        <td>Departure</td>
                        <td><input type="text" name="depart" value="" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Return</td>
                        <td><input type="text" name="return" value="" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Airport</td>
                        <td><input type="text" name="airport" value="" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Destination</td>
                        <td><input type="text" name="destination" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>No of seats in Economic class</td>
                        <td><input type="text" name="ecoseat" value="" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td> No of seats in business class</td>
                        <td><input type="text" name="busineseat" value="" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Flight Number:</td>
                        <td><input type="text" name="flightNo" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        
                        <td><input type="reset" value="CANCEL" class="btn btn-sm btn-outline-secondary" /></td>
                        <td><input type="submit" value="ADD FLIGHT" class="btn btn-sm btn-outline-secondary" /></td>
                    </tr>
                </tbody>
            </table>
         </div>
        </form>
       </div>   
        
        <br>
        <br>
        <div id="searchflght" class="active">
            <br>
        <br>
           <div class="table-responsive">
              
                <h1>Search Flights</h1>
               <form action="SearchFlightServlet" method="POST">
            <table border="0" class="table table-striped table-sm">  
               <tbody>
                    <tr>
                        <td>FLIGHT ID </td>
                        <td><input type="text" name="fid" value="" class="form-control"/></td>
                    </tr>
                        
                        <td><input type="reset" value="CANCEL" class="btn btn-sm btn-outline-secondary" /></td>
                        <td><input type="submit" value="VIEW FLIGHT" class="btn btn-sm btn-outline-secondary"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
                 <br>
        <br>
                
              <div class="table-responsive" class="active">  
                <h2>Search Flight Results</h2>
                
                <table border="0" class="table table-striped table-sm">
                   
                    <tbody>
                        <tr>
                            <td>Flight Number</td>
                            <td>Air Port</td>
                            <td>Destination</td>
                            <td>Departure</td>
                            <td>Returned</td>
                            <td>Economy Seats</td>
                            <td>Business Seats</td>
                        </tr>
                        <tr>
                             <%
                        try{
                            
                        int i=0;
                    List rts =(List)request.getAttribute("result");
                    Iterator it = rts.iterator();
                    while(it.hasNext())
                    {
                        i++;
                        
                    %><td><%out.println(it.next());%></td><%
                    }
                       if(i==7){
                           %></tr><% 
                        }
                      } catch (Exception e) {
                        System.out.println("");
                    }
                    %>
                              
                         <br>
        <br>
                        
                    </tbody>
                </table>
  
                </div>
         </div>
    </div>
       <br>
       <br>
           
      <div id="addTicket" class="active">
          <br>
        <br>
            <div class="table-responsive">  
        <form action="TicketServlet" method="POST">
            <table border="0" class="table table-striped table-sm">
                <h1>Update Ticket Details</h1>
               <tbody>
                    <tr>
                        <td>Ticket Id</td>
                        <td><input type="text" name="tid" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Seat Number</td>
                        <td><input type="text" name="snum" value="" class="form-control" /></td>
                    </tr>
                   
                   
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="price" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td> Date</td>
                        <td><input type="text" name="date" value="" class="form-control"/></td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" value="UPDATE TICKET INFO" class="btn btn-sm btn-outline-secondary"/></td>
                        <td><input type="reset" value="CANCEL" class="btn btn-sm btn-outline-secondary"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
                
           <br>     
                
                
        </div>
           
         </div>
                    
                    
          <br>
            <br>          
                    
     <div id="searchTicket" class="active">
         <br>
        <br>
       <div class="table-responsive">
            <form action="SearchTicket" method="POST">
            <table border="0" class="table table-striped table-sm">
                <h1>Search Ticket</h1>
               <tbody>
                    <tr>
                        <td>TICKET ID </td>
                        <td><input type="text" name="tid" value="" class="form-control"/></td>
                    </tr>
                        
                        <td><input type="reset" value="CANCEL" class="btn btn-sm btn-outline-secondary"/></td>
                        <td><input type="submit" value="VIEW TICKET" class="btn btn-sm btn-outline-secondary"/></td>
                    </tr>
                </tbody>
            </table>
        </form> 
           
           
        </div>
          <div class="table-responsive">  
                <h2>Search Ticket Results</h2>
                
                <table border="0" class="table table-striped table-sm">
                   
                    <tbody>
                        <tr>
                            <td>Ticket Number</td>
                            <td>Seat Number</td>
                            <td>Flight Number</td>
                            <td>Booking ID</td>
                            <td>Price</td>
                            <td>Date</td>
                        </tr>
                        <tr>
                             <%
                        try{
                            
                        int i=0;
                    List rts =(List)request.getAttribute("Ticketresult");
                    Iterator it = rts.iterator();
                    while(it.hasNext())
                    {
                        i++;
                        
                    %><td><%out.println(it.next());%></td><%
                    }
                       if(i==6){
                           %></tr><% 
                        }
                      } catch (Exception e) {
                        System.out.println("");
                    }
                    %>
                              
                        
                    </tbody>
                </table>
  
                </div>
     </div>
        
            
             <br>
                         <br>
       
    </main>
   </div>  
  </div>

<script src="jquery-3.5.1.slim.min.js"></script>
      <script>window.jQuery || document.write('<script src="assets/js/vendor/jquery.slim.min.js"><\/script>');</script><script src="assetsD/dist/js/bootstrap.bundle.min.js"></script>
        <script src="feather.min.js"></script>
        <script src="Chart.min.js"></script>
        <script src="dashboard.js"></script>
 </body>
                
</html>

   