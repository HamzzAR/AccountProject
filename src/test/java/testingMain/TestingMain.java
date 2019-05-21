package testingMain;

import main.Account;
import main.Service;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestingMain {
	private Service service  = new Service();
	
	@Test
	public void getAccountsByNameTest() {
		Account acc = new Account("hamza","Razeq");
		Account acc2 = new Account("hamza","Azi");
		service.addAccount(acc);
		service.addAccount(acc2);
		
		int result = service.getAccountsByName("hamza");
		System.out.println(result);
		int expected = 2;
		assertEquals(expected,result);
	}
	
	@Test
	public void getAccountsByNameTest2() {
		Account acc = new Account("hamza","ali");
		Account acc2 = new Account("ali","Azi");
		Account acc3 = new Account("ali","hamza");
		Account acc4 = new Account("hamza","Azi");
		Account acc5 = new Account("ali","Azi");
		
		service.addAccount(acc);
		service.addAccount(acc2);
		service.addAccount(acc3);
		service.addAccount(acc4);
		service.addAccount(acc5);
		
		int result = service.getAccountsByName("ali");
		System.out.println(result);
		int expected = 3;
		assertEquals(expected,result);
	}

}
