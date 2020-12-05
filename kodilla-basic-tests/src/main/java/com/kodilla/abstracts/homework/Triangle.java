package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double width;
    private double height;
    private double sidea;
    private double sideb;
    private double sidec;



    public Triangle(double width, double height, double sidea,double sideb, double sidec) {
        this.width = width;
        this.height = height;
        this.sidea=sidea;
        this.sideb = sideb;
        this.sidec=sidec;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sidea+sideb+sidec;
    }
}
