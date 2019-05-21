
public class App {

	public App() {
		System.out.println("Hello World to the standard out");
		Service service = new Service();
		
		Account acc = new Account("Hamza","Razeq",1);
		service.addAccount(acc);
		System.out.println(service.getAccount(1).getFirstName());
	}

	public static void main(String[] args) {
		new App();

	}

}
