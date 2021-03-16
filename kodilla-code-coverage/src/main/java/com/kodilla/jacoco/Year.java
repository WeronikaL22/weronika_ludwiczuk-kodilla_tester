package com.kodilla.jacoco;

public class Year {
    int anInt;

    public Year(int year) {
        this.anInt = year;
    }

    public boolean isLeap() {
        return (this.anInt % 400 == 0) || ((this.anInt % 4 == 0) && (this.anInt % 100 != 0));
    }
}





