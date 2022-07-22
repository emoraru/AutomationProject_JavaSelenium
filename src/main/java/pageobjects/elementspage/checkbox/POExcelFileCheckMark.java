package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POExcelFileCheckMark extends POBase {

    @FindBy(xpath = "//*[@id=\"tree-node\"]//span[contains(text(),'Excel File.doc')]")
    private WebElement weExcelFileCheckmark;
    public POExcelFileCheckMark (WebDriver driver) { super(driver); }
    public Boolean isExcelFileCheckMarkDisplayed() { return WEUtils.isDisplayed(weExcelFileCheckmark); }
    public Boolean clickExcelFileCheckMark() { return WEUtils.click(weExcelFileCheckmark); }
}
