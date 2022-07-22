package pageobjects.bookstore.login;

import framework.utils.webdriver.WDUtils;
import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POLoginForm extends POBase {
    @FindBy(id = "userName")
    private WebElement poLoginUserName;
    public POLoginForm(WebDriver driver) { super(driver); }
    public Boolean isLoginUserNameDisplayed() { return WEUtils.isDisplayed(poLoginUserName); }
    public Boolean clickLoginUserName() { return WEUtils.click(poLoginUserName); }
    public Boolean setTextUserName(String text) { return WEUtils.setText(poLoginUserName, text); }

    @FindBy(id = "password")
    private WebElement poLoginPassword;
    public Boolean isLoginPasswordDisplayed() { return WEUtils.isDisplayed(poLoginPassword); }
    public Boolean clickLoginPassword() { return WEUtils.click(poLoginPassword); }
    public Boolean setTextPassword(String text) { return WEUtils.setText(poLoginPassword, text); }

    @FindBy(id = "login")
    private WebElement poLoginButton;
    public Boolean isLoginButtonDisplayed() { return WEUtils.isDisplayed(poLoginButton); }
    public Boolean clickLoginButton() { return WEUtils.click(poLoginButton); }
}
