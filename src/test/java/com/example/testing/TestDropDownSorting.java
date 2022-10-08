package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropDownSorting {
    String URL = "https://www.twoplugs.com/";

    @Test
    void testCase2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        driver.findElement(By.id("details-button")).sendKeys("Advanced");
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='secondary-button small-link']"));
        driver.findElement(By.id("details-button")).click();

        driver.findElement(By.id("details-button")).sendKeys("Hide advanced");
        List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='secondary-button small-link']"));
        driver.findElement(By.id("details-button")).click();

        driver.findElement(By.id("proceed-link")).sendKeys("Proceed to www.twoplugs.com (unsafe)");
        List<WebElement> list2 = driver.findElements(By.xpath("//*[@class='small-link']"));
        driver.findElement(By.id("proceed-link")).click();

        driver.findElement(By.linkText("LIVE POSTING")).click();
        
        for (WebElement webElement : list2){
            System.out.println(webElement.getText());
        }
        Thread.sleep(5000L);
        driver.close();
    }

}
