package com.telran.trellotests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Trello {
    WebDriver wd;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
    }

    @Test
    public void goOnTrelloAndLogIn(){
        wd.get("https://trello.com/");
        wd.findElement(By.xpath("//a[@class='global-header-section-button']")).click();
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("feverchezer@yahoo.fr");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("givesome101");
        wd.findElement(By.id("login")).click();

       // WebElement profileIMG= ;
        Assert.assertTrue(isElementPresent(wd.findElement(By)));
        //wd.findElement(By.cssSelector(".member-avatar")).click();
        //wd.findElement
         //       (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[5]/a[4]/span[1]/img[1]"))
          //      .click();
        //wd.findElement(By.cssSelector("#5a8d8b3257b202b75961a485-avatar")).click();
        //wd.findElement(By.id("5a8d8b3257b202b75961a485-avatar")).click();



    }

    private boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    @Test
    public void chargePicture(){
        wd.get("https://trello.com/ferdinandverchezer");
        //wd.findElement(By.xpath("//a[@class='button-link tabbed-pane-header-details-edit js-edit-profile']")).click();
       // wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
       //wd.findElement(By.xpath("//a[@class='button-link tabbed-pane-header-details-edit js-edit-profile']")).click();

    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
