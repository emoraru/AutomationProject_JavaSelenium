import data.URLConstants;
import framework.utils.webdriver.WDUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.homepage.POHeader;

public class HeaderTests extends BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        setup();
        navigateToBasePage();
    }

    @AfterMethod
    public void afterMethod() { tearDown(); }

    @Test
    public void verifyHeaderLogoButtonTest() {
        POHeader poHeader = new POHeader(driver);
        Assert.assertTrue(poHeader.isHeaderLogoButtonDisplayed(), "Unable to confirm Header Logo button is displayed");
        Assert.assertTrue(poHeader.clickHeaderLogoButton(), "Unable to click Header Logo button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).contains(URLConstants.BASE_URL),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.BASE_URL);


        //TODO delete this
        //WDUtils.waitForSeconds(5);
        //WebElement weSearchViewTextField = driver.findElement(By.cssSelector("div[class *= 'searchBarContainer'] input[placeholder='Search']"));
        //Assert.assertTrue(WEUtils.isDisplayed(weSearchViewTextField), "Unable to confirm search view was loaded after clicking search button from header");
    }
}
