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
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        String buttonEnterLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        By buttonEnterBy = By.xpath(buttonEnterLocator);
        WebElement buttonEnterElement = driver.findElement(buttonEnterBy);
        buttonEnterElement.click();
        //Thread.sleep(4000);
        String errorMessageLoginLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]";
        By errorMessageLoginBy = By.xpath(errorMessageLoginLocator);
        WebElement errorMessageLoginElement = driver.findElement(errorMessageLoginBy);
        String actual = errorMessageLoginElement.getText();
        String expected = "Укажите ник или e-mail";
        Assertions.assertEquals(expected, actual);

        String errorMessagePasswordLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";
        By errorMessagePasswordBy = By.xpath(errorMessagePasswordLocator);
        WebElement errorMessagePasswordElement = driver.findElement(errorMessagePasswordBy);
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
