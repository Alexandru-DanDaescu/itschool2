package session4.practice;

public class JavaStatements {

    public static void main(String[] args) {

        int currentYear = 2023;
        int birthDay = 1992;
        int age = currentYear - birthDay;
        System.out.println("Age is: "+ age);

        if (age >= 50){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        int number = 12;

        if(number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        }
        else System.out.println("Number is zero");

        printName();

        printDistinction();
    }
    public static void printName(){
        String name = "Ioana";
        String city = "Cluj";
        String sex = "f";
        int age = 20;

        if(city.equals("Cluj")){                      //Cognitive complexity
            if(sex.equals("f")){                      //
                if(age == 20){                        //
                    System.out.println(name);         //This is a major NO GO
                }
            }
        }
        if(city.equals("Cluj") || city.equals("Bucharest") && sex.equals("f4") || age == 200){
            System.out.println(name);
        }

    }

    public static void printDistinction(){
        int mark = 70;
        if(mark >= 40) System.out.println("Pass");
        else if (mark >= 85) System.out.println("Distinction");


    }

}
