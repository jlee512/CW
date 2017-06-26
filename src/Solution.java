/**
 * Created by Julian on 27/06/2017.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution{
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){

        //Get number of moves
        int num_moves = moves.length;

        //Initialise fighter selection list (to be filled with the relevant fighters names and converted back to a string array)
        List<String> fighter_selection = new ArrayList<>();

        //Get maximum fighters array dimensions
        int num_rows = fighters.length;
        int num_columns = fighters[0].length;

        //Initialise current position variable
            //current_position[0] -> row number (or, y coordinate)
            //current_position[1] -> column number (or, x coordinate)
        int[] current_position = position;

        for (int i = 0; i < num_moves; i++) {

            current_position = calculate_position_change(moves[i], current_position, num_columns, num_rows);

            String fighter_name = fighters[current_position[1]][current_position[0]];
            fighter_selection.add(fighter_name);

        }

        return fighter_selection.toArray(new String[0]);
    }

    private static int[] calculate_position_change(String move, int[] current_position, int max_x, int max_y) {

        int[] final_position = current_position;

        switch(move){

            case "up":
                //If attempt to move circular up, maintain default non-move coordinates
                if (final_position[1] != 0) {
                    final_position[1]--;
                }
                break;
            case "down":
                //If attempt to move circular down, maintain default non-move coordinates
                if (final_position[1] != (max_y - 1)) {
                    final_position[1]++;
                }
                break;
            case "right":
                //If attempt to move circular, adjust final_position correspondingly, otherwise process move right normally
                if (final_position[0] != (max_x -1)) {
                    final_position[0]++;
                } else {
                    final_position[0] = 0;
                }
                break;
            case "left":
                //If attempt to move circular, adjust final_position correspondingly, otherwise process move left normally
                if (final_position[0] != 0) {
                    final_position[0]--;
                } else {
                    final_position[0] = max_x - 1;
                }
                break;
        }

        return final_position;
    }

    public static void main(String[] args) {

        String[][] fighters = new String[2][6];
        fighters[0] = new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"};
        fighters[1] = new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"};
        int[] position = new int[]{0, 0};
        String[] moves = new String[]{"up", "left", "right", "left", "left"};

        String[] selection = streetFighterSelection(fighters, position, moves);

        for (int i = 0; i < selection.length; i++) {

            System.out.println(selection[i]);

        }


    }

}
