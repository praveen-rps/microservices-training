package springjdbc.service;

import java.util.List;

import springjdbc.model.Student;

public interface StudentService {
	
	public int addStudent(Student student);
	public int deleteStudent(int htno);
	public List<Student> getAllStudents();
	public Student getStudent(int htno);

}
