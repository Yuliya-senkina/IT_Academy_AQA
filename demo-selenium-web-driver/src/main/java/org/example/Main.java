package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver= new SafariDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        // Input name
        String inputNameXpath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameXpathBY= By.xpath(inputNameXpath);
        WebElement element = driver.findElement(inputNameXpathBY);
        element.sendKeys("Login");
        String inputCalculateXpath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputCalculateXpathBY= By.xpath(inputCalculateXpath);
        WebElement element2 = driver.findElement(inputCalculateXpathBY);
        element2.click();
        }
    }
