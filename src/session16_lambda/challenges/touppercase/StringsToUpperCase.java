package session16_lambda.challenges.touppercase;

import java.util.List;

@FunctionalInterface
public interface StringsToUpperCase {

    List<String> toUpperCase(List<String> stringList);

}
