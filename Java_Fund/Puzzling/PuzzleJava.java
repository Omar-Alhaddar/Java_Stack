import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava{

    //Q1
    public static ArrayList<Integer> greaterthan10(int [] x){
        ArrayList<Integer> arrx = new ArrayList<Integer>();
        int sum = 0;
        for (int i=0 ; i<x.length ; i++){
            sum = sum+x[i];

            if (x[i]>10){
                arrx.add(x[i]);
            }
        }
        System.out.println("the sum of the array values is: "+ sum);
        System.out.println(arrx);
        return (arrx);

    }

    //Q2
    public static ArrayList<String> names(String [] x){
        ArrayList<String> shuffled = new ArrayList<String>();
        ArrayList<String> GreaterThan5 = new ArrayList<String>();
        for (int i=0 ; i<x.length ; i++){
            if (x[i].length() > 5 ){
                GreaterThan5.add(x[i]);
            }
            shuffled.add(x[i]);
        }
        Collections.shuffle(shuffled);
        System.out.println(shuffled);
        System.out.println(GreaterThan5);
        return GreaterThan5;

    }

    //Q3
    public static void alphabet(){
        ArrayList<Character> arr = new ArrayList<Character>();
        for (char i='A' ; i<= 'Z' ; i++){
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("Last letter of shuffled array: " + arr.get(25));
        char firstLetter = arr.get(0);
        System.out.println("First letter of shuffled array: " + firstLetter);
        if ("AEIOU".indexOf(firstLetter) >= 0) System.out.println("First letter is a vowel.");
    }

    //Q4
    public static int[] randomNums() {
        int[] newArr = new int[10];
        Random r = new Random();
        for (int i = 0; i < newArr.length; i++) {
          newArr[i] = r.nextInt(100-55) + 55;
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
      }

    //Q5
    public static void randomNumsSorted() {
        int[] newArr = randomNums();
        ArrayList<Integer> newArrList = new ArrayList<Integer>();
        for (int i = 0; i < newArr.length; i++) {
            newArrList.add(newArr[i]);
        }
        Collections.sort(newArrList);
        System.out.println(newArrList);
        System.out.println("Minimum value: " + newArrList.get(0));
        System.out.println("Maximum value: " + newArrList.get(9));
      }

      //Q6
      public static String randomString() {
        ArrayList<Character> newArr = new ArrayList<Character>();
        String newString = "";
        for (char letter = 'A'; letter <= 'Z'; letter++) {
          newArr.add(letter);
        }
        Collections.shuffle(newArr);
        for (int i = 0; i < 5; i++) {
          newString += newArr.get(i);
        }
        return newString;
      }

    //Q6
    public static void arrayOfRandomStrings() {
        String[] newArr = new String[10];
        for (int i = 0; i < 10; i++) {
          newArr[i] = randomString();
        }
        System.out.println(Arrays.toString(newArr));
      }


    public static void main(String[] args) {
        int[] arr1 ={3,5,1,2,7,9,8,13,25,32};
        greaterthan10(arr1);

        String[] arr2 ={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        names(arr2);

        alphabet();

        randomNums();

        randomNumsSorted();

        System.out.println("Random String: " + randomString());

        arrayOfRandomStrings();
        
    }
}