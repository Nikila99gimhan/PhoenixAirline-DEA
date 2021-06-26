
package StaffGradeOne;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class viewTicket {

   Statement st;
   private String driver = "com.mysql.jdbc.Driver";
      private   String url = "jdbc:mysql://localhost:3306/phoenix_airline";
    List searchTicket(String id) {
        connectToDb();
        String sql1 = "SELECT * FROM ticket WHERE ticket_id LIKE '%"+id+"%'";
        List blist =new ArrayList();
        try {
            ResultSet rs =st.executeQuery(sql1);
            while(rs.next()){
                blist.add(rs.getString("ticket_no"));
                blist.add(rs.getString("seat_no"));
                blist.add(rs.getString("flight_no"));
                blist.add(rs.getString("booking_id"));
                blist.add(rs.getString("price"));
                blist.add(rs.getString("date"));
               
               
               
                
            }
        }
       catch(SQLException ex)
        {
            Logger.getLogger(viewFlight.class.getName()).log(Level.SEVERE,null,ex);
        }
        return blist;
    }
    
    private void connectToDb()
    {
          
        try
        {
        Class.forName(driver); // load the driver
        java.sql.Connection con=DriverManager.getConnection(url ,"root",""); // create the connection
         st=con.createStatement();
 
         }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(viewFlight.class.getName()).log(Level.SEVERE,null,ex);
        }
            
    }
    
    
    
    
    
}
