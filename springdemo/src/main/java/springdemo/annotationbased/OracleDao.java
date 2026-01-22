package springdemo.annotationbased;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleDao implements Dao {

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("Oracle connections is established");

	}

	@Override
	public void loadDriver() {
		// TODO Auto-generated method stub
		System.out.println("Oracle driver is loaded");


	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Oracle connections is closed");


	}


}
