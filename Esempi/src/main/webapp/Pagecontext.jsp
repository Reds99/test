<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.jsp.*" %>
<%@ page import="java.io.*" %>

<%!
	public static void metodo(PageContext contesto)throws IOException{
		JspWriter out = contesto.getOut();
		ServletRequest rq = contesto.getRequest();
		out.write("Meta rq: " + rq.getRemoteAddr());
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
metodo(pageContext);
%>

</body>
</html>