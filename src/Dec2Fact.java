import java.util.*;

/**
 * Created by Julian on 11/07/2017.
 */


public class Dec2Fact {

    public static String dec2FactString(long nb) {

        //0-9 are the normal decimal values, A-Z are values 10 through


        return "";
    }
    public static long factString2Dec(String str) {

        //Construct a hashmap representing the number system
        HashMap<Character, Integer> numberSystem = new HashMap<>();

        for (int i = 0; i < 36; i++) {

            if (i < 10) {
                numberSystem.put((char)(i + 48), i);
            }
            else {
                numberSystem.put((char)(i + 65), i);
            }

        }

        //Queue the decimal multipliers
        int[] multiplier = new int[str.length()];


        for (int i = (str.length() - 1); i > -1; i--) {

            multiplier[str.length() - 1 - i] = numberSystem.get(str.charAt(i));

        }

        return multiply_factorials_recursive(multiplier, (str.length() - 1));
    }

    public static long multiply_factorials_recursive(int[] multiplier, int factorial)
    {

        if(multiplier.length == 1)
        {

            return 0;

        } else {

            return (multiplier[factorial] * factorial + multiply_factorials_recursive(multiplier, factorial--));

        }
    }

    public static void main(String[] args) {

        System.out.println("Test");

        System.out.println(factString2Dec("1212210"));

    }
}
