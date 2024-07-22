package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

    @Test
    public void WebLoginCarLoan() {
        System.out.println("weblogincar");
    }

    @BeforeMethod
    public void beforeEvery() {
        System.out.println("I will execute before every method in day 3 class");
    }

    @AfterMethod
    public void afterEvery() {
        System.out.println("I will execute after every method in day 3 class");
    }

    @Test
    public void MobileLoginCarLoan() {
        System.out.println("Mobilelogincar");
    }

    @BeforeSuite
    public void bfSuite() {
        System.out.println("I am no 1");
    }

    @Test
    public void APICarLoan() {
        System.out.println("APIlogincar");
    }
}
