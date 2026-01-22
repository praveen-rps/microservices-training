package springdemo.annotationbased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"springdemo.annotationbased"})
public class AnnotConfig {

}
