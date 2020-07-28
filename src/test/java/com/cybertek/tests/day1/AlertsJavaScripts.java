package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsJavaScripts {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("83").setup();
        WebDriver driver = new ChromeDriver();


driver.manage().window().maximize();

driver.get("http://practice.cybertekschool.com/javascript_alerts");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]")).click();
        Thread.sleep(2000);

       Alert alert = driver.switchTo().alert();
       String alertMessage = alert.getText();
        System.out.println(alertMessage);
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]")).click();
        Thread.sleep(2000);
        alertMessage=alert.getText();
        System.out.println(alertMessage);
        alert.accept();

        driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]")).click();
        Thread.sleep(2000);
        alertMessage=alert.getText();
        System.out.println(alertMessage);
        alert.sendKeys("Hello Denis");
        alert.accept();
        Thread.sleep(2000);




driver.close();


    }
}
