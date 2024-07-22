package test;

import org.testng.annotations.Test;

public class Day4 {

    @Test
    public void WebLoginHomeLoan() {
        System.out.println("webloginhome");
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
