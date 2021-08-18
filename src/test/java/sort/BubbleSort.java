package sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    public void bubleSortTest() {

        int [] array = {3};
        int attempts =0;
        while(attempts<array.length) {
            for(int index=0; index<array.length; index++) {
                if(index+1==array.length){
                    break;
                }
                System.out.println(index);
                if(array[index+1]<array[index]) {
                    int memory1 =  array[index];
                    int memory2= array[index+1];
                    array[index+1]=memory1;
                    array[index]=memory2;
                }
                System.out.println(Arrays.toString(array));


            }
            attempts++;
        }

      //  System.out.println(Arrays.toString(array));
    }


}
