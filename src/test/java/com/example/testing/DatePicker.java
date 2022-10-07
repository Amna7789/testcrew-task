package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DatePicker {

    String URL = "https://www.dummyticket.com/dummy-ticket-for-visa-application/";

    @Test
    void testCase6() throws InterruptedException {
        String URL = "https://www.dummyticket.com/dummy-ticket-for-visa-application/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        //driver.findElement(By.linkText("")).click();
        Thread.sleep(5000L);
        driver.close();

    }
}