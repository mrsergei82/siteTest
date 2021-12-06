package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException {

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

        driver.quit();


    }


}
