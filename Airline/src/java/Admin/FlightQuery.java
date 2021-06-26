
package Admin;

import com.mysql.jdbc.Statement;
import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class FlightQuery {
  
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

    List searchFlights(String destination) {
        
          connectToDB();
        String sql;
        
        sql = "SELECT * FROM flight where destination LIKE '"+destination+"'";
        
        System.out.println("sql: " + destination);
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
            Logger.getLogger(User.class).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            blist.add("");

        }
        return blist;
    
    
    }
    
    
     
     
     
     
     
}
