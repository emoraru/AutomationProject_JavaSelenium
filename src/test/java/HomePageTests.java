import data.URLConstants;
import framework.utils.RetryAnalyzer;
import framework.utils.webdriver.WDUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.homepage.*;

public class HomePageTests extends BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        setup();
        navigateToBasePage();
    }

    @AfterMethod
    public void afterMethod() { tearDown(); }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void openHomePageTest() {
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.BASE_URL),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.BASE_URL);
    }

    @Test
    public void verifyElementsCardButtonTest() {
        POElementsCard poElementsCard = new POElementsCard(driver);
        Assert.assertTrue(poElementsCard.isElementsCardDisplayed(), "Unable to confirm Elements Card button is displayed");
        Assert.assertTrue(poElementsCard.clickElementsCard(), "Unable to click Elements Card button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).contains(URLConstants.ELEMENTS_CARD_URL)),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.ELEMENTS_CARD_URL);
    }

    @Test
    public void verifyFormsCardButtonTest() {
        POFormsCard poFormsCard = new POFormsCard(driver);
        Assert.assertTrue(poFormsCard.isFormsCardDisplayed(), "Unable to confirm Forms Card button is displayed");
        Assert.assertTrue(poFormsCard.clickFormsCard(), "Unable to click Forms Card button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).contains(URLConstants.FORMS_CARD_URL)),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.FORMS_CARD_URL);
    }

    @Test
    public void verifyAlertsWindowsCardButtonTest() {
        POAlertsWindowsCard poAlertsWindowsCard = new POAlertsWindowsCard(driver);
        Assert.assertTrue(poAlertsWindowsCard.isAlertsWindowsCardDisplayed(), "Unable to confirm AlertsWindows Card button is displayed");
        Assert.assertTrue(poAlertsWindowsCard.clickAlertsWindowsCard(), "Unable to click AlertsWindows Card button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).contains(URLConstants.ALERTS_WINDOWS_CARD_URL)),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.ALERTS_WINDOWS_CARD_URL);
    }

    @Test
    public void verifyWidgetsCardButtonTest() {
        POWidgetsCard poWidgetsCard = new POWidgetsCard(driver);
        Assert.assertTrue(poWidgetsCard.isWidgetsCardDisplayed(), "Unable to confirm Widget Card button is displayed");
        Assert.assertTrue(poWidgetsCard.clickWidgetsCard(), "Unable to click Widget Card button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).contains(URLConstants.WIDGETS_CARD_URL)),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.WIDGETS_CARD_URL);
    }

    @Test
    public void verifyInteractionsButtonTest() {
        POInteractionsCard poInteractionsCard = new POInteractionsCard(driver);
        Assert.assertTrue(poInteractionsCard.isInteractionsCardDisplayed(), "Unable to confirm Interactions Card button is displayed");
        Assert.assertTrue(poInteractionsCard.clickInteractionsCard(), "Unable to click Interactions Card button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).contains(URLConstants.INTERACTIONS_CARD_URL)),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.INTERACTIONS_CARD_URL);
    }

    @Test
    public void verifyBooksButtonTest() {
        POBookStoreCard poBookStoreCard = new POBookStoreCard(driver);
        Assert.assertTrue(WDUtils.scrollDown(driver), "Unable to scroll down");
        Assert.assertTrue(poBookStoreCard.isBooksCardDisplayed(), "Unable to confirm Books Card button is displayed");
        Assert.assertTrue(poBookStoreCard.clickBooksCard(), "Unable to click Books Card button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).contains(URLConstants.BOOKS_CARD_URL)),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.BOOKS_CARD_URL);
    }

}
