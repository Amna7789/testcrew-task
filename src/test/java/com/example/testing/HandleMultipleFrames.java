package com.example.testing;

import org.testng.annotations.Test;

public class HandleMultipleFrames extends AbstractApplicationTest {
    String URL = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";

    @Test
    void testCase7() throws InterruptedException {
        driver.get(URL);
        //switching to first frame
        driver.switchTo().frame(0);
        //it should work in order to switch to frame1
        //driver.switchTo().frame(1);
        Thread.sleep(5000L);
    }
}
