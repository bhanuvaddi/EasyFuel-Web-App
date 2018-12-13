package com.ai.qa.easyfuel.web.utilities;

import com.ai.qa.easyfuel.web.envSetup.BaseTest;
import com.ai.qa.easyfuel.web.envSetup.EnvSetup;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class HooksMethods implements BaseTest {

/*
    EnvSetup envSetup = new EnvSetup();
    NavigateMethods navigateMethods = new NavigateMethods();
*/
    @Before
    public void beforeScenario() {
        navigationObj.closeDriver();
        EnvSetup.CreateWebDriver("chrome");
    }

    @After
    public void afterScenario() {
        navigationObj.closeDriver();
    }

}
