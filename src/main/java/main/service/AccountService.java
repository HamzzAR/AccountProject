package main.service;

import javax.inject.Inject;

import main.repo.AccountRepo;
import main.util.ToJSON;

public class AccountService {
	
	@Inject
	ToJSON json;
	
	@Inject
	AccountRepo repo;

	public AccountService() {
	}
	
	public String addAccount(String accountJSON) {
		return this.repo.addAccount(accountJSON);
	}
	
	public void setJson(ToJSON json) {
		this.json = json;
	}
	
	public void setRepo(AccountRepo repo) {
		this.repo = repo;
	}
	
	public String getAccount(int number) {
		return this.json.convertToJSON(this.repo.getAccount(number));
	}
	

}
