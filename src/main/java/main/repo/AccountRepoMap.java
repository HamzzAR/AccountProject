package main.repo;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import main.domain.Account;


public class AccountRepoMap {
	private Map<Integer,Account> accounts = new HashMap<Integer, Account>();
	private int accountNumber = 1;

	public void addAccount(Account account) {
		accounts.put(accountNumber, account);
		account.setAccountNumber(accountNumber);
		accountNumber++;
	}

	public Account getAccount(int accountNumber) {
		return accounts.get(accountNumber);
	}

	public Integer getAccountsByName(String string) {
		int res = 0;
		for (Entry<Integer, Account> entry : accounts.entrySet()) {
			if(entry.getValue().getFirstName().equals(string)) {
				res++;
			}
		}
		
		return res;
	}


}
