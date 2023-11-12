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
        OnlinerPage onlinerPage = new OnlinerPage();
        WebElement enterButtonWeb = driver.findElement(By.xpath(onlinerPage.enterButton));
        enterButtonWeb.click();
        WebElement buttonEnter = driver.findElement(By.xpath(onlinerPage.buttonEnter));
        buttonEnter.click();
        //Thread.sleep(4000);
        WebElement errorMessageLogin = driver.findElement(By.xpath(onlinerPage.errorMessageLogin));
        String actual = errorMessageLogin.getText();
        Assertions.assertEquals("Укажите ник или e-mail", actual);
        WebElement errorMessagePassword = driver.findElement(By.xpath(onlinerPage.errorMessagePassword));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Укажите пароль", actualPassword);
    }

    @Test
    public void testDev() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://devby.io");
        DevByPage devByPage = new DevByPage();
        WebElement enterButton = driver.findElement(By.xpath(devByPage.enterButton));
        enterButton.click();
        Thread.sleep(4000);
        WebElement inputTextLogin = driver.findElement(By.xpath(devByPage.inputTextLogin));
        inputTextLogin.sendKeys("webgetd");
        WebElement inputTextPassword = driver.findElement(By.xpath(devByPage.inputTextPassword));
        inputTextPassword.sendKeys("321");
        WebElement enterButtonForm = driver.findElement(By.xpath(devByPage.enterButtonForm));
        enterButtonForm.click();
        Thread.sleep(4000);
        WebElement textErrorLoginPassword = driver.findElement(By.xpath(devByPage.textErrorLoginPassword));
        String actual = textErrorLoginPassword.getText();
        Assertions.assertEquals("Неверный логин или пароль.", actual);
        driver.quit();
    }

    @Test
    public void testJavaRush() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavaRush javaRush = new JavaRush();
        driver.manage().window().maximize();
        driver.navigate().to("https://javarush.com");
        WebElement enterButton = driver.findElement(By.xpath(javaRush.enterButton));
        enterButton.click();
        Thread.sleep(4000);
        WebElement enterTitleForm = driver.findElement(By.xpath(javaRush.enterTitleForm));
        String actual = enterTitleForm.getText();
        Assertions.assertEquals("НАЧАТЬ", actual);
    }

    @Test
    public void testAvBy() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://av.by/");
        AvBy avBy=new AvBy();
        WebElement enterButton = driver.findElement(By.xpath(avBy.buttonEnter));
        enterButton.click();
        Thread.sleep(2000);
        WebElement buttonLoginPassword = driver.findElement(By.xpath(avBy.buttonLoginPassword));
        buttonLoginPassword.click();
        Thread.sleep(2000);
        WebElement inputLoginField = driver.findElement(By.xpath(avBy.inputLoginField));
        inputLoginField.sendKeys("add");
        WebElement inputPasswordField = driver.findElement(By.xpath(avBy.inputPasswordField));
        inputPasswordField.sendKeys("rew");
        WebElement buttonForm = driver.findElement(By.xpath(avBy.buttonForm));
        buttonForm.click();
        Thread.sleep(2000);
        WebElement textError = driver.findElement(By.xpath(avBy.textError));
        String actual = textError.getText();
        Assertions.assertEquals("Неверный логин или пароль. Если забыли пароль, восстановите его", actual);
        driver.quit();

    }
}
