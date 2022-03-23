package in.jt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Course {
	
	//@Bean
	public Institute getIns() {
		return new Institute("Prakalpana","Bangloore");
	}
	
	
	

	/*
	 * @Bean public Institute getInstitute() { return new Institute(); }
	 */
	public Course() {
		System.err.println("Course :: Constructor");
	}
	
	
}
