import data.LoginDataConstants;
import data.URLConstants;
import framework.utils.RetryAnalyzer;
import framework.utils.webdriver.WDUtils;
import framework.utils.webelement.WEUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.bookstore.login.*;

public class BookStorePageTests extends BaseTest{

    @BeforeMethod
    public void beforeMethod() {
        setup();
        navigateToBookStorePage();
    }

    @AfterMethod
    public void afterMethod() { tearDown(); }

    @Test
    public void navigateToLoginPageTest() {
        POLoginNavigationButton poLoginNavigationButton = new POLoginNavigationButton(driver);
        WDUtils.waitForSeconds(1);
        WDUtils.scrollDown(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poLoginNavigationButton.isLoginNavigationButtonDisplayed(), "Unable to confirm Login navigation button is displayed.");
        Assert.assertTrue(poLoginNavigationButton.clickLoginNavigationButton(), "Unable to click Login navigation button.");
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.LOGIN_NAV_BUTTON_URL),
                "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.LOGIN_NAV_BUTTON_URL);

    }

    @Test
    public void successfulLoginTest() {
        POLoginForm poLoginForm = new POLoginForm(driver);
        POLoginUserName poLoginUsername = new POLoginUserName(driver);
        WEUtils.pressLoginNavigationButton(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poLoginForm.isLoginUserNameDisplayed(), "Unable to confirm UserName field is displayed");
        Assert.assertTrue(poLoginForm.clickLoginUserName(), "Unable to click UserName field");
        Assert.assertTrue(poLoginForm.setTextUserName(LoginDataConstants.USER_NAME), "Unable to set text to UserName field");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poLoginForm.isLoginPasswordDisplayed(), "Unable to confirm Password field is displayed.");
        Assert.assertTrue(poLoginForm.clickLoginPassword(), "Unable to click Password field.");
        Assert.assertTrue(poLoginForm.setTextPassword(LoginDataConstants.PASSWORD), "Unable to set text to Password field.");

        Assert.assertTrue(poLoginForm.isLoginButtonDisplayed(), "Unable to confirm Login button is displayed.");
        Assert.assertTrue(poLoginForm.clickLoginButton(), "Unable to click Login button.");
        WDUtils.waitForSeconds(10);

        Assert.assertTrue(poLoginUsername.isUserNameDisplayed(), "Username field is not displayed.");
        Assert.assertTrue(poLoginUsername.getUserNameText().equals(LoginDataConstants.USER_NAME),
                "Different login username encountered: " + poLoginUsername.getUserNameText());
    }

    //in future can be divided in multiple tests with only the password wrong or only the username.
    @Test (retryAnalyzer = RetryAnalyzer .class)
    public void unsuccessfulLoginTest() {
        POLoginForm poLoginForm = new POLoginForm(driver);
        WEUtils.pressLoginNavigationButton(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poLoginForm.isLoginUserNameDisplayed(), "Unable to confirm UserName field is displayed");
        Assert.assertTrue(poLoginForm.clickLoginUserName(), "Unable to click UserName field");
        Assert.assertTrue(poLoginForm.setTextUserName(LoginDataConstants.WRONG_USER_NAME), "Unable to set text to UserName field");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poLoginForm.isLoginPasswordDisplayed(), "Unable to confirm Password field is displayed.");
        Assert.assertTrue(poLoginForm.clickLoginPassword(), "Unable to click Password field.");
        Assert.assertTrue(poLoginForm.setTextPassword(LoginDataConstants.WRONG_PASSWORD), "Unable to set text to Password field.");

        Assert.assertTrue(poLoginForm.isLoginButtonDisplayed(), "Unable to confirm Login button is displayed.");
        Assert.assertTrue(poLoginForm.clickLoginButton(), "Unable to click Login button.");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poLoginForm.isUnsuccessfulLoginMessageDisplayed(), "Error message for Unsuccessful login is not displayed.");
    }


    @Test
    public void logoutTest() {
        POLogoutButton poLogoutButton = new POLogoutButton(driver);
        POLoginForm poLoginForm = new POLoginForm(driver);
        WEUtils.successfulLogin(driver);

        Assert.assertTrue(poLogoutButton.isLogoutButtonDisplayed(), "Unable to confirm Logout button is displayed.");
        Assert.assertTrue(poLogoutButton.clickLogoutButton(), "Unable to click Logout button.");
        WDUtils.waitForSeconds(5);

        Assert.assertTrue(poLoginForm.isLoginUserNameDisplayed(), "Unable to confirm User Name field is displayed after Logout");
        Assert.assertTrue(poLoginForm.isLoginPasswordDisplayed(), "Unable to confirm Password field is displayed after Logout");
        Assert.assertTrue(poLoginForm.isLoginButtonDisplayed(), "Unable to confirm Login button is displayed after Logout");
    }

    @Test
    public void goToStoreButtonTest() {
        POProfile poGoToStoreButton = new POProfile(driver);

        WEUtils.successfulLogin(driver);
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poGoToStoreButton.isGoToStoreButtonDisplayed(), "Unable to confirm Go to store button is displayed");
        Assert.assertTrue(poGoToStoreButton.clickGoToStoreButton(), "Unable to click Go to store button");
        WDUtils.waitForSeconds(3);
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.BOOKS_CARD_URL), "Unable to confirm BookStore url");

        WDUtils.waitForSeconds(3);

    }


}
