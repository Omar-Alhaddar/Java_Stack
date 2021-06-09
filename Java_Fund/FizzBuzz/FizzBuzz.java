public class FizzBuzz{

    public static String fizzBuzz(int number){

        if (number%5 ==0 && number%3 ==0){
            return ("FizzBuzz");
        }
        else if (number%5 ==0){

            return ("Buzz");

        }
        else if (number%3 ==0){

            return ("Fizz");
        }
        else {
            return Integer.toString(number);
        }

    }
    
    public static void main(String[] args) {
        System.out.println(fizzBuzz(17));
    }


}