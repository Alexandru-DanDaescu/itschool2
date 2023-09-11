package session13.challenges.librarymanagementsystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Library {


    private List<Book> bookList;

    private List<Member> memberList;

    public Library() {
        bookList = new ArrayList<>();
        memberList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    //adds book to library
    public void addBook(Book book) {
        bookList.add(book);
    }

    //removes book from library
    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void displayAllBooks() {
        System.out.println(bookList.toString());
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    //adds member to library
    public void addMember(Member member) {
        memberList.add(member);
    }

    //removes member from library
    public void removeMember(Member member) {
        memberList.remove(member);
    }

    public void searchBookByISBN(Book book) {
        System.out.println(book.getISBN());
    }

    public void searchMemberByName(Member member) {
        System.out.println(member.getName());
    }

}
