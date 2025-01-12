package com.mtsbank.desktop.contribution;

import static com.codeborne.selenide.Condition.visible;
import static com.mtsbank.elements.SelenideElementsPc.*;

public class OpenContributionPage {

    public void openContributionPage() {
        contribution.shouldBe(visible).click();
        mtsContribution.scrollIntoView(true).click();
    }
}
