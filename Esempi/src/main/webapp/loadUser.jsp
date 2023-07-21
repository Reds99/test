<%@page import="java.util.ArrayList"%>
<%
	String utente = request.getParameter("utente");
	ArrayList<String> utenti = (ArrayList<String>)session.getAttribute("utenti");
	if(utenti == null){
		utenti = new ArrayList<String>();
	}
	utenti.add(utente);
	session.setAttribute("utenti", utente);
	response.sendRedirect("sessionListener.jsp");



%>