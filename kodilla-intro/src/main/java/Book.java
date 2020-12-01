public class Book {

    private String author;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
        }


    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {

        return new Book(author, title);
    }

}

