package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://bikeland.ru");
        driver.findElement(By.xpath(
                "//div[@class='order-1 order-md-2 col col-md-auto col-lg-3 " +
                        "text-right']/div[@class='header-controls']/a")).click();
        driver.findElement(By.id("user_login")).sendKeys("SuperSeryi");
        driver.findElement(By.id("user_password")).sendKeys("s2233s");
        driver.findElement(By.name("Login")).click();






    }

}
