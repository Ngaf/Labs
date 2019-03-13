<%@include file="logg.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
    <%
       String profile_msg =(String)request.getAttribute("profile_msg");
       if(profile_msg != null){
       out.print(profile_msg);
   }
      String login_msg=(String)
      request.getAttribute("login_msg");
       if(login_msg != null){
       out.print(login_msg);
   }

     %>
     <br>
     <form action="logindetails.jsp" method="post">
     	<input type="text" name="Email" placeholder="Enter Email"><br>
     	<input type="password" name="Password" placeholder="Enter Password"><br>
     	<input type="submit" name="Login">
</body>
</html>


