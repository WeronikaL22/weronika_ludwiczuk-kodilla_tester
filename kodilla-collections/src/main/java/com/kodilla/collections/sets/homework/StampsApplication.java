package com.kodilla.collections.sets.homework;

import java.util.HashSet;

public class StampsApplication {
    public static void main(String[] args) {
        HashSet<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("kaczynski", 10, 10, true);
        Stamp stamp2 = new Stamp("Pope", 200, 100, false);
        Stamp stamp3 = new Stamp("Pope", 200, 100, false);

        //System.out.println(stamp2.hashCode());
        //System.out.println(stamp3.hashCode());

        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp2);
        stamps.add(stamp2);
        stamps.add(stamp3);
        stamps.add(stamp1);

        System.out.println(stamps.size());
    }
}
