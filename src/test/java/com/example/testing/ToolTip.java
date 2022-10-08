package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip extends AbstractApplicationTest{
    String URL = "https://jqueryui.com/tooltip/";

    @Test
    void testCase4() throws InterruptedException {

        driver.get(URL);

        System.out.println("Tooltip web Page Displayed");
        // Get element for which we need to find tooltip
        WebElement ageTextBox = driver.findElement(By.id("age"));

        //Get title attribute value
        String tooltipText = ageTextBox.getAttribute("title");

        System.out.println("Retrieved tooltip text as :" + tooltipText);

        //Verification if tooltip text is matching expected value
        if (tooltipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")) {
            System.out.println("Pass : Tooltip matching expected value");
        } else {
            System.out.println("Fail : Tooltip NOT matching expected value");
        }

    }
}
