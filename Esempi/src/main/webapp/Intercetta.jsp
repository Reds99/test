<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" buffer=5000 autoFlush="false" isThreadSafe="false" info="descrizione"
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cattura richiesta</title>
</head>
<body>
<%
	if (request.getMethod().equals("POST")) {
		out.println(request.getParameter("nome") + " " + request.getParameter("cognome"));
	} else {
		response.sendRedirect("index.html");
		response.flushBuffer();
	}
%>


</body>
</html>