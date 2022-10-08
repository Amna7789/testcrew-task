package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class AutoSuggestDropDown extends AbstractApplicationTest {

    @Test
    void testCase8() throws Exception {
        String URL = "https://www.google.com/webhp?hl=en";

        driver.get(URL);
       // driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.name("q")).sendKeys("java tutorials");

        List<WebElement> dropDownList = driver.findElements(By.xpath("//*[@class='sbct']"));

        for (WebElement webElement : dropDownList) {
            System.out.println(webElement.getText());
        }

        // Click on the search button
        driver.findElement(By.name("btnK")).submit();

        List<WebElement> selectedList = driver.findElements(By.xpath("//h3[contains(., 'W3Schools')]"));

        Assert.assertNotEquals(0, selectedList.size(), "Result does not have W3Schools");

        selectedList.get(0).click();

        takeSnapShot(driver, "dropdown.jpg");
    }



}
