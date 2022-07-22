package framework.utils.webelement;

import framework.utils.webdriver.WDUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageobjects.bookstore.login.POLoginNavigationButton;
import pageobjects.elementspage.buttons.POButtonsButton;
import pageobjects.elementspage.checkbox.POCheckboxButton;
import pageobjects.elementspage.checkbox.POCollapseAllCheckBoxesButton;
import pageobjects.elementspage.checkbox.POExpandAllCheckBoxesButton;
import pageobjects.elementspage.textbox.POTextBoxButton;

public class WEUtils {

    public static Boolean click(WebElement el) {
        try {
            el.click();
            return Boolean.TRUE;
        } catch (Exception e) {
            return null;
        }
    }

    public static Boolean doubleClick(WebElement el, WebDriver driver) {
        Actions action = new Actions(driver);
        try {
            action.doubleClick(el).perform();
            return Boolean.TRUE;
        } catch (Exception e) {
            return null;
        }
    }

    public static Boolean rightClick(WebElement el, WebDriver driver) {
        Actions action = new Actions(driver);
        try {
            action.contextClick(el).perform();
            return Boolean.TRUE;
        } catch (Exception e) {
            return null;
        }
    }

    public static Boolean isDisplayed(WebElement el) {
        try {
            return el.isDisplayed();
        } catch (Exception e) {
            return null;
        }
    }

    public static String getText(WebElement el) {
        try {
            return el.getText();
        } catch (Exception e) {
            return null;
        }
    }

    public static Boolean setText(WebElement el, String text) {
        try {
            el.sendKeys(text);
            return Boolean.TRUE;
        } catch (Exception e) {
            return null;
        }
    }

    public static void pressCheckBoxButton(WebDriver driver) {
        POCheckboxButton poCheckboxButton = new POCheckboxButton(driver);
        Assert.assertTrue(poCheckboxButton.isCheckboxButtonDisplayed(), "Unable to confirm Check Box button is displayed");
        Assert.assertTrue(poCheckboxButton.clickCheckboxButton(), "Unable to click Check Box button");
    }

    public static void expandAll(WebDriver driver) {
        POExpandAllCheckBoxesButton poExpandAllCheckBoxesButton = new POExpandAllCheckBoxesButton(driver);
        Assert.assertTrue(poExpandAllCheckBoxesButton.isExpandAllButtonDisplayed(), "Unable to confirm Expand All button is displayed");
        Assert.assertTrue(poExpandAllCheckBoxesButton.clickExpandAllButton(), "Unable to click Expand All button");
    }

    public static void collapseAll(WebDriver driver) {
        POCollapseAllCheckBoxesButton poCollapseAllCheckBoxesButton = new POCollapseAllCheckBoxesButton(driver);
        Assert.assertTrue(poCollapseAllCheckBoxesButton.isCollapseAllCheckBoxDisplayed(), "Unable to confirm Collapse All button is displayed");
        Assert.assertTrue(poCollapseAllCheckBoxesButton.clickCollapseAllButton(), "Unable to click Collapse All button");
    }

    public static void pressButtonsButton(WebDriver driver) {
        POButtonsButton poButtonsButton = new POButtonsButton(driver);
        Assert.assertTrue(poButtonsButton.isButtonsButtonDisplayed(), "Unable to confirm Buttons button is displayed");
        Assert.assertTrue(poButtonsButton.clickButtonsButton(), "Unable to click Buttons button");
    }

    public static void pressTextBoxButton(WebDriver driver) {
        POTextBoxButton poTextBoxButton = new POTextBoxButton(driver);
        Assert.assertTrue(poTextBoxButton.isTextBoxButtonDisplayed(), "Unable to confirm Text Box button is displayed.");
        Assert.assertTrue(poTextBoxButton.clickTextBoxButton(), "Unable to click Text Box button.");
    }

    public static void pressLoginNavigationButton(WebDriver driver) {
        POLoginNavigationButton poLoginNavigationButton = new POLoginNavigationButton(driver);
        WDUtils.scrollDown(driver);
        Assert.assertTrue(poLoginNavigationButton.isLoginNavigationButtonDisplayed(), "Unable to confirm Login navigation button is displayed.");
        Assert.assertTrue(poLoginNavigationButton.clickLoginNavigationButton(), "Unable to click Login navigation button.");
    }

}


