package com.qa.simple.account_application;

public class Person {
	String firstName;
	String lastName;
	String accountId;
 public Person(String firstName, String lastName, String accountId) {
			this.firstName=firstName;
			this.lastName=lastName;
			this.accountId=accountId;
			}
		public  String getFirstname() {
			return firstName;
			}
		
		public  String getLastname() {
			return lastName;
			}
		
		public String getAccountId() {
			return accountId;
			}
		
		public  String setFirstname() {
			return firstName;
			}
		
		public  String setLastname() {
			return lastName;
		}
			
		public  String setAccountId() {
			return accountId;
			}
}
