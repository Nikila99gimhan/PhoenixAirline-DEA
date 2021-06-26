package Login_and_Register;



import Model.RegisterBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Register extends HttpServlet {




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
processRequest(request, response);
PrintWriter out = response.getWriter();
   String fname = request.getParameter("firstName");
   String lname = request.getParameter("lastname");
String email = request.getParameter("email");
String password = request.getParameter("password");

RegisterBean st = new RegisterBean();
System.out.println(email);

if(st.clientRegistration(fname, lname, email, password)){
out.println("Registration Success!");
RequestDispatcher req = request.getRequestDispatcher("home.jsp");
req.include(request, response);


}

}




@Override
public String getServletInfo() {
return "Short description";
}



}