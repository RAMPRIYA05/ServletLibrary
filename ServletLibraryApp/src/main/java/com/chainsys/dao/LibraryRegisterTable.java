package com.chainsys.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.model.Library;

/**
 * Servlet implementation class LibraryRegisterTable
 */
@WebServlet("/LibraryRegisterTable")
public class LibraryRegisterTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibraryRegisterTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<a href='LibraryRegisterTable.html'>Register Table</a>");  
	        out.println("<h1>Library List</h1>");  
	          
	        List<Library> list=LibraryDao.getAllLibrary();  
	        out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>Name</th><th>CardNumber</th><th>EmailId</th><th>Password</th><th>PhoneNumber</th><th>Address</th><th>City</th><th>PinCode</th><th>District</th><th>State</th><th>Gender</th><tr>");     
	        for(Library libraryPojo:list)
	        {  
	            out.print("<tr><td>"+libraryPojo.getName()+"</td><td>"+libraryPojo.getCardNumber()+"</td><td>"+libraryPojo.getEmailId()+"</td><td>"+libraryPojo.getPassword()+"</td><td>"+libraryPojo.getPhoneNumber()+"</td><td>"+libraryPojo.getAddress()+"</td><td>"+libraryPojo.getCity()+"</td><td>"+libraryPojo.getPinCode()+"</td><td>"+libraryPojo.getDistrict()+"</td><td>"+libraryPojo.getState()+"</td><td>"+libraryPojo.getGender()+"</td><tr>");
	        }
	        out.print("</table>");  
	          
	        out.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
