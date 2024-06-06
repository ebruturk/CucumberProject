package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class XYZBankHomePage {
    public XYZBankHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
