package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class MyTest {

    @Test
    @Epic("login")
    public void test1(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        SitePage result = new SitePage(driver)
                .getSite()
                .clickEnter()
                .writeLogin()
                .writePassword()
                .clickLog()
                .getProfile();
        result.testAssert1();
        driver.close();
    }
}
