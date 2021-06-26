/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import com.mysql.jdbc.Statement;
import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author Sandali
 */
public class UserQuery {

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
            Logger.getLogger(User.class).log(Level.SEVERE, null, ex);
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

    User viewProfile(String UID) {

        connectToDB();
        String sql;

        sql = "SELECT U_id,first_name,last_name,grade_id,email,user_type FROM user WHERE U_id LIKE " +UID+ "";
       
        System.out.println("sql: " + UID);
        List userdetails = new ArrayList();
        User user = new User();
        try {
            System.out.println("Try ran");

            ResultSet rs = st.executeQuery(sql);
//            System.out.println("Result set:"+((User)rs));
            while (rs.next()) {
                user.setUserId(rs.getInt(1));
                user.setFirstName(rs.getString(2));
                user.setLastName(rs.getString(3));
                user.setGradeId(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setUserType(rs.getString(6));
//                String fName = rs.getString(2);
//                System.out.println("Fname: " + fName);
            }

//            while(rs){
//                System.out.println(rs);
//            }
//             System.out.println("sql: " +rs.getString("first_name"));
//            
//            user.setUserId(rs.getInt("U_id"));
//            user.setFirstName(rs.getString("first_name"));
//            user.setLastName(rs.getString("last_name"));
//            user.setGradeId(rs.getString("grade_id"));
//            user.setEmail(rs.getString("email"));
//            user.setUserType(rs.getString("user_type"));
//             
//            System.out.println("sql: " + UID);
//        System.out.println("sql: " +user.getFirstName());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
//            Logger.getLogger(User.class).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}
