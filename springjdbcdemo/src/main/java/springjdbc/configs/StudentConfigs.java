package springjdbc.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages="springjdbc")
public class StudentConfigs {
		
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(createDataSource());
		return template;
	}
	
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ctsdb");
		ds.setUsername("root");
		ds.setPassword("your_password");
		return ds;
	}
}


