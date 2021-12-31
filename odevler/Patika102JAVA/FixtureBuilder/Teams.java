package FixtureBuilder;

public class Teams {
	private String t1,t2;
	
	public Teams(String t1, String t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}
	
	public void printMatch() {
		
		System.out.println(this.t1 + " vs " + this.t2);
	}
	
}
