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

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        driver.findElement(By.linkText("LIVE POSTING")).click();

        List<WebElement> list3 = driver.findElements(By.xpath("//*[@class='clearfix']"));

        for (WebElement webElement : list3) {
            System.out.println(webElement.getText());
        }

        Thread.sleep(5000L);
        driver.close();
    }

}
