package framework.utils.webdriver;

import framework.utils.BaseWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WDWait extends BaseWait {
    public static Boolean waitForPageTitleToContainText(WebDriver driver, String partialText) {
        try {
            return myLongWait(driver).until(ExpectedConditions.titleContains(partialText));
        } catch (TimeoutException e) {
            return null;
        }
    }

    public static Boolean waitForPageTitleToContainTextMyWay(WebDriver driver, String partialText) {
        try {
            return myLongWait(driver).until(textToBePresentInTitle(partialText));
        } catch (TimeoutException e) {
            return null;
        }
    }

    private static ExpectedCondition<Boolean> textToBePresentInTitle(String partialText) {
        return new ExpectedCondition<>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return driver.getTitle().contains(partialText);
                } catch (Exception e) {
                    return null;
                }
            }
            public String toString() {
                return String.format("Partial title: " + partialText + " to be present!");
            }
        };
    }
}
