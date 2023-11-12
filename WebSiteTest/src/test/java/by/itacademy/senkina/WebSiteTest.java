package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {
    @Test
    public void testOnliner() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by");
        String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        WebElement enterButtonWebElement = driver.findElement(By.xpath(enterButtonLocator));
        enterButtonWebElement.click();

        String buttonEnterLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        WebElement buttonEnterElement = driver.findElement(By.xpath(buttonEnterLocator));
        buttonEnterElement.click();
        //Thread.sleep(4000);
        String errorMessageLoginLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]";
        WebElement errorMessageLoginElement = driver.findElement(By.xpath(errorMessageLoginLocator));
        String actual = errorMessageLoginElement.getText();
        String expected = "Укажите ник или e-mail";
        Assertions.assertEquals(expected, actual);

        String errorMessagePasswordLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
        WebElement errorMessagePasswordElement = driver.findElement(By.xpath(errorMessagePasswordLocator));
        String actualPassword = errorMessagePasswordElement.getText();
        String expectedPassword = "Укажите пароль";
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testDev() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://devby.io");

        String enterButtonLocator = "/html/body/div[2]/header/div[1]/div[3]/a";
        WebElement enterButton = driver.findElement(By.xpath(enterButtonLocator));
        enterButton.click();
        Thread.sleep(4000);

        String inputTextLoginLocator = "//*[@id=\"root\"]/div/div/div/div/div/div/form/ul/li[1]/input";
        WebElement inputTextLogin = driver.findElement(By.xpath(inputTextLoginLocator));
        inputTextLogin.sendKeys("webgetd");

        String inputTextPasswordLocator = "//*[@id=\"root\"]/div/div/div/div/div/div/form/ul/li[2]/div/input";
        WebElement inputTextPassword = driver.findElement(By.xpath(inputTextPasswordLocator));
        inputTextPassword.sendKeys("321");

        String enterButtonFormLocator = "//*[@id=\"root\"]/div/div/div/div/div/div/form/button";
        WebElement enterButtonForm = driver.findElement(By.xpath(enterButtonFormLocator));
        enterButtonForm.click();
        Thread.sleep(4000);

        String textErrorLoginPasswordLocator = "//*[@id=\"root\"]/div/div/div/div/div/div/form/span";
        WebElement textErrorLoginPasswordElement = driver.findElement(By.xpath(textErrorLoginPasswordLocator));

        String actual = textErrorLoginPasswordElement.getText();
        String expected = "Неверный логин или пароль.";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void testJavaRush() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://javarush.com");
        String enterButtonLocator = "//*[@id=\"sapper\"]/main/div/div[2]/div/div/div[3]/header/div/div[4]";
        WebElement enterButtonElement = driver.findElement(By.xpath(enterButtonLocator));
        enterButtonElement.click();
        String enterTitleFormLocator = "//*[@id=\"id_button_jr_welcome_start_learning_1\"]";
        Thread.sleep(4000);
        WebElement enterTitleFormElement = driver.findElement(By.xpath(enterTitleFormLocator));
        String actual = enterTitleFormElement.getText();
        String expected = "НАЧАТЬ";
        Assertions.assertEquals(expected, actual);
    }
}
