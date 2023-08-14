package session6.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";
        for(int i = 0;i < 10;i++){
            result += "a"; //not efficient
        }
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0;i < 10;i++){
            stringBuilder.append("a");
        }

        String result2 = stringBuilder.toString();
        System.out.println(result2);
        System.out.println(stringBuilder);

    }
}
