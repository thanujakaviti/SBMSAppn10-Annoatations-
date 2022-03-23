package in.jt;

import org.springframework.stereotype.Service;

@Service
public class C {
	public C() {
		System.err.println(" C :: Constructor");
	}
	void m3() {
		System.out.println(" C:: m3");
	}
}
