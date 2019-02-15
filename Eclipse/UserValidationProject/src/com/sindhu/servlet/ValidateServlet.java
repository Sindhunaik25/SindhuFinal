package com.sindhu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sindhu.dao.IUserDAO;
import com.sindhu.dao.InvalidUserException;
import com.sindhu.dao.UserDAO;
import com.sindhu.utility.DAOUtility;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		RequestDispatcher requestDispatcher = null;
		// out.println("<h1>Hello Everyone</h1>");
		String userName, password;
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		String userType = "Invalid";
		try {
			userType = getUserType(userName, password);

			if (userType.equals("Admin")) {
				requestDispatcher = request.getRequestDispatcher("/admin");
			} else if (userType.equals("User")) {
				requestDispatcher = request
						.getRequestDispatcher("/UserServlet");
				out.print("<h1>Welcome user </h1>" + userName);
			} else {
				requestDispatcher = request.getRequestDispatcher("/invalid");
				out.print("<h1>Invalid user </h1>");
			}
			requestDispatcher.forward(request, response);
		} catch (InvalidUserException e) {
			out.print("<h1>Invalid User</h1>" + e);
		}

	}

	public String getUserType(String userName, String password) {
		IUserDAO dao = DAOUtility.getUserDAO();
		//System.out.println(userName + " " + password);
		return dao.getUserType(userName, password);

	}

}
