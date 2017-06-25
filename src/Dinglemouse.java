/**
 * Created by Julian on 26/06/2017.
 */

import java.util.HashMap;
import java.util.Iterator;

public class Dinglemouse {

    public static int deadAntCount(final String ants) {

        //Initialise ant body count
        int f_ant_alities = 0;

        //Remove all live ants
        String ants_dead = ants.replaceAll("ant","");

        HashMap<String, Integer> body_parts_map = new HashMap<>();

        String ant_body_part_finder = "";

        for (int i = 0; i < ants_dead.length(); i++) {

            if (ants_dead.charAt(i) != '.') {

                ant_body_part_finder += ants_dead.charAt(i);

            } else if (ant_body_part_finder.length() > 0) {

                if (body_parts_map.containsKey(ant_body_part_finder)) {
                    //If the body part is already contained within the hashmap, increment the integer count
                    body_parts_map.put(ant_body_part_finder, body_parts_map.get(ant_body_part_finder) + 1);

                } else {
                    //If the body is not contained within the hashmap, create new entry
                    body_parts_map.put(ant_body_part_finder, 1);

                }
                /*Reset body part extraction temp variable to blank string*/
                ant_body_part_finder = "";

            }

        }

        Iterator<String> body_parts_found_iterator = body_parts_map.keySet().iterator();

        while(body_parts_found_iterator.hasNext()) {

            String body_part_found = body_parts_found_iterator.next();

            //If a full ant body is found, increment f_ant_alities count by 1 and decrement map value
            if (body_part_found.length() == 3) {

                int number_of_body_part = body_parts_map.get(body_part_found);

                //Decrement body part count
                if (number_of_body_part == 1) {

                    body_parts_found_iterator.remove();
                } else {

                    body_parts_map.put(body_part_found, number_of_body_part - 1);

                }

                //Increment f_ant_alities count
                f_ant_alities++;

            }

        }

        return f_ant_alities;
    }

    public static void main(String[] args) {

        System.out.println("Number of dead ants: 3");
        System.out.println(deadAntCount("ant..na..ant.t..ant.a..nat....ant"));

    }

}
