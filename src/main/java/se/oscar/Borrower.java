package se.oscar;

public class Borrower {
    private String name;
    private String email;

    public Borrower(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
