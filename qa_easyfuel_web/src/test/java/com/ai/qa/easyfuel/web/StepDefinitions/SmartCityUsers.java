package com.ai.qa.easyfuel.web.StepDefinitions;

import com.ai.qa.easyfuel.web.PageModel.SmartCityAccountPageObjects;
import com.ai.qa.easyfuel.web.PageModel.SmartCityLoginPageObjects;
import com.ai.qa.easyfuel.web.PageModel.SmartCityUsersPageObjects;
import com.ai.qa.easyfuel.web.envSetup.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SmartCityUsers implements BaseTest {

    SmartCityLoginPageObjects loginPageObjects = new SmartCityLoginPageObjects();
    SmartCityAccountPageObjects accountPageObjects = new SmartCityAccountPageObjects();
    SmartCityUsersPageObjects usersPageObjects = new SmartCityUsersPageObjects();
    SmartCityLogin loginPage = new SmartCityLogin();


    /**Givens I logged in to SmartCity account
     */
    @Given("^I logged in to SmartCity account$")
    public void i_logged_in_to_SmartCity_account() throws Throwable {
        String logOutLink = null;
        loginPage.i_am_on_the_SmartCity_login_page();
        try{
            loginPage.i_have_entered_a_registered_username_and_a_valid_password();
            loginPage.i_try_to_log_in();
        }catch (Throwable expression){
            try{
                /*clickObj.click("xpath",accountPageObjects.xpath_LogoutLink());
                loginPage.i_am_on_the_SmartCity_login_page();
                loginPage.i_have_entered_a_registered_username_and_a_valid_password();
                loginPage.i_try_to_log_in();*/
                logOutLink = assertionObj.getElementText("xpath",accountPageObjects.xpath_LogoutLink());
                if (logOutLink.toLowerCase().contains("logout")){
                    System.out.println("On the SmartCity account page, User already logged in and logout link is available");
                }
            }catch (Throwable e){
                System.out.println("Error @ i_am_on_the_SmartCity_account_page, please see the error below.....");
                System.out.println(e);
            }
        }
    }

    /**Whens I select User Page
     * @param UserPage
     */
    @When("^I select \"([^\"]*)\"$")
    public void i_select(String UserPage) throws Throwable {
        switch(UserPage){
            case "View Users":
                clickObj.click("xpath",usersPageObjects.xpath_ViewUsersPageLink());
                break;
            case "New Administration User":
                clickObj.click("xpath",usersPageObjects.xpath_AdminUsersPageLink());
                break;
            case "New Power User":
                clickObj.click("xpath",usersPageObjects.xpath_PowerUsersPageLink());
                break;
            case "New Client Power User":
                clickObj.click("xpath",usersPageObjects.xpath_ClientPowerUsersPageLink());
                break;
            case "New Help Desk User":
                clickObj.click("xpath",usersPageObjects.xpath_HelpDeskUsersPageLink());
                break;
            default:
                Assert.fail(UserPage +" not implemented. failed @When I select User Page");
                break;
        }
        progressObj.wait("2");
    }

    /**Thens I am on the User Page
     * @param UserPage
     */
    @Then("^I am on the \"([^\"]*)\"$")
    public void i_am_on_the(String UserPage) throws Throwable {
        String userType = null;
        switch(UserPage){
            case "View Users":
                Assert.assertTrue(assertionObj.isElementDisplayed("xpath", usersPageObjects.xpath_UserTextSearchBox()));
                break;
            case "New Administration User":
                userType = assertionObj.getElementText("xpath",usersPageObjects.xpath_UserTypeText());
                Assert.assertTrue(userType.toLowerCase().contains("administrator"));
                break;
            case "New Power User":
                userType = assertionObj.getElementText("xpath",usersPageObjects.xpath_UserTypeText());
                Assert.assertTrue(userType.toLowerCase().contains("power"));
                break;
            case "New Client Power User":
                userType = assertionObj.getElementText("xpath",usersPageObjects.xpath_UserTypeText());
                Assert.assertTrue(userType.toLowerCase().contains("client power"));
                break;
            case "New Help Desk User":
                userType = assertionObj.getElementText("xpath",usersPageObjects.xpath_UserTypeText());
                Assert.assertTrue(userType.toLowerCase().contains("help desk"));
                navigationObj.closeDriver();
                break;
            default:
                Assert.fail(UserPage + " not implemented. Error @Then I am on the "+ UserPage +" Page");
                break;
        }
    }


}
