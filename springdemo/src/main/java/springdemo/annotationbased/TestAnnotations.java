package springdemo.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import springdemo.javabased.FlightConfig;
import springdemo.model.Address;

public class TestAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AnnotConfig.class);
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		Teacher teacher = context.getBean(Teacher.class);
		System.out.println(teacher);
		//Address address = (Address)context.getBean("addr2");
		//System.out.println(address);
		
		Book book  = context.getBean(Book.class);
		System.out.println(book);
		DbService service = context.getBean(DbService.class);
		service.showDetails();
		


	}

}
