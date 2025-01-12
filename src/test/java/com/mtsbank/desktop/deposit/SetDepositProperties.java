package com.mtsbank.desktop.deposit;

import org.openqa.selenium.Keys;

import java.util.Random;

import static com.mtsbank.elements.SelenideElementsPc.*;

public class SetDepositProperties {
    Random random = new Random();
    int minDepositeSum = 50000;
    int maxDepositeSum = 400000000;
    int randomDepositeSum;
    int minDays = 1;
    int maxDays = 730;
    int randomDays;
    static String randomDaysStr = "";
    static String randomDepositeSumStr = "";

    public void setDepositProperties() {
        randomDays = random.nextInt(minDays, maxDays + 1);
        randomDepositeSum = random.nextInt(minDepositeSum, maxDepositeSum + 1);
        randomDepositeSumStr = String.valueOf(randomDepositeSum);
        depositeSum.sendKeys(Keys.CONTROL + "A");
        depositeSum.sendKeys(randomDepositeSumStr);
        randomDaysStr = String.valueOf(randomDays);
        countDays.sendKeys((Keys.CONTROL + "A"));
        countDays.sendKeys(randomDaysStr);

    }
}
