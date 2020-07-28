package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("83").setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(3000);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Pupkov");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.close();



    }
}
