package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POExcelFileCheckMarkResponse extends POBase {
    @FindBy(xpath = "//div[@class=\"display-result mt-4\"]//span[contains(text(),\"excelFile\")]")
    private WebElement weExcelFileCheckMarkResponse;
    public POExcelFileCheckMarkResponse(WebDriver driver) { super(driver); }
    public Boolean isExcelFileCheckMarked() { return WEUtils.isDisplayed(weExcelFileCheckMarkResponse); }
}
