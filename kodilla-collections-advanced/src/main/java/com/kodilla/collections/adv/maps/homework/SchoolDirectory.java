package com.kodilla.collections.adv.maps.homework;

;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> register = new HashMap<>();

        Principal John = new Principal("John", "Kowalski", "New Hampshire High School");
        Principal Maria = new Principal("Maria", "Nowak","Cork Primary School");
        Principal Thomas = new Principal("Thomas", "Duncan","Calais Secondary School");

        School JohnsSchool = new School(41,31,21,32,43);
        School MariasSchool = new School(22,27,81,19);
        School ThomasSchool = new School(16,24,27,18,12);

        register.put(John,JohnsSchool);
        register.put(Maria,MariasSchool);
        register.put(Thomas,ThomasSchool);



        for (Map.Entry<Principal, School> principalEntry : register.entrySet())
           System.out.println("Principal "+ principalEntry.getKey().getNameAndSurname() +
                   " works in " +principalEntry.getKey().getSchoolName() + ". " + "Number of all students in the school is:  "
                   + principalEntry.getValue().sumOfStudents());


    }
}
