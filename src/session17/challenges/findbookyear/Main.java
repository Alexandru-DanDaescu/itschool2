package session17.challenges.findbookyear;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book("Author1","Some book",2010),
                new Book("Author2","Another one",2015),
                new Book("Author3","Test",2020),
                new Book("Author4","Help",1990),
                new Book("Author5","Aversion",1994)
        );

        System.out.println(getYearOfBook(bookList, 2000));


    }

    private static Map<String, List<String>> getYearOfBook(List<Book> input, int inputYear){
        return input.stream()
                .filter(year -> year.getYear() >= inputYear)
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getTitle, Collectors.toList())));
    }

}
