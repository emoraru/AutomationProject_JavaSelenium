package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class PODownloadsCheckMarkResponse extends POBase {
    @FindBy(xpath = "//div[@class=\"display-result mt-4\"]//span[contains(text(),\"downloads\")]")
    private WebElement weDownloadsCheckMarkResponse;
    public PODownloadsCheckMarkResponse(WebDriver driver) { super(driver); }
    public Boolean isDownloadsCheckMarked() { return WEUtils.isDisplayed(weDownloadsCheckMarkResponse); }

}
