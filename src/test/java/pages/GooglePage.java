package pages;

import com.atf.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage extends BasePage {
    @FindBy(how = How.CSS, using = "*[class='btn btn-primary']")
    private WebElement btnLogin;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void componentValidation() {

    }


    public void click() {
        action.clickElement(btnLogin);
    }
}