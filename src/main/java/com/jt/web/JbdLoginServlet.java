package com.jt.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jt.dao.JbdTravelsDao;


@WebServlet("/JbdTravelsLoginServlet")
public class JbdLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JbdTravelsDao dbobj = new JbdTravelsDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JbdLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		System.out.println("Calling Do post ...");
		// String result =
		// dbobj.valoidateLogin(request.getParameter("Fusername"),request.getParameter("Fpassword"));
		response.setContentType("text/html");
		
		
		String lusername = "test";
		String lpassword = "1";
		
		
		/*if ("test".equalsIgnoreCase(lusername) && "1".equals(lpassword)) {
			response.sendRediret("custType.html");
		}*/
		
		// ** Commented 59 - 69 line for testing **
		
		/*if ("SUCCESS".equalsIgnoreCase(result)) {
			response.sendRedirect("custType.html");
			// RequestDispatcher
			// rd=request.getRequestDispatcher("customer_choice.html");
			// rd.forward(request,response);
			System.out.println("Login Success!!....");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
			out.print("Please enter correct User Name / Password");
		}*/

		// Actual logic goes here.
		// PrintWriter out = response.getWriter();
		// out.println("<h1>" + result + "</h1>");
		// response.getWriter().print(result);
		// .getOutputStream().print(getServletName());;

	}

}
