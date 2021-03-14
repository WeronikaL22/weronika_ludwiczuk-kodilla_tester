package NumberChecker;

public class NumberChecker {

    public String checkIfNumberDivisible(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        else return "Nope";
    }

    public String checkIfDivisibleByThreeAndFive(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        else return "Nope";
    }

}

