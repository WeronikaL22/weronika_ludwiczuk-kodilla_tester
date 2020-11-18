public class SecondClass {

    public static void main(String[] args) {
        Grades grades = new Grades();

        int[] gradesArray = {6,2,3,1,4};



        for (int i = 0; i < gradesArray.length; i++) {
            grades.add(gradesArray[i]);
            System.out.println(grades.lastGrade());
            System.out.println("Srednia arytmetyczna wynosi " + grades.calculateAverage());


        }


    }

}














