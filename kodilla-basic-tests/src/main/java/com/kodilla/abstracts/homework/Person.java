package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

   // public Job getJob() {
     //   return this.job;
  //  }

    public Person(String firstName,int age, Job job) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;
    }

    public String getJobResponsibilities() {
        return this.job.getResponsibilities();
    }

}
