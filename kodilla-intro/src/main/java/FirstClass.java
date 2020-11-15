public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(200, 600, 2014);
        checkNotebook(notebook);
        Notebook heavyNotebook = new Notebook(3000, 1390, 1980);
        checkNotebook(heavyNotebook);
        Notebook oldNotebook = new Notebook(2001, 400, 2013);
        checkNotebook(oldNotebook);
    }

    public static void checkNotebook(Notebook notebook) {  //notebook jako parametr
        System.out.println(notebook.weight + "gram " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPerWeight();
    }

}
