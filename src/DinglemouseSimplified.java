/**
 * Created by Julian on 26/06/2017.
 */
public class DinglemouseSimplified {

    public static int deadAntCount(final String ants) {

        int f_ant_alities = 0;

        if (ants != null) {

            String dead_ants = ants.replaceAll("ant|[^ant]", "");

            int number_of_body_parts_total = dead_ants.length();

            dead_ants = dead_ants.replaceAll("a", "");
            int number_of_a_parts = number_of_body_parts_total - dead_ants.length();

            dead_ants = dead_ants.replaceAll("n", "");
            int number_of_n_parts = number_of_body_parts_total - number_of_a_parts - dead_ants.length();
            int number_of_t_parts = number_of_body_parts_total - number_of_a_parts - number_of_n_parts;

            f_ant_alities = Math.max(number_of_a_parts, Math.max(number_of_n_parts, number_of_t_parts));

        }

        return f_ant_alities;
    }
}
