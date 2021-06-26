/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Thuthi
 */
public class addTicket {
     Connection con = null;
     int state = 0; 
    public boolean addTicketInfo(String pname, String cclass, String stype, String seatNo, String email, int phonenum, String method, String cno) {
         try
       {
           PreparedStatement ps = con.prepareStatement("INSERT INTO ticketdetails(passengerName,cabinClass,seatType,seatNum,email,phone)VALUES(?,?,?,?,?,?)");
           ps.setString(1,pname);
           ps.setString(2,cclass);
           ps.setString(3,stype);
           ps.setString(4,seatNo);
           ps.setString(5,email);
           ps.setInt(6,phonenum);
           state = ps.executeUpdate();
       }
       catch(Exception e)
               {
                 e.printStackTrace();  
               }
        return state == 1;
    }
    
}
