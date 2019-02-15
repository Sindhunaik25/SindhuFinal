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

/**
 * Servlet implementation class RegisterValidate
 */
@WebServlet("/register")
public class RegisterValidate extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		LoginDAO dao=new LoginDAO();
		String name1= request.getParameter("name");
		String email1 = request.getParameter("email");
		String password1 = request.getParameter("Password");
		String phone1 = request.getParameter("Phone");
		pw.println(name1);
	
    // String status=dao.getInsertData(name1,email1,password1,phone1);
 	LoginDAO obj = new LoginDAO();
		boolean existingUser;
		try {
			existingUser= obj. checkExistingUser(email1);
			if(existingUser){
				String invalidMessage = "User already exists. Please Login!!!!!!!";
				request.setAttribute("existingUser", invalidMessage);
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
			else {
				
				String status=dao.getInsertData(name1,email1,password1,phone1);	
		    	  pw.println("<h1>sucess</h1>");
		    	  RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		    	  rd.forward(request,response );
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
		
	}

	
		
		

}
