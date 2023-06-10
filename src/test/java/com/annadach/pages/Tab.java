package com.annadach.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Tab {

    private final SelenideElement savedTab =  $(MobileBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists"));
    private final SelenideElement searchTab = $(MobileBy.id("org.wikipedia.alpha:id/nav_tab_search"));
    private final SelenideElement editsTab =  $(MobileBy.id("org.wikipedia.alpha:id/nav_tab_edits"));
    private final SelenideElement moreTab = $(MobileBy.id("org.wikipedia.alpha:id/nav_more_container"));
    private final SelenideElement settingTab = $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_settings_container"));

    //Action
    public void openSavedTab () {
        savedTab.click();
    }
    public void openSearchTab () {
        searchTab.click();
    }
    public void openEditsTab () {
        editsTab.click();
    }
    public void openMoreTab () {
        moreTab.click();
    }
    public void openSettingTab () {
        settingTab.click();
    }

    //Check
    public void checkSavedTab () {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Saved"));
    }
    public void checkSearchTab () {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Search"));
    }
    public void checkEditsTab () {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Edits"));
    }
    public void checkMoreTab () {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"))
                .shouldHave(text("Settings"));
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView"))
                .shouldHave(text("Donate"));
    }
}
