package test;

import org.testng.annotations.*;

import java.net.URL;

public class Day3 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("before executing any method in day 3 class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after executing any method in day 3 class");
    }

    @Parameters({"URL", "APIKey/username"})
    @Test(groups = {"Smoke"})
    public void WebLoginCarLoan(String URLName, String key) {
        System.out.println("weblogincar");
        System.out.println(URLName);
        System.out.println(key);
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

    @Test(enabled = false)
    public void MobileSignInCarLoan() {
        System.out.println("Mobile SIGNIN");
    }

    @Test(dataProvider = "getData")
    public void MobileSignOutCarLoan(String username, String userpassword) {
        System.out.println("Mobile SIGNOUT");
        System.out.println(username);
        System.out.println(userpassword);
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan() {
        System.out.println("APIlogincar");
    }

    @DataProvider
    public Object[][] getData() {
        //1st combiantion - username password - good credit history= row
        //2nd - username password  - no crdit history
        // 3rd - fraudelent credit history
        Object[][] data= new Object[3][2];
        //1st set
        data[0][0]="firstsetusername";
        data[0][1]="firstpassword";
        //couloumns in the row are nothing but values for that particualar combination(row)

        //2nd set
        data[1][0]= "secondsetusername";
        data[1][1]= "secondpassword";

        //3rd set
        data[2][0]="thirdsetusername";
        data[2][1]="thirdpassword";
        return data;

    }
}
