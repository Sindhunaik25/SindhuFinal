package com.naik.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username1 = request.getParameter("name");
		out.println(username1);
		String password1 = request.getParameter("password");
		out.println(password1);
		String gender1 = request.getParameter("gender");
		out.println(gender1);
		String hobby1 = request.getParameter("h1");
		out.println(hobby1);
		String hobby2 = request.getParameter("h2");
		out.println(hobby2);
		String hobby3 = request.getParameter("h3");
		out.println(hobby3);
		String city = request.getParameter("city");
		out.println(city);

	}

}
