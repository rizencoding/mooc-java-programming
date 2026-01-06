public class Book {
    private String title;
    private int numPages;
    private int yearPubl;

    public Book(String title, int pages, int year){
        this.title = title;
        this.numPages = pages;
        this.yearPubl = year;
    }

    public String getTitle(){
        return this.title;
    }
    public String toString(){
        return this.title+", "+this.numPages+" pages, "+this.yearPubl;
    }
}
