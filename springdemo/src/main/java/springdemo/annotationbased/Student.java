package springdemo.annotationbased;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
public class Student {
	
	int htno;
	String name;
	String branch;
	
	public Student() {
		this.htno=1244;
		this.name="Hari";
		this.branch="CSE";
	}

	public Student(int htno, String name, String branch) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
	}

	public int getHtno() {
		return htno;
	}

	public void setHtno(int htno) {
		this.htno = htno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
	}
	

}
