package pages.onlineServiceBooking;

import com.atf.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SelectDealerPage extends BasePage {

    @FindBy(how = How.CSS, using = "*[data-test-id='input-field-mileage']")
    private WebElement txtMileage;

    @FindBy(how = How.CSS, using = "*[data-test-id='dealer-finder-search-input']")
    private WebElement txtDealer;

    @FindBy(how = How.CSS, using = "*[data-test-id='dealer-finder-dealer-card-select-button']")
    private WebElement btnSelect;

    private final String locatorCss_clickDealerFromTheList = "*[data-test-id = 'dealer-finder-dealer-tile-card-1']";


    public SelectDealerPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void componentValidation() {
    }
    public void seeDealerField() {
        wait.waitUntilElementIsDisplayed(txtDealer, 30);
        validate.ensureElementIsDisplayed(txtDealer);
    }
    public void searchByLocationForARetailer(String dealerLocation) {
        action.fillInInputField(txtDealer, dealerLocation);
        wait.waitForPage();
        txtDealer.sendKeys(Keys.ENTER);
    }

    public void selectDealer() {
        WebElement elementWhenInteractive = action.getElementWhenInteractive(By.cssSelector(locatorCss_clickDealerFromTheList));
        action.scrollByJavaScript(elementWhenInteractive);
        action.clickElement(elementWhenInteractive);
        action.clickElement(btnSelect);
    }

    public void seeOptionToSelectDealer() {
        wait.waitUntilElementIsDisplayed(btnSelect,30);
        validate.ensureElementIsDisplayed(btnSelect);
    }


}
