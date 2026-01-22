package springdemo.annotationbased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
@Primary
public class DaoImpl implements Dao {

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySql connections is established");

	}

	@Override
	public void loadDriver() {
		// TODO Auto-generated method stub
		System.out.println("MySql driver is loaded");


	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("MySql connections is closed");


	}

}
