package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class MyTest {

    @Test
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
    @Test
    public void test2(){
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
                .getProfile()
                .toFriendsPage();
        result.testAssert2();
        driver.close();
    }
    @Test
    public void test3(){
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
                .getProfile()
                .toProfile();
        result.testAssert3();
        driver.close();
    }
    @Test
    public void test4(){
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
                .getProfile()
                .toMemories();
        result.testAssert4();
        driver.close();
    }
}
