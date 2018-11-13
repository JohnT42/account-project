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
        user.addAccount("The", "Shafeeq","23");
        user.addAccount("Orion", "Pax","34");
        user.addAccount("Stan", "Lee","34534");
        user.addAccount("Steve", "Ditko","345");
        for(int i=1; i<=Service.count;i++)
        user.getAccountDetails(i);
    }
}
