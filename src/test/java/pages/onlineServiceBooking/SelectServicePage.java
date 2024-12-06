package pages.onlineServiceBooking;

import com.atf.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class SelectServicePage extends BasePage {

    @FindBy(how = How.CSS, using = "*[data-test-id='SERVICE_SELECTION-step']")
    private WebElement serviceSelection;

    @FindBy(how = How.CSS, using = "*[data-test-id='serviceOptionCheckbox-972886B1-B922-433F-ACD7-71936158A363-checkbox-label']")
    private WebElement chkboxServiceOptionGlobalTyre;

    @FindBy(how = How.CSS, using = "*[data-test-id='selected-services-summary-servicetype-BF4DDA9C-B0EE-4B1A-A468-6F3FCAC5F3BC']")
    private WebElement labelServiceType;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-show-date-section']")
    private WebElement btnConfirm;

    @FindBy(how = How.CSS, using = "*[class*='DaySelection-module_calendar_syXNO']")
    private WebElement appointmentDateCalendar;

    @FindBy(how = How.CSS, using = "*[data-test-id='edit-dealer-button']")
    private WebElement btnEdit;

    @FindBy(how = How.CSS, using = "*[data-test-id='select-dropdown-drop-off-toggle']")
    private WebElement sectionDropoff;

    @FindBy(how = How.CSS, using = "*[data-test-id='select-dropdown-pick-up-hours-toggle']")
    private WebElement sectionPickup;

    @FindBy(how = How.CSS, using = "*[data-test-id='selected-services-summary-container']")
    private WebElement sectionServiceBookingSummary;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-services-selection-confirm']")
    private WebElement labelPromotionalPrice;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-services-selection-confirm']")
    private WebElement btnConfirmSelection;

    @FindBy(how = How.CSS, using = "*[data-test-id='alternativeTransportDropdown']")
    private WebElement sectionAlternativeTransport;

    public SelectServicePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void componentValidation() {
    }

    public void checkIfServicePageIsDisplayed() {
        validate.ensureElementIsDisplayed(serviceSelection);
    }

    public void selectAService() {
        wait.waitUntilElementIsDisplayed(chkboxServiceOptionGlobalTyre,30);
        action.clickElement(chkboxServiceOptionGlobalTyre);
    }

    public void clickConfirmCTA() {
        action.clickElement(btnConfirm);
    }

    public void selectADate() {
        wait.waitUntilElementIsDisplayed(appointmentDateCalendar,30);
    }

    public void clickEdit() {
        wait.waitUntilElementIsDisplayed(btnEdit, 30);
        action.clickElement(btnEdit);
    }

    public void seeIfAbleToSelectTime() {
        wait.waitUntilElementIsDisplayed(sectionDropoff,30);
        validate.ensureElementIsDisplayed(sectionDropoff);
        wait.waitUntilElementIsDisplayed(sectionPickup,30);
        validate.ensureElementIsDisplayed(sectionPickup);
    }

    public void seeServiceBookingSummary() {
        wait.waitUntilElementIsDisplayed(sectionServiceBookingSummary,30);
        validate.ensureElementIsDisplayed(sectionServiceBookingSummary);
    }

    public void selectToConfirmSelectedService() {
        wait.waitUntilElementIsDisplayed(btnConfirmSelection,30);
        validate.ensureElementIsDisplayed(btnConfirmSelection);
        action.getElementWhenInteractive(btnConfirmSelection);
        action.clickElementBySelenium(btnConfirmSelection);
    }

    public void seeServiceType() {
        validate.ensureElementIsDisplayed(labelServiceType);
    }

    public void seeServiceWithPromotionalPrice() {
        validate.ensureElementIsDisplayed(chkboxServiceOptionGlobalTyre);
        validate.ensureElementIsDisplayed(labelPromotionalPrice);
    }

    public void seeOptionToSelectAlternativeTransport() {
        validate.ensureElementIsDisplayed(sectionAlternativeTransport);
    }
}
