package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;

public class  AbstractApplicationTest {

    final String basePath = ".\\screenshot\\";
    WebDriver driver;
    @BeforeTest
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    void cleanup() throws InterruptedException {
        Thread.sleep(2000L);
        driver.quit();
    }

    public void takeSnapShot(WebDriver webdriver,String fileName) throws Exception{
        String fileNameWithPath = basePath + fileName;
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File(fileName);

        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }

}
