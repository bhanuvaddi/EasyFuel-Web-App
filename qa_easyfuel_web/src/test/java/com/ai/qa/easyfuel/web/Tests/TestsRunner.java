package com.ai.qa.easyfuel.web.Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(strict = true,
            //plugin	= {"pretty"}, strict = true, dryRun = false,
            format = {"json:target/cucumber/1.json", "html:target/cucumber/1.html", "pretty"},
            //monochrome = false,
            tags		= {"@SmartCityLogin, @SmartCityUsers"},
            features	= {"src/main/resources/features"},
            glue		= {"com.ai.qa.easyfuel.web.StepDefinitions"}
    )
    public class TestsRunner {
}

