public class Notebook {
    public int weight;
    public int price;
    public int year;

    //określam atrybuty klasy (bez tego klasa nie wie ze powinna oczekwiac od konstruktora zmiennej weight
    public Notebook(int weight, int price, int year) { //przekazuję wagę laptopa jako argument
        this.weight = weight;
        this.price = price;
        this.year = year;//mówię konstrukturowi żeby przypisał wartości argumentów do atrybutów klasy
    }



    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight () {
        if (this.weight <= 200) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 200 && this.weight <= 2000) {
            System.out.println("This notebook is quite light");

        } else {
            System.out.println("This notebook is quite heavy");
        }
    }

    public void checkYearPerWeight(){
        if (this.year <= 2000 && this.weight >=2500){
            System.out.println("This notebook is old and heavy");
        }
        else if(this.year >= 2001 && this.year<=2015 && this.weight<2500 && this.weight>2000){
            System.out.println("This notebook is quite old and heavy");
        }
        else {
            System.out.println("This notebook is not old neither heavy");

        }


    }
}




