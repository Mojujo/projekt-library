package se.oscar;

public class Book {
    private String title;
    private String author;
    private int pages;
    private String genre;

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book [title= " + title + ", author= " + author + ", pages= " + pages + ", genre= " + genre + "]";
    }
}
