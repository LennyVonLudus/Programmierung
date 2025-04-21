package hw2;
public class Textbook extends Book {
    String subject = "";
    public Textbook(String title, int year, String author, String subject) {
        super(title, year, author);
        this.subject = subject;
    }
    public void getInfo() {
        System.out.println(title + "," + " published in " + year+ ", by " + author + " Subject: " + subject);
    }
}
