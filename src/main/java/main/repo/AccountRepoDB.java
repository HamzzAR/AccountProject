package main.repo;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import main.domain.Account;
import main.util.ToJSON;

@Transactional(SUPPORTS)
@Default
public class AccountRepoDB implements AccountRepo{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private ToJSON util;

	
	
	@Override
	@Transactional(REQUIRED)
	public String addAccount(String account) {
		Account acc = util.convertFromJSON(account, Account.class);
		manager.persist(acc);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Override
	public Account getAccount(int id) {
		return manager.find(Account.class, id);
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(int id) {
		if (manager.contains(manager.find(Account.class, id))) {
			manager.remove(manager.find(Account.class, id));
		}
		
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	@Override
	public Account updateAccount(int id, Account account) {
		
		return manager.merge(account);
	}

	@Override
	public String getAllAccounts() {
		TypedQuery<Account> query = manager.createQuery("Select a FROM Account a", Account.class);
		Collection<Account> accounts = query.getResultList();
		return util.convertToJSON(accounts);
	}

}
