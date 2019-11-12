package com.lti.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.lti.dao.ExtendedDAO;
import com.lti.dao.GenericDao;
import com.lti.model.Account;
import com.lti.model.Transaction;

public class AccountService {

	public void openAccount(Account acc) {
		GenericDao dao = new GenericDao();
		dao.insert(acc);
		// sending an email to the customer

	}

	public void withdraw(int accno, double amount) {
		GenericDao dao = new GenericDao();
		Account obj = (Account) dao.fetchById(Account.class, accno);
		Transaction tran = createTransaction(obj,"Withdraw");
		
		double bal = obj.getBalance() - amount;
		if (bal > 500) {
			obj.setBalance(bal);
			tran.setAccount(obj);
			dao.insert(obj);
			dao.insert(tran);
		}

	}

	public void deposit(int accno, double amount) {
		GenericDao dao = new GenericDao();
		Account obj = (Account) dao.fetchById(Account.class, accno);
		Transaction tran = createTransaction(obj,"Deposit");
		
		obj.setBalance(obj.getBalance() + amount);
		tran.setAccount(obj);
		dao.insert(obj);
		dao.insert(tran);
	}

	public void transfer(int fromAcno, double amount, int toAcno) {
		GenericDao dao = new GenericDao();
		Account obj = (Account) dao.fetchById(Account.class, fromAcno);
		Transaction obj_trac = createTransaction(obj, "Transfer");
		
		Account obj1 = (Account) dao.fetchById(Account.class, toAcno);
		Transaction obj_trac1 = createTransaction(obj, "Transfer");
		
		if(obj.getBalance()>amount && (obj.getBalance()-amount)>500) {
		obj.setBalance(obj.getBalance() - amount);
		obj_trac.setAccount(obj);

		obj1.setBalance(amount + obj1.getBalance());
		obj_trac1.setAccount(obj1);
		
		dao.insert(obj);
		dao.insert(obj1);
		dao.insert(obj_trac);
		dao.insert(obj_trac1);
		}
	}

	public double checkBalance(int accno) {
		GenericDao dao = new GenericDao();
		Account obj = (Account) dao.fetchById(Account.class, accno);
		
		return obj.getBalance();
	}

	private Transaction createTransaction(Account acc, String type) {
		
		Transaction trans = new Transaction();
		trans.setAccount(acc);
		trans.setDateAndTime(LocalDateTime.now());
		trans.setType(type);
		
		return trans;
	}
	
	public List<Account> showType(String type){
		ExtendedDAO ex = new ExtendedDAO();
		List<Account>  li = ex.fetchFromType(type);
		return li;
	}
	
	public List<Transaction> showTop(int type){
		ExtendedDAO ex = new ExtendedDAO();
		List<Transaction>  li = ex.returnValues(type);
		return li;
	}
	public  List<Transaction> showDateAndTime(int id,LocalDate date){
		ExtendedDAO d=new ExtendedDAO();
		List<Transaction> li=d.returnDateAndTime(id, date);
		return li;
			
	}
}
