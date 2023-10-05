package session16_lambda.challenges.findobject;

import java.util.List;
@FunctionalInterface
public interface ListObjectFinder<T> {

    boolean findObjectInList(List<T> list, T item);

}
