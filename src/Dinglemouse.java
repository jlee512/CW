/**
 * Created by Julian on 26/06/2017.
 */

import java.util.*;

public class Dinglemouse {

    public static int deadAntCount(final String ants) {

        //Initialise ant body count
        int f_ant_alities = 0;

        if (ants == null) {

            return f_ant_alities;

        }

        //Remove all live ants
        String ants_dead = ants.replaceAll(" ", ".");
        ants_dead = ants_dead.replaceAll("ant", "") + ".";

        HashMap<String, Integer> body_parts_map = new HashMap<>();

        String ant_body_part_finder = "";

        for (int i = 0; i < ants_dead.length(); i++) {

            if (ants_dead.charAt(i) == 'a' || ants_dead.charAt(i) == 'n' || ants_dead.charAt(i) == 't') {

                ant_body_part_finder += ants_dead.charAt(i);

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

        Integer number_of_a_parts = body_parts_map.get("a");
        Integer number_of_n_parts = body_parts_map.get("n");
        Integer number_of_t_parts = body_parts_map.get("t");

        if (number_of_a_parts == null) {

            number_of_a_parts = 0;

        }
        if (number_of_n_parts == null) {

            number_of_n_parts = 0;

        }
        if (number_of_t_parts == null) {

            number_of_t_parts = 0;

        }

        f_ant_alities = Math.max(number_of_a_parts,Math.max(number_of_n_parts, number_of_t_parts));

        return f_ant_alities;
    }
}
