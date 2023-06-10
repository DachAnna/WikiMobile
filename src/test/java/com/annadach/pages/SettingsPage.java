package com.annadach.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SettingsPage {

    private final SelenideElement moreTab = $(MobileBy.id("org.wikipedia.alpha:id/nav_more_container"));
    private final SelenideElement settingTab = $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_settings_container"));

    //Action
    public void openMoreTab () {
        moreTab.click();
    }
    public void openSettingTab () {
        settingTab.click();
    }
    public void chooseLanguageSettings () {
        $$(MobileBy.id("android:id/title"))
                .findBy(text("Wikipedia languages")).click();
    }
    public void addLanguage() {
        $$(MobileBy.id("org.wikipedia.alpha:id/wiki_language_title"))
                .findBy(text("ADD LANGUAGE")).click();
    }
    public void chooseLanguage(String chosenLanguage) {
        $$(MobileBy.id("org.wikipedia.alpha:id/localized_language_name"))
                .findBy(text(chosenLanguage)).click();
    }

    //Check
    public void checkChosenLanguage(String originalLanguage, String chosenLanguage) {
        $(MobileBy.id("android:id/summary")).shouldHave(text(originalLanguage +", " + chosenLanguage));
    }
}
