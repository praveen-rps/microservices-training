package springdemo.model;

public class Employee {
	
	int empid;
	String name;
	String dept;
	
	public Employee() {
		System.out.println("Inside employee constructor..!");
	}

	
	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}


	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void initMethod() {
		System.out.println("this method is called at intialization phase ");
	}
	
	public void destroyMethod() {
		System.out.println("this method is called before bean destroy");
	}

	public void service() {
		System.out.println("Service method is called..!");
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	

}
