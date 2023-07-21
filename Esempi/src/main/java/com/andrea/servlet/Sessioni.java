package com.andrea.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessioni")
public class Sessioni extends HttpServlet {
	private static final long serialVersionUID = 7641092212163008841L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Locale locale = request.getLocale();
		DateFormat italian = DateFormat.getDateTimeInstance(
				DateFormat.SHORT,
				DateFormat.MEDIUM,
				locale);
		
		String intestazione;
		Integer accessi = (Integer)session.getAttribute("contatore");
		if(accessi == null) {
			accessi = 0;
			intestazione = "Benvenuto, nuovo utente";
		}else {
			intestazione = "Bentornato";
			accessi += 1;
		}
		
		session.setAttribute("contatore", accessi);
		
		PrintWriter out = response.getWriter();

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><title>Inrcettare sessioni</title></head>");
		out.println("<body>");
		out.println("<h1>"+intestazione+"</h1>");
		out.println("<p> id univoco di sessione:&nbsp; "+session.getId()+"</p>");
		out.println("<p> id univoco di sessione:&nbsp; "+session.getId()+"</p>");
		out.println("Creazione sessione:&nbsp;"+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date(session.getCreationTime()))+"</p>");
		out.println("Numero accessi "+accessi);
		out.println("</body>");
		out.println("</html>");
		
	}


}
