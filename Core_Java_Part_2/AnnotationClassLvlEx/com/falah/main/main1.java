package com.falah.main;

import java.lang.annotation.Annotation;

import com.falah.account.Account;
import com.falah.annotation.Bank;

public class main1 {

	public static void main(String[] args) throws Exception {
		Account ac = new Account("Junaid", 111, 25000);
		ac.getAccountDetails();
		System.out.println();
		
		Class cls = Class.forName("com.falah.account.Account");
		Annotation ann = cls.getAnnotation(Bank.class);
		Bank bank=(Bank)ann;
		System.out.println("Bank Details----> ");
		System.out.println("-----------------");
		System.out.println("Bank Id : "+bank.bankid());
		System.out.println("Bank Name : "+bank.bankname());
		System.out.println("Bank Address : "+bank.bankaddress());
	}

}
