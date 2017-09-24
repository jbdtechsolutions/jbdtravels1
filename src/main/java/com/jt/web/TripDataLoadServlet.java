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

public class TripDataLoadServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	String custId = "";
	String custName = "";
	String primaryContact;
	String secondryContact;
	String email = "";

	String addressOthers = "";
	String addressType = "";
	String city;
	String doorNo;
	String landMark = "";
	String street1 = "";
	String street2 = "";
	String sub_location;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*		request.getParameter(custId);
		request.getParameter(custName);
		request.getParameter(primaryContact);
		request.getParameter(secondryContact);
		request.getParameter(email);*/
		
		Customer customer = new Customer();
		Address address = new Address();
		JBDCoreBusiness core = new JBDCoreBusiness();
		JbdTravelsDao jbdTravelsDao = new JbdTravelsDao();
		/*Getting Customer Personal Details From New Registration Form */
		//customer.setCustId(request.getParameter("FcustId"));
		customer.setCustId("00111");
		customer.setCustName(request.getParameter("FcustName"));
		customer.setPrimaryContact(request.getParameter("FprimaryContact"));
		customer.setSecondryContact(request.getParameter("FsecondryContact"));
		customer.setEmail(request.getParameter("Femail"));
		
		/*Getting Customer Address Details From New Registration Form */
		
		//address.setAddressType(request.getParameter("FaddressType"));
		address.setAddressType("Permanent");
		address.setDoorNo(request.getParameter("FdoorNo"));
		address.setStreet1(request.getParameter("Fstreet1"));
		address.setStreet2(request.getParameter("Fstreet2"));
		address.setLandMark(request.getParameter("FlandMark"));
		address.setSub_location(request.getParameter("Fsub_location"));
		address.setAddressOthers(request.getParameter("FaddressOthers"));
		address.setCity(request.getParameter("Fcity"));
		
		customer.setCustAdd(address);
		try {
			customer.setCustId(core.generateCustomerId(customer.getCustAdd().getCity()));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

			
			String result;
			try {
				result = jbdTravelsDao.sendCustomerDetails(customer);
				if("SUCCESS".equalsIgnoreCase(result)){
					System.out.println("Customer Registered Successfully");
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	
