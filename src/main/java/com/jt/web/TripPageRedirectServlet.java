package com.jt.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jt.bean.customer.Address;
import com.jt.bean.customer.Customer;
import com.jt.core.JBDController;
import com.jt.core.JBDCoreBusiness;
import com.jt.dao.JbdTravelsDao;

public class TripPageRedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String custType = request.getParameter("custType");
		
		System.out.println("custType : " + custType);
		if (custType.equalsIgnoreCase("existingCustomer")) {
			response.sendRedirect("trip.html");
		} else if (custType.equalsIgnoreCase("newCustomer")) {
			response.sendRedirect("custReg.html");

		} else if (custType.equalsIgnoreCase("rePayment")) {

			response.sendRedirect("customer_choice.html");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
