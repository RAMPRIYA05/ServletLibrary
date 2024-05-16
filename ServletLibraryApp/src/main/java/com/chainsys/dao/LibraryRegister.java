package com.chainsys.dao;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.model.Library;



//import com.chainsys.model.Library;



/**
 * Servlet implementation class Library
 */
@WebServlet("/LibraryRegister")
public class LibraryRegister extends HttpServlet {
	static Library libraryPojo=new Library();
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibraryRegister() {
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
		int cardNumber=Integer.parseInt(request.getParameter("cardNumber"));
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
		out.println(cardNumber);
		out.println(emailId);
		out.println(password);
		out.println(phoneNumber);
		out.println(address);
		out.println(city);
		out.println(pinCode);
		out.println(district);
		out.println(state);
		out.println(gender);
		
		
// //       List<String> list = new ArrayList<String>();
//       
////        list.add(name);
////        list.add(Integer.toString(cardNumber));
////        list.add(emailId);
////        list.add(password);
////        list.add(Integer.toString(phoneNumber));
////        list.add(address);
////        list.add(city);
////        list.add(Integer.toString(pinCode));
////        list.add(district);
////        list.add(state);
////        list.add(gender);
////        
////        for (String details: list)
////        out.println(details);
//
//
//          list.add(new Library(name,cardNumber,emailId,password,phoneNumber,address,city,pinCode,district,state,gender));
//         request.setAttribute("list", list);
//         RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//         dispatcher.forward(request, response);

		libraryPojo.setName(name);
		libraryPojo.setCardNumber(cardNumber);
		libraryPojo.setEmailId(emailId);
		libraryPojo.setPassword(password);
		libraryPojo.setPhoneNumber(phoneNumber);
		libraryPojo.setAddress(address);
		libraryPojo.setCity(city);
		libraryPojo.setPinCode(pinCode);
		libraryPojo.setDistrict(district);
		libraryPojo.setState(state);
		libraryPojo.setGender(gender);
		 
		int status=LibraryDao.save(libraryPojo);
		
		 if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("Register.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
		 out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Post");
	}

}
