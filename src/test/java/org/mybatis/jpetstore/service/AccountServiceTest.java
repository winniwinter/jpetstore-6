package org.mybatis.jpetstore.service;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mybatis.jpetstore.domain.Account;
import org.mybatis.jpetstore.persistence.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/applicationContext.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountServiceTest {

	@Autowired
	private AccountMapper accountMapper;

	@Autowired
	private AccountService accountService;

	@Test
	public void atest() {
		Account account = new Account();
		account.setUsername("blub");
		account.setPassword("bla");
		account.setAddress1("bla");
		account.setEmail("blub@bla.com");
		account.setFirstName("Demo");
		account.setLastName("nunu");
		account.setCity("lala");
		account.setState("DE");
		account.setZip("64554");
		account.setCountry("lasdjf");
		account.setStatus("");
		account.setAddress2("923");
		account.setPhone("234");
		account.setFavouriteCategoryId("ldjfkd");
		account.setLanguagePreference("EN");

		accountService.insertAccount(account);

		// accountMapper.insertAccount(account);
	}

	@Test
	public void btest() {
		Account accountByUsername = accountService.getAccount("blub");

		Assert.assertNotNull(accountByUsername);

	}
}
