public class Stars {

    public static void main(String[] args) {

        int i;
        int j;
        int row = 6;

        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {


                System.out.print("*");
            }

            System.out.println();
        }
    }
}
