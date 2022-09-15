package in.jt;

import org.springframework.stereotype.Component;

@Component
public class A {
	public A() {
		System.err.println(" A :: Constructor");
		m1();
	}
	void m1() {
		System.out.println(" A :: m1");
	}
}
