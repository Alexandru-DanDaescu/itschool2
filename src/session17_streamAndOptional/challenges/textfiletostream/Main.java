package session17_streamAndOptional.challenges.textfiletostream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) throws IOException {

        File textFile = new File("src/session17/challenges/textfiletostream/resources/streamtesting.txt");

        List<String> words = Files.readAllLines(Path.of(textFile.getPath()));


        Optional<String> findLongest = words.stream()
                        .flatMap(word -> Stream.of(word.split("\\s+")))
                                .max(Comparator.comparingInt(String::length));


        System.out.println(findLongest.get());

    }
}
