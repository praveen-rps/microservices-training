package springjdbc.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springjdbc.configs.StudentConfigs;
import springjdbc.model.Student;
import springjdbc.service.StudentService;
import springjdbc.service.StudentServiceImpl;

public class StudentController {
	
	public static void main(String args[]) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(StudentConfigs.class);
		StudentService service = context.getBean(StudentServiceImpl.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter htno");
		int htno = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter branch ");
		String branch = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		Student student = new Student(htno,name,branch,email);
		
		int k = service.addStudent(student);
		
		//int k = service.deleteStudent(htno);
		
		if(k>=1)
			System.out.println("Record added..!");
		else
			System.out.println("Not added..!");
		
		//service.getAllStudents().forEach(System.out::println);
	//System.out.println(service.getStudent(htno));
		
	}

}
