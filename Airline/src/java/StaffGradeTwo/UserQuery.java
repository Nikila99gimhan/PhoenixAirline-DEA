
package StaffGradeTwo;

import com.mysql.jdbc.Statement;
import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

class UserQuery {
    
    
     Statement st;

    List searchUser(String userType) {
        connectToDB();
        String sql;
        if (userType.equals("Clients")) {
            sql = "SELECT U_id,first_name,last_name,user_type FROM user WHERE grade_id LIKE 'C01'";
        } else if (userType.equals("Staff01")) {
            sql = "SELECT U_id,first_name,last_name,user_type FROM user WHERE grade_id LIKE 'S01'";
        } else if (userType.equals("Staff02")) {
            sql = "SELECT U_id,first_name,last_name,user_type FROM user WHERE grade_id LIKE 'S02'";
        } else {
            sql = "SELECT U_id,first_name,last_name,user_type FROM user";

        }
        System.out.println("sql: " + userType);
        List blist = new ArrayList();
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                List list = new ArrayList();

                list.add(rs.getInt("U_id"));
                list.add(rs.getString("first_name"));
                list.add(rs.getString("last_name"));
                list.add(rs.getString("user_type"));
                blist.add(list);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserQuery.class).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            blist.add("");

        }
        return blist;
    }

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

     List viewAllUsers() {
        connectToDB();
        String sql;
        
            sql = "SELECT U_id,first_name,last_name,user_type FROM user";

        
        List blist = new ArrayList();
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                List list = new ArrayList();

                list.add(rs.getInt("U_id"));
                list.add(rs.getString("first_name"));
                list.add(rs.getString("last_name"));
                list.add(rs.getString("user_type"));
                blist.add(list);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserQuery.class).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            blist.add("");

        }
        return blist;
    }

    List SearchUserId(String UserId) {
       
        connectToDB();
        String sql;
        
            sql = "SELECT U_id,first_name,last_name,user_type FROM user WHERE U_id LIKE "+UserId+"";

        
        List blist = new ArrayList();
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                List list = new ArrayList();

                list.add(rs.getInt("U_id"));
                list.add(rs.getString("first_name"));
                list.add(rs.getString("last_name"));
                list.add(rs.getString("user_type"));
                blist.add(list);
            }
        }  catch (SQLException ex) {
            Logger.getLogger(UserQuery.class).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            blist.add("");
            System.out.println(blist);
        }
        return blist;
        
        }
    
    
    
    
    
    
}
