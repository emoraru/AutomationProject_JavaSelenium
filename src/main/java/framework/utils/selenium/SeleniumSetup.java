package framework.utils.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumSetup {

    public static WebDriver createWebDriver() {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/webdrivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        if (driver != null) {
            driver.manage().window().maximize();
        }
        return driver;
    }
}
