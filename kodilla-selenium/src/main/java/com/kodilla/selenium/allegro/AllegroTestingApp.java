package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement agreeToCookies = driver.findElement(
                By.cssSelector(".m3h2_16 > button"));
        agreeToCookies.click();


        WebElement category = driver.findElement(
                By.cssSelector("div > select"));
        Select chooseCATEGORY= new Select(category);
        chooseCATEGORY.selectByIndex(2);

        WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article > div")));

        List<WebElement> elements = driver.findElements(By.className("mgn2_13 mqu1_ae mp0t_0a mgmw_ia mli8_k4 _9c44d_3UsPL"));
        elements.get(0).getText();
        elements.get(1).getText();
        elements.get(2).getText();

    }
}
