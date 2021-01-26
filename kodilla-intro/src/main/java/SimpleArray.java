public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "squirell";
        animals[3] = "snake";
        animals[4] = "ant";

        String animal= animals[3];
        int numberOfElements = animals.length;
        System.out.println(animal);
        System.out.println("Moja tablica zawiera" +" " + numberOfElements+" "+ "elementów.");

    }
}
