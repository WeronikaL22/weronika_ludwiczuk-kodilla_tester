package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> result = new ArrayList<>();

        result.add(new Flight("Warsaw", "Malaga"));
        result.add(new Flight("Katowice", "Radom"));
        result.add(new Flight("Paris", "Dubai"));
        result.add(new Flight("Paris", "Madrid"));


        return result;
    }
}
