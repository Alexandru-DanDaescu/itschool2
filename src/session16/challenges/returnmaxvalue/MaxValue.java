package session16.challenges.returnmaxvalue;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface MaxValue {

    Optional maxValue(List<Integer> input);
}
