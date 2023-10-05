package session5_advancedFlowControl.practice;
import java.util.ArrayList;
import java.util.List;
public class FlowControl {

    public static void main(String[] args) {

       //printNumberWithWhile(10);
       //printNumberWithDoWhile(10);
       //printNumberWithFor(10);

        List<String> list = new ArrayList<>();
        list.add("Bucuresti");
        list.add("Timisioara");
        list.add("Cluj");
        printlistWithForEach(list);
    }

    //shift + f6 (refactor selected variable)
    public static void printNumberWithWhile(int input){
        int number = 1;
        while(number <= input){
            System.out.print(number+", ");
            number++;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;
        do{
            System.out.print(number+", ");
            number++;
            if (number == input){
                System.out.println(number);
            }
        }
        while (number < input);
    }

    public static void printNumberWithFor(int input){

        for(int i = 1 ;i<=input;i++){
            System.out.print(i+", ");
        }
    }

    public static void printlistWithForEach(List<String> list){
        int listSize = list.size();;
        int count = 0;
        for(String listValue : list){
            count++;
            if (count == listSize){
                System.out.print(listValue);
            }
            else{
                System.out.print(listValue + ", ");
            }

        }
    }

    public static void printListWithFor(List<String> list){
        for (int index = 0; index < list.size();index++){
          if(index == list.size() - 1){
              System.out.println(list.get(index));
          }
          else {
              System.out.print(list.get(index)+ ", ");
          }
        }
    }


}
