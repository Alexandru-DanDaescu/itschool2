package session13_recapAndSolid.challenges.librarymanagementsystem;

import java.util.UUID;

public class Book extends Author {

    private String bookTitle;

    private String publisher;

    private UUID ISBN;


    public Book(String bookTitle, String publisher, String nationality, String authorName, String dateInput) {
        super(nationality, authorName, dateInput);
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        ISBN = UUID.randomUUID();

    }


    //displays book information, including the author's information
    @Override
    public String toString() {
        return super.toString() + this.bookTitle + " " + this.publisher + " " + this.ISBN;
    }

    public UUID getISBN() {
        return ISBN;
    }

}
