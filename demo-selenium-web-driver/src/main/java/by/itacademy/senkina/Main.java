package by.itacademy.senkina;
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
        WebElement inputNameElement = driver.findElement(inputNameXpathBY);
        inputNameElement.sendKeys("Login");
        // Input height
        String inputHeightXpath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightXpathBY= By.xpath(inputHeightXpath);
        WebElement inputHeightElement = driver.findElement(inputHeightXpathBY);
        inputHeightElement.sendKeys("160");
        // Input weight
        String inputWeightXpath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightXpathBY= By.xpath(inputWeightXpath);
        WebElement inputWeightElement = driver.findElement(inputWeightXpathBY);
        inputWeightElement.sendKeys("67");

        // choose radio male/female
        String inputGenderXpath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputGenderXpathBY= By.xpath(inputGenderXpath);
        WebElement inputGenderXpathElement = driver.findElement(inputGenderXpathBY);
        inputGenderXpathElement.click();

        // Put buttom calculte
        String inputCalculateXpath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputCalculateXpathBY= By.xpath(inputCalculateXpath);
        WebElement inputCalculateElement = driver.findElement(inputCalculateXpathBY);
        inputCalculateElement.click();
        }
    }
