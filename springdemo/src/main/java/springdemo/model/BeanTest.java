package springdemo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("d://beans.xml");
		
		Book book = (Book) context.getBean("book1");
		Book book1 = (Book) context.getBean("book1");
		
		System.out.println(book.hashCode());
		System.out.println(book1.hashCode());
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
		Address adr =(Address) context.getBean("address1");
		System.out.println(adr);
		
		Person p = context.getBean(Person.class);
		System.out.println(p);
		
		
		

	}

}
