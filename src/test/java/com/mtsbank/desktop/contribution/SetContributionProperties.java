package com.mtsbank.desktop.contribution;

import org.openqa.selenium.Keys;

import java.util.concurrent.ThreadLocalRandom;

import static com.codeborne.selenide.Condition.visible;
import static com.mtsbank.elements.SelenideElementsPc.*;

public class SetContributionProperties {
    int minContributionSum = 10000;
    int maxContributionSum = 500000000;
    int randomContributionSum = ThreadLocalRandom.current().nextInt(minContributionSum, maxContributionSum + 1);
    String randomContributionSumStr = String.valueOf(randomContributionSum);

    public void setContributionProperties() {
        //для всех
        allUsers.scrollIntoCenter().shouldBe(visible).click();
        //валюта вклада
        depositCurrency.scrollIntoCenter().shouldBe(visible).click();
        //срок
        periodMenu.scrollIntoCenter().click();
        period.click();
        //сумма вклада
        inputContributionSum.scrollIntoCenter().sendKeys(Keys.CONTROL + "A");
        inputContributionSum.sendKeys(randomContributionSumStr);
        //выплачивать проценты
        percentTime.scrollIntoCenter().click();
        //оставлять проценты на вкладе
        percentOnContribution.scrollIntoCenter().click();
        //вид вклада
        typeOfContribution.scrollIntoCenter().click();
    }
}
