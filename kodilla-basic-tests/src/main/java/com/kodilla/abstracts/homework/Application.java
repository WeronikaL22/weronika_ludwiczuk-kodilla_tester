package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(5,5);
        System.out.println("The area of this square is " + square.calculateArea());
        System.out.println("The perimeter of this square is " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("The area if this rectangle is " + rectangle.calculateArea());
        System.out.println("The perimeter if this rectangle is " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(4,5);
        System.out.println("The area if this triangle is " + triangle.calculateArea());
        System.out.println("The perimeter of this triangle is " + triangle.calculatePerimeter());


    }
}
