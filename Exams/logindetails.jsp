<%@ page import="Exam.login.LoginDao"%>

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
  
    <jsp:useBean id="excute" class="Exam.login.LoginBean"/>
        <jsp:setProperty property=* name="execute"/>

    

    <%
         boolean status=LoginDao.validate(execute);
         if(status){
         session.setAttribute("session", "TRUE");
         response.sendRedirect("../crud/AddForm.html");
     }
     else
     {
     	out.print("Email or Password Mismatched!!!");
     }

     %>
     
</body>
</html>


