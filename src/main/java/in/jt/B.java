package in.jt;

import org.springframework.stereotype.Controller;

@Controller
public class B {
	public B() {
		System.err.println(" B :: Constructor");
	}
	void m2() {
		System.out.println(" B :: m2");
	}
}
