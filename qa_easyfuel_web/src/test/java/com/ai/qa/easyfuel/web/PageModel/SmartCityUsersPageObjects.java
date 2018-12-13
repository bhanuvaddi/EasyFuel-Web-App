package com.ai.qa.easyfuel.web.PageModel;

import com.ai.qa.easyfuel.web.utilities.RequirmentUtils;

public class SmartCityUsersPageObjects extends RequirmentUtils {

    RequirmentUtils requtil = new RequirmentUtils();
    String propertiesFileName = "SmartCityUsersPage.properties";


    /** Method to get xpath_ViewUsersPageLink from SmartCityUsersPage.properties
     *  @return String: xpath_ViewUsersPageLink
     */
    public String xpath_ViewUsersPageLink() {
        String xpath_ViewUsersPageLink = getEnvPropertyValue(propertiesFileName, "xpath_ViewUsersPageLink");
        return xpath_ViewUsersPageLink;
    }

    /** Method to get xpath_AdminUsersPageLink from SmartCityUsersPage.properties
     *  @return String: xpath_AdminUsersPageLink
     */
    public String xpath_AdminUsersPageLink() {
        String xpath_AdminUsersPageLink = getEnvPropertyValue(propertiesFileName, "xpath_AdminUsersPageLink");
        return xpath_AdminUsersPageLink;
    }

    /** Method to get xpath_PowerUsersPageLink from SmartCityUsersPage.properties
     *  @return String: xpath_PowerUsersPageLink
     */
    public String xpath_PowerUsersPageLink() {
        String xpath_PowerUsersPageLink = getEnvPropertyValue(propertiesFileName, "xpath_PowerUsersPageLink");
        return xpath_PowerUsersPageLink;
    }

    /** Method to get xpath_ClientPowerUsersPageLink from SmartCityUsersPage.properties
     *  @return String: xpath_ClientPowerUsersPageLink
     */
    public String xpath_ClientPowerUsersPageLink() {
        String xpath_ClientPowerUsersPageLink = getEnvPropertyValue(propertiesFileName, "xpath_ClientPowerUsersPageLink");
        return xpath_ClientPowerUsersPageLink;
    }

    /** Method to get xpath_HelpDeskUsersPageLink from SmartCityUsersPage.properties
     *  @return String: xpath_HelpDeskUsersPageLink
     */
    public String xpath_HelpDeskUsersPageLink() {
        String xpath_HelpDeskUsersPageLink = getEnvPropertyValue(propertiesFileName, "xpath_HelpDeskUsersPageLink");
        return xpath_HelpDeskUsersPageLink;
    }

// ######## -- Common Object across different users pages -- ########
    /** Method to get xpath_UserTypeText from SmartCityUsersPage.properties
     *  @return String: xpath_UserTypeText
     */
    public String xpath_UserTypeText() {
        String xpath_UserTypeText = getEnvPropertyValue(propertiesFileName, "xpath_UserTypeText");
        return xpath_UserTypeText;
    }

// ######## -- View Users page Objects -- ########
    /** Method to get xpath_UserTextSearchBox from SmartCityAccountPage.properties
     *  @return String: xpath_UserTextSearchBox
     */
    public String xpath_UserTextSearchBox() {
        String xpath_UserTextSearchBox = getEnvPropertyValue(propertiesFileName, "xpath_UserTextSearchBox");
        return xpath_UserTextSearchBox;
    }


//######## -- New Administration User page Objects -- ########

// ######## -- New Power User page Objects -- ########

// ######## -- New Client Power User page Objects -- ########

// ######## -- New Help Desk User page Objects -- ########


}
