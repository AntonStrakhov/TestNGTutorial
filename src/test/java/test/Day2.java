package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @Test(groups = {"Smoke"})
    public void PLoan() {

        System.out.println("good");
    }

    @BeforeTest
    public void prerequiste() {
        System.out.println("I will execute first");
    }
}
