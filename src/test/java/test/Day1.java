package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {

    @AfterTest
    public void lastexecution() {
        System.out.println("I will execute last");
    }

    @Test
    public void Demo() {

        System.out.println("hello");
    }

    @AfterSuite
    public void afSuite() {
        System.out.println("I am the no 1 from last");
    }

    @Test
    public void SecondTest() {

        System.out.println("bye");
    }
}
