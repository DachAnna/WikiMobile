package com.annadach.drivers;

import com.annadach.config.MainConfig;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackMobileDriver implements WebDriverProvider {

    public static MainConfig config = ConfigFactory.create(MainConfig.class, System.getProperties());

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {


        // Set your access credentials
        desiredCapabilities.setCapability("browserstack.user", config.getUserName());
        desiredCapabilities.setCapability("browserstack.key", config.getAccessKey());

        // Set URL of the application under test
        desiredCapabilities.setCapability("app", "bs://7b706782a5dbc2d12e87e058aa5121c986729d48");

        // Specify device and os_version for testing
        desiredCapabilities.setCapability("device", "Google Pixel 3");
        desiredCapabilities.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "Java Android");
        desiredCapabilities.setCapability("name", "Wiki_test");

        return new AndroidDriver(getBrowserstackUrl(), desiredCapabilities);
    }
}
