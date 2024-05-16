package com.chainsys.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Library
 */
@WebServlet("/Library")
public class Library extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Library() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("name");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		int phoneNumber=Integer.parseInt(request.getParameter("phoneNumber"));
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		int pinCode=Integer.parseInt(request.getParameter("pinCode"));
		String district=request.getParameter("district");
		String state=request.getParameter("state");
		String gender=request.getParameter("gender");
		PrintWriter out=response.getWriter();
		out.println(name);
		out.println(emailId);
		out.println(password);
		out.println(phoneNumber);
		out.println(address);
		out.println(city);
		out.println(pinCode);
		out.println(district);
		out.println(state);
		out.println(gender);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
