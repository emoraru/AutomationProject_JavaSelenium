package pageobjects.bookstore.login;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POLoginForm extends POBase {
    @FindBy(id = "userName")
    private WebElement weLoginUserName;

    public Boolean isLoginUserNameDisplayed() { return WEUtils.isDisplayed(weLoginUserName); }
    public Boolean clickLoginUserName() { return WEUtils.click(weLoginUserName); }
    public Boolean setTextUserName(String text) { return WEUtils.setText(weLoginUserName, text); }

    @FindBy(id = "password")
    private WebElement weLoginPassword;
    public Boolean isLoginPasswordDisplayed() { return WEUtils.isDisplayed(weLoginPassword); }
    public Boolean clickLoginPassword() { return WEUtils.click(weLoginPassword); }
    public Boolean setTextPassword(String text) { return WEUtils.setText(weLoginPassword, text); }

    @FindBy(id = "login")
    private WebElement weLoginButton;
    public Boolean isLoginButtonDisplayed() { return WEUtils.isDisplayed(weLoginButton); }
    public Boolean clickLoginButton() { return WEUtils.click(weLoginButton); }

    @FindBy(xpath = "//div[@class=\"col-md-12 col-sm-12\"]/p[text()='Invalid username or password!']")
    private WebElement weUnsuccessfulLoginMessage;
    public Boolean isUnsuccessfulLoginMessageDisplayed() { return WEUtils.isDisplayed(weUnsuccessfulLoginMessage); }
    public POLoginForm(WebDriver driver) { super(driver); }
}
