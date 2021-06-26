
<%@ page import="java.util.*,javax.mail.*"%>



<%@ page import="javax.mail.internet.*" %>



<%@ page import = "java.io.*,java.util.*,javax.mail.*"%>



<%@ page import = "javax.mail.internet.*,javax.activation.*"%>






<%



//Creating a result for getting status that messsage is delivered or not!



String result;



// Get recipient's email-ID, message & subject-line from index.html page



 String to = request.getParameter("email");



 String subject = "Your Recovery Password";



String messg = "Your Recovery Code = 123";





// Sender's email ID and password needs to be mentioned



final String from = "phoenixairlines2021@gmail.com";



final String pass = "HiruniEshani";





// Defining the gmail host



String host = "smtp.gmail.com";





// Creating Properties object



Properties props = new Properties();





// Defining properties



props.put("mail.smtp.host", host);



props.put("mail.transport.protocol", "smtp");



props.put("mail.smtp.auth", "true");



props.put("mail.smtp.starttls.enable", "true");



props.put("mail.user", from);



props.put("mail.password", pass);



props.put("mail.port", "465");





// Authorized the Session object.



Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {



@Override



protected PasswordAuthentication getPasswordAuthentication() {



return new PasswordAuthentication(from, pass);



}



});





try {



// Create a default MimeMessage object.



MimeMessage message = new MimeMessage(mailSession);



// Set From: header field of the header.



message.setFrom(new InternetAddress(from));



// Set To: header field of the header.



message.addRecipient(Message.RecipientType.TO,



new InternetAddress(to));



// Set Subject: header field



message.setSubject(subject);



// Now set the actual message



message.setText(messg);



// Send message



Transport.send(message);



result = "Your mail sent successfully....";



} catch (MessagingException mex) {



mex.printStackTrace();



result = "Error: unable to send your mail....";



}



%>




<html>
<head>
<title>Sending Mail in JSP</title>
</head>

<body>
<h1><center>Sending Mail</center></h1>
<center><% out.println(result);%></center>
<br><br>
<a href="Login.jsp"><center><button>Login</button></center></a>
</body>
</html>