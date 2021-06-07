package com.example.AmazonWebTesting;

import com.example.AmazonWebTesting.Basics;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogTest extends Basics {

    @Test // Login with mouse over.
    public void LoginTest() throws InterruptedException{
        Actions a = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
        a.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[@class='nav-action-inner']"))).
                click().build().perform();
        setByXpath("//input[@type='email']" , "deneme123@gmail.com");
        clickBy(By.id("continue"));
        setByXpath("//input[@type='password']","123456");
        clickBy(By.id("signInSubmit"));
    }
}
