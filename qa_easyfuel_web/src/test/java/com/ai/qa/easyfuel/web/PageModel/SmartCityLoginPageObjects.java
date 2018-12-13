package com.ai.qa.easyfuel.web.PageModel;

import com.ai.qa.easyfuel.web.utilities.RequirmentUtils;

public class SmartCityLoginPageObjects extends RequirmentUtils {

    RequirmentUtils requtil = new RequirmentUtils();
    String propertiesFileName = "SmartCityLoginPage.properties";


    /** Method to get SmartCityLoginPage_URL from SmartCityLoginPage.properties
    * @return String: SmartCityLoginPage_URL
    */
    public String SmartCityLoginPage_URL(){
        String SmartCityLoginPage_URL = requtil.getEnvPropertyValue(propertiesFileName,"SmartCityLoginPage_URL");
        return SmartCityLoginPage_URL;
    }

    /** Method to get SmartCity_ValidUserName from SmartCityLoginPage.properties
     *  @return String: SmartCity_ValidUserName
     */
    public String SmartCity_ValidUserName() {
        String SmartCity_ValidUserName = getEnvPropertyValue(propertiesFileName, "SmartCity_ValidUserName");
        return SmartCity_ValidUserName;
    }

    /** Method to get SmartCity_ValidPassword from SmartCityLoginPage.properties
     *  @return String: SmartCity_ValidPassword
     */
    public String SmartCity_ValidPassword() {
        String SmartCity_ValidPassword = getEnvPropertyValue(propertiesFileName, "SmartCity_ValidPassword");
        return SmartCity_ValidPassword;
    }

    /** Method to get SmartCity_InvalidUserName from SmartCityLoginPage.properties
     *  @return String: SmartCity_InvalidUserName
     */
    public String SmartCity_InvalidUserName() {
        String SmartCity_InvalidUserName = getEnvPropertyValue(propertiesFileName, "SmartCity_InvalidUserName");
        return SmartCity_InvalidUserName;
    }

    /** Method to get SmartCity_InvalidPassword from SmartCityLoginPage.properties
     *  @return String: SmartCity_InvalidPassword
     */
    public String SmartCity_InvalidPassword() {
        String SmartCity_InvalidPassword = getEnvPropertyValue(propertiesFileName, "SmartCity_InvalidPassword");
        return SmartCity_InvalidPassword;
    }

    /** Method to get SmartCity_ResetUsernameOrPasswordEmailId from SmartCityLoginPage.properties
     *  @return String: SmartCity_ResetUsernameOrPasswordEmailId
     */
    public String SmartCity_ResetUsernameOrPasswordEmailId() {
        String SmartCity_ResetUsernameOrPasswordEmailId = getEnvPropertyValue(propertiesFileName, "SmartCity_ResetUsernameOrPasswordEmailId");
        return SmartCity_ResetUsernameOrPasswordEmailId;
    }

    // Methods reading object values
    /** Method to get xpath_SmartCity_UserNameInputField from SmartCityLoginPage.properties
     *  @return String: xpath_SmartCity_UserNameInputField
     */
    public String xpath_SmartCity_UserNameInputField() {
        String xpath_SmartCity_UserNameInputField = getEnvPropertyValue(propertiesFileName, "xpath_SmartCity_UserNameInputField");
        return xpath_SmartCity_UserNameInputField;
    }

    /** Method to get xpath_SmartCity_PasswordInputField from SmartCityLoginPage.properties
     *  @return String: xpath_SmartCity_PasswordInputField
     */
    public String xpath_SmartCity_PasswordInputField() {
        String xpath_SmartCity_PasswordInputField = getEnvPropertyValue(propertiesFileName, "xpath_SmartCity_PasswordInputField");
        return xpath_SmartCity_PasswordInputField;
    }

