<%-- 
    Document   : StaffTwo.jsp
    Created on : May 22, 2021, 12:13:28 AM
    Author     : Sandali
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <title>staff Grade Two Dashboard</title>

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
            <a class="nav-link" href="#addFlights">
              <span data-feather="send"></span>
              Add Flights
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#searchflght">
              <span data-feather="search"></span>
              Search Flights
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#searchClient">
              <span data-feather="refresh-ccw"></span>
              Search Client
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
        <h1 class="h2">Staff Grade Two Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
          <div class="btn-group mr-2"></div>
        </div>
      </div>
            

       <div id="addFlights">
      <br>
            <br>
            <br>
           <div class="table-responsive">
               <h1>Add Flights</h1>
                 
        <form action="AddFlight">
            <table border="0" class="table table-striped table-sm">
                
                    <tr>
                        <td><label>Flight Number</label></td>
                        <td><input type="text" name="FlightNumber" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label>Departure</label></td>
                        <td><input type="text" name="departure" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td> <label>departure airport</label></td>
                        <td><input type="text" name="depAirport" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td> <label>destination</label></td>
                        <td><input type="text" name="destination" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label>return</label></td>
                        <td><input type="text" name="return" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label>Economical Class seats</label></td>
                        <td><input type="text" name="ecoSeats" value="" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label>Business Class seats</label></td>
                        <td><input type="text" name="BuisSeats" value="" class="form-control"/></td>
                    </tr>
                     <tr>
                        <td></td>
                        <td><input type="submit"  value="Add Flight" class="btn btn-sm btn-outline-secondary" /></td>
                    </tr>
                </tbody>
            </table>

            
        </form>
        
        <div id="searchflght">
            <br>
            <br>
            <br>
         <h1>Search Flights</h1>
          <form action="ViewAllFlights"><button class="btn btn-sm btn-outline-secondary">View all Flights</button ></form>
          </br>
          
         <form action="SearchFlights">
            
             <table border="0" class="table table-striped table-sm">
                 
                 <tbody>
                     
                     <tr>
                         <td>search by ID</td>
                         <td><input type="text" name="FlightId" class="form-control"/></td>
                         <td><input type="submit" value="Search" class="btn btn-sm btn-outline-secondary"/></td>
                     </tr>
                    
                 </tbody>
             </table>

             
         </form>
          
          <h1>Flight Search Results</h1>
        
        <br>
        <br>
                 
        <table border="0" class="table table-striped table-sm">
            <thead>
                <tr>
                    <th>Flight Number</th>
                    <th>Departure</th>
                    <th>Return</th>
                    <th>Airport</th>
                    <th>Destination</th>
                    <th>Economy Seats</th>
                    <th>Business seats</th>
                </tr>  
            </thead>
            <tbody>
        
        <%
                    
                    try {
                        List flightResults = (List) request.getAttribute("flightresult");
                        //Iterator it = results.iterator();
                        for (Object flight : flightResults) {
                %> <tr>
                    <td><% out.println(((ArrayList) flight).get(0));%></td>
                    <td><% out.println(((ArrayList) flight).get(1));%></td>
                    <td><% out.println(((ArrayList) flight).get(2));%></td>
                    <td><% out.println(((ArrayList) flight).get(3));%></td>
                    <td><% out.println(((ArrayList) flight).get(4));%></td>
                    <td><% out.println(((ArrayList) flight).get(5));%></td>
                    <td><% out.println(((ArrayList) flight).get(6));%></td>
                  </tr> 
                         
                  <%
                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                %> 
                
                </tbody>
                </table>
                </div>
         </div>
        
       </div>   
        
        <br>
        <br>
        
        
        
        
        
        
        
        <div id="searchClient">
            
            <br>
            <br>
            <br>
           <div class="table-responsive">
             <h1>Search Clients</h1>
                <form action="ViewAllUsers"><button class="btn btn-sm btn-outline-secondary">View all Users</button></form>
                 </br>
                <form action="SearchUser">
                    <table border="0" class="table table-striped table-sm">
                        <tbody>
                     <tr>
                         <td>search by ID</td>
                         <td><input type="text" name="UserId" class="form-control"/></td>
                         <td><input type="submit" value="Search" class="btn btn-sm btn-outline-secondary" /></td>
                     </tr>
                    
                         </tbody>
             </table>

             
         </form>
        
           <h1>Client Search Results</h1>   
            <table border="0" class="table table-striped table-sm" >
            <thead>
                <tr>
                    <th>User ID</th>
                    <th>First name</th>
                    <th>Last Name</th>
                    <th>User Type</th>
                </tr>  
            </thead>
            <tbody>

                <%
                    int UID;
                    try {
                        List results = (List) request.getAttribute("usertResult");
                        //Iterator it = results.iterator();
                        for (Object user : results) {
                %> <tr>
                    <td><% out.println(((ArrayList) user).get(0));%></td>
                    <td><% out.println(((ArrayList) user).get(1));%></td>
                    <td><% out.println(((ArrayList) user).get(2));%></td>
                    <td><% out.println(((ArrayList) user).get(3));%></td>
                </tr> <%
                        }

                    } catch (Exception e) {
                        System.out.println("");
                    }
                %> 
            </tbody>
        </table>
             
        <br>
        <br>
        </div>
    </div>
                
                
                
                
       <br>
       <br>
         
       
       
       
     
                    
                    
          <br>
            <br>          
                    
     <div id="searchTicket">
         <br>
        <br>
       <div class="table-responsive">
         
        </div>
      </div>
     
        
            
             <br>
            <br>
    </main>
   </div>  
 

<script src="jquery-3.5.1.slim.min.js"></script>
      <script>window.jQuery || document.write('<script src="assets/js/vendor/jquery.slim.min.js"><\/script>');</script><script src="assetsD/dist/js/bootstrap.bundle.min.js"></script>
        <script src="feather.min.js"></script>
        <script src="Chart.min.js"></script>
        <script src="dashboard.js"></script>
 </body>
                
</html>
