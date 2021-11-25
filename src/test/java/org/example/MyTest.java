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
        driver.get("https://www.livejournal.com");
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"b-loginform-field__wrap\"]/input")).sendKeys("Sergei777777");
        driver.findElement(By.id("lj_loginwidget_password")).sendKeys("SuperGg1");
        driver.findElement(By.name("action:login")).click();
        driver.close();
    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"b-loginform-field__wrap\"]/input")).sendKeys("Sergei777777");
        driver.findElement(By.id("lj_loginwidget_password")).sendKeys("SuperGg1");
        driver.findElement(By.name("action:login")).click();
    }
}
