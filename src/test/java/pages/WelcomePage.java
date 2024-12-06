/*
 * Description: Methods to validate Welcome page after login.
 * Author: Monique Pimentel
 * Created Date: 22-05-2018
 * Last Modified:
 * Reviewed by:
 * Reviewed Date:
 */
package pages;

import static com.atf.handlers.ErrorReporter.reportErrorWithMessage;

import com.atf.base.BasePage;
import com.atf.config.Settings;
import com.atf.enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class WelcomePage extends BasePage {


    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "*[id='onetrust-accept-btn-handler']")
    private WebElement btnCookiesAccept;

    @FindBy(how = How.CSS, using = "*[data-test-id='side-menu']")
    private WebElement sideMenu;

    public void closePopup(WebElement element) {
        if (wait.waitUntilElementIsPresent(element, 4)) {
            action.clickElement(element);
        }
    }

    public void closeCookiesPolicy() {
        int timeOut = Settings.getRunningBrowser().equals(Browsers.Safari) ? 10 : 5;
        action.closePopUp(btnCookiesAccept, timeOut);
    }

    public void validateUserIsLogin() {
        validateDashBoardIsDisplayed();
    }

    private void validateDashBoardIsDisplayed() {
        wait.waitUntilElementIsDisplayed(sideMenu, 30);
        validate.ensureElementIsDisplayed(sideMenu);
    }

    @Override
    public void componentValidation() {

    }
}
