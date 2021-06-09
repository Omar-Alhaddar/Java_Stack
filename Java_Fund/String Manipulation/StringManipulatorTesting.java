public class StringManipulatorTesting{

    public static void main(String[] args) {

        // first 
        StringManipulator km = new StringManipulator(); 
       System.out.println(km.trimAndConcat("    Hello     ","     World    "));

       // second 
       char x= 'o';
       System.out.println(km.getIndexOrNull("Coding", x));
       System.out.println(km.getIndexOrNull("Hello World", x));
       System.out.println(km.getIndexOrNull("Hi", x));
       

       //third
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";

        System.out.println(km.getIndexOrNull(word, subString));
        System.out.println(km.getIndexOrNull(word, notSubString));

        //fourth
        System.out.println(km.concatSubstring("Hello", 1, 2, "world"));

  }
    
}