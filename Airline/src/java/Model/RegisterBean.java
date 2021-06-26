package Model;



import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;




public class RegisterBean {
Connection con = null;

public boolean clientRegistration(String fname, String lname, String email,String password ){
int state = 0;
try{
con=DBcon.Connection();
System.out.println(fname);


PreparedStatement ps = con.prepareStatement("insert into user (first_name,last_name,email,password,grade_id) values(?,?,?,?,?)");
ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,email);
ps.setString(4,password);
ps.setString(5,"C01");




state = ps.executeUpdate();
return true;

} catch (ClassNotFoundException | SQLException e){
System.out.println(e);

}
return state == 1;


}

public boolean clientLogin( String email,String password ){
int state = 0;
try{
con=DBcon.Connection();


PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?" );

ps.setString(1,email);
ps.setString(2,password);
ResultSet rs = ps.executeQuery();
if(rs.next()){
return true;
}else
{
return false;
}







} catch (ClassNotFoundException | SQLException e){
System.out.println(e);

}
return state == 1;


}


}