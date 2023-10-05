package session13_recapAndSolid.challenges.librarymanagementsystem;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("test", "some publisher", "Insert nationality", "Author", "1970-10-12");
        Book book2 = new Book("another test", "second publisher", "Insert another nationality", "Second author", "1980-05-11");
        Book book3 = new Book("again", "third publisher", "Another nationality", "Third Author", "1990-03-05");
        Book book4 = new Book("random", "fourth publisher", "Again another nationality", "Fourth Author", "1960-10-10");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayAllBooks();


        Member member1 = new Member("John", "Insert address here", 04012323);


        library.addMember(member1);

        member1.addBooksToMember(library);

        System.out.println(member1.displayMemberBooks());

        library.searchBookByISBN(book1);

        library.searchMemberByName(member1);


    }

}
