package test;

import org.testng.annotations.*;

public class Day3 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("before executing any method in day 3 class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("after executing any method in day 3 class");
    }

    @Test(groups = {"Smoke"})
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

    @Test (enabled = false)
    public void MobileSignInCarLoan() {
        System.out.println("Mobile SIGNIN");
    }

    @Test (timeOut = 4000)
    public void MobileSignOutCarLoan() {
        System.out.println("Mobile SIGNOUT");
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan() {
        System.out.println("APIlogincar");
    }
}
