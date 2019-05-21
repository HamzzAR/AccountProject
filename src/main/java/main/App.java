package main;

public class App {

	public App() {
		System.out.println("Hello World to the standard out");
		Service service = new Service();
		
		Account acc = new Account("Hamza","Razeq");
		Account acc2 = new Account("Ali","Azi");
		service.addAccount(acc);
		service.addAccount(acc2);
		
		System.out.println(service.getAccount(1).getFirstName());
		System.out.println(acc.getAccountNumber());
		
		System.out.println(service.getAccount(2).getFirstName());
		System.out.println(acc2.getAccountNumber());
		
		
	}

	public static void main(String[] args) {
		new App();

	}


}
