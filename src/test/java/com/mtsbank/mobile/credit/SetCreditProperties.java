package com.mtsbank.mobile.credit;

import org.openqa.selenium.Keys;

import java.util.Random;

import static com.mtsbank.elements.SelenideElementsMobile.*;

public class SetCreditProperties {
    Random random = new Random();
    int minCreditSum = 20000;
    int maxCreditSum = 5000000;
    int randomCreditSum;
    static String randomCreditSumStr = "";

    public void setCreditProperties() {
        randomCreditSum = random.nextInt(minCreditSum, maxCreditSum + 1);
        randomCreditSumStr = String.valueOf(randomCreditSum);
        creditSum.sendKeys(Keys.CONTROL + "A");
        creditSum.sendKeys(randomCreditSumStr);
        creditTime.click();
    }
}
