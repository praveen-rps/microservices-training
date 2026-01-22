package springjdbc.model;

public class Student {
	
	int htno;
	String name;
	String branch;
	String email;
	
	public Student() {
		
	}

	public Student(int htno, String name, String branch, String email) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", branch=" + branch + ", email=" + email + "]";
	}
	

}
