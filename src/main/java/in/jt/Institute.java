package in.jt;

import org.springframework.stereotype.Component;


public class Institute {
	
	private String insName;//null
	private String insAddr;//null
	
	public Institute() {
		System.err.println("Institute :: constructor");
	}
	public Institute(String insName, String insAddr) {
		super();
		this.insName = insName;
		this.insAddr = insAddr;
	}
	@Override
	public String toString() {
		return "Institute [insName=" + insName + ", insAddr=" + insAddr + "]";
	}
	
	
}
