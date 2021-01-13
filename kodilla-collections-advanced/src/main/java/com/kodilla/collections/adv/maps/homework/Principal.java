package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String surname;
    private String schoolName;


    public Principal(String firstName, String surname,String schoolName) {
        this.firstName = firstName;
        this.surname = surname;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) &&
                Objects.equals(surname, principal.surname) &&
                Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, schoolName);
    }

    public String getNameAndSurname(){
        return
                firstName + " " + surname;
    }

    public String getSchoolName(){
        return
                schoolName;
    }
}
