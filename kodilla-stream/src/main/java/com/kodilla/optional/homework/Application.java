package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> register = new ArrayList<>();
        register.add(new Student("Tom Wise",null ));
        register.add(new Student("Mila Cunnis", new Teacher("Bill") ));
        register.add(new Student("Kasia Cichopek", new Teacher("Grzegorz") ));
        register.add(new Student("Marcin Najman", null));


        for(Student student: register) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            System.out.println("Student: " + student.getName());
            if(optionalTeacher.isPresent()) {
                Teacher teacher = optionalTeacher.get();
                System.out.println("Teacher:" + teacher.getName());
            } else {
                System.out.println("Teacher: <undefined>");
            }
            System.out.println("----------------------------------");
        }
    }
}
