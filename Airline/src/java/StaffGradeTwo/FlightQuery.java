
package StaffGradeTwo;

import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;


class FlightQuery {
  
    Statement st;
    
    private void connectToDB() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/phoenix_airline";
        try {
            Class.forName(driver);
            java.sql.Connection con = DriverManager.getConnection(url, "root", "");
            st = (Statement) con.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    
    
    
    void addFlight(String flightNumber, String departure, String returnd, String airport, String destination, int economySeats, int buissSeat) {
       
    connectToDB();
    String sql="INSERT INTO flight (flight_no,airport,destination,eco_seat_no,bclass_seat_no) VALUES('"+flightNumber+"','"+airport+"','"+destination+"',"+economySeats+","+buissSeat+")";
     System.out.println(flightNumber);
    
    try{
       st.executeUpdate(sql);
        
    }catch(SQLException ex){
          ex.printStackTrace();
    }
    
    }

    List searchflight(String flightNumber) {
        connectToDB();
         String sql="SELECT * FROM flight WHERE flight_no LIKE '"+flightNumber+"'";
        
         List blist = new ArrayList();
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                List list = new ArrayList();

               
                list.add(rs.getString("flight_no"));
                 list.add(rs.getInt("departure"));
                  list.add(rs.getInt("returnd"));
                list.add(rs.getString("airport"));
                list.add(rs.getString("destination"));
                 list.add(rs.getInt("eco_seat_no"));
                  list.add(rs.getInt("bclass_seat_no"));
                 
                blist.add(list);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightQuery.class).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            blist.add("");
            System.out.println(blist);

        }
        return blist;
         
        }

    List viewAllFlights() {
        
        connectToDB();
         String sql="SELECT * FROM flight";
        
         List blist = new ArrayList();
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                List list = new ArrayList();

               
                list.add(rs.getString("flight_no"));
                 list.add(rs.getInt("departure"));
                  list.add(rs.getInt("returnd"));
                list.add(rs.getString("airport"));
                list.add(rs.getString("destination"));
                 list.add(rs.getInt("eco_seat_no"));
                  list.add(rs.getInt("bclass_seat_no"));
                 
                blist.add(list);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightQuery.class).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            blist.add("");
            System.out.println(blist);

        }
        return blist;
        
        }
    
    
      
    
    
    
}
