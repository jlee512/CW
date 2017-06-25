/**
 * Created by Julian on 26/06/2017.
 */

import java.util.HashMap;

public class Dinglemouse {

    public static int deadAntCount(final String ants) {
        // Your code here

        String ants_dead = ants.replaceAll("ant","");

        HashMap<String, Integer> body_parts = new HashMap<>();

        String ant_body_part = "";

        for (int i = 0; i < ants_dead.length(); i++) {

            if (ants_dead.charAt(i) != '.') {

                ant_body_part += ants_dead.charAt(i);

            } else if (ant_body_part.length() > 0) {

                if (body_parts.containsKey(ant_body_part)) {
                    //If the body part is already contained within the hashmap, increment the integer count
                    body_parts.put()

                } else {
                    //If the body is not contained within the hashmap, create new entry


                }
                /*Reset body part extraction temp variable to blank string*/
                ant_body_part = "";

            }

        }

        return 0;
    }

    public static void main(String[] args) {

        deadAntCount("ant....ant...ant...nat....aantnt");

    }

}
