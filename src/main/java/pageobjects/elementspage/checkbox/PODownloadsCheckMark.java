package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class PODownloadsCheckMark extends POBase {
    @FindBy(xpath = "//*[@id=\"tree-node\"]//span[contains(text(),'Downloads')]")
    private WebElement weDownloadsCheckMark;
    public PODownloadsCheckMark(WebDriver driver) { super(driver); }
    public Boolean isDownloadsCheckMarkDisplayed() { return WEUtils.isDisplayed(weDownloadsCheckMark); }
    public Boolean clickDownloadsCheckMark() { return WEUtils.click(weDownloadsCheckMark); }
}
