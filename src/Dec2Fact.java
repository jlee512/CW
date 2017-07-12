/**
 * Created by Julian on 11/07/2017.
 */

import java.util.*;

public class Dec2Fact {

    //Construct a hashmap representing the number system
    private static final HashMap<Character, Integer> numberSystem = new HashMap<>();
    static {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 36; i++) {

            if (i < 10) {
                numberSystem.put((char)(i + 48), i);
            }
            else {
                numberSystem.put((char)(i + 55), i);
            }

        }
    }

    public static String dec2FactString(long nb) {

        //0-9 are the normal decimal values, A-Z are values 10 through
        String factString = "";
        long division_result = nb;
        long modulo_result;
        char modulo_result_character;
        int divider = 1;

        while (division_result != 0) {

            modulo_result = division_result % divider;

            if(modulo_result < 10)
            {

                modulo_result_character = (char)(modulo_result + 48);

            }
            else
            {

                modulo_result_character = (char)(modulo_result + 55);

            }

            division_result = division_result / divider;
            factString = modulo_result_character + factString;
            divider++;

        }

        return factString;
    }
    public static long factString2Dec(String str) {

        //Construct array of multipliers
        int[] multiplier = new int[str.length()];


        for (int i = (multiplier.length - 1); i > -1; i--) {

            multiplier[multiplier.length - 1 - i] = numberSystem.get(str.charAt(i));

        }

        return multiply_factorials_recursive(multiplier, 0);
    }

    public static long multiply_factorials_recursive(int[] multiplier, int factorial) {

        //If factorial is at position 0, move further up the number sequence
        if (factorial == 0) {

                return (factorial + multiply_factorials_recursive(multiplier, (factorial + 1)));

        //Base case uf at tge end of the number sequence
        } else if (factorial == (multiplier.length - 1)) {

            return (factorial * multiplier[factorial]);

        //If number position is between the first a last digit
        } else {

            return (factorial * (multiplier[factorial] + multiply_factorials_recursive(multiplier, factorial + 1)));

        }
    }

    public static void main(String[] args) {

        System.out.println(factString2Dec("2DCAA5842344512200"));
        System.out.println(dec2FactString(1234567890));
        System.out.println(factString2Dec("14F9122694751231010"));
        System.out.println(dec2FactString(8150835199999999L));

    }
}
