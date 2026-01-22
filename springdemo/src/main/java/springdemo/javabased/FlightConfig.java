package springdemo.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import springdemo.model.Address;
import springdemo.model.Person;

@Configuration
public class FlightConfig {
	
	@Bean(value="flight1")
	@Scope("prototype")
	public Flight createFlight1() {
		return new Flight(1001,"Indigo","Chennai","Bangalore");
	}
	
	@Bean("flight2")
	@Scope("prototype")
	public Flight createFlight2() {
		return new Flight(1002,"SpiceJet","Hyderabad","Bangalore");
	}
	
	@Bean("address1")
	public Address createAddress1() {
		return new Address(101,"T Nagar", "Chennai");
	}
	
	@Bean("address2")
	public Address createAddress2() {
		return new Address(102,"Mount Road", "Chennai");
	}
	
	@Bean("person")
	public Person createPerson() {
		return new Person(1001,"Kumar", createAddress1());
	}

}
