package com.mtsbank.desktop.atm24;

import static com.mtsbank.elements.SelenideElementsPc.*;

public class SetBancomatsProperties {

    public void setBancomatsProperties() {
        openFilters.click();
        offWorkNow.click();
        onWork24h.click();
        offMtsOffice.click();
        offMtsMarkets.click();
        offTerminals.click();
        offPartnerBancomats.click();
        closeFilters.click();
    }
}
