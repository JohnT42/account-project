package com.qa.simple.account_application;
import java.util.HashMap;

public class Service {
	HashMap <Integer, Person> map=new HashMap<Integer, Person>();
	static int accountnum=0;
			
	public void addAccount(String firstName, String lastName) {
		accountnum++;
		this.map.put(accountnum, new Person(firstName, lastName));	
	}
	
	public void getAccountDetails(int accountNumber) {
		Person account=map.get(accountNumber);
		System.out.println("First Name: "+account.getFirstname()+"\n"+"Last Name: "+account.getLastname()
		);
	}
	
}
