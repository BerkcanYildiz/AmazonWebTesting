package com.example.AmazonWebTesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public WebDriver driver;

    @BeforeEach
    public void StartingChrome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
    }
    @AfterEach
    public void After(){
        driver.quit();
    }

    public void setById(String id, String value){
        WebElement loginElement =driver.findElement(By.id(id));
        loginElement.click();
        loginElement.sendKeys(value);
    }
    public void setByXpath(String xpath, String value){
        WebElement le =driver.findElement(By.xpath(xpath));
        le.click();
        le.sendKeys(value);
    }
    public void clickBy(By by){
        WebElement button = driver.findElement(by);
        button.click();
    }
}
