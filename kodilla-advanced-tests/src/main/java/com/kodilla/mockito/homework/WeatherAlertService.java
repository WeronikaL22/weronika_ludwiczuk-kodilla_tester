package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherAlertService {

    private Map<Localization, Set<UserClient>> localizationClients = new HashMap<>();

    public void subscribe(Localization localization, UserClient userClient) {
        Set<UserClient> clients = this.localizationClients.get(localization);

        if(clients == null) {
            clients = new HashSet<>();
        }

        clients.add(userClient);
        this.localizationClients.put(localization, clients);
    }

    public void sendNotification(WeatherNotification notification) {
        Localization localization = notification.getLocalization();

        if(!this.localizationClients.containsKey(localization)) {
            return;
        }

        Set<UserClient> clients = this.localizationClients.get(localization);
        clients.forEach(client -> client.receiveNotification(notification));
    }

    public void unsubscribeFromLocalization(Localization localization, UserClient userClient){
        Set<UserClient> clients = this.localizationClients.get(localization);

        if(clients == null) {
            clients = new HashSet<>();
        }

        clients = clients
                .stream()
                .filter(c -> !c.equals(userClient)) // zwraca wszystkich klientów którzy nie są równi UserClient
                .collect(Collectors.toSet());

        this.localizationClients.put(localization, clients);
    }

    public void unsubscribeFromAllLocalizations(UserClient userClient) {
        this.localizationClients
            .forEach((localization, clients) -> {
                unsubscribeFromLocalization(localization, userClient);
            });
    }

    public void sendGeneralInformationNotificationsToAll(WeatherNotification notification) {

        Set<UserClient> uniqueClients = new HashSet<>();

        this.localizationClients
            .forEach((localization, clients) -> {
                uniqueClients.addAll(clients);
            });

        uniqueClients.forEach(client -> client.receiveNotification(notification));

    }

    public void deleteLocalization(Localization localization){
        this.localizationClients.remove(localization);
    }
}





