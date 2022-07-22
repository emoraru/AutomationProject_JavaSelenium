package framework.utils.webelement;

import framework.utils.BaseWait;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WEWait extends BaseWait {
    public static Boolean waitForElementTextToContainString(WebDriver driver, By locator, String partialText) {
        try {
            return myShortWait(driver).until(ExpectedConditions.textToBePresentInElementLocated(locator, partialText));
        } catch (TimeoutException e) {
            System.out.println("Timeout exception encountered for waitForElementTextToContainString method");
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
