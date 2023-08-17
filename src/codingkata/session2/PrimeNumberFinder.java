package codingkata.session2;

public class PrimeNumberFinder {
    public static void main(String[] args) {


//        for(int number = 2; number < 10000;number++){
//            long startTime = System.currentTimeMillis();
//            if(isPrime(number)){
//                long endTime = System.currentTimeMillis();
//                System.out.println(number+" " +(startTime - endTime));
//            }
//
//
//        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0){
                return false;
            }
        }

        return true;

    }

}
