import java.util.Random;

public class RandomNumbers {

    private int minimalNumber = 1000;
    private int maximumNumber = -1000;


    public int getMinimalNumber() {
        return minimalNumber;
    }
    public int getMaximumNumber(){
        return maximumNumber;
    }

    public RandomNumbers() {
    }

    public void draw() {
        Random random = new Random();

        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if(temp < this.minimalNumber) {
                this.minimalNumber = temp;
            }
            if(temp > this.maximumNumber){
                this.maximumNumber = temp;

            }
        }
    }
}
