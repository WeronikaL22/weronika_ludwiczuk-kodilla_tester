public class TestRandomNumbers {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();


        randomNumbers.draw();
        System.out.println("Max number is " + randomNumbers.getMaximumNumber());
        System.out.println("Min number is " + randomNumbers.getMinimalNumber());

    }
}
