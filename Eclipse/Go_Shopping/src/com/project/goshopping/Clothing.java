package com.project.goshopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Clothing extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		String email1 = request.getParameter("email");
		String pass1 = request.getParameter("password");

		LoginDAO obj = new LoginDAO();

		try {
			boolean valid = obj.checkLogin(email1, pass1);
			System.out.println(valid);
			if (valid) {
				/*RequestDispatcher rd=request.getRequestDispatcher("Clothing.jsp");
				rd.forward(request, response);*/
				HttpSession session= request.getSession();
				session.setAttribute("email", email1);
				response.sendRedirect("index.jsp");
			}
			else{
				String invalidMessage = "Invalid Credentials. Enter valid credentials!!s.";
				request.setAttribute("invalidMessage", invalidMessage);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			    
			}
			
		} 
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		

		
	}

}
