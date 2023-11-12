package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebSiteTest {
    @Test
    public void testOnliner() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by");
        OnlinerPage onlinerPage = new OnlinerPage();
        WebElement enterButtonWeb = driver.findElement(By.xpath(onlinerPage.enterButtonLocator));
        enterButtonWeb.click();
        WebElement buttonEnter = driver.findElement(By.xpath(onlinerPage.buttonEnterLocator));
        buttonEnter.click();
        //Thread.sleep(4000);
        WebElement errorMessageLogin = driver.findElement(By.xpath(onlinerPage.errorMessageLoginLocator));
        String actual = errorMessageLogin.getText();
        Assertions.assertEquals("Укажите ник или e-mail", actual);
        WebElement errorMessagePassword = driver.findElement(By.xpath(onlinerPage.errorMessagePasswordLocator));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Укажите пароль", actualPassword);
    }

    @Test
    public void testDev() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://devby.io");
        DevByPage devByPage = new DevByPage();
        WebElement enterButton = driver.findElement(By.xpath(devByPage.enterButtonLocator));
        enterButton.click();
        Thread.sleep(4000);
        WebElement inputTextLogin = driver.findElement(By.xpath(devByPage.inputTextLoginLocator));
        inputTextLogin.sendKeys("webgetd");
        WebElement inputTextPassword = driver.findElement(By.xpath(devByPage.inputTextPasswordLocator));
        inputTextPassword.sendKeys("321");
        WebElement enterButtonForm = driver.findElement(By.xpath(devByPage.enterButtonFormLocator));
        enterButtonForm.click();
        Thread.sleep(4000);
        WebElement textErrorLoginPassword = driver.findElement(By.xpath(devByPage.textErrorLoginPasswordLocator));
        String actual = textErrorLoginPassword.getText();
        Assertions.assertEquals("Неверный логин или пароль.", actual);
        driver.quit();
    }

    @Test
    public void testJavaRush() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://javarush.com");
        String enterButtonLocator = "//*[@id=\"sapper\"]/main/div/div[2]/div/div/div[3]/header/div/div[4]";
        WebElement enterButton = driver.findElement(By.xpath(enterButtonLocator));
        enterButton.click();
        String enterTitleFormLocator = "//*[@id=\"id_button_jr_welcome_start_learning_1\"]";
        Thread.sleep(4000);
        WebElement enterTitleForm = driver.findElement(By.xpath(enterTitleFormLocator));
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
