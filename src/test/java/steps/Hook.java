package steps;

import com.atf.base.BaseHook;
import com.atf.base.BaseStep;
import com.atf.browsers.config.BrowserInitializer;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseHook {

    public Hook(BaseStep baseStep) {
        super(baseStep);
    }

    @Before
    public void setUp(Scenario scenario) {
        setUp();
        BrowserInitializer.initializer(baseStep, browser, environment, scenario);
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            embedReport(scenario);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            baseStep.driver.quit();
        }
    }
}
