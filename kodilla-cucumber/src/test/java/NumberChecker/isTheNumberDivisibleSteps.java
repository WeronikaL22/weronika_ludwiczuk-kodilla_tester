package NumberChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class isTheNumberDivisibleSteps implements En {
    private int number;
    private String response;

    public isTheNumberDivisibleSteps(){
        Given("number is 6", () -> {
            this.number = 6;
        });
        Given("number is 9", () -> {
            this.number = 9;
        });
        Given("number is 14", () -> {
            this.number = 14;
        });
        Given("number is 5", () -> {
            this.number = 5;
        });
        Given("number is 20", () -> {
            this.number = 20;
        });
        Given("number is 4", () -> {
            this.number = 4;
        });
        Given("number is 15", () -> {
            this.number = 15;
        });
        Given("number is 60", () -> {
            this.number = 60;
        });
        Given("number is 123", () -> {
            this.number = 123;
        });

        When("I ask whether it is or isn't divisible by 3", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.response = numberChecker.checkIfNumberDivisible(this.number);
        });
        When("I ask whether it is or isn't divisible by 5", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.response = numberChecker.checkIfNumberDivisible(this.number);
        });
        When("I ask whether it is or isn't divisible by 3 and 5", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.response = numberChecker.checkIfDivisibleByThreeAndFive(this.number);
        });

        Then("I should get response {string}", (String string) -> {
            Assert.assertEquals(string,this.response);
        });
    }
}
