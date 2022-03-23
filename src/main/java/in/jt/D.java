package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class D {
	
	public D() {
		System.err.println(" D :: Constructor");
	}
	void m4() {
		System.out.println(" D :: m4");
	}
	@Override
	public String toString() {
		return "D [ins=" + ins + "]";
	}
}
