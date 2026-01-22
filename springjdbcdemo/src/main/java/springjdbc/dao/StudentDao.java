package springjdbc.dao;

import java.util.List;

import springjdbc.model.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	public int deleteStudent(int htno);
	public List<Student> getAllStudents();
	public Student getStudent(int htno);
	// Write the code for the Update Method

}
