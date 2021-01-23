package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Student> register = new ArrayList<>();
        register.add(new Student("Tom Wise", null));
        register.add(new Student("Mila Cunnis", new Teacher("Bill")));
        register.add(new Student("Kasia Cichopek", new Teacher("Grzegorz")));
        register.add(new Student("Marcin Najman", null));

        var studentsInfo = register
            .stream()
                .map(student -> "Student: " + student.getName() +  "; Teacher: " +
                                Optional.ofNullable(student.getTeacher())
                                        .map(Teacher::getName)
                                        .orElse("<undefined>"))
                .collect(Collectors.toList());
        System.out.println(studentsInfo);





        // var studentsWithTeachers = register
         //   .stream()
           // .filter(student -> Optional.ofNullable(student.getTeacher()).isPresent()) //  wyfiltruj tych co mają teachera
           // .map(student -> "Student '" + student.getName() + "'; Teacher '" + student.getTeacher().getName() + "'")
           // .collect(Collectors.toList());

        //System.out.println(studentsWithTeachers);

        //var studentsWithoutTeachers = register
          //  .stream()
            //.filter(student -> Optional.ofNullable(student.getTeacher()).isEmpty())
            //.map(student -> "Student '" + student.getName() + "'; Teacher <undefined>")
            //.collect(Collectors.toList());

        //System.out.println(studentsWithoutTeachers);


        //for(Student student: register) {
          //  Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            //System.out.println("Student: " + student.getName());
            //if(optionalTeacher.isPresent()) {
              //  Teacher teacher = optionalTeacher.get();
               // System.out.println("Teacher:" + teacher.getName());
            //} else {
              //  System.out.println("Teacher: <undefined>");
            //}
            //System.out.println("----------------------------------");
        //}
    }
 }





