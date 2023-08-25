package session9.practice.bookmanagementsystem;

public class BookManagementSystem {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter",200.33f);
        book1.printBookInfo();

        Book book2 = new Book();

        book2.setTitle("Animal Farm");
        book2.setPrice(300f);
        book2.printBookInfo();


    }
}
