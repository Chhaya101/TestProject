package steps.OnlineServiceBooking;

import com.atf.base.BaseStep;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;
import lombok.Setter;
import pages.onlineServiceBooking.SelectDealerPage;
import java.util.List;
import java.util.Map;


public class SelectDealerSteps extends BaseStep {
    private SelectDealerPage selectDealerPage;

    public SelectDealerSteps(BaseStep baseStep) {
        setDriver(baseStep);
        selectDealerPage = new SelectDealerPage(driver);
    }

    @And("^I see the option to select any one of the dealer$")
    public void iSeeTheOptionToSelectAnyOneOfTheDealer() {
        selectDealerPage.seeOptionToSelectDealer();
    }

    @When("^I select the option to search for dealer based on Search by location \"([^\"]*)\"$")
    public void iSelectTheOptionToSearchForDealerBasedOnSearchByLocation(String dealerLocation){
        selectDealerPage.searchByLocationForARetailer(dealerLocation);
    }

    @When("^I select the option to select a specific dealer from the result$")
    public void iSelectTheOptionToSelectASpecificDealerFromTheResult() {
        selectDealerPage.selectDealer();
    }

    @Then("^I see the Select dealer field$")
    public void iSeeTheSelectDealerField() {
        selectDealerPage.seeDealerField();
    }
}
