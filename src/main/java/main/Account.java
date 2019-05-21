package main;

public class Account {
	private String firstName,lastName;
	private int accountNumber;
	
	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	

}
