package com.framework.steps.common;

import com.framework.base.TestBase;
import com.framework.implementation.utils.readJsonFile;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class commonSteps extends TestBase {

    @Before
    public static void getEnvironment() {
        readJsonFile.getEnvironment("SIT");
    }

    @After()
    public void tearDown(Scenario scenario) {
        if (driver!=null ) {
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","My Screenshot");
            }
            driver.quit();
        }

    }

}