    /** Method to get xpath_SmartCity_LoginButton from SmartCityLoginPage.properties
     *  @return String: xpath_SmartCity_LoginButton
     */
    public String xpath_SmartCity_LoginButton() {
        String xpath_SmartCity_LoginButton = getEnvPropertyValue(propertiesFileName, "xpath_SmartCity_LoginButton");
        return xpath_SmartCity_LoginButton;
    }

    /** Method to get xpath_SmartCity_UserNameRequired from SmartCityLoginPage.properties
     *  @return String: xpath_SmartCity_UserNameRequired
     */
    public String xpath_SmartCity_UserNameRequired() {
        String xpath_SmartCity_UserNameRequired = getEnvPropertyValue(propertiesFileName, "xpath_SmartCity_UserNameRequired");
        return xpath_SmartCity_UserNameRequired;
    }

    /** Method to get xpath_SmartCity_PasswordRequired from SmartCityLoginPage.properties
     *  @return String: xpath_SmartCity_PasswordRequired
     */
    public String xpath_SmartCity_PasswordRequired() {
        String xpath_SmartCity_PasswordRequired = getEnvPropertyValue(propertiesFileName, "xpath_SmartCity_PasswordRequired");
        return xpath_SmartCity_PasswordRequired;
    }

    /** Method to get xpath_LoggedOutMessage from SmartCityLoginPage.properties
     *  @return String: xpath_LoggedOutMessage
     */
    public String xpath_LoggedOutMessage() {
        String xpath_LoggedOutMessage = getEnvPropertyValue(propertiesFileName, "xpath_LoggedOutMessage");
        return xpath_LoggedOutMessage;
    }

    /** Method to get xpath_LoginUnsuccessfulMessage from SmartCityLoginPage.properties
     *  @return String: xpath_LoginUnsuccessfulMessage
     */
    public String xpath_LoginUnsuccessfulMessage() {
        String xpath_LoginUnsuccessfulMessage = getEnvPropertyValue(propertiesFileName, "xpath_LoginUnsuccessfulMessage");
        return xpath_LoginUnsuccessfulMessage;
    }

    /** Method to get xpath_ResetUsernameOrPasswordLink from SmartCityLoginPage.properties
     *  @return String: xpath_ResetUsernameOrPasswordLink
     */
    public String xpath_ResetUsernameOrPasswordLink() {
        String xpath_ResetUsernameOrPasswordLink = getEnvPropertyValue(propertiesFileName, "xpath_ResetUsernameOrPasswordLink");
        return xpath_ResetUsernameOrPasswordLink;
    }
    /** Method to get xpath_ResetUsernameRadioButton from SmartCityLoginPage.properties
     *  @return String: xpath_ResetUsernameRadioButton
     */
    public String xpath_ResetUsernameRadioButton() {
        String xpath_ResetUsernameRadioButton = getEnvPropertyValue(propertiesFileName, "xpath_ResetUsernameRadioButton");
        return xpath_ResetUsernameRadioButton;
    }

    /** Method to get xpath_ResetPasswordRadioButton from SmartCityLoginPage.properties
     *  @return String: xpath_ResetPasswordRadioButton
     */
    public String xpath_ResetPasswordRadioButton() {
        String xpath_ResetPasswordRadioButton = getEnvPropertyValue(propertiesFileName, "xpath_ResetPasswordRadioButton");
        return xpath_ResetPasswordRadioButton;
    }

    /** Method to get xpath_ResetContinue from SmartCityLoginPage.properties
     *  @return String: xpath_ResetContinue
     */
    public String xpath_ResetContinue() {
        String xpath_ResetContinue = getEnvPropertyValue(propertiesFileName, "xpath_ResetContinue");
        return xpath_ResetContinue;
    }

    /** Method to get xpath_ResetPasswordEmailIdField from SmartCityLoginPage.properties
     *  @return String: xpath_ResetPasswordEmailIdField
     */
    public String xpath_ResetPasswordEmailIdField() {
        String xpath_ResetPasswordEmailIdField = getEnvPropertyValue(propertiesFileName, "xpath_ResetPasswordEmailIdField");
        return xpath_ResetPasswordEmailIdField;
    }

