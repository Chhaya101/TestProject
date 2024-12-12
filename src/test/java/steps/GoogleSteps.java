package steps;
import com.atf.base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.GooglePage;


public class GoogleSteps extends BaseStep {

    private GooglePage googlePage;
    public GoogleSteps(BaseStep baseStep) {
        setDriver(baseStep);
        googlePage = new GooglePage(driver);

    }
    @Given("^User opens the webpage \"([^\"]*)\"$")
    public void user_opens_the_webpage(String url)   {

        driver.navigate().to(url);
        System.out.println("test");

    }

    @And("^I click on Login$")
    public void iClickOnLogin() {
        googlePage.click();
    }
}

