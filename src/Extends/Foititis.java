package Extends;

public class Foititis extends Human {
	protected int ssn;
	protected double grade;
	public Foititis(String name,String surname,int afm,String address,int ssn,double grade) {
		super(name,surname,afm,address);
		this.ssn=ssn;
		this.grade=grade;
	}
	protected void setGrade(double grade) {
		this.grade=grade;
	}
	protected double getGrade() {
		return grade;
	}
	protected int getSsn() {
		return ssn;
	}
	protected void setSsn(int ssn) {
		this.ssn=ssn;
		int counter=0;
		while(ssn!=0) {
			ssn=ssn/10;
			++counter;
		}
		if(counter<=5) {
			System.out.println("");
			System.out.println("The number of digits are " + counter);
		}
		else {
			System.out.println("The number of digits are wrong");
		}
	}
	protected void Going() {
		System.out.println("Many times foititis is not going to the shcool");
	}
	
	

}
