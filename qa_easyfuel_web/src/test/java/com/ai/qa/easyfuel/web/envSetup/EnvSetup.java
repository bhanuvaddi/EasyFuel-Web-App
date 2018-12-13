package com.ai.qa.easyfuel.web.envSetup;

import com.ai.qa.easyfuel.web.utilities.RequirmentUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class EnvSetup {

    static WebDriver driver = null;
    static String browserName = null;
    /*static String ChromeBrowser = null;
    static String Firefox = null;*/
    static String IE = null;
    static String currentPath = System.getProperty("user.dir");
    static Properties prop = new Properties();
    static RequirmentUtils requtil = new RequirmentUtils();

    public static String getBrowserName()
    {

        browserName = requtil.getEnvPropertyValue("Browser.properties","Browser");
        if(browserName != null)
        {
            System.out.println("reading browser config file");
        }else if(browserName == null)
            System.out.println("browser not supplied,please supply a browser");
        return browserName;
    }


    public static WebDriver CreateWebDriver(String browserName){
        System.out.println("Browser selected: "+browserName);

        switch(browserName.toLowerCase()){

            case"ch":
            case"chrome":
            case "google chrome":
                System.setProperty("webdriver.chrome.driver", currentPath+"/src/main/resources/BrowserConfig/BrowserDrivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("useAutomationExtension", false);
                driver = new ChromeDriver(options);
                break;
                default:
                    System.out.println("Invalid browser name - "+browserName);
                    System.exit(0);
                    break;
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1920, 1075));
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
