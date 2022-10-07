package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {
    //String URL = "https://jqueryui.com/tooltip/";

    @Test
    void testCase1() throws InterruptedException {
       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        WebElement ageTextBox = driver.findElement(By.id("age"));
        String tooltipText = ageTextBox.getAttribute("We ask for your age only for statistical purposes. ");

        System.out.println("Retrieved tooltip text as :"+tooltipText);

        //Verification if tooltip text is matching expected value
        if(tooltipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){
            System.out.println("Pass : Tooltip matching expected value");
        }
        else{
            System.out.println("Fail : Tooltip NOT matching expected value");
        }
        Thread.sleep(5000L);
        driver.close();*/
       /* WebDriverManager.chromedriver().setup();
        String baseUrl = "https://jqueryui.com/tooltip/";
       // System.setProperty("webdriver.chrome.driver","<path of browser driver file>");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTooltip = "We ask for your age only for statistical purposes.";
        // Find the age field
        WebElement ele = driver.findElement(By.id("age"));
        //get the value of the "title" attribute
        String actualTooltip = ele.getAttribute("title");
        //Comparing tooltip’s value with expected value
        System.out.println("Actual Title of Tool Tip"+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        driver.close();*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/tooltip/");
        System.out.println("website loaded");
        //Maximise browser window driver.manage().window().maximize();
        // Instantiate Action Class
        Actions actions = new Actions(driver); //Retrieve
        WebElement element = driver.findElement(By.id("age"));
        // Using the action class to mimic mouse hover
        actions.moveToElement(element).perform();
        WebElement toolTip = driver.findElement(By.xpath("//*[@id='age']"));
        // To get the tool tip text and assert
        String toolTipText = toolTip.getText();
        System.out.println("toolTipText-->"+toolTipText);
        //Verification if tooltip text is matching expected value
        if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes."))
        { System.out.println("Pass");
        }
        else{ System.out.println("Fail");
        } // Close the main windo//
        driver.close();
    }

}
