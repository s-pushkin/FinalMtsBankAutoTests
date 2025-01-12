package com.mtsbank.desktop.deposit;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mtsbank.elements.SelenideElementsPc.offers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckDepositProperties extends SetDepositProperties {
    public void checkDepositProperties() {
        for (SelenideElement offer : offers) {
            String term = "";
            String rate = "";
            String sum = "";
            sleep(1000);
            ElementsCollection termElements = offer.$$("div.sc-fWSDcn.hMozzc");
            if (termElements.size() > 0) {
                termElements.get(0).shouldBe(visible);
                term = termElements.get(0).getText();
            }
            ElementsCollection rateElements = offer.$$("div.sc-fWSDcn.hMozzc");
            if (rateElements.size() > 1) {
                rateElements.get(1).shouldBe(visible);
                rate = rateElements.get(1).getText();
            }
            ElementsCollection sumElements = offer.$$("div.sc-fWSDcn.hMozzc");
            if (sumElements.size() > 2) {
                sumElements.get(2).shouldBe(visible);
                sum = sumElements.get(2).shouldBe(visible).getText();
            }
            String termValue = term.replaceAll("[^\\d,]", "")
                    .replace(",", ".")
                    .replace(" ", "")
                    .replace("\u20BD", "");
            double termDouble = Double.parseDouble(termValue);
            String rateValue = rate.replaceAll("[^\\d,]", "")
                    .replace("%", "")
                    .replace(",", ".")
                    .replace(" ", "")
                    .replace("\u20BD", "");
            double rateDouble = Double.parseDouble(rateValue);
            String sumValue = sum.replaceAll("[^\\d,]", "")
                    .replace(",", ".")
                    .replace(" ", "")
                    .replace("\u20BD", "");
            double sumDouble = Double.parseDouble(sumValue);
            double daysCountFromRandom = Double.parseDouble(randomDaysStr);

            assertEquals(termDouble, daysCountFromRandom, "Дни равны");

            double DepositeSumFromRandom = Double.parseDouble(randomDepositeSumStr);
            if (DepositeSumFromRandom * (rateDouble / 365 / 100 * termDouble) < sumDouble) {
                System.out.println("Выплаты по ставке рассчитаны верно");
            }
        }
    }
}

