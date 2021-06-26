
package Admin;

import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TicketQuery {
  
    
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

    void searchTickets() {
       
    
    
    
    }
     
     
     
     
     
     
     
     
     
}
