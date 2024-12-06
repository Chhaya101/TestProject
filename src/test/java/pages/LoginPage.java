package pages;

import com.atf.base.BasePage;
// import com.local.transformation.UserAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// import static com.local.productionAccounts.TryRegisterAccountToManualTest.user;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "*[data-test-id='sso-login-create-account-link']")
    private WebElement lnkCreateAccount;

    @FindBy(how = How.CSS, using = "*[data-test-id='login-login-email-input']")
    private WebElement txtEmailInput;

    @FindBy(how = How.CSS, using = "*[data-test-id='login-login-password-input']")
    private WebElement txtPasswordInput;

    @FindBy(how = How.CSS, using = "*[data-test-id='login-submit-button']")
    private WebElement btnSignIn;

    @FindBy(how = How.CSS, using = "*[class='cp_Header-container-3'] [data-test-id='login-header-title-label']")
    private WebElement txtLoginTitle;

    @FindBy(how = How.CSS, using = "*[class='cp_Header-container-3'] [data-test-id='login-header-description-label']")
    private WebElement txtLoginDescription;

    @FindBy(how = How.CSS, using = "*[class='btn btn-close visible-box']")
    private WebElement btnCloseLogin;



    @Override
    public void componentValidation() {
    }

    public void goToRegistrationPage(){
        wait.waitUntilElementIsDisplayed(lnkCreateAccount, 30);
        action.clickElement(lnkCreateAccount);
    }

    /*public void enterUserNameAndPassword(UserAccount user) {
        action.fillInInputField(txtEmailInput, user.getEmail());
        action.fillInInputField(txtPasswordInput, user.getPassword());
    }*/

    public void clickOnSignInCTA(){
        wait.waitUntilElementIsDisplayed(btnSignIn, 10);
        action.clickElement(btnSignIn);
    }

    public void checkLoginPageIsDisplyed() {
        wait.waitUntilElementIsDisplayed(btnSignIn, 20);
    }



    public void iWantToLoginToMyAccount() {
        wait.waitUntilElementIsDisplayed(txtEmailInput, 30);
        validate.ensureElementIsDisplayed(txtEmailInput);
        validate.ensureElementIsDisplayed(txtPasswordInput);
    }

    public void enterUsername(String username) {
        validate.ensureElementIsDisplayed(txtEmailInput);
        action.clearField(txtEmailInput);
        action.fillInInputField(txtEmailInput, username);
    }

    public void enterPassword(String password) {
        validate.ensureElementIsDisplayed(txtPasswordInput);
        action.clearField(txtPasswordInput);
        action.fillInInputField(txtPasswordInput, password);
    }

    public void checkSignInButton() {
        wait.waitUntilElementIsDisplayed(btnSignIn, 10);
        validate.ensureElementIsDisplayed(btnSignIn);
    }

    public void checkLoginTitle() {
        validate.ensureElementIsDisplayed(txtLoginTitle);
    }

    public void checkLoginDescription() {
        validate.ensureElementIsDisplayed(txtLoginDescription);
    }

    public void loginCloseButton() {
        validate.ensureElementIsDisplayed(btnCloseLogin);
        action.clickElement(btnCloseLogin);

    }


    /*public void doLoginOnCp(UserAccount user) {
        fillLoginForm(user.getEmail(), user.getPassword());
        action.clickElement(btnSignIn);
        wait.waitUntilElementIsNotVisible(btnSignIn);
        user.deleteUserAccountAfterTest(driver);
    }*/
    private void fillLoginForm(String userName, String password) {
//        wait.waitUntilElementIsDisplayed(loginForm);
        wait.waitUntilElementIsDisplayed(txtEmailInput, 30);
//        wait.waitUntilElementIsDisplayed(loginForm, 30);
        action.fillInInputField(txtEmailInput, userName);
        action.fillInInputField(txtPasswordInput, password);
        action.sendTab(txtPasswordInput);
    }
}
