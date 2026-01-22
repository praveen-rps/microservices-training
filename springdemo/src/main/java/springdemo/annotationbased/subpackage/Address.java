package springdemo.annotationbased.subpackage;

import org.springframework.stereotype.Component;

@Component("addr2")
public class Address {
	
	int dno;
	String street;
	String city;
	
	public Address() {
		this.dno=1111;
		this.street="Mg Road";
		this.city="bangalore";
	}

	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	

}
