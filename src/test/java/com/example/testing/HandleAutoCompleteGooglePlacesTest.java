package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class HandleAutoCompleteGooglePlacesTest {

    String URL = "https://www.twoplugs.com/";

    @Test
    void testCase1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.findElement(By.id("details-button")).sendKeys("Advanced");

        List<WebElement> list = driver.findElements(By.xpath("//*[@class='secondary-button small-link']"));
        //driver.findElement(By.id("details-button")).submit();
        driver.findElement(By.id("details-button")).click();

        driver.findElement(By.id("details-button")).sendKeys("Hide advanced");
        List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='secondary-button small-link']"));
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.className("//*[@class='secondary-button small-link']")).submit();

        driver.findElement(By.id("proceed-link")).click();
        driver.findElement(By.id("proceed-link")).sendKeys("Proceed to www.twoplugs.com (unsafe)");
        driver.findElement(By.className("//*[@class='small-link']")).submit();
        //driver.findElement(By.linkText("Live Posting")).click();
        Thread.sleep(5000L);
        driver.close();
    }

}