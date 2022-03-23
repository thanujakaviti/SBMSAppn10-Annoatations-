package in.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp10Application {

	public static void main(String[] args) {
		System.out.println("spring main class started");
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp10Application.class, args);
		Course bean = context.getBean(Course.class);
		
	

		/*		
		A bean1 = context.getBean(A.class);
		System.out.println(bean1+"\t"+bean1.getClass().getName()+"\t"+bean1.hashCode());
		bean1.m1();
		
		
		
		B bean2 = context.getBean(B.class);
		System.out.println(bean2+"\t"+bean2.getClass().getName()+"\t"+bean2.hashCode());
		bean2.m2();
		
		C bean3 = context.getBean(C.class);
		System.out.println(bean3+"\t"+bean3.getClass().getName()+"\t"+bean3.hashCode());
		bean3.m3();
		
		D bean4 = context.getBean(D.class);
		System.out.println(bean4+"\t"+bean4.getClass().getName()+"\t"+bean4.hashCode());
		bean4.m4();
		
		
		
		E bean5 = context.getBean(E.class);
		System.out.println(bean5+"\t"+bean5.getClass().getName()+"\t"+bean5.hashCode());
		bean5.m5();
		*/
		System.out.println("spring main class ended");
	}

}
