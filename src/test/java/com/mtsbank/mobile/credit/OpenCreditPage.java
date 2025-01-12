package com.mtsbank.mobile.credit;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mtsbank.elements.SelenideElementsMobile.*;

public class OpenCreditPage {
    public void openCreditPage() {
        creditPage.shouldBe(visible).click();
        motorCreditPage.scrollIntoCenter().shouldBe(visible).click();
    }
}
