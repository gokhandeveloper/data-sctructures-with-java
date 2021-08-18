package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SelectionSort {

    @Test
     public void selectionSort() {

        int [] array = {8,2,4,1,3};
        int [] sorted = new int[5];

        for(int index=0; index<array.length; index++) {
            var foundMinNumber=index;
            for(int sort=index; sort<array.length; sort++)
                if(array[sort]<array[foundMinNumber])
                    foundMinNumber = sort;
            var temp = array[foundMinNumber];
            array[foundMinNumber]= array[index];
            array[index]=temp;
    }
       // System.out.println(foundMinNumber);
        System.out.println(Arrays.toString(array));


}

}
