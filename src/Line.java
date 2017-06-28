/**
 * Created by Julian on 28/06/2017.
 */


public class Line {
    public static String WhoIsNext(String[] names, int n)
    {

        //Initialise the nam_index variable
        int name_index = 0;

        //Adjust to base zero indices
        n = n - 1;

        //Establish the initial length of the queue
        int num_names = names.length;

        double multiples_of_num_names = (double) (n / num_names);
        int queue_cycle = 1;
        int max_num_of_individual = 1;

        //Calculate queue cycle (i.e. how many times have we been through the entire queue) and the maximum number of any given individual that exists
        if (n > 0) {

            queue_cycle = (int) Math.ceil((Math.log((multiples_of_num_names / 2) + 1) / Math.log(2)) + 1);


            max_num_of_individual = (int) Math.pow(2, (queue_cycle - 1));

        }

        //Calculate the:
        // offset: the number of drinks that have been bought from the vending machine up to the start of the current cycle, and;
        // current_cycle_n: the number of drinks that have been bought from the vending machine during the current cycle
        int offset = 0;

        if (queue_cycle > 1) {

            offset = num_names * (2 * ((int) Math.pow(2, queue_cycle - 2) - 1) + 1);

        }

        int current_cycle_n;

        //If there have been more than 1 cycle, apply the offset to calculate the number of drinks bought in this cycle.
        if (offset > 0) {

            current_cycle_n = n - offset;

            //If there has only been 1 cycle, no offset is applied to n.
        } else {

            current_cycle_n = n;

        }

        //Calculate the index of the individual buying the current drink

        name_index = current_cycle_n / max_num_of_individual;

        return names[name_index];
    }

    public static void main(String[] args) {

        int length = 5;

        for (int i = 0; i < 160; i++) {

            double divided = (double) (i / length);
            int queue_cycle = 1;
            int num_repeats = 1;

            if (i > 0) {

                queue_cycle = (int) Math.ceil((Math.log((divided / 2) + 1) / Math.log(2)) + 1);


                num_repeats = (int) Math.pow(2, (queue_cycle - 1));

            }

            System.out.println(i + " queue cycle: " + queue_cycle);
//            System.out.println("repeats: " + num_repeats);

            int offset = 0;

            if (queue_cycle > 1) {

                offset = length * (2 * ((int) Math.pow(2, queue_cycle - 2) - 1) + 1);

            }

//            System.out.println("offset: " + offset);
            int adjusted_n;

            if (offset > 0) {

                adjusted_n = i - offset;

            } else {

                adjusted_n = i;

            }

            System.out.println("adjusted: " + adjusted_n);

            int selection = adjusted_n / num_repeats;

            System.out.println("selection: " + selection);


        }

        System.out.println(WhoIsNext(new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" }, 2));

    }

}
