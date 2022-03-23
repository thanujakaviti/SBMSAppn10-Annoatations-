package in.jt;

import org.springframework.stereotype.Component;

@Component
public class A {
	public A() {
		System.err.println(" A :: Constructor");
	}
	void m1() {
		System.out.println(" A :: m1");
	}
}
