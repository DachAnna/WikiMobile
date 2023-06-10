package com.annadach.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.CollectionCondition.containExactTextsCaseSensitive;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SavedPages {

    private final SelenideElement savedMenu = $(MobileBy.id("org.wikipedia.alpha:id/menu_overflow_button"));
    private final SelenideElement optionCreate = $(MobileBy.id("org.wikipedia.alpha:id/reading_lists_overflow_create_new_list"));

    //Action
    public void openSavedMenu() {
        savedMenu.click();
    }

    public void tapOptionCreate() {
        optionCreate.click();
    }

    //Check
    public void checkPopUp() {
        $$(MobileBy.id("org.wikipedia.alpha:id/text_input"))
                .should(containExactTextsCaseSensitive("My reading list"));
        $$(MobileBy.id("org.wikipedia.alpha:id/secondary_text_input"))
                .should(containExactTextsCaseSensitive("Description (optional)"));
    }
}
