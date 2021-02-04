package com.kodilla.mockito;

import com.kodilla.mockito.homework.Localization;
import com.kodilla.mockito.homework.UserClient;
import com.kodilla.mockito.homework.WeatherAlertService;
import com.kodilla.mockito.homework.WeatherNotification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {


    @Test
    public void InterestedUserShouldBeAddedToLocalizationAndReceiveNotification(){
        WeatherAlertService weatherAlertService = new WeatherAlertService();

        Localization localization = new Localization(45, 56);
        UserClient user = Mockito.mock(UserClient.class);

        WeatherNotification notification = new WeatherNotification(localization);

        weatherAlertService.subscribe(localization, user);
        weatherAlertService.sendNotification(notification);

        Mockito.verify(user, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void UserCanUnsubscribeFromLocalization(){
        WeatherAlertService weatherAlertService = new WeatherAlertService();

        Localization localization = new Localization(45, 56);
        UserClient user = Mockito.mock(UserClient.class);

        WeatherNotification notification = new WeatherNotification(localization);

        weatherAlertService.subscribe(localization, user);
        weatherAlertService.unsubscribeFromLocalization(localization, user);
        weatherAlertService.sendNotification(notification);

        Mockito.verify(user, Mockito.never()).receiveNotification(notification);

    }

    @Test
    public void UserCanUnsubscribeFromAllLocalizations(){
        // Given
        WeatherAlertService weatherAlertService = new WeatherAlertService();

        Localization localization1 = new Localization(45, 56);
        Localization localization2 = new Localization(58, 73);

        UserClient user = Mockito.mock(UserClient.class);

        weatherAlertService.subscribe(localization1, user);
        weatherAlertService.subscribe(localization2, user);

        // When
        weatherAlertService.unsubscribeFromAllLocalizations(user);

        WeatherNotification notification = new WeatherNotification(localization1);
        weatherAlertService.sendNotification(notification);

        // Then
        Mockito.verify(user, Mockito.never()).receiveNotification(notification);

    }

    @Test
    public void OnlyUsersFromCertainLocalizationShouldReceiveNotification(){
        //given
        WeatherAlertService weatherAlertService = new WeatherAlertService();
        UserClient user1 = Mockito.mock(UserClient.class);
        UserClient user2 = Mockito.mock(UserClient.class);

        Localization localization1 = new Localization(45, 56);
        Localization localization2 = new Localization(58, 73);

        //when
        WeatherNotification notification = new WeatherNotification(localization1);

        weatherAlertService.subscribe(localization1, user1);
        weatherAlertService.subscribe(localization2, user1);
        weatherAlertService.subscribe(localization1, user2);
        weatherAlertService.sendNotification(notification);

        //then
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(user2, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void GeneralInformationNotificationIsSentToAllUsersOnce(){
        WeatherAlertService weatherAlertService = new WeatherAlertService();
        UserClient user1 = Mockito.mock(UserClient.class);
        UserClient user2 = Mockito.mock(UserClient.class);

        Localization localization1 = new Localization(0, 0);
        Localization localization2 = new Localization(58, 73);

        //when
        weatherAlertService.subscribe(localization1, user1);
        weatherAlertService.subscribe(localization2, user1);
        weatherAlertService.subscribe(localization2, user2);

        WeatherNotification notification = new WeatherNotification("Terms of use update");
        weatherAlertService.sendGeneralInformationNotificationsToAll(notification);

        //then
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(user2, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void CanDeleteALocalization(){
        WeatherAlertService weatherAlertService = new WeatherAlertService();
        UserClient user1 = Mockito.mock(UserClient.class);


        Localization localization1 = new Localization(5, 12);

        //when
        WeatherNotification notification = new WeatherNotification(localization1);

        weatherAlertService.subscribe(localization1, user1);
        weatherAlertService.deleteLocalization(localization1);
        weatherAlertService.sendNotification(notification);

        //then
        Mockito.verify(user1, Mockito.never()).receiveNotification(notification);

    }


}
