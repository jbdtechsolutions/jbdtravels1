package com.jt.poc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jt.bean.trip.Trip;
import com.jt.dao.trip.TripDAOImpl;

public class DBMainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/beans.xml");

      TripDAOImpl tripJDBCTemplate = (TripDAOImpl)context.getBean("tripJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
     // tripJDBCTemplate.create("Zara", "11");
    //  tripJDBCTemplate.create("Nuha", "2");
   //   tripJDBCTemplate.create("Ayan", "15");

      System.out.println("------Listing Multiple Records--------" );
      List<Trip> trips = tripJDBCTemplate.listTrips();
      for (Trip trip : trips) {
         System.out.print("ID : " + trip.getTripId());
         System.out.print(", Name : " + trip.getTravelTo());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      tripJDBCTemplate.updateTrip("Zara", "Coimbatore");

      System.out.println("----Listing Record with ID = 2 -----" );
      Trip trip = tripJDBCTemplate.getTrip("Zara");
      System.out.print("ID : " + trip.getTripId() + " ");
      System.out.print(", Place : " + trip.getTravelTo() );
	  
   }
}

