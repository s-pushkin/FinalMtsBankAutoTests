package com.mtsbank.desktop.debetcards;

import static com.codeborne.selenide.Condition.visible;
import static com.mtsbank.elements.SelenideElementsPc.*;


public class ClickDebetCards {

    public void clickDebetCards() {
        cards.shouldBe(visible).click();

        debetCards.scrollIntoView(false).shouldBe(visible).click();
    }
}
