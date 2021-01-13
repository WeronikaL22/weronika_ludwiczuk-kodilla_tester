package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List <Integer> studentNumbers = new ArrayList<>();

    @Override
    public String toString() {
        return "School{" +
                "studentNumbers=" + studentNumbers +
                '}';
    }


    public School(int... studentNumbers){
        for(int studentNumber: studentNumbers){
            this.studentNumbers.add(studentNumber);
        }

    }

    public int sumOfStudents(){
        int sum=0;
        for(int studentNumber: studentNumbers){
            sum+= studentNumber;
        }
        return sum;


    }


}
