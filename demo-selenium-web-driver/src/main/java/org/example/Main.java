package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver= new SafariDriver();
        driver.get("https://www.onliner.by");
        String xpath="//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By xpathBY= By.xpath(xpath);
        WebElement element = driver.findElement(xpathBY);
        element.sendKeys("Login");
        }
    }
