import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julian on 22/06/2017.
 */
public class Persist {

    public static int persistence(long n) {

        long num_temp = n;
        List<Long> digits;
        int persistence = 0;

        /*If 'n' is less than 10, persistence is zero*/
        if (n < 10) {

            return 0;

        }


                /*Persistence is calculated when the number of digits is 1*/

        digits = digitsToList(num_temp);

        while (digits.size() > 1) {
            persistence++;

            num_temp = digits.get(0);

            for (int i = 1; i < digits.size(); i++) {

                num_temp *= digits.get(i);

            }

            digits = digitsToList(num_temp);

        }

        return persistence;

    }

    private static List<Long> digitsToList(long num_temp) {

        List<Long> digits = new ArrayList<>();

    /*While the number had at least 2 digits, extract digits*/
        while (num_temp >= 10) {

            digits.add(num_temp % 10);

            num_temp /= 10;

        }

        digits.add(num_temp);

        return digits;
    }

}
