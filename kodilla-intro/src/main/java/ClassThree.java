public class ClassThree {

    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);



        User[] users = {anna, betty, carl, david, eva, frankie};

        double averageAge = averageAge(users);
        String message = "Average age is " + averageAge;
        System.out.println(message);
        printYoungsters(users,averageAge);


    }

    public static void printYoungsters(User[] users, double averageAge) {
        for (int i = 0; i < users.length; i++) {
            int currentUserAge = users[i].getAge();
            if (currentUserAge < averageAge) {
                System.out.println(users[i].getName());
            }
        }
    }

    public static double averageAge(User[] users) { //przyjmuje tablice jako parametr
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            //System.out.println(users[i].getAge());
            int currentAge = users[i].getAge();
            sum = sum + currentAge;
            //System.out.println(sum);
        }

        double average = (double)sum/(double)users.length;
        return average;
    }
}







