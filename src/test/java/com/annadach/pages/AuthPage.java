package com.annadach.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AuthPage {

    private final SelenideElement authPage = $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_login_button"));

    //Action
    public void openAuthPage() {
        authPage.click();
    }

    //Check
    public void checkAuthPage() {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Create an account"));
    }
}
