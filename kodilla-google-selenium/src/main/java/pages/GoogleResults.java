package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {
    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    private String href;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public GoogleResult navigateToRandomResult() {
        Random random = new Random();
        int index = random.nextInt(results.size());
        System.out.println("Navigating to result on index: " + index);
        WebElement result = results.get(index);

        WebElement link = result.findElement(By.tagName("a"));

        href = link.getAttribute("href");
        System.out.println("Link href is: " + href);

        link.click();
        return new GoogleResult(driver);
    }

    public String getHref() {
        return href;
    }
}
