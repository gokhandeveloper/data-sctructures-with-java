package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSort {

    @Test
    public void mergeSortTest() {

        int [] array= {7,5,9,0,10,1};
        mergeSort(array);

    }

    private void mergeSort(int[] array) {
        if(array.length<2)
            return;
        var middle= array.length/2;
        int [] left = new int [middle];
        for(var i=0; i< middle; i++) {
            left[i]= array[i];
        }
        int [] right = new int[array.length-middle];
        for(var i = middle; i< array.length; i++) {
            right[i-middle]= array[i];
        }
        mergeSort(left);
        mergeSort(right);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        merge(left,right,array);
        System.out.println(Arrays.toString(array));

    }
    private void merge(int[] leftArray, int[]rightArray, int[]mergedArray) {
        int leftIndex=0, rightIndex=0, mergedIndex=0;
        while(leftIndex< leftArray.length &&
                rightIndex< rightArray.length){
            if(leftArray[leftIndex]<=rightArray[rightIndex])
                mergedArray[mergedIndex++]=leftArray[leftIndex++];
            else
                mergedArray[mergedIndex++]= rightArray[rightIndex++];
        }
        while(leftIndex<leftArray.length)
            mergedArray[mergedIndex++] = leftArray[leftIndex++];
        while(rightIndex<rightArray.length)
            mergedArray[mergedIndex++]=rightArray[rightIndex++];
    }


}
