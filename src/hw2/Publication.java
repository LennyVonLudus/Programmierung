package hw2;
public class Publication {
    protected String title = "";
    protected int year = 0;
    public Publication(String title, int year) {
        this.year = year;
        this.title = title;
    }
    public void getInfo() {
        System.out.println(title + "," + " published in " + year);
    }
}