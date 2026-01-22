package springdemo.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springdemo.model.Address;

public class TestAnnotationConfigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new AnnotationConfigApplicationContext(FlightConfig.class);
		
		Flight flight1 = (Flight)context.getBean("flight2");
		System.out.println(flight1.hashCode());
		
		Flight flight2 = (Flight)context.getBean("flight2");
		System.out.println(flight2.hashCode());
		
		Address addr1 =(Address) context.getBean("address1");
		System.out.println(addr1);
		
		Address addr2 =(Address) context.getBean("address2");
		System.out.println(addr2);

		
		
	}

}
