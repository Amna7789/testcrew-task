package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class BootStrapDropDown extends AbstractApplicationTest {
    String URL = "https://www.hdfcbank.com/";

    @Test
    void testCase5() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(5000L);
        //select Product Type
        List<WebElement> selectedListProductType = driver.findElements(By.xpath("//*[@class='btn-primary dropdown-toggle btn-block']"));
        Assert.assertNotEquals(0,selectedListProductType.size(),"Result doesn't have Product Type");
        selectedListProductType.get(0).click();
        //capture all items to list
        List<WebElement> dropDownListProductType = driver.findElements(By.xpath("//*[@class = 'dropdown1 dropdown-menu']"));
        for (WebElement webElement : dropDownListProductType){
            System.out.println(webElement.getText());
        }
        //select Product
        List<WebElement> selectedListProduct = driver.findElements(By.xpath("//*[@class='btn-primary dropdown-toggle btn-block']"));
        Assert.assertNotEquals(0,selectedListProduct.size(),"Result doesn't have Product");
        selectedListProduct.get(0).click();
        //capture all items to list but it doesn't have drop down menu
        List<WebElement> dropDownListProduct = driver.findElements(By.xpath("//*[@class = 'dropdown1 dropdown-menu']"));
        for (WebElement webElement : dropDownListProduct){
            System.out.println(webElement.getText());
        }

    }

}
