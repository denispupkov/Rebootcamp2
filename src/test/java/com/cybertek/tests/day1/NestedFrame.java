package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().version("83").setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement leftText = driver.findElement(By.tagName("body"));
        System.out.println(leftText.getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        WebElement rightText = driver.findElement(By.tagName("body"));
        System.out.println(rightText.getText());

        driver.switchTo().parentFrame();
        Thread.sleep(2000);

        driver.switchTo().frame("frame-middle");
        WebElement middleText = driver.findElement(By.id("content"));
        System.out.println(middleText.getText());

        Thread.sleep(2000);

        driver.switchTo().defaultContent().switchTo().frame("frame-bottom");
        //driver.switchTo().frame("frame-bottom");
        WebElement frameBottom = driver.findElement(By.tagName(("body")));
        System.out.println(frameBottom.getText());
        Thread.sleep(2000);




       driver.quit();


    }
}
