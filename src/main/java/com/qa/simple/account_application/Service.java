package com.qa.simple.account_application;
import java.util.HashMap;

import org.json.JSONObject;

public class Service {
	HashMap <Integer, Person> map=new HashMap<Integer, Person>();
	static int count=0;
			
	public void addAccount(String firstName, String lastName, String accountId) {
		count++;
		this.map.put(count, new Person(firstName, lastName, accountId));	
	}

		public String getAccountDetails(int num){
			JSONObject json=new JSONObject(map.get(num));
			System.out.println(json.toString());
			return json.toString();
}
}
