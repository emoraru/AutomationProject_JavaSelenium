import data.URLConstants;
import framework.utils.selenium.SeleniumSetup;
import framework.utils.webdriver.WDUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;


public class BaseTest {
    protected WebDriver driver;

    //@BeforeSuite(alwaysRun = true)
    public void setup() {
        driver = SeleniumSetup.createWebDriver();
        Assert.assertNotNull(driver, "Unable to create driver");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Unable to close webdriver");
        }
    }

    protected void navigateToBasePage() {
        WDUtils.navigateTo(driver, URLConstants.BASE_URL);
        WDUtils.waitForSeconds(5);
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.BASE_URL),
                "When navigating to Homepage url: Different url encountered " + driver.getCurrentUrl());
        Assert.assertTrue(WDUtils.getPageTitle(driver).contains("ToolsQA"),
                "When navigating to Homepage url: Different page title encountered: " + driver.getTitle());
    }

    protected void navigateToElementsPage() {
        WDUtils.navigateTo(driver, URLConstants.ELEMENTS_CARD_URL);
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.ELEMENTS_CARD_URL),
                "When navigating to Elements Page url: Different url encountered " + driver.getCurrentUrl());
    }
    protected void navigateToBookStorePage() {
        WDUtils.navigateTo(driver, URLConstants.BOOKS_CARD_URL);
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.BOOKS_CARD_URL),
                "When navigating to Book Store page url: Different url encountered " + driver.getCurrentUrl());
    }
}
