package hw3;

public class Account {
	public String owner = "";
	private double balance = 0.0;
	protected int pin;
	String internalNote = "";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Account(String owner, double balance, int pin, String internalNote) {
		this.owner = owner;
		this.balance = balance;
		this.pin = pin;
		this.internalNote = internalNote;
	}
	public double getBalance() {
		return balance;
	}
	public void changePin(int pin) {
		if(this.pin == pin) {
			this.pin = pin;
		}
	}
	
 
}
