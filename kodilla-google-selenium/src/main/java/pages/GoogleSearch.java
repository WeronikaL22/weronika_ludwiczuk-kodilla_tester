package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    @FindBy(tagName = "form")
    static WebElement acceptCookiesButton;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public GoogleResults getSearchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        //acceptDamnCookies(driver);
        inputField.sendKeys("Kodilla");
        GoogleResults googleResults = loadResults(driver);

        return googleResults;
    }

    /*private void acceptDamnCookies(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookiesButton)).submit();
    }*/

    private GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
