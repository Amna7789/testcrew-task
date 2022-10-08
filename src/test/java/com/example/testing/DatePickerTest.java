package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerTest extends AbstractApplicationTest {

    String URL = "https://www.dummyticket.com/dummy-ticket-for-visa-application/";

    @Test
    void testCase6() throws Exception {

        int year = 2005;
        String month = "Jun";
        int day = 30;

        driver.get(URL);
        driver.findElement(By.id("dob")).click();

        /*select year from option*/
        Select yearSel = new Select(driver.findElement(By.className("ui-datepicker-year")));
        yearSel.selectByVisibleText(""+year);

        /*select month from option*/
        Select monSel = new Select(driver.findElement(By.className("ui-datepicker-month")));
        monSel.selectByVisibleText(month);

        driver.findElements(By.xpath("//*[@class='ui-state-default']")).get(day-1).click();

        takeSnapShot(driver, "datePickerTest.jpg");
    }
}