package com.ai.qa.easyfuel.web.PageModel;

import com.ai.qa.easyfuel.web.utilities.RequirmentUtils;

public class SmartCityAccountPageObjects extends RequirmentUtils {

        RequirmentUtils requtil = new RequirmentUtils();
        String propertiesFileName = "SmartCityAccountPage.properties";

    // Methods reading object values
    /** Method to get xpath_LoggedInAs_Text from SmartCityAccountPage.properties
     *  @return String: xpath_LoggedInAs_Text
     */
    public String xpath_LoggedInAs_Text() {
        String xpath_LoggedInAs_Text = getEnvPropertyValue(propertiesFileName, "xpath_LoggedInAs_Text");
        return xpath_LoggedInAs_Text;
    }

    /** Method to get xpath_LoggedInUserName from SmartCityAccountPage.properties
     *  @return String: xpath_LoggedInAs_Text
     */
    public String xpath_LoggedInUserName() {
        String xpath_LoggedInUserName = getEnvPropertyValue(propertiesFileName, "xpath_LoggedInUserName");
        return xpath_LoggedInUserName;
    }

    /** Method to get xpath_LogoutLink from SmartCityAccountPage.properties
     *  @return String: xpath_LogoutLink
     */
    public String xpath_LogoutLink() {
        String xpath_LogoutLink = getEnvPropertyValue(propertiesFileName, "xpath_LogoutLink");
        return xpath_LogoutLink;
    }

}
