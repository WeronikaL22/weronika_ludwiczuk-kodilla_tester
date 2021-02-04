package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAiports(){
        Map <String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
        return airports;
    }
    public boolean isAirportInUse (String airport) throws AirportNotFoundException {
        if(getListOfAiports().containsKey(airport))
            return getListOfAiports().get(airport);
        throw new AirportNotFoundException();   //jeśli nie ma w mapie lotniska podanego przez użytkownika, rzucony zostanie wyjątek
    }
}

//  wyjątek zostanie wyrzucony na zewnatrz, poza metodę isAirportInUse -
//  konieczność obsługi wyjątku zostanie przeniesiona do miejsca, w którym metoda isAirportInUse będzie wywoływana.
//  jęsli wywołam try..catch w isAiportinUse wtedy wyjatek zostanie stłumiony
