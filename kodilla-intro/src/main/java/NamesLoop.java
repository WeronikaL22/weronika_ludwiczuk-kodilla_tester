public class NamesLoop {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Weronika", "Genowefa", "Mirek", "Hania", "Daria", "Krzyś"};
        int numberOfElements = names.length;

        for (int i= names.length- 1; i>=0; i--) {
            System.out.println(names[i]);
        }
    }
}

