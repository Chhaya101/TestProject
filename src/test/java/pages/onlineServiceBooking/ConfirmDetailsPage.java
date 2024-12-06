package pages.onlineServiceBooking;

import org.openqa.selenium.WebDriver;
import com.atf.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ConfirmDetailsPage extends BasePage{

    @FindBy(how = How.CSS, using = "*[data-test-id='contact-details-section']")
    private WebElement sectionContactDetails;

    @FindBy(how = How.CSS, using = "*[data-test-id='select-dropdown-contact-details-first-name']")
    private WebElement txtFirstName;

    @FindBy(how = How.CSS, using = "*[data-test-id='input-contact-details-last-name']")
    private WebElement txtLastName;

    @FindBy(how = How.CSS, using = "*[data-test-id='input-contact-details-phone-number'] input")
    private WebElement txtPhone;

    @FindBy(how = How.CSS, using = "*[data-test-id='input-contact-details-email-address']")
    private WebElement txtEmail;

    @FindBy(how = How.CSS, using = "*[data-test-id='checkbox-extra-details-email-checkbox-label']")
    private WebElement checkboxEmail;

    @FindBy(how = How.CSS, using = "*[data-test-id='checkbox-terms-general-policy-checkbox-label']")
    private WebElement checkboxGeneralPolicy;

    @FindBy(how = How.CSS, using = "*[data-test-id='checkbox-terms-data-protection-checkbox-label']")
    private WebElement checkboxDataPolicy;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-confirm-booking']")
    private WebElement btnConfirmSelection;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-details-summary-serviceName']")
    private WebElement sectionAppointmentDetailServiceName;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-details-summary-dropOffTime']")
    private WebElement sectionAppointmentDetailDropOffTime;

    @FindBy(how = How.CSS, using = "*[data-test-id='OSB-details-summary-pickUpTime']")
    private WebElement sectionAppointmentDetailPickupTime;

    @FindBy(how = How.CSS, using = "*[data-test-id='dealer-summary-dealer-address']")
    private WebElement sectionRetailerAddress;

    @FindBy(how = How.CSS, using = "*[data-test-id='dealer-summary-dealer-phone-number']")
    private WebElement sectionRetailerPhone;

    @FindBy(how = How.CSS, using = "*[data-test-id='go-to-previous-tab-button']")
    private WebElement goToToyotaHomePage;

    @FindBy(how = How.CSS, using = "*[data-test-id='firstName-mandatory-sign']")
    private WebElement labelmandayorySignFname;

    @FindBy(how = How.CSS, using = "*[data-test-id='lastName-mandatory-sign']")
    private WebElement labelmandayorySignLname;

    @FindBy(how = How.CSS, using = "*[data-test-id='emailAddress-mandatory-sign']")
    private WebElement labelmandayorySignEmailAddress;

    @FindBy(how = How.CSS, using = "*[data-test-id='phoneNumber-mandatory-sign']")
    private WebElement labelmandayorySignPhoneNo;

    @FindBy(how = How.CSS, using = "*[data-test-id='selected-services-summary-container']")
    private WebElement sectionServiceBookingSummary;

    @FindBy(how = How.CSS, using = "*[data-test-id='selected-services-summary-servicetype-BF4DDA9C-B0EE-4B1A-A468-6F3FCAC5F3BC']")
    private WebElement labelServiceType;

    @FindBy(how = How.CSS, using = "*[data-test-id='serviceOptionCheckbox-972886B1-B922-433F-ACD7-71936158A363-checkbox-label']")
    private WebElement chkboxServiceOptionGlobalTyre;

    @FindBy(how = How.CSS, using = "*[data-test-id='serviceprice-972886B1-B922-433F-ACD7-71936158A363']")
    private WebElement labelPromotionalPrice;

    @FindBy(how = How.CSS, using = "*[class='SummaryHeader-module_confirmation_ZJElm col-xs-12']")
    private WebElement labelBookingConfirmationMsg;

    public ConfirmDetailsPage(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public void componentValidation() {
    }

    public void seeContactDetailsSection() {
        wait.waitUntilElementIsDisplayed(sectionContactDetails,30);
        validate.ensureElementIsDisplayed(sectionContactDetails);
    }

    public void enterFirstName(String firstName) {
        action.fillInInputField(txtFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        action.fillInInputField(txtLastName, lastName);
    }

    public void enterEmail(String email) {
        action.fillInInputField(txtEmail, email);
    }

    public void enterPhoneNumber(String phoneNumber) {
        action.fillInInputField(txtPhone, phoneNumber);
    }

    public void selectEmailAsPreferredContact() {
        action.clickElement(checkboxEmail);
    }

    public void selectPrivacyPolicy() {
        action.clickElement(checkboxGeneralPolicy);
        action.clickElement(checkboxDataPolicy);
    }

    public void seeIfAbleToFinalizeBooking() {
        wait.waitUntilElementIsDisplayed(btnConfirmSelection,30);
        validate.ensureElementIsDisplayed(btnConfirmSelection);
    }
    public void confirmBooking() {
        action.clickElement(btnConfirmSelection);
    }

    public void seeRecapOfMyAppointment() {
        wait.waitUntilElementIsDisplayed(sectionAppointmentDetailServiceName);
        validate.ensureElementIsDisplayed(sectionAppointmentDetailServiceName);
        validate.ensureElementIsDisplayed(sectionAppointmentDetailDropOffTime);
        validate.ensureElementIsDisplayed(sectionAppointmentDetailPickupTime);
    }

    public void seeRetailerInformation() {
        validate.ensureElementIsDisplayed(sectionRetailerAddress);
        validate.ensureElementIsDisplayed(sectionRetailerPhone);
    }

    public void seeIfAbleToReturnToHomepgae() {
        validate.ensureElementIsDisplayed(goToToyotaHomePage);
    }

    public void seeMandatoryFieldsAreIndicated() {
        validate.ensureElementIsDisplayed(labelmandayorySignFname);
        validate.ensureElementIsDisplayed(labelmandayorySignLname);
        validate.ensureElementIsDisplayed(labelmandayorySignEmailAddress);
        validate.ensureElementIsDisplayed(labelmandayorySignPhoneNo);
    }

    public void seeIfFirstNameIsPrefilled() {
        validate.checkElementHasContent(txtFirstName);
    }

    public void seeLastNamePrefilled() {
        validate.checkElementHasContent(txtLastName);
    }

    public void seeEmailAddressPrefilled() {
        validate.checkElementHasNoContent(txtEmail);
    }

    public void seeIfAbleToEditPeronalInformation() {
        validate.ensureElementIsEnabled(txtFirstName);
        validate.ensureElementIsEnabled(txtLastName);
        validate.ensureElementIsEnabled(txtEmail);
        validate.ensureElementIsEnabled(checkboxEmail);
    }

    public void seeServiceBookingSummaryonPersonalDetails() {
        wait.waitUntilElementIsDisplayed(sectionServiceBookingSummary,30);
        validate.ensureElementIsDisplayed(sectionServiceBookingSummary);
    }

    public void seeServiceType() {
        validate.ensureElementIsDisplayed(labelServiceType);
    }

    public void seeServiceWithPromotionalPriceOnPersonalDetails() {
        validate.ensureElementIsDisplayed(chkboxServiceOptionGlobalTyre);
        validate.ensureElementIsDisplayed(labelPromotionalPrice);    }

    public void seeBookingConfirmationMessage() {
        validate.ensureElementIsDisplayed(labelBookingConfirmationMsg);
    }
}
