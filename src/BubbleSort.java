import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Julian on 28/07/2017.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] test1 = {1, 2, 3};
        int[] test2 = {3, 2, 1};

        BubbleSort.sort(test1);
        BubbleSort.sort(test2);

    }

    public static void sort(int[] a){

        int n = a.length;
        int num_swaps_total = 0;

        for(int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for(int j = 0; j < (n - 1); j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    num_swaps_total++;
                    numberOfSwaps++;

                }

            }

            if (numberOfSwaps == 0) {

                break;

            }

        }

        System.out.println("Sorted: " + Arrays.toString(a));
        System.out.println("Number of swaps : " + num_swaps_total);

    }

}
