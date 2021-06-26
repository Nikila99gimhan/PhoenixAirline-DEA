
package StaffGradeOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


class flightAdd {
private String driver="com.mysql.jdbc.Driver";
private String url="jdbc:mysql://localhost:3306/phoenix_airline";
Statement st;



void adding(String dep, String ret, String air, String des, String eco, String busi,String fno) {
String sql1 = "INSERT INTO flight VALUES('"+fno+"','"+dep+"','"+ret+"','"+air+"','"+des+"','"+eco+"','"+busi+"')";
connectToDb();
try {
st.executeUpdate(sql1);
} catch (SQLException ex) {
Logger.getLogger(flightAdd.class.getName()).log(Level.SEVERE, null, ex);
}

}



private void connectToDb() {

try {
Class.forName(driver);

Connection con = DriverManager.getConnection(url,"root","");
st = con.createStatement();
} catch (ClassNotFoundException | SQLException ex) {
Logger.getLogger(flightAdd.class.getName()).log(Level.SEVERE, null, ex);
}
}
}