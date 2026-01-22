package springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springjdbc.dao.StudentDao;
import springjdbc.model.Student;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao dao;

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.addStudent(student);
	}

	@Override
	public int deleteStudent(int htno) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(htno);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}

	@Override
	public Student getStudent(int htno) {
		// TODO Auto-generated method stub
		return dao.getStudent(htno);
	}

}
