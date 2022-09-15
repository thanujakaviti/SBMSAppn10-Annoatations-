package in.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp10Application {

	public static void main(String[] args) {
		System.out.println("spring main class started");
		System.out.println("11111111111111111111111111111111111111111111111111111");
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp10Application.class, args);
		Course bean = context.getBean(Course.class);
		
	

		System.out.println("spring main class ended");
		System.out.println("****************^^^^^^^^^^^^^^^^^^************############################");
	}

}
