import java.lang.*;

public class Pythagorean{
    public static double calculateHypotenuse(int legA, int legB) {
        return Math.sqrt(Math.pow(legA,2)+Math.pow(legB,2));
    }
    
    public static void main(String[] args) {
        System.out.print(calculateHypotenuse(2,3));
    }

}


