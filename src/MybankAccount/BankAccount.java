package MybankAccount;

public class BankAccount implements Iinterest {
	private static int id=1000;
	private String ssn;
	private String accountnumber;
	private static final  String routingnumber="005400657";
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN,double balance) {
		System.out.println("New Account created");
		this.SSN=SSN;
		this.balance=balance;
		id++;
		setAccountnumber();
	}
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("123456789",652.5);
		BankAccount account2 = new BankAccount("1147852369",652.5);
		BankAccount account3 = new BankAccount("987456321",652.5);
		account1.setName("maik");
		account1.getName();
		//System.out.println(account1.getName());
		account1.katathesi(222.5);
		account1.analipsi(500);
		account1.SetAccrue();
		System.out.println(account1.toString());
	}
	private void setAccountnumber() {
		int random=((int)Math.random()*100);
		accountnumber=id + "" + random +  SSN.substring(0, 2);
		System.out.println("Your account number is " + accountnumber);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void katathesi(double ammount) {
		balance=balance+ammount;
		showbalance();
	}
	public void analipsi(double ammount) {
		balance=balance-ammount;
		if(balance<0) {
			System.out.println("You cant make analipsi");
		}
		else
		showbalance();
	}
	public void showbalance() {
		System.out.println("Balance = " + balance);
	}

	@Override
	public void SetAccrue() {
		// TODO Auto-generated method stub
		balance=balance*(1+(rate/100));
		showbalance();
	}
	@Override
	public String toString() {
		return "[Name : " + name + "]\n[Account number: " + accountnumber + "]\n[Balance : " + balance + "]\n";
	}
}
