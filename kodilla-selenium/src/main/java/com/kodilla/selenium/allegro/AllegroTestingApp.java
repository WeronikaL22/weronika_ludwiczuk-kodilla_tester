package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();


        WebElement agreeToCookies = driver.findElement(
                By.xpath("//div[@class=\"_854c2_OPWNL _9f0v0 _jkrtd mj7a_0 mh36_16 mvrt_16 mg9e_16 mpof_ki m389_6m munh_56 m3h2_56 myre_zn myre_8v_s m7f5_5x_s _854c2_21ZR4\"]" + "//button[1]"));
        agreeToCookies.click();


        WebElement category = driver.findElement(
                By.xpath("//select[@class=\"mr3m_1 m7er_k4 _k70df mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4 _d25db_an94v\"]@data-role"));
        Select chooseCATEGORY= new Select(category);
        chooseCATEGORY.selectByIndex(2);


        WebElement inputField = driver.findElement(By.xpath("//div/form[@novalidate=\"\"]/input[@type=\"search\"]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

    }
}
