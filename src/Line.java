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
        int x = 0;

        for (int i = 0; i < 100000; i++) {

            int divided = i / length;

            System.out.println(divided);

//            System.out.println(getX(divided));

        }

    }

    public static int getX(int divided) {

        int x;

        if (divided <= 1) {

            x = 1;

        } else if (divided <= 2) {

            x = 2;

        } else {

            x = 2 * (getX(divided - 2) + getX(divided - 1)) - 2 * (divided - 3);

        }

        return x;

    }

}
