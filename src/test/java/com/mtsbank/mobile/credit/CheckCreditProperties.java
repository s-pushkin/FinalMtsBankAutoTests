package com.mtsbank.mobile.credit;

import com.mtsbank.elements.SelenideElementsMobile.*;

import static com.mtsbank.elements.SelenideElementsMobile.*;
import static com.mtsbank.mobile.credit.SetCreditProperties.randomCreditSumStr;

public class CheckCreditProperties {
    public void checkCreditProperties() {
        String creditSumMonthStr = "";
        creditSumMonthStr = creditSumMonth.text();
        String creditSumMonthValue = creditSumMonthStr.replaceAll("[^\\d,]", "")
                .replace(",", ".")
                .replace(" ", "")
                .replace("\u20BD", "");
        double creditSumMonthStrDouble = Double.parseDouble(creditSumMonthValue);
        double randomCreditSumDouble = Double.parseDouble(randomCreditSumStr);
        if (randomCreditSumDouble > (creditSumMonthStrDouble * 12)) {
            System.out.println("Процент по кредиту рассчитан не верно");
        } else {
            System.out.println("Процент по вкладу рассчитан верно");
        }
    }
}
