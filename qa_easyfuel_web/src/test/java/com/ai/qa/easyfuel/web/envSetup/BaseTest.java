package com.ai.qa.easyfuel.web.envSetup;

import com.ai.qa.easyfuel.web.utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BaseTest {

    public static WebDriver driver = EnvSetup.CreateWebDriver("chrome");
    public static WebDriverWait wait = new WebDriverWait(driver, 5);

    AssertionMethods assertionObj = new AssertionMethods();
    ClickElementsMethods clickObj = new ClickElementsMethods();
    ConfigurationMethods configObj = new ConfigurationMethods();
    ErrorHandlingMethods errorhandlingObj = new ErrorHandlingMethods();
    HooksMethods hooksObjects = new HooksMethods();
    InputMethods inputObj = new InputMethods();
    JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();
    MiscMethods miscmethodObj = new MiscMethods();
    NavigateMethods navigationObj = new NavigateMethods();
    ProgressMethods progressObj = new ProgressMethods();
    RequirmentUtils requtilObj = new RequirmentUtils();
    ScreenShotMethods screenshotObj = new ScreenShotMethods();
    SelectElementByType selectObj = new SelectElementByType();
    TestCaseFailed testfailObj = new TestCaseFailed();

}
