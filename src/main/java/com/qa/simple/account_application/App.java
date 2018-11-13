package com.qa.simple.account_application;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello world to the standard out" );
        Service user=new Service();
        user.addAccount("The", "Shafeeq");
        user.addAccount("Orion", "Pax");
        user.addAccount("Stan", "Lee");
        user.getAccountDetails(3);
    }
}
