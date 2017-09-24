package com.jt.poc.test;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jt.dao.trip.TripDAOImpl;


public class ExecuteJT {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/jt-servlet.xml");
		//SimpleHelloBean obj = (SimpleHelloBean) context.getBean("helloBean");
		TripDAOImpl tripdao = (TripDAOImpl) context.getBean("tripJDBCTemplate");
		//obj.sayName();
		System.out.println(tripdao.getTrip("KTP001").travelTo);
		//System.out.println(System.currentTimeMillis());

	}

}
