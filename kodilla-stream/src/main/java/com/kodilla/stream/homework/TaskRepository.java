package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks =new ArrayList<>();
        LocalDate myDate1 = LocalDate.of(2019, 11, 20);
        LocalDate myDate2 = LocalDate.of(2020, 9, 13);
        LocalDate myDate3 = LocalDate.of(2021, 1, 2);

        LocalDate deadline1= LocalDate.of(2020,11,21);
        LocalDate deadline2= LocalDate.of(2021,1,23);
        LocalDate deadline3= LocalDate.of(2021,1,22);

        tasks.add(new Task("sweeping the floor", myDate1, deadline1 ));
        tasks.add(new Task("making a stew", myDate2, deadline2 ));
        tasks.add(new Task("writing a chapter of a new book", myDate3, deadline3 ));

        return tasks;

    }
}
