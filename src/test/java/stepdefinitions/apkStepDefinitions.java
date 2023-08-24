package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkStepDefinitions {

    AndroidDriver<AndroidElement> driver;


    @Given("User want to download an app that is his wanted app")
    public void user_want_to_download_an_app_that_is_his_wanted_app() throws MalformedURLException {
        final String cihazIsmi="PIXEL";
        final String platformVersion="10.0";


        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahmet\\IdeaProjects\\APPIUM_T-116\\Apps\\all-currency-converter-3-9-0 (1).apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Given("User want to download an app that has options like {string} {string} {string} {string} {string}")
    public void user_want_to_download_an_app_that_has_options_like(String deviceName, String platformVersion1, String platformName, String automationName, String app) throws MalformedURLException {
        final String cihazIsmi= deviceName;
        final String platformVersion=platformVersion1;


        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,automationName);

        capabilities.setCapability(MobileCapabilityType.APP,app);

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
