/**
 * Created by Julian on 28/06/2017.
 */


public class Line {
    public static String WhoIsNext(String[] names, int n)
    {

        //Establish the initial length of the queue
        int num_names = names.length;

        //Establish the length of the queue at the nth drink
        int queue_length = num_names + (n - 1);

        int multiplier_of_length = n / num_names;

        String name = "";


        return name;
    }

    public static void main(String[] args) {

        int length = 5;

        for (int i = 0; i < 160; i++) {

            double divided = (double) (i / length);
            int num_repeats = 1;

            if (i > 0) {

                int log_test = (int) Math.ceil((Math.log((divided / 2) + 1) / Math.log(2)) + 1);
//                System.out.println(i + " power: " + log_test);

                num_repeats = (int) Math.pow(2, (log_test - 1));


            }

            System.out.println("repeats: " + num_repeats);

        }

    }

}
