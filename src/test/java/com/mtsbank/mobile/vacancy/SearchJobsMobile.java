package com.mtsbank.mobile.vacancy;

import static com.mtsbank.elements.SelenideElementsMobile.*;

public class SearchJobsMobile {
    String nameOfJob = "инженер тестирования";

    public void searchJobs() {
        inputJob.setValue(nameOfJob);
        inputJob.pressEnter();
    }
}
