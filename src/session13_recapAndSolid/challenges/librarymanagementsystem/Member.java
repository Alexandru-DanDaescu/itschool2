package session13_recapAndSolid.challenges.librarymanagementsystem;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.UUID;

public class Member {

    private String name;

    private String address;

    private int phoneNumber;

    private UUID ID;

    private List<Object> addBook;


    public Member(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.ID = UUID.randomUUID();
    }

    public void addBooksToMember(Library library) {
        Scanner scanner = new Scanner(System.in);
        addBook = new ArrayList<>();
        System.out.println("Enter the amount of books that you want to add: ");
        int[] array = new int[library.getBookList().size()];
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            if (array.length > 0) {
                addBook.add(library.getBookList().get(i));
            } else {
                break;
            }
        }

    }


    //displays the books that the member of the library has
    public List<Object> displayMemberBooks() {
        return addBook;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public UUID getID() {
        return ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


}
