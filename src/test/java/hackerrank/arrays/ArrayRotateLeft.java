package hackerrank.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRotateLeft {

    @Test
    public void rotateLeftTest() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);integers.add(2);integers.add(3);integers.add(4);integers.add(5);
        System.out.println(rotLeft(integers, 5));
    }

    private List<Integer> rotLeft(List<Integer> a, int d){
        Integer[] ints = a.stream().toArray(Integer[]::new);

        if(ints.length>=100_000 || d>=100_000) {
            throw new IllegalArgumentException();
        }
        int memory = 0;
        for (int j = 0; j < d; j++) {
            int index = ints.length - 1;
            memory = ints[0];
            if(memory>=1_000_000) {
                throw new IllegalArgumentException();
            }
            for (int x = 0; x < ints.length; x++) {

                if (x + 1 < ints.length) {
                    ints[x] = ints[x + 1];

                }

            }
            ints[index] = memory;

        }
        return Arrays.asList(ints);
    }
}
