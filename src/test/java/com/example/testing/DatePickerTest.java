package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

        System.out.println("Amna is working");
    }

    private Date getDate() throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 5, 30);
        Date d = cal.getTime();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String ddate = formatter.format(d);
        Date date = formatter.parse("30/6/2005");
       /* String splitter[] = date.split("-");
        String month_year = splitter[1];
        String day = splitter[0];
        System.out.println(month_year);
        System.out.println(day);*/
        System.out.println("Date: " + date);
        return d;
    }
}