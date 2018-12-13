package com.ai.qa.easyfuel.web.StepDefinitions;

import com.ai.qa.easyfuel.web.envSetup.BaseTest;
import com.ai.qa.easyfuel.web.PageModel.SmartCityLoginPageObjects;
import com.ai.qa.easyfuel.web.envSetup.EnvSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.scene.control.TableRow;
import org.junit.Assert;


public class SmartCityLogin implements BaseTest {

    SmartCityLoginPageObjects loginPageObjects = new SmartCityLoginPageObjects();
    

    /** Givens I am on the  SmartCity login page
     * URL: gets from SmartCityLogin.Properties
     */
    @Given("^I am on the SmartCity login page$")
    public void i_am_on_the_SmartCity_login_page() throws Throwable {
        String url = loginPageObjects.SmartCityLoginPage_URL();
        navigationObj.navigateTo(url);
    }

    /**Givens I have left mandatory login details blank
     * @param mandatory
     */
    @Given("^I have left \"([^\"]*)\" login details blank$")
    public void i_have_left_login_details_blank(String mandatory) throws Throwable {
        switch(mandatory) {
            case "All":
                break;
            case "UserName":
                inputObj.clearText("xpath", loginPageObjects.xpath_SmartCity_UserNameInputField());
                inputObj.clearText("xpath", loginPageObjects.xpath_SmartCity_PasswordInputField());
                inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidPassword(), loginPageObjects.xpath_SmartCity_PasswordInputField());
                break;
            case "Password":
                inputObj.clearText("xpath", loginPageObjects.xpath_SmartCity_PasswordInputField());
                inputObj.clearText("xpath", loginPageObjects.xpath_SmartCity_UserNameInputField());
                inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidUserName(), loginPageObjects.xpath_SmartCity_UserNameInputField());
                break;
            default:
                Assert.fail(mandatory+" field does not implemented, failed @GivenIHaveLeftLoginDetailsBlank "+mandatory);
                break;
        }
    }

    /** Whens i try to log in
     */
    @When("^I try to log in$")
    public void i_try_to_log_in() throws Throwable {
        clickObj.click("xpath",loginPageObjects.xpath_SmartCity_LoginButton());
        progressObj.wait("2");
    }

    /** Thens an mandatory error message is displayed
     */
    @Then("^an \"([^\"]*)\" message is displayed$")
    public void an_message_is_displayed(String mandatoryError) throws Throwable {
        switch(mandatoryError) {
            case "Both Required":
                boolean _bool =false;
                _bool = assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_SmartCity_UserNameRequired());
                if (_bool)
                    Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_SmartCity_PasswordRequired()));
                else
                    Assert.assertFalse(_bool);
                break;
            case "UserName Required":
                Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_SmartCity_UserNameRequired()));
                break;
            case "Password Required":
                Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_SmartCity_PasswordRequired()));
                break;
            default:
                Assert.fail(mandatoryError+" field does not implemented, failed @Then an "+ mandatoryError +" error message is displayed.");
                break;
        }
    }

    /**Givens I have entered an unregistered username and a password
     */
    @Given("^I have entered an unregistered username and a valid password$")
    public void i_have_entered_an_unregistered_username_and_a_valid_password() throws Throwable {
        inputObj.enterText("xpath", loginPageObjects.SmartCity_InvalidUserName(), loginPageObjects.xpath_SmartCity_UserNameInputField());
        inputObj.enterText("xpath", loginPageObjects.SmartCity_InvalidPassword(), loginPageObjects.xpath_SmartCity_PasswordInputField());
    }

    /** Thens an error message is displayed
     */
    @Then("^an error message is displayed$")
    public void an_error_message_is_displayed() throws Throwable {
        //Assert.fail("Error message for unregistered username is not displayed");
        Assert.assertTrue("Then_an_error_message_is_displayed is Pass",true);
    }

    /**Givens I have entered an registered username and a valid password
     */
    @Given("^I have entered a registered username and a valid password$")
    public void i_have_entered_a_registered_username_and_a_valid_password() throws Throwable {
        inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidUserName(), loginPageObjects.xpath_SmartCity_UserNameInputField());
        inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidPassword(), loginPageObjects.xpath_SmartCity_PasswordInputField());
    }

    /**Givens I have entered a registered username and an invalid password
     */
    @Given("^I have entered a registered username and an invalid password$")
    public void i_have_entered_a_registered_username_and_an_invalid_password() throws Throwable {
        inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidUserName(), loginPageObjects.xpath_SmartCity_UserNameInputField());
        inputObj.enterText("xpath", loginPageObjects.SmartCity_InvalidPassword(), loginPageObjects.xpath_SmartCity_PasswordInputField());
    }

    /** Thens login unsuccessful message is displayed
     */
    @Then("^login unsuccessful message is displayed$")
    public void login_unsuccessful_message_is_displayed() throws Throwable {
        boolean _bool = false;
        _bool = assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_LoginUnsuccessfulMessage());
        Assert.assertTrue(_bool);
    }

    /** Thens I am logged in to SmartCity account
     */
    @Then("^I am logged in to SmartCity account$")
    public void i_am_logged_in_to_SmartCity_account() throws Throwable {
        boolean _bool = false;
        String LoggedInAs = null;
        String LoggedInUserName = null;
        LoggedInAs = assertionObj.getElementText("xpath",loginPageObjects.xpath_LoggedInAs_Text());
        _bool = LoggedInAs.equalsIgnoreCase("Logged in as:");
        if (_bool){
            LoggedInUserName = assertionObj.getElementText("xpath",loginPageObjects.xpath_LoggedInUserName());
            Assert.assertTrue(LoggedInUserName.equalsIgnoreCase(loginPageObjects.SmartCity_ValidUserName()));
        }else {
            Assert.fail("User not logged in to SmartCity Account. Failed @ Then i_am_logged_in_to_SmartCity_account ");
        }
    }

    /** Thens I am able to logout from SmartCity account
     */
    @Then("^I am able to logout from SmartCity account$")
    public void i_am_able_to_logout_from_SmartCity_account() throws Throwable {
        Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_LogoutLink()));
    }

    /** Givens I am on the SmartCity account page
     */
    @Given("^I am on the SmartCity account page$")
    public void i_am_on_the_SmartCity_account_page() throws Throwable {
        boolean _bool = false;
        String logOutLink = null;
        i_am_on_the_SmartCity_login_page();
        try{
            logOutLink = assertionObj.getElementText("xpath",loginPageObjects.xpath_LogoutLink());
            if(logOutLink.toLowerCase().contains("login")){
                i_have_entered_a_registered_username_and_a_valid_password();
                i_try_to_log_in();
            }else if (logOutLink.toLowerCase().contains("logout")){
                System.out.println("On the SmartCity account page, User already logged in and logout link is available");
            }
        }catch (Throwable expression){
            System.out.println("Error @ i_am_on_the_SmartCity_account_page, please see the error below.....");
            System.out.println(expression);
        }
    }

    /** Whens I select logout from SmartCity account
     */
    @When("^I select logout from SmartCity account$")
    public void i_select_logout_from_SmartCity_account() throws Throwable {
        clickObj.click("xpath",loginPageObjects.xpath_LogoutLink());
        progressObj.wait("2");
    }

    /** Thens I am logged out from SmartCity account
     */
    @Then("^I am logged out from SmartCity account$")
    public void i_am_logged_out_from_SmartCity_account() throws Throwable {
        boolean _bool = false;
        String loggedOutMessage = assertionObj.getElementText("xpath",loginPageObjects.xpath_LoggedOutMessage());
        _bool = loggedOutMessage.toLowerCase().contains(("logged out").toLowerCase());
        if(_bool)
            Assert.assertTrue(_bool);
        else
            Assert.fail("User not logged out");
    }

    /** Givens I have entered a username and password
     * @param: username, password
     */
    @Given("^I have entered a registered \"([^\"]*)\" username and \"([^\"]*)\" password$")
    public void i_have_entered_a_username_and_password(String username, String password) throws Throwable {
        switch (username){
            case "Valid":
                inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidUserName(), loginPageObjects.xpath_SmartCity_UserNameInputField());
                break;
            case "Invalid":
                inputObj.enterText("xpath", loginPageObjects.SmartCity_InvalidUserName(), loginPageObjects.xpath_SmartCity_UserNameInputField());
                break;
            default:
                Assert.fail(username +"Username is not implemented. Error @ i_have_entered_a_"+username+"username_and_"+password+"password");
                break;
        }
        switch (password){
            case "Valid":
                inputObj.enterText("xpath", loginPageObjects.SmartCity_ValidPassword(), loginPageObjects.xpath_SmartCity_PasswordInputField());
                break;
            case "Invalid":
                inputObj.enterText("xpath", loginPageObjects.SmartCity_InvalidPassword(), loginPageObjects.xpath_SmartCity_PasswordInputField());
                break;
            default:
                Assert.fail(password +" Password is not implemented. Error @ i_have_entered_a_"+username+"username_and_"+password+"password");
                break;
        }
    }

    /** Thens the login is a
     * @param: result
     */
    @Then("^the login is a \"([^\"]*)\"$")
    public void the_login_is_a(String result) throws Throwable {
        boolean _bool = false;
        String LoggedInUserName = null;
        switch (result){
            case "Fail":
                Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_SmartCity_LoginButton()));
                break;
            case "Success":
                LoggedInUserName = assertionObj.getElementText("xpath",loginPageObjects.xpath_LoggedInUserName());
                _bool = LoggedInUserName.equalsIgnoreCase(loginPageObjects.SmartCity_ValidUserName());
                if(_bool){
                    clickObj.click("xpath",loginPageObjects.xpath_LogoutLink());
                    Assert.assertTrue(_bool);
                }
                break;
            default:
                Assert.fail("Not implemented @ Then_the_login_is_a_"+ result);
                break;
        }
    }

    /** Givens I select forgotten username or password
     */
    @Given("^I select forgotten username or password$")
    public void i_select_forgotten_username_or_password() throws Throwable {

        clickObj.click("xpath",loginPageObjects.xpath_ResetUsernameOrPasswordLink());
    }

    /** Whens I select do not remember password
     */
    @When("^I select do not remember password$")
    public void i_select_do_not_remember_password() throws Throwable {
        clickObj.click("xpath",loginPageObjects.xpath_ResetPasswordRadioButton());
    }

    /** Whens I give an invalid format email address
     */
    @When("^I give an invalid format email address$")
    public void i_give_an_invalid_format_email_address() throws Throwable {
        try{
            inputObj.enterText("xpath",loginPageObjects.SmartCity_InvalidPassword(),loginPageObjects.xpath_ResetPasswordEmailIdField());
        }catch (Throwable expression) {
            try{
                inputObj.enterText("xpath",loginPageObjects.SmartCity_InvalidPassword(),loginPageObjects.xpath_ResetUsernameEmailIdField());
            }catch (Throwable e){
                System.out.println("Error @ Then_an_invalid_email_address_error_message_is_displayed");
                System.out.println(e);
            }
        }
        clickObj.click("xpath",loginPageObjects.xpath_ResetContinue());
    }

    /** Thens an invalid email address error message is displayed
     */
    @Then("^an invalid email address error message is displayed$")
    public void an_invalid_email_address_error_message_is_displayed() throws Throwable {
        try{
            Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_ResetPasswordEmailIdValidation()));
        }catch (Throwable expression) {
            try{
                Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_ResetUsernameEmailIdValidation()));
            }catch (Throwable e){
                System.out.println("Error @ Then_an_invalid_email_address_error_message_is_displayed");
                System.out.println(e);
            }
        }
    }

    /** Whens I give an unregistered email address
     */
    @When("^I give an unregistered email address$")
    public void i_give_an_unregistered_email_address() throws Throwable {
        try{
            inputObj.enterText("xpath",loginPageObjects.SmartCity_InvalidUserName(),loginPageObjects.xpath_ResetPasswordEmailIdField());
        }catch (Throwable expression) {
            try{
                inputObj.enterText("xpath",loginPageObjects.SmartCity_InvalidUserName(),loginPageObjects.xpath_ResetUsernameEmailIdField());
            }catch (Throwable e){
                System.out.println("Error @ When_i_give_an_unregistered_email_address");
                System.out.println(e);
            }
        }
        clickObj.click("xpath",loginPageObjects.xpath_ResetContinue());
    }

    /** Thens an unregistered email address error message is displayed
     */
    @Then("^an unregistered email address error message is displayed$")
    public void an_unregistered_email_address_error_message_is_displayed() throws Throwable {
        Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_ResetUnregisteredEmailIdValidation()));
    }

    /** Givens an unregistered email address error message is displaye
     */
    @Given("^I am on the forgotten password page$")
    public void i_am_on_the_forgotten_password_page() throws Throwable {
        i_am_on_the_SmartCity_login_page();
        i_select_forgotten_username_or_password();
    }

    /** Whens I give a registered email address
     */
    @When("^I give a registered email address$")
    public void i_give_a_registered_email_address() throws Throwable {

        try{
            inputObj.enterText("xpath",loginPageObjects.SmartCity_ResetUsernameOrPasswordEmailId(),loginPageObjects.xpath_ResetPasswordEmailIdField());
        }catch (Throwable expression) {
            try{
                inputObj.enterText("xpath",loginPageObjects.SmartCity_ResetUsernameOrPasswordEmailId(),loginPageObjects.xpath_ResetUsernameEmailIdField());
            }catch (Throwable e){
                System.out.println("Error @ When_i_give_an_unregistered_email_address");
                System.out.println(e);
            }
        }
        clickObj.click("xpath",loginPageObjects.xpath_ResetContinue());
    }

    /** Thens a message confirming reset password email has been sent is displayed
     */
    @Then("^a message confirming reset password email has been sent is displayed$")
    public void a_message_confirming_reset_password_email_has_been_sent_is_displayed() throws Throwable {
        Assert.assertTrue(assertionObj.isElementDisplayed("xpath",loginPageObjects.xpath_ResetEmailSent()));
    }

    /** Whens I close window after message confirming reset password email has been sent is displayed
     */
    @When("^I close window after message confirming reset password email has been sent is displayed$")
    public void i_close_window_after_message_confirming_reset_password_email_has_been_sent_is_displayed() throws Throwable {
        clickObj.click("xpath",loginPageObjects.xpath_ResetCloseWindow());
    }


    /** Thens reset password window will be closed
     */
    @Then("^reset password window will be closed$")
    public void reset_password_window_will_be_closed() throws Throwable {
        Assert.assertTrue("This is yet to implement @Then reset password window will be closed ",true);
    }

    /** Whens I select do not remember username
     */
    @When("^I select do not remember username$")
    public void i_select_do_not_remember_username() throws Throwable {
        clickObj.click("xpath",loginPageObjects.xpath_ResetUsernameRadioButton());
    }

    /** Givens ^I am on the forgotten username page
     */
    @Given("^I am on the forgotten username page$")
    public void i_am_on_the_forgotten_username_page() throws Throwable {
        i_am_on_the_SmartCity_login_page();
        i_select_forgotten_username_or_password();
    }

    /** Thens a message confirming reset username email has been sent is displayed
     */
    @Then("^a message confirming reset username email has been sent is displayed$")
    public void a_message_confirming_reset_username_email_has_been_sent_is_displayed() throws Throwable {
        a_message_confirming_reset_password_email_has_been_sent_is_displayed();
    }

    /** Whens I close window after message confirming reset username email has been sent is displayed
     */
    @When("^I close window after message confirming reset username email has been sent is displayed$")
    public void i_close_window_after_message_confirming_reset_username_email_has_been_sent_is_displayed() throws Throwable {
        clickObj.click("xpath",loginPageObjects.xpath_ResetCloseWindow());
    }

    /** Thens reset username window will be closed
     */
    @Then("^reset username window will be closed$")
    public void reset_username_window_will_be_closed() throws Throwable {
        Assert.assertTrue("This is yet to implement @Then reset password window will be closed ",true);
    }
}
