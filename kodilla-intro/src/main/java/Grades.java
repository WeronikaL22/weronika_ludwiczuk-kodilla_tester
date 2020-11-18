public class Grades {
    private int[] grades;
    private int size; //zmienna monitoruje aktualna liczbę elementów w tablicy

    public Grades() {   //konstruktor
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {  //przerywa działanie - void zwraca pustkę
        if (this.size == 10) {
            System.out.println("Can't add this grade!!!");
            return;
        }
        this.grades[this.size] = value; //dodanie elementu do tablicy, jeśli rozmiar jest mniejszy od maksymalnego
        this.size++;
    }

    public int lastGrade() {

        return this.grades[size - 1];
    }


    public double calculateAverage() {
        int sum = 0;


        for (int i = 0; i < grades.length; i++) {
            sum += this.grades[i];
        }
        return (this.size == 0) ? 0 : (double)sum/(double)this.size;

    }



}



