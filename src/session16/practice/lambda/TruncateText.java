package session16.practice.lambda;

@FunctionalInterface
public interface TruncateText {

    String truncate(String input, int maxLength);
}
