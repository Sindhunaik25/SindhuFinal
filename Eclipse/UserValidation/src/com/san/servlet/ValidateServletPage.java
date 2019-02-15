package com.san.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.dao.UserDAO;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;


@WebServlet("/validate")
public class ValidateServletPage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname,password;
		PrintWriter out=response.getWriter();
		uname=request.getParameter("uname");
		password=request.getParameter("password");
		String userType="Invalid";
		RequestDispatcher rd=null;
		userType=getUserType(uname,password);
		if(userType.equals("Admin"))
		{
			rd=request.getRequestDispatcher("/admin");
		}
		else if(userType.equals("User"))
		{
			rd=request.getRequestDispatcher("/user");
		}
		else
		{
			{
				out.println("Invalid");
			}
		}
	rd.forward(request, response);
	}

	public String getUserType(String uname, String password) {
		
		UserDAO dao=new UserDAO();
		return dao.getUserType(uname,password);
	}

	

}
