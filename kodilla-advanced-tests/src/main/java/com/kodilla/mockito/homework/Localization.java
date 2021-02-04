package com.kodilla.mockito.homework;

import java.util.Objects;

public class Localization {
    private double Latitude;
    private double Longitude;

    public Localization(double latitude, double longitude) {
        Latitude = latitude;
        Longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Localization)) return false;
        Localization that = (Localization) o;
        return Double.compare(that.Latitude, Latitude) == 0 &&
                Double.compare(that.Longitude, Longitude) == 0;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Latitude, Longitude);
    }
}
