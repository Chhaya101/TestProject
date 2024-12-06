package steps.OnlineServiceBooking;

import com.atf.base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.onlineServiceBooking.SelectServicePage;
import pages.onlineServiceBooking.ConfirmDetailsPage;

public class ConfirmDetailsSteps extends BaseStep{
    private ConfirmDetailsPage confirmDetailsPage;
    public ConfirmDetailsSteps(BaseStep baseStep) {
        setDriver(baseStep);
        confirmDetailsPage = new ConfirmDetailsPage(driver);
    }
    @Then("^I should see the contact details section$")
    public void iShouldSeeTheContactDetailsSection() {
        confirmDetailsPage.seeContactDetailsSection();
    }

    @And("^I should be able to fill in the first name \"([^\"]*)\"$")
    public void iShouldBeAbleToFillInTheFirstName(String firstName){
        confirmDetailsPage.enterFirstName(firstName);
    }

    @And("^the last name \"([^\"]*)\"$")
    public void theLastName(String lastName){
        confirmDetailsPage.enterLastName(lastName);
    }

    @And("^the email address \"([^\"]*)\"$")
    public void theEmailAddress(String email)  {
        confirmDetailsPage.enterEmail(email);
    }

    @And("^the phone number \"([^\"]*)\"$")
    public void thePhoneNumber(String phoneNumber) {
        confirmDetailsPage.enterPhoneNumber(phoneNumber);
    }

    @And("^I should be able to choose between email or phone as the preferred contact method \\(default email\\)$")
    public void iShouldBeAbleToChooseBetweenEmailOrPhoneAsThePreferredContactMethodDefaultEmail() {
        confirmDetailsPage.selectEmailAsPreferredContact();
    }

    @When("^I accept the privacy policy$")
    public void iAcceptThePrivacyPolicy() {
        confirmDetailsPage.selectPrivacyPolicy();
    }

    @Then("^I should be able to finalize my booking$")
    public void iShouldBeAbleToFinalizeMyBooking() {
        confirmDetailsPage.seeIfAbleToFinalizeBooking();
    }

    @And("^I should see a recap of my appointment$")
    public void iShouldSeeARecapOfMyAppointment() {
        confirmDetailsPage.seeRecapOfMyAppointment();
    }

    @And("^I should see the retailer's information where I booked my appointment$")
    public void iShouldSeeTheRetailerSInformationWhereIBookedMyAppointment() {
        confirmDetailsPage.seeRetailerInformation();
    }

    @And("^I should be able to return to the homepage$")
    public void iShouldBeAbleToReturnToTheHomepage() {
        confirmDetailsPage.seeIfAbleToReturnToHomepgae();
    }

    @When("^My booking is successful$")
    public void myBookingIsSuccessful() {
        confirmDetailsPage.confirmBooking();
    }

    @And("^mandatory fields should be indicated$")
    public void mandatoryFieldsShouldBeIndicated() {
        confirmDetailsPage.seeMandatoryFieldsAreIndicated();
    }

    @Then("^I should be able to see my first name prefilled$")
    public void iShouldBeAbleToSeeMyFirstNamePrefilled() {
        confirmDetailsPage.seeIfFirstNameIsPrefilled();
    }

    @And("^My last name prefilled$")
    public void myLastNamePrefilled() {
        confirmDetailsPage.seeLastNamePrefilled();
    }

    @And("^My email address prefilled$")
    public void myEmailAddressPrefilled() {
        confirmDetailsPage.seeEmailAddressPrefilled();
    }

    @And("^I should be able to edit my personal information$")
    public void iShouldBeAbleToEditMyPersonalInformation() {
        confirmDetailsPage.seeIfAbleToEditPeronalInformation();
    }

    @When("^I go to the service booking summary on Personal details step during a service booking$")
    public void iGoToTheServiceBookingSummaryOnPersonalDetailsStepDuringAServiceBooking() {
        confirmDetailsPage.seeServiceBookingSummaryonPersonalDetails();
    }

    @Then("^I see the service type of the selected service\\(s\\) on Personal details step$")
    public void iSeeTheServiceTypeOfTheSelectedServiceSOnPersonalDetailsStep() {
        confirmDetailsPage.seeServiceType();
    }

    @And("^I see the service with promotional price is indicated next to its service name on Personal details$")
    public void iSeeTheServiceWithPromotionalPriceIsIndicatedNextToItsServiceNameOnPersonalDetails() {
        confirmDetailsPage.seeServiceWithPromotionalPriceOnPersonalDetails();
    }

    @Then("^I should be informed that my booking has been confirmed$")
    public void iShouldBeInformedThatMyBookingHasBeenConfirmed() {
        confirmDetailsPage.seeBookingConfirmationMessage();
    }
}
