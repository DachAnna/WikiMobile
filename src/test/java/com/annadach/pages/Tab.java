package com.annadach.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Tab {

    private final SelenideElement savedTab = $(MobileBy.AccessibilityId("Saved"));
    private final SelenideElement searchTab = $(MobileBy.AccessibilityId("Search"));
    private final SelenideElement empty = $(MobileBy.id("org.wikipedia.alpha:id/history_empty_container"));
    private final SelenideElement editsTab = $(MobileBy.AccessibilityId("Edits"));
    private final SelenideElement moreTab = $(MobileBy.AccessibilityId("More"));

    //Action
    public void openSavedTab() {
        savedTab.click();
    }

    public void openSearchTab() {
        searchTab.click();
    }

    public void openEditsTab() {
        editsTab.click();
    }

    public void openMoreTab() {
        moreTab.click();
    }

    public void emptyClick() {
        empty.click();
    }

    //Check
    public void checkSavedTab() {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Saved"));
    }

    public void checkSearchTab() {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Search"));
    }

    public void checkEditsTab() {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Edits"));
    }

    public void checkMoreTab() {
        $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"))
                .shouldHave(text("Settings"));
    }
}
