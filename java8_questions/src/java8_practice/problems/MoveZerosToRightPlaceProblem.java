package java8_practice.problems;

import java.util.Arrays;

public class MoveZerosToRightPlaceProblem {

    public static int[] moveZeroToRightPlace(int[] numbs) {
        int ind = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] != 0)
                numbs[ind++] = numbs[i];
        }
        while (ind < numbs.length) {
            numbs[ind++] = 0;
        }
        return numbs;
    }

    public static void main(String[] args) {
        int[] numbs = {0, 5, 0, 8, 6, 0, 1, 9};
        System.out.println(Arrays.toString(moveZeroToRightPlace(numbs)));
    }
}
