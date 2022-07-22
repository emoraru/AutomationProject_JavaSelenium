package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POBase {
    protected WebDriver driver;

    public POBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
