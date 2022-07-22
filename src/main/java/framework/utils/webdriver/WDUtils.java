package framework.utils.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WDUtils {
    public static String getPageTitle(WebDriver driver) {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            return null;
        }
    }

    public static String getCurrentUrl(WebDriver driver) {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            return null;
        }
    }

    public static Boolean navigateTo(WebDriver driver, String url) {
        try {
            driver.navigate().to(url);
            return Boolean.TRUE;
        } catch (Exception e) {
            return null;
        }
    }


    //TODO replace with wait mechanism
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Boolean scrollDown(WebDriver driver) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1000)", "");
            return Boolean.TRUE;
        } catch (Exception e) {
            return null;
        }
    }
}
