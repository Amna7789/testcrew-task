package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropDownSorting extends AbstractApplicationTest {
    String URL = "https://www.twoplugs.com/";

    @Test
    void testCase2() throws InterruptedException {
        driver.get(URL);

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        driver.findElement(By.linkText("LIVE POSTING")).click();

        List<WebElement> list3 = driver.findElements(By.xpath("//*[@class='clearfix']"));

        for (WebElement webElement : list3) {
            System.out.println(webElement.getText());
        }

        Thread.sleep(5000L);

    }

}
