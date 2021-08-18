package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InsertionSort {

    @Test
    public void insertionSort() {
        int [] array= {7,5,9,0};
        for(var i=1; i<array.length; i++) {
            var current = array[i];
            var j = i-1;
            while(j>=0 && array[j]> current) {
                array[j+1]= array[j];
                j--;
            }
            array[j+1]=current;
        }
        System.out.println(Arrays.toString(array));
    }

}
