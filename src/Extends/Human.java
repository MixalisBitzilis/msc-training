package Extends;

public class Human {
	private String name;
	private String surname;
	private long afm;
	private String address;
	public  Human() {}
	
	public Human(String name,String surname,long afm,String address) {
		this.name=name;
		this.surname=surname;
		this.afm=afm;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public long getAfm() {
		return afm;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setAfm(long afm) {
		this.afm=afm;
		int counter=0;
		while(afm!=0) {
			afm=afm/10;
			++counter;
		}
		if(counter<=9) {
			System.out.println("Afm is correct and it is " + this.afm);
		}
		else {
			System.out.println("Afm is incorrect");
		} 
	}
	public void setAddress(String address) {
		this.address=address;
		if(this.address.startsWith("A")) {
		System.out.println("Your address is  " + this.address + "\n");}
		else {
			System.out.print("Wrong address");}
	}
	public void shout() {
		System.out.println("The human is shouted");
	}
	public static void main(String[] args) {
		Human h = new Human("mixalis","bitzilis",123456789,"anaksarxoy 14");
		h.setAfm(153490032);
		System.out.println(h.getAfm());
		h.setAddress("\nLaodikeias");
		Foititis f = new Foititis("giannis","kalopoulos",123456897,"piliou 20",17002,18.2);
		f.setSsn(17008);
		f.getSsn();
		System.out.println(f.getSsn());
		
		
		
	}
}


