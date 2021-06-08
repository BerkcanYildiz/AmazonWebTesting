package com.example.AmazonWebTesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Basics {
    public WebDriver driver;

    @BeforeEach
    public void StartingChrome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        clickBy(By.id("sp-cc-accept"));
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
    public void SelectMethodForQuantity(){
        Select select = new Select(driver.findElement(By.name("quantity")));
        select.selectByVisibleText("2");
    }
    List<WebElement> allProducts;
    public void RandomItem() throws InterruptedException{
        allProducts  = driver.findElements(By.xpath("//*[@data-component-type=\"s-search-result\"]"));
        Thread.sleep(500);
        Random random = new Random();
        int randomProduct  = random.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        clickBy(By.id("add-to-cart-button"));
    }
    public void PageScroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
