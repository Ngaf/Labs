<%@page import="Exam.viewData.ListDao"%>

<jsp:useBean id="me" class="Exam.viewData.ListBean">	
	<jsp:setProperty property="*" name="me"/> 
</jsp:useBean>
<%  
int i=ListDao.save(me);  
if(i>0){ 
	response.sendRedirect("addAttendance-Success.jsp");  
}else{  
	response.sendRedirect("addAttendance-Error.jsp"); 
}  
%>  

</body>
</html>