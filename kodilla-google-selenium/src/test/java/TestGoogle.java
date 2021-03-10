import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResult;
import pages.GoogleResults;
import pages.GoogleSearch;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleResults results = googleSearch.getSearchResults();

        results.iSeeResults();

        GoogleResult result = results.navigateToRandomResult();
        String href = results.getHref();

        String pageUrl = result.getUrl();
        System.out.println("Actual page url " + pageUrl);

        Assert.assertEquals(href, pageUrl);
    }
}
