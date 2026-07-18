package java8_practice.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentRepeatingElementProblem {

    public int[] findTopKMostFrequentRepeatingElement(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) ->
                        b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
        }

        int frElm[] = new int[k + 1];
        for (int i = 0; i < k; i++) {
            frElm[i] = pq.poll().getKey();
        }

        return frElm;
    }

}



