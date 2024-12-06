package pages.onlineServiceBooking;

import com.atf.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectVehiclePage extends BasePage {
    @FindBy(how = How.CSS, using = "*[data-test-id='inputFieldSearchVinReg']")
    private WebElement txtVin;

    @FindBy(how = How.CSS, using = "*[data-test-id='input-field-mileage']")
    private WebElement txtMileage;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-confirm-button-landing-page']")
    private WebElement btnContinue;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-login']")
    private WebElement btnLogin;

    @FindBy(how = How.CSS, using = "*[data-test-id='vehicle-lookup-flag-country-code']")
    private WebElement labelCountryAbbreviation;

    @FindBy(how = How.CSS, using = "*[data-test-id='switch-vehicle-search-method'] +span")
    private WebElement labelToolTip;

    @FindBy(how = How.CSS, using = "*[data-test-id='landing-page']")
    private WebElement sectionLandingPage;

    public SelectVehiclePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void componentValidation() {
    }

    public void enterVin(String vin) {
        wait.waitUntilElementIsDisplayed(txtVin, 30);
        action.fillInInputField(txtVin, vin);
    }

    public void enterMileage(String mileage) {
        wait.waitUntilElementIsDisplayed(txtMileage, 30);
        action.fillInInputField(txtMileage, mileage);
    }
    public void seeIfAbleToConfirm() {
        wait.waitUntilElementIsDisplayed(btnContinue, 30);
    }
    public void clickContinueCTA() {
        action.scrollTo(btnContinue);
        action.clickElementByJavaScript(btnContinue);
    }

    public void seeIfAbbreviationIsDisplayed() {
        validate.ensureElementIsDisplayed(labelCountryAbbreviation);
    }

    public void seeIfToolTipIsDisplayed() {
        validate.ensureElementIsDisplayed(labelToolTip);
    }

    public void seeCustomerIsOnLandingPage() {
        wait.waitUntilElementIsDisplayed(sectionLandingPage, 20);
        validate.ensureElementIsDisplayed(sectionLandingPage);
    }

    public void SelectTheLoginOptionOnOSBLanding() {
        wait.waitUntilElementIsDisplayed(btnLogin,20);
        action.clickElement(btnLogin);
    }


}
