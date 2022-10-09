package com.example.testing;

import org.testng.annotations.Test;

public class HandleAuthenticatedPopUps extends AbstractApplicationTest {
    String URL = "https://the-internet.herokuapp.com/basic_auth";

    @Test
    void testCase3() throws InterruptedException {
        driver.get(URL);
        String a = "admin";
        String s = "https://" + a + ":" + a + "@" +
                "the-internet.herokuapp.com/basic_auth";

        driver.get(s);
    }

}
