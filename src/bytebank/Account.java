package bytebank;

public class Account {
	private double balance;
	private int agency;
	private int number;
	private Client name;
	private static int total = 0;
	
	public Account(int agency, int number) {
		Account.total++;
		System.out.println("Accounts total: " + Account.total);
		this.agency = agency;
		this.number = number;
		this.balance = 100;
		System.out.println("Created account" + this.number);
	}
	
	public void credit(double value) {
		this.balance = this.balance + value;
	}
	
	public boolean debit(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		
		return false;
	}
	
	public boolean transfer(double value, Account destiny) {
		if (this.balance >= value) {
			this.balance -= value;
			destiny.credit(value);
			return true;
		}
		
		return false;
		
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("Invalid number");
			return;
		}
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("Invalid number");
			return;
		}
	}
	
	public void setClient(Client client) {
		this.name = client;
	}
	
	public Client getClient() {
		return this.name;
	}
	
	public static int getTotal() {
		return Account.total;
	}
}
