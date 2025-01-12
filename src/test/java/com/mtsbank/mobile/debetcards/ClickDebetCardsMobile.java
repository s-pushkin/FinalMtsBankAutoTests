package com.mtsbank.mobile.debetcards;

import static com.codeborne.selenide.Condition.visible;
import static com.mtsbank.elements.SelenideElementsMobile.*;


public class ClickDebetCardsMobile {

    public void clickDebetCards() {
        cardsMobile.shouldBe(visible).click();
    }
}
