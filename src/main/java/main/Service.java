package main;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Service {
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
	
	public JSONObject convertMapToJSONObject() {
		JSONObject obj = new JSONObject(accounts);
		return obj;
	}

	public Integer getAccountsByName(String string) {
		return 0;
	}
	
	

}
