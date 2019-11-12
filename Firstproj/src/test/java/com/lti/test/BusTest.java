package com.lti.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Bus;
import com.lti.model.Stop;

public class BusTest {

	@Test
	public void test() {
		GenericDao dao = new GenericDao();
		Bus b = new Bus();
		b.setOperator("vrl");
		b.setSource("Mahape");
		b.setDestination("Pune");
		b.setArrivalTime(LocalTime.of(07, 15));
		b.setDepartureTime(LocalTime.of(8, 30));
		Stop s1 = new Stop();
		s1.setName("Vashi");
		s1.setArrivalTime(LocalTime.of(05, 9));
		s1.setDepartureTime(LocalTime.of(05, 30));
		
		Stop s2 = new Stop();
		s2.setName("Thane");
		s2.setArrivalTime(LocalTime.of(05, 40));
		s2.setDepartureTime(LocalTime.of(05, 45));
		
		Stop s3 = new Stop();
		s3.setName("Kopar");
		s3.setArrivalTime(LocalTime.of(06, 45));
		s3.setDepartureTime(LocalTime.of(06, 50));
		
		Stop s4 = new Stop();
		s4.setName("Ghansoli");
		s4.setArrivalTime(LocalTime.of(06, 50));
		s4.setDepartureTime(LocalTime.of(06, 55));
		
		List<Stop> stops=new ArrayList<Stop>();
		stops.add(s1);
		stops.add(s2);
		stops.add(s3);
		stops.add(s4);
		s1.setBus(b);
		s2.setBus(b);
		s3.setBus(b);
		s3.setBus(b);
		b.setStops(stops);
		dao.insert(b);	
	}
	@Test
	public void fetchBus() {
		GenericDao dao=new GenericDao();
		Bus b=(Bus) dao.fetchById(Bus.class,484);
		
		System.out.println(b.getOperator());
		System.out.println(b.getDepartureTime());
		System.out.println(b.getArrivalTime());
		
		for(Stop stop : b.getStops()) {
			System.out.println(stop.getName());
			System.out.println(stop.getArrivalTime());
			System.out.println(stop.getDepartureTime());
		}
	}
	@Test
	public void fetchStop() {
		GenericDao dao=new GenericDao();
		Stop stop=(Stop)dao.fetchById(Stop.class, 486);
		
		System.out.println(stop.getName());
		System.out.println(stop.getArrivalTime());
		
		Bus bus=stop.getBus();
		System.out.println(bus.getOperator());
		System.out.println(bus.getSource());
		System.out.println(bus.getDestination());
	}
	
}
