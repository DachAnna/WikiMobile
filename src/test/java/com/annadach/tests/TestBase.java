package com.annadach.tests;

import com.annadach.drivers.BrowserStackMobileDriver;
import com.annadach.drivers.EmulatorMobileDriver;
import com.annadach.drivers.RealMobileDriver;
import com.codeborne.selenide.Configuration;
import io.appium.java_client.MobileBy;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;


public class TestBase {

    public static String deviceHost = System.getProperty("deviceHost", "browserstack");

    @BeforeAll
    public static void setup() {
        addListener("AllureSelenide", new AllureSelenide());
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserStackMobileDriver.class.getName();
                break;
            case "emulator":
                Configuration.browser = EmulatorMobileDriver.class.getName();
                break;
            case "real":
                Configuration.browser = RealMobileDriver.class.getName();
                break;
        }
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        step("Открыть приложение", () -> {
            open();
            $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        });
    }

    @AfterEach
    public void afterEach() {
        step("Закрыть приложение", () -> {
            closeWebDriver();
        });
    }
}
