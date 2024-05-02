package com.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest 
{
    @Test
    public void test(){
        WebDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shoppersstop.com/");
        driver.findElement(By.xpath("//*[@id=\"profileImage\"]/a/i")).click();
        String title = driver.getTitle();
        String pagesource = driver.getPageSource();
        System.out.println(title);
        System.out.println(pagesource);
        int length = pagesource.length();
        System.out.println(length);
        String url = driver.getCurrentUrl();
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
        driver.quit();
    }
    
}