    /** Method to get xpath_ResetUsernameEmailIdField from SmartCityLoginPage.properties
     *  @return String: xpath_ResetUsernameEmailIdField
     */
    public String xpath_ResetUsernameEmailIdField() {
        String xpath_ResetUsernameEmailIdField = getEnvPropertyValue(propertiesFileName, "xpath_ResetUsernameEmailIdField");
        return xpath_ResetUsernameEmailIdField;
    }

    /** Method to get xpath_ResetPasswordEmailIdValidation from SmartCityLoginPage.properties
     *  @return String: xpath_ResetPasswordEmailIdValidation
     */
    public String xpath_ResetPasswordEmailIdValidation() {
        String xpath_ResetPasswordEmailIdValidation = getEnvPropertyValue(propertiesFileName, "xpath_ResetPasswordEmailIdValidation");
        return xpath_ResetPasswordEmailIdValidation;
    }

    /** Method to get xpath_ResetUsernameEmailIdValidation from SmartCityLoginPage.properties
     *  @return String: xpath_ResetUsernameEmailIdValidation
     */
    public String xpath_ResetUsernameEmailIdValidation() {
        String xpath_ResetUsernameEmailIdValidation = getEnvPropertyValue(propertiesFileName, "xpath_ResetUsernameEmailIdValidation");
        return xpath_ResetUsernameEmailIdValidation;
    }

    /** Method to get xpath_ResetUnregisteredEmailIdValidation from SmartCityLoginPage.properties
     *  @return String: xpath_ResetUnregisteredEmailIdValidation
     */
    public String xpath_ResetUnregisteredEmailIdValidation() {
        String xpath_ResetUnregisteredEmailIdValidation = getEnvPropertyValue(propertiesFileName, "xpath_ResetUnregisteredEmailIdValidation");
        return xpath_ResetUnregisteredEmailIdValidation;
    }

    /** Method to get xpath_ResetEmailSent from SmartCityLoginPage.properties
     *  @return String: xpath_ResetEmailSent
     */
    public String xpath_ResetEmailSent() {
        String xpath_ResetEmailSent = getEnvPropertyValue(propertiesFileName, "xpath_ResetEmailSent");
        return xpath_ResetEmailSent;
    }

    /** Method to get xpath_ResetCloseWindow from SmartCityLoginPage.properties
     *  @return String: xpath_ResetCloseWindow
     */
    public String xpath_ResetCloseWindow() {
        String xpath_ResetCloseWindow = getEnvPropertyValue(propertiesFileName, "xpath_ResetCloseWindow");
        return xpath_ResetCloseWindow;
    }

// ########## -- After Login Objects -- ##########
    /** Method to get xpath_LoggedInAs_Text from SmartCityLoginPage.properties
     *  @return String: xpath_LoggedInAs_Text
     */
    public String xpath_LoggedInAs_Text() {
        String xpath_LoggedInAs_Text = getEnvPropertyValue(propertiesFileName, "xpath_LoggedInAs_Text");
        return xpath_LoggedInAs_Text;
    }

    /** Method to get xpath_LoggedInUserName from SmartCityLoginPage.properties
     *  @return String: xpath_LoggedInAs_Text
     */
    public String xpath_LoggedInUserName() {
        String xpath_LoggedInUserName = getEnvPropertyValue(propertiesFileName, "xpath_LoggedInUserName");
        return xpath_LoggedInUserName;
    }

    /** Method to get xpath_LogoutLink from SmartCityLoginPage.properties
     *  @return String: xpath_LogoutLink
     */
    public String xpath_LogoutLink() {
        String xpath_LogoutLink = getEnvPropertyValue(propertiesFileName, "xpath_LogoutLink");
        return xpath_LogoutLink;
    }

}
