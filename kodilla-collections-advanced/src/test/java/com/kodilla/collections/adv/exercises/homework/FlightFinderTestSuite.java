package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void WhenTheFlightFromNotFoundThenResultIsEmpty(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Kamianka");
        //then
        assertEquals(0,result.size());
    }

    @Test
    public void WhenTheFlightToNotFoundThenResultIsEmpty(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Sarnaki");
        //then
        assertEquals(0,result.size());
    }

    @Test
    public void WhenTheFlightsFromFoundThenResultCorrect(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Paris");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Paris", "Dubai"));
        expectedList.add(new Flight("Paris", "Madrid"));
        assertEquals(expectedList, result);
    }

    @Test
    public void WhenTheFlightsToFoundThenResultCorrect(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Radom");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Katowice", "Radom"));
        assertEquals(expectedList, result);
    }
}