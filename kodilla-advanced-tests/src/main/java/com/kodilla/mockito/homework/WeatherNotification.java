package com.kodilla.mockito.homework;

import java.util.Objects;

public class WeatherNotification {
    private Localization localization;
    private String generalMessage;

    public WeatherNotification(Localization localization) {
        this.localization = localization;
    }

    public WeatherNotification(String generalMessage) {
        this.generalMessage = generalMessage;
    }

    public Localization getLocalization() {
        return localization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherNotification)) return false;
        WeatherNotification that = (WeatherNotification) o;
        return Objects.equals(localization, that.localization) &&
                Objects.equals(generalMessage, that.generalMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localization, generalMessage);
    }
}
