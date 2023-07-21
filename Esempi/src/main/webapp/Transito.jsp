<%
	String username = (String)session.getAttribute("username");
	if(username != null){
		response.sendRedirect("Visualizza.jsp");
	}else{
		response.sendRedirect("Form.jsp");
	}
%>
