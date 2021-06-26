package Login_and_Register;



import Model.RegisterBean;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {




protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");

}



@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}




@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

HttpSession session = request.getSession();


String email = request.getParameter("email");
String password = request.getParameter("password");

RegisterBean st = new RegisterBean();
System.out.println(email);

if(st.clientLogin( email, password)){

session.setMaxInactiveInterval(6000);
session.setAttribute("name", email.split("@")[0]);



if(email.contains("@admin.com")){
RequestDispatcher req = request.getRequestDispatcher("AdminDashboard.jsp");
req.include(request, response);

}
else if(email.contains("@staffg1.com")){
RequestDispatcher req = request.getRequestDispatcher("StaffOne.jsp");
req.include(request, response);

}
else if(email.contains("@staffg2.com")){
RequestDispatcher req = request.getRequestDispatcher("StaffTwo.jsp");
req.include(request, response);

}
else{
RequestDispatcher req = request.getRequestDispatcher("home.jsp");
req.include(request, response);

}


}
else
{

response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<script type=\"text/javascript\">");
pw.println("alert('Invalid Username or Password');");
pw.println("</script>");
RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
rd.include(request, response);



}

}
@Override
public String getServletInfo() {
return "Short description";
}



}