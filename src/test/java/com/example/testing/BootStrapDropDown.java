package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BootStrapDropDown {
    String URL = "https://www.hdfcbank.com/";

    @Test
    void testCase5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        Thread.sleep(5000L);
        //select Product Type
        List<WebElement> selectedList = driver.findElements(By.xpath("//h3[contains(., 'Select Product Type')]"));
        Assert.assertNotEquals(0,selectedList.size(),"Result doesn't have Product Type");
        selectedList.get(0).click();
        //capture all items to list
        List<WebElement> dropDownList = driver.findElements(By.xpath("//*[@class = 'sbct']"));
        for (WebElement webElement : dropDownList){
            System.out.println(webElement.getText());
        }
        driver.close();

    }

}
