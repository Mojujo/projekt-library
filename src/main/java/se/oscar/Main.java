package se.oscar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();
        boolean run = true;
        String title;
        String author;
        int pages;
        String genre;
        String tempUsername;
        String tempEmail;

        while (run) {
            System.out.println("""
                    
                    *****************************
                    Welcome to the Library System
                    Choose what you want to do
                    *****************************
                    
                    1: Add a book
                    2: Delete a book
                    3: Show all books
                    4: Borrow a book
                    5: Exit""");
            switch(scan.nextInt()) {
                case 1:
                    System.out.println("Enter the title of the book");
                    title = scan.next();
                    System.out.println("Enter the author of the book");
                    author = scan.next();
                    System.out.println("Enter the number of pages of the book");
                    pages = scan.nextInt();
                    System.out.println("Enter the genre of the book");
                    genre = scan.next();
                    library.addBook(title, author, pages, genre);
                    break;
                case 2:
                    System.out.println("What book do you wish to delete? Use list index");
                    library.deleteBook(scan.nextInt());
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    System.out.println("""
                            Do you have an account?
                            1: Log in:
                            2: Register an account:""");
                    switch(scan.nextInt()) {
                        case 1:
                            System.out.println("Enter email: ");
                            library.borrowBook(scan.next());
                            break;
                        case 2:
                            System.out.println("Enter username: ");
                            tempUsername = scan.next();
                            System.out.println("Enter email: ");
                            tempEmail = scan.next();
                            library.addBorrower(tempUsername, tempEmail);
                        default:
                            break;
                    }
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
