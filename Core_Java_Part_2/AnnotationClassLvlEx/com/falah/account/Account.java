package com.falah.account;

import com.falah.annotation.Bank;

@Bank()
public class Account {
	String accname;
	int accno;
	int accbalance;
	public Account(String accname, int accno, int accbalance) {
		super();
		this.accname = accname;
		this.accno = accno;
		this.accbalance = accbalance;
	}
	
	public void getAccountDetails() {
		System.out.println("Account Details here-->");
		System.out.println("-----------------------");
		System.out.println("Account Number : "+accno);
		System.out.println("Account Name : "+accname);
		System.out.println("Account Balance : "+accbalance);
	}

}
