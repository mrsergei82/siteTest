package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public  class SitePage {


    private WebDriver driver;

    private final String site = "https://www.livejournal.com";
    private final String login = "Sergei777777";
    private final String password = "SuperGg1";
    private final String button_Enter_Xp = "//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]";
    private final String login_Xp = "//div[@class=\"b-loginform-field__wrap\"]/input";
    private final String password_id = "lj_loginwidget_password";
    private final String actionLog_name = "action:login";
    private final String profileButton_Xp = "//body/div[2]/header/div[1]/nav[2]/ul/li[2]/a/span";
    private final String assert1 = "https://sergei777777.livejournal.com/";
    private final String friends_Xp = "//ul[@class='j-nav j-header-nav j-journal-nav']/li[2]/a";
    private final String assert2 = "https://sergei777777.livejournal.com/feed/";
    private final String profile_Xp = "//*[@id=\"home\"]/div[4]/div[3]/div/div[1]/div/div/header/div[2]/div/ul/li[3]/a";
    private final String assert3 = "https://sergei777777.livejournal.com/profile";
    private final String memories_Xp = "//a[@title='Избранное']";
    private final String assert4 = "https://sergei777777.livejournal.com/memories";

    public SitePage(WebDriver driver){
        this.driver = driver;
    }
    public void testAssert1(){
        driver.getCurrentUrl().equals(assert1);
    }
    public void testAssert2(){
        driver.getCurrentUrl().equals(assert2);
    }
    public void testAssert3(){
        driver.getCurrentUrl().equals(assert3);
    }
    public void testAssert4(){
        driver.getCurrentUrl().equals(assert4);
    }
    public SitePage toMemories(){
        driver.findElement(By.xpath(memories_Xp)).click();
        return this;
    }
    public SitePage toProfile(){
        driver.findElement(By.xpath(profile_Xp)).click();
        return this;
    }
    public SitePage toFriendsPage(){
        driver.findElement(By.xpath(friends_Xp)).click();
        return this;
    }
    public SitePage getProfile(){
        driver.findElement(By.xpath(profileButton_Xp)).click();
        return this;
    }
    public SitePage getSite(){
        driver.get(site);
        return this;
    }
    public SitePage clickEnter(){
        driver.findElement(By.xpath(button_Enter_Xp)).click();
        return this;
    }
    public SitePage writeLogin(){
        driver.findElement(By.xpath(login_Xp)).sendKeys(login);
        return this;
    }
    public SitePage writePassword(){
        driver.findElement(By.id(password_id)).sendKeys(password);
        return this;
    }
    public SitePage clickLog(){
        driver.findElement(By.name(actionLog_name)).click();
        return this;
    }

}
