package sort;

import org.junit.jupiter.api.Test;

public class QuickSort {
    @Test
    public void quickSortUsingPivotIsTheLastElementTest() {

        int [] array= {15,6,3,1,22,10,13};
       var indexOfThePivotAfterItIsMoved = partitionPosition(array);

    }

    private int partitionPosition(int[] array) {
        var pivot= array[array.length-1];
        var boundary = -1;
        for(var index = 0; index< array.length; index++) {
            if(array[index] <=pivot) {
                boundary++;
                int memory1 =  array[index];
                array[index]= array[boundary];
                array[index]=memory1;
            }
        }
        return boundary;
    }

}
