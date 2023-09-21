package session16.challenges.genericitemfiltering;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface ListFilter<T> {

    List<T> filterItems(List<T> list, Predicate<T> predicate);


}
