package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAutoCompleteGooglePlacesTest {

    String URL = "https://www.twoplugs.com/";

    @Test
    void testCase1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.findElement(By.linkText("LivePosting")).click();
        Thread.sleep(5000L);
        driver.close();
    }

}
