package com.mtsbank.desktop.contribution;

import static com.mtsbank.elements.SelenideElementsPc.*;

public class CheckContributionCalculations extends SetContributionProperties {
    public void checkContributionCalculations() {
        String percentStr = percent.text();
        percentStr = percentStr.replace("%", "");
        percentStr = percentStr.replace(",", ".");
        double ContributionSumDouble = Double.parseDouble(randomContributionSumStr);
        double PercentDouble = Double.parseDouble(percentStr);
        double contributionSumWithPercent = ContributionSumDouble * (1 + (PercentDouble / 100));
        String finalSumStr = finalSum.innerText();
        finalSumStr = finalSumStr.replace(",", ".");
        finalSumStr = finalSumStr.replace(" ", "");
        finalSumStr = finalSumStr.replace("\u20BD", "");
        double finalSumDouble = Double.parseDouble(finalSumStr);
        if (finalSumDouble > contributionSumWithPercent) {
            System.out.println("Процент по вкладу рассчитан верно");
        } else {
            System.out.println("Процент по вкладу рассчитан неверно");
        }
    }
}
