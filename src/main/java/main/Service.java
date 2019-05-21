package main;
import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer,Account> accounts = new HashMap<Integer, Account>();
	private int accountNumber = 1;

	public void addAccount(Account account) {
		if(accounts.isEmpty()) {
			accounts.put(accountNumber, account);
			account.setAccountNumber(accountNumber);
		}else {
			accountNumber++;
			accounts.put(accountNumber, account);
			account.setAccountNumber(accountNumber);
		}
	}

	public Account getAccount(int accountNumber) {
		Account res = null;
		for (Map.Entry<Integer, Account> entry: accounts.entrySet()) {
			if(entry.getKey() == accountNumber) {
				res = entry.getValue();
			}
		}
		
		return res;
	}

}
