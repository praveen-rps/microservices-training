package springdemo.annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Author {
	
	int aid;
	String name;
	public Author() {
		aid=999;
		name="Rod Johnons";
	}
	public Author(int aid, String name) {
		super();
		this.aid = aid;
		this.name = name;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + "]";
	}
	

}
