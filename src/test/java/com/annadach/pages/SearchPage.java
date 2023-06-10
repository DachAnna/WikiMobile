package com.annadach.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    private SelenideElement
            searchField = $(MobileBy.AccessibilityId("Search Wikipedia")),
            inputField = $(MobileBy.id("org.wikipedia.alpha:id/search_src_text"));

    //Action
    public void openSearchField() {
        searchField.click();
    }

    public void setValue(String value) {
        inputField.val(value);
    }

    //Check
    public void checkSuccessfulResult() {
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));
    }

    public void checkUnsuccessfulResult() {
        $(MobileBy.id("org.wikipedia.alpha:id/results_text"))
                .shouldHave(text("No results"));
    }
}
