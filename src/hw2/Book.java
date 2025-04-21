package hw2;

public class Book extends Publication {
    String author = "";
    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }
    @Override
    public void getInfo() {
        System.out.println(title + "," + " published in " + year+ ", by " + author);
    }
}
