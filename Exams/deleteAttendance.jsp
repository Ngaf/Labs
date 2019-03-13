<%@page import="Exam.viewData.ListDao"%>
<jsp:useBean id="me" class="Exam.viewData.ListBean">
	<jsp:setProperty property="*" name="me"/>
</jsp:useBean>
<%
	ListDao.delete(me);
	reponse.sendRedirect("viewForm.jsp");
%>