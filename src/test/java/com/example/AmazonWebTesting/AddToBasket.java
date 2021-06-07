package com.example.AmazonWebTesting;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddToBasket extends Basics {

    @Test // Text Apple to search box and add 2 from the first product to the cart
    public void AddToBasket() throws InterruptedException{
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        search.sendKeys("apple");
        clickBy(By.id("nav-search-submit-button"));
        clickBy(By.xpath("//div[@data-index='1']"));
        Select quantitySelect = new Select(driver.findElement(By.name("quantity")));
        quantitySelect.selectByVisibleText("2");
        clickBy(By.id("add-to-cart-button"));
        Thread.sleep(5000);
    }

}
