package com.sindhu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(
		description = "My First Servlet File", 
		urlPatterns = { 
				"/FirstServlet", 
				"/first"
		})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FirstServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("hello");
	}

	
	
}
