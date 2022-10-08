package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAuthenticatedPopUps extends AbstractApplicationTest {
    String URL = "https://the-internet.herokuapp.com/basic_auth";

    @Test
    void testCase3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        String a = "admin";
        String s = "https://" + a + ":" + a + "@" +
                "the-internet.herokuapp.com/basic_auth";

        Thread.sleep(5000L);

        driver.get(s);
        driver.close();
    }

}
