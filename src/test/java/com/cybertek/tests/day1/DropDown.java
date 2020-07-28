package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("83").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(2000);

        Select select = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(2000);
        List<String> str = new ArrayList<>();

        for (int i = 0; i <select.getOptions().size() ; i++) {

            str.add(select.getOptions().get(i).getText());
        }

    select.selectByIndex(1);
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());

        driver.close();


    }
}
