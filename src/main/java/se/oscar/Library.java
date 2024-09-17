package se.oscar;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Borrower> borrowerList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int index = 0;

    public void addBook(String title, String author, int pages, String genre) {
        bookList.add(new Book(title, author, pages, genre));
    }

    public void deleteBook(int index) {
        bookList.remove(index - 1);
    }

    public void listBooks() {
        for (Book book : bookList) {
            i = i + 1;
            System.out.println(i + " " + book);
        }
        i = 0;
    }

    public void addBorrower(String name, String email) {
        borrowerList.add(new Borrower(name, email));
    }

    public void borrowBook(String email) {
        for (Borrower borrower : borrowerList) {
            if (borrower.getEmail().equals(email)) {
                System.out.println("What book do you want to borrow? Use list index");
                index = scan.nextInt();
                System.out.println("You have seleceted: " + bookList.get(index-1));
                deleteBook(index-1);
            }
        }
    }
}
