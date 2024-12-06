package steps.OnlineServiceBooking;

import com.atf.base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.onlineServiceBooking.SelectDealerPage;
import pages.onlineServiceBooking.SelectServicePage;

public class SelectServiceSteps extends BaseStep {
    private SelectServicePage selectServicePage;
    public SelectServiceSteps(BaseStep baseStep) {
        setDriver(baseStep);
        selectServicePage = new SelectServicePage(driver);
    }

    @Then("^I am redirected to the service section page$")
    public void iAmRedirectedToTheServiceSectionPage() {
        selectServicePage.checkIfServicePageIsDisplayed();
    }

    @Given("^That I'm a user that selected at least one service$")
    public void thatIMAUserThatSelectedAtLeastOneService() {
        selectServicePage.selectAService();
    }

    @When("^I confirm the service\\(s\\)$")
    public void iConfirmTheServiceS() {
        selectServicePage.clickConfirmCTA();
    }

    @And("^I have selected my service booking date$")
    public void iHaveSelectedMyServiceBookingDate() {
        selectServicePage.selectADate();
    }

    @When("^i click on edit$")
    public void iClickOnEdit() {
        selectServicePage.clickEdit();
    }

    @And("^I should be able to select a time for my drop off time$")
    public void iShouldBeAbleToSelectATimeForMyDropOffTime() {
        selectServicePage.seeIfAbleToSelectTime();
    }

    @When("^I go to the service booking summary on  Date and time section during a service booking$")
    public void iGoToTheServiceBookingSummaryOnDateAndTimeSectionDuringAServiceBooking() {
        selectServicePage.seeServiceBookingSummary();
    }

    @When("^I select to confirm the selected services$")
    public void iSelectToConfirmTheSelectedServices() {
        selectServicePage.selectToConfirmSelectedService();
    }

    @Then("^I see the service type of the selected service\\(s\\)$")
    public void iSeeTheServiceTypeOfTheSelectedServiceS() {
        selectServicePage.seeServiceType();
    }

    @And("^I see the service with promotional price is indicated next to its service name$")
    public void iSeeTheServiceWithPromotionalPriceIsIndicatedNextToItsServiceName() {
        selectServicePage.seeServiceWithPromotionalPrice();
    }

    @Then("^I see the option to select an alternative transport dropdown field$")
    public void iSeeTheOptionToSelectAnAlternativeTransportDropdownField() {
        selectServicePage.seeOptionToSelectAlternativeTransport();
    }
}
