import data.LoginDataConstants;
import data.URLConstants;
import framework.utils.webdriver.WDUtils;
import framework.utils.webelement.WEUtils;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.bookstore.login.POLoginForm;
import pageobjects.bookstore.login.POLoginNavigationButton;

public class BookStorePageTests extends BaseTest{
    @BeforeMethod
    public void beforeMethod() { navigateToBookStorePage(); }

    @Test
    public void navigateToLoginPageTest() {
        POLoginNavigationButton poLoginNavigationButton = new POLoginNavigationButton(driver);
        WDUtils.waitForSeconds(5);
        WDUtils.scrollDown(driver);
        WDUtils.waitForSeconds(2);
        Assert.assertTrue(poLoginNavigationButton.isLoginNavigationButtonDisplayed(), "Unable to confirm Login navigation button is displayed.");
        Assert.assertTrue(poLoginNavigationButton.clickLoginNavigationButton(), "Unable to click Login navigation button.");
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.LOGIN_NAV_BUTTON_URL), "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.LOGIN_NAV_BUTTON_URL);

    }

    @Test
    public void setTextLoginFormTest() {
        POLoginForm poLoginForm = new POLoginForm(driver);
        WEUtils.pressLoginNavigationButton(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poLoginForm.isLoginUserNameDisplayed(), "Unable to confirm UserName field is displayed");
        Assert.assertTrue(poLoginForm.clickLoginUserName(), "Unable to click UserName field");
        Assert.assertTrue(poLoginForm.setTextUserName(LoginDataConstants.USER_NAME), "Unable to set text to UserName field");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poLoginForm.isLoginPasswordDisplayed());
        Assert.assertTrue(poLoginForm.clickLoginPassword());
        Assert.assertTrue(poLoginForm.setTextPassword(LoginDataConstants.PASSWORD));

        Assert.assertTrue(poLoginForm.isLoginButtonDisplayed());
        Assert.assertTrue(poLoginForm.clickLoginButton());

        WDUtils.waitForSeconds(4);

    }

}
