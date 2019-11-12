package com.lti.test;



import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.lti.model.Account;
import com.lti.model.Transaction;
import com.lti.service.AccountService;

public class testBank {

	@Test
	public void openAccount() {
		Account a = new Account();
		a.setAcno(148);
		a.setBalance(80020);
		a.setName("yzewsdfgsd1");
		a.setType("current");
		
		AccountService ac = new AccountService();
		ac.openAccount(a);
	}

	@Test
	public void withdrawTest() {
		AccountService ac = new AccountService();
		ac.withdraw(1234, 4000);
	}
	
	@Test
	public void depositTest() {
		AccountService ac = new AccountService();
		ac.deposit(124,5000);
	}
	
	@Test
	public void transferTest() {
		AccountService a = new AccountService();
		a.transfer(1234, 500, 124);
	}
	
	@Test
	public void getBalTest()
{
		AccountService ac = new AccountService();
		double bal =ac.checkBalance(1234);
		System.out.println("balance is : "+bal);
		}
	
	@Test
	public void getType() {
		AccountService a = new AccountService();
	
		List<Account> e = a.showType("current");
		for(Account acc : e) {
			System.out.println(acc);
		}
	}
	@Test
	public void getTop() {
		AccountService a = new AccountService();
	
		List<Transaction> e = a.showTop(1234);
		for(Transaction acc : e) {
			System.out.println(acc.getDateAndTime());
		}
		
	}
	@Test
	public void getspecficDateAndTime() {
		AccountService a = new AccountService();
		System.out.println(LocalDate.of(2019, 11, 9));
		List<Transaction> t=a.showDateAndTime(124,LocalDate.of(2019, 11, 9));
		for(Transaction acc : t) {
			System.out.println(acc.getDateAndTime());
		}
	}
}
