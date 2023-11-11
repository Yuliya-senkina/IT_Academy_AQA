package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.Driver;

public class WebSiteTest {
    @Test
    public void testOnliner() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by");
        String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();
        String enterTitleFormLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/div[1]";
        By enterTitleFormBy = By.xpath(enterTitleFormLocator);
        WebElement enterTitleFormElement = driver.findElement(enterTitleFormBy);
        String actual = enterTitleFormElement.getText();
        String expected = "Вход";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDev() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://devby.io");
        String enterButtonLocator = "/html/body/div[2]/header/div[1]/div[3]/a";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonElement = driver.findElement(enterButtonBy);
        enterButtonElement.click();
        String enterTitleFormLocator = "//*[@id=\"root\"]/div/div/div/div/ul/a[1]";
        By enterTitleFormBy = By.xpath(enterTitleFormLocator);
        Thread.sleep(4000);
        WebElement enterTitleFormElement = driver.findElement(enterTitleFormBy);
        String actual = enterTitleFormElement.getText();
        String expected = "Вход";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testJavaRush() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://javarush.com");
        String enterButtonLocator = "//*[@id=\"sapper\"]/main/div/div[2]/div/div/div[3]/header/div/div[4]";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonElement = driver.findElement(enterButtonBy);
        enterButtonElement.click();
        String enterTitleFormLocator = "//*[@id=\"id_button_jr_welcome_start_learning_1\"]";
        By enterTitleFormBy = By.xpath(enterTitleFormLocator);
        Thread.sleep(4000);
        WebElement enterTitleFormElement = driver.findElement(enterTitleFormBy);
        String actual = enterTitleFormElement.getText();
        String expected = "НАЧАТЬ";
        Assertions.assertEquals(expected, actual);
    }
}
