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
    public static void main(String[] args) throws InterruptedException {

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
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div[1]/a/span")).click();
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/form/div[1]/div/div[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"bx_1213689452_142767\"]/div/a")).click();
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div[2]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"comp_366054522fed11564619d3a08ff39671\"]/form/div[2]/div[1]/div[3]/div/div/div/div[6]/button")).click();
        Thread.sleep(1000);
        driver.quit();






    }

}
