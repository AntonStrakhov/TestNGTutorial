package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @Parameters({"URL"})
    @Test
    public void WebLoginHomeLoan(String uname) {
        System.out.println("webloginhome");
        System.out.println(uname);
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan() {
        System.out.println("Mobileloginhome");
    }

    @Test
    public void LoginAPIHomeLoan() {
        System.out.println("APIloginHome");
    }
}
