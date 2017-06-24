/**
 * Created by Julian on 23/06/2017.
 */

public class OpStrings1{

    public static String rot(String strng) {

        return strng;
    }

    public static String selfieAndRot(String strng) {
        // your code

        return strng + " world";
    }
    public static String oper(Fct operator, String s) {
        // your code and complete ... before operator
        return operator.fct(s);
    }

    public static void main(String[] args) {

        System.out.println(oper(OpStrings1::rot, "hello1"));

    }

    public interface Fct {

        public String fct (String strng);

    }

}
