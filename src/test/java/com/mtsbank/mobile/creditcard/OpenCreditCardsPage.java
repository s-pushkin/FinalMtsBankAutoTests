package com.mtsbank.mobile.creditcard;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mtsbank.elements.SelenideElementsMobile.*;

public class OpenCreditCardsPage {
    public void openCreditCardsPage() {
        sleep(3000);
        creditCardPage.shouldBe(visible).click();
    }
}
