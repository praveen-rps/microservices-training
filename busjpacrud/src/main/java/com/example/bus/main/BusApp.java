package com.example.bus.main;

import com.example.bus.dao.BusDao;
import com.example.bus.dao.BusDaoImpl;
import com.example.bus.entity.Bus;
public class BusApp {
	public static void main(String[] args) {
		BusDao dao = new BusDaoImpl();
		dao.save(new Bus("KA-01-1234", "Bangalore", "Chennai", 150));
		dao.save(new Bus("KA-01-4564", "Hyderabad", "Chennai", 50));
		dao.save(new Bus("KA-01-7890", "Chennai", "Madurai", 75));
		dao.save(new Bus("KA-01-1010", "Mysore", "Bangalore", 40));
		dao.findAll().forEach(System.out::println);
		
		Bus bus = dao.find(9L)	;
		if(bus!=null)
			System.out.println(bus);
		else
			System.out.println("Bus not found..!");
		
	}
}
