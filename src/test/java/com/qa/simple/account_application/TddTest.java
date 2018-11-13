package com.qa.simple.account_application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TddTest {
@Test
public void test1() {
	Service user=new Service();
	user.addAccount("Peter", "Tran","2");
	user.addAccount("Peter", "Tran","3");
	user.addAccount("Peter", "Tran","4");
	assertEquals(0, user.countName("John"));
	}

@Test
public void test2() {
	Service user=new Service();
	user.addAccount("Peter", "Tran","2");
	user.addAccount("Peter", "Tran","3");
	user.addAccount("John", "Tran","4");
	assertEquals(1, user.countName("John"));
	}

@Test
public void test3() {
	Service user=new Service();
	user.addAccount("Peter", "Tran","2");
	user.addAccount("John", "Tran","3");
	user.addAccount("John", "Tran","4");
	assertEquals(2, user.countName("John"));
	}

@Test
public void test4() {
	Service user=new Service();
	user.addAccount("John", "Tran","2");
	user.addAccount("John", "Tran","3");
	user.addAccount("John", "Tran","4");
	assertEquals(3, user.countName("John"));
	}
}

