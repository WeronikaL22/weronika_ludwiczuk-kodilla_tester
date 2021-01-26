package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number of rounds:");
            String s = scanner.nextLine();
            try{
                int rounds = Integer.parseInt(s); //wiedząc że metoda ta może wywołac wyjątek, umieszcam ją w "try"
                return rounds;
            } catch (Exception e){ //przechwyca wyjątki klasy Exception
                System.out.println("Wrong data. Enter only digits.Try again.");
            }
        }
    }
}
