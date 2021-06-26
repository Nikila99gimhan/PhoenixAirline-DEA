
package StaffGradeOne;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class TicketAdd {
    
    
     private String driver="com.mysql.jdbc.Driver";
     private  String url="jdbc:mysql://localhost:3306/";
     Statement st;

    void tadding(String tcid, String seat, String price, String date) {
        String sql1 = "UPDATE ticket SET seat_no= '"+seat+"',price= '"+price+"',date='"+date+"' WHERE ticket_id='"+tcid+"'"; 
        connectToDb();
        try {
            st.executeUpdate(sql1);
        } catch (SQLException ex) {
            Logger.getLogger(TicketAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectToDb() {
      
        try {
            Class.forName(driver); // load the driver
        java.sql.Connection con=DriverManager.getConnection(url ,"root",""); // create the connection
         st=con.createStatement();
         
         
         
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TicketAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
