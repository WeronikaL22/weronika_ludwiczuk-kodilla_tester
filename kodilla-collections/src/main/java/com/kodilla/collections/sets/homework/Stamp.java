package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    Stamp(String name, int height, int width, boolean stamped) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.stamped = stamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", stamped=" + stamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return height == stamp.height &&
                width == stamp.width &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, stamped);
    }

    private String name;
    private int height;
    private int width;
    private boolean stamped;
}
