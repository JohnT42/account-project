package com.qa.simple.account_application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JSONTest {
@Test
public void test1() {
	Service user=new Service();
	user.addAccount("FTest", "LTest","2");	
	String expected= "{\"accountId\":\"2\",\"firstname\":\"FTest\",\"lastname\":\"LTest\"}";
	assertEquals(expected, user.getAccountDetails(1));
	}
@Test
public void test2() {
	Person user=new Person("FTest", null, null);
	String expected= "FTest";
	assertEquals(expected,user.setFirstname());
	}
@Test
public void test3() {
	Person user=new Person(null, "LTest", null);
	String expected= "LTest";
	assertEquals(expected,user.setLastname());
	}
@Test
public void test4() {
	Person user=new Person(null, null,"1");
	String expected= "1";
	assertEquals(expected,user.setAccountId());
	}
}
