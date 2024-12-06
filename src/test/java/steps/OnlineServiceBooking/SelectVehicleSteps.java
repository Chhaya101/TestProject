package steps.OnlineServiceBooking;

import com.atf.base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.onlineServiceBooking.SelectDealerPage;
import pages.onlineServiceBooking.SelectVehiclePage;

public class SelectVehicleSteps extends BaseStep{

    private SelectVehiclePage selectVehiclePage;

    public SelectVehicleSteps(BaseStep baseStep) {
        setDriver(baseStep);
        selectVehiclePage = new SelectVehiclePage(driver);
    }

    @Then("^I should be able to enter a Vin/ Registration number$")
    public void iShouldBeAbleToEnterAVinRegistrationNumber() {
    }

    @And("^I should be able to enter the mileage of my vehicle \"([^\"]*)\"$")
    public void iShouldBeAbleToEnterTheMileageOfMyVehicle(String mileage) {
        selectVehiclePage.enterMileage(mileage);
    }

    @And("^I have entered a VIN/Reg in the input field \"([^\"]*)\"$")
    public void iHaveEnteredAVINRegInTheInputField(String vin) {
        selectVehiclePage.enterVin(vin);
    }

    @And("^I should be able to confirm my selection$")
    public void iShouldBeAbleToConfirmMySelection() {
        selectVehiclePage.seeIfAbleToConfirm();
    }
    @When("^I select the option to confirm my selection on the landing page$")
    public void iSelectTheOptionToConfirmMySelectionOnTheLandingPage() {
        selectVehiclePage.clickContinueCTA();
    }

    @And("^I see the option to see more details of the field \\(tool tip for Vin\\)$")
    public void iSeeTheOptionToSeeMoreDetailsOfTheFieldToolTipForVin() {
        selectVehiclePage.seeIfToolTipIsDisplayed();
    }

    @And("^I see the field of enter Vin/Registration number is indicated with the abbreviation of my country$")
    public void iSeeTheFieldOfEnterVinRegistrationNumberIsIndicatedWithTheAbbreviationOfMyCountry() {
        selectVehiclePage.seeIfAbbreviationIsDisplayed();
    }

    @Given("^I am a customer that is on the OSB landing page$")
    public void iAmACustomerThatIsOnTheOSBLandingPage() {
        selectVehiclePage.seeCustomerIsOnLandingPage();
    }

    @When("^I select the Login option on OSB page landing page$")
    public void iSelectTheLoginOptionOnOSBPageLandingPage() {
        selectVehiclePage.SelectTheLoginOptionOnOSBLanding();
    }


}
