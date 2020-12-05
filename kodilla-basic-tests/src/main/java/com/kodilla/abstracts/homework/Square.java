package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int width, int heigth) {

        super( width, heigth);
    }

    @Override
        public int calculateArea(){
        return getWidth()*getHeigth();
        }

    @Override
    public int calculatePerimeter() {

        return getWidth()*4;
    }
}




