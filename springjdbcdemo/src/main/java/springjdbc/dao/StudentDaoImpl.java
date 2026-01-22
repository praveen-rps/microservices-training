package springjdbc.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springjdbc.model.Student;
import springjdbc.model.StudentRowMapper;

@Component
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student values(?,?,?,?)";
		
	return template.update(query,student.getHtno(), student.getName(),student.getBranch(), 
			student.getEmail());
		
	}

	@Override
	public int deleteStudent(int htno) {
		// TODO Auto-generated method stub
		String query = "delete from student where htno = ?";
		return template.update(query,htno);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		return template.query(sql,new StudentRowMapper());
		
	}

	@Override
	public Student getStudent(int htno) {
		// TODO Auto-generated method stub
		
		String query = "select * from student where htno=?";
		List<Student> students = getAllStudents();
		Student temp=null;
		temp = students.stream()
				.filter(n->n.getHtno()==htno)
				.map(p->p).collect(Collectors.toList())
				.get(0);
		return temp;
	}

		
		
		
	}


