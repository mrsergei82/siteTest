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
        driver.findElement(By.xpath("//body/div[2]/header/div[1]/nav[2]/ul/li[2]/a/span")).click();
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://sergei777777.livejournal.com/"));
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
        driver.findElement(By.xpath("//body/div[2]/header/div[1]/nav[2]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//ul[@class='j-nav j-header-nav j-journal-nav']/li[2]/a")).click();
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://sergei777777.livejournal.com/feed/"));
        driver.close();
    }
    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");
        driver.findElement(By.xpath("//body/div[2]/header/div[1]/nav[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"b-loginform-field__wrap\"]/input")).sendKeys("Sergei777777");
        driver.findElement(By.id("lj_loginwidget_password")).sendKeys("SuperGg1");
        driver.findElement(By.name("action:login")).click();
        driver.findElement(By.xpath("//body/div[2]/header/div[1]/nav[2]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[4]/div[3]/div/div[1]/div/div/header/div[2]/div/ul/li[3]/a")).click();
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://sergei777777.livejournal.com/profile"));
        driver.close();
    }
    @Test
    public void test4(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");
        driver.findElement(By.xpath("//body/div[2]/header/div[1]/nav[2]/ul/li[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"b-loginform-field__wrap\"]/input")).sendKeys("Sergei777777");
        driver.findElement(By.id("lj_loginwidget_password")).sendKeys("SuperGg1");
        driver.findElement(By.name("action:login")).click();
        driver.findElement(By.xpath("//body/div[2]/header/div[1]/nav[2]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//a[@title='Избранное']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://sergei777777.livejournal.com/memories"));
        driver.close();
    }
}
