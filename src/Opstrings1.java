/**
 * Created by Julian on 23/06/2017.
 */

import java.util.Arrays;

public class Opstrings1 {

    public static String rot(String strng) {

        String rot = new StringBuilder(strng).reverse().toString();

        return rot;
    }

    public static String selfieAndRot(String strng) {
        // your code

        StringBuilder selfieAndRotBuilder = new StringBuilder();

        String[] selfieSplit = strng.split("\n");

        char[] ellipsisArray = new char[selfieSplit[0].length()];
        Arrays.fill(ellipsisArray, '.');
        String ellipsis = new String(ellipsisArray) + "\n";

        for (String split : selfieSplit) {
            selfieAndRotBuilder.append(split).append(ellipsis);
        }

        String selfie = selfieAndRotBuilder.toString();

        String rot = rot(selfie);

        return selfie + rot.substring(1);
    }

    public static String oper(Fct operator, String s) {
        // your code and complete ... before operator
        return operator.fct(s);
    }

    public interface Fct {

        public String fct (String strng);

    }
}
