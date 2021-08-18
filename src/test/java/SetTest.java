import org.junit.jupiter.api.Test;

import java.util.*;

public class SetTest {

    @Test
    public void countTheNumberOfUniqePairsOfAGivenArray(){
        var array = new int[]{1, 2, 3};
        Set<Integer> uniqueValues =getUniqueValues(array);
        Map<Integer, Integer> map = new HashMap<>();
        var i=0;
        for(int value: uniqueValues) {
            map.put(i,value);
            i++;
        }


    }

    private Set<Integer> getUniqueValues(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(var i = 0; i< array.length; i++) {
            set.add(array[i]);
        }
        return set;
    }
}
