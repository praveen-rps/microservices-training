package springdemo.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DbService {
	
	@Autowired
	@Qualifier("oracle")
	Dao dao;
	
	public void showDetails() {
		dao.loadDriver();
		dao.getConnection();
		dao.close();
	}

}
