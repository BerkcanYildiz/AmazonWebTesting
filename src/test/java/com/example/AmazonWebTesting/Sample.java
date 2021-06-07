package com.example.AmazonWebTesting;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

// This is the scenario page.
public class Sample extends Basics{

    @Test
    public void LogIn() {
        Actions a = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
        a.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[@class='nav-action-inner']"))).
                click().build().perform();
        setByXpath("//input[@type='email']" , "deneme123@gmail.com");
        clickBy(By.id("continue"));
        setByXpath("//input[@type='password']","123456");
        clickBy(By.id("signInSubmit"));
    }
    @Test
    public void SearchOnTheBox(){
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        search.sendKeys("apple");
        clickBy(By.id("nav-search-submit-button"));
    }
    @Test // Adding random product from the 2nd page of Apple products.
    public void AddBasket() throws InterruptedException {

    }
}
