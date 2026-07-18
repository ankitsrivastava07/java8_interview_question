package java8_practice.problems;

import java.util.ArrayDeque;
import java.util.Arrays;

public class PositiveNegativeNumberSeqProblem {

    public void convertArrayToPosAndNegNumberSeq(int[] arr) {

        ArrayDeque<Integer> pos = new ArrayDeque<>();
        ArrayDeque<Integer> neg = new ArrayDeque<>();

        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                neg.offer(arr[i]);

            else
                pos.offer(arr[i]);
        }

        while (!pos.isEmpty() && !neg.isEmpty()) {
            arr[ind++] = pos.poll();
            arr[ind++] = neg.poll();
        }

        while (!pos.isEmpty()) {
            arr[ind++] = pos.poll();
        }

        while (!neg.isEmpty()) {
            arr[ind++] = neg.poll();
        }

        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        PositiveNegativeNumberSeqProblem pos = new PositiveNegativeNumberSeqProblem();
        pos.convertArrayToPosAndNegNumberSeq(new int[]{1, 2, 3, 4, 5, -8, -9, 3});
    }
}
