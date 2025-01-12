package com.mtsbank.mobile.vacancy;

import static com.mtsbank.elements.SelenideElementsMobile.*;

public class OpenVacansiesPageMobile {
    public void openVacansiesPage() {
        mtsBankLinks.scrollIntoCenter().click();
        jobsMts.scrollIntoCenter().click();
    }
}
