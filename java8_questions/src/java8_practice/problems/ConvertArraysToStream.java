package java8_practice.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConvertArraysToStream {

    public void convertArraysTOStream(int[] ars) {
        IntStream stream = Arrays.stream(ars);
        System.out.println(stream);

    }
}
