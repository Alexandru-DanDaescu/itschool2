package session16_lambda.challenges.createnewlist;

import java.util.List;

@FunctionalInterface
public interface CreateList {


    List<Integer> createNewListFromAnotherList(List<Integer> integerList, IntInput intInput);


}
