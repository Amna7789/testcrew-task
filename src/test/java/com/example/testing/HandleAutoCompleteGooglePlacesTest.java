package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HandleAutoCompleteGooglePlacesTest extends AbstractApplicationTest{

    String URL = "https://www.twoplugs.com/";

    @Test
    void testCase1() throws InterruptedException {
        driver.get(URL);

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        driver.findElement(By.linkText("LIVE POSTING")).click();

        WebElement mapElement = driver.findElement(By.id("autocomplete"));
        mapElement.sendKeys("Toronto");
        mapElement.sendKeys(Keys.DOWN);
        String city = mapElement.getAttribute("value");

        Assert.assertEquals("Toronto OH,USA",city);
    }

}
