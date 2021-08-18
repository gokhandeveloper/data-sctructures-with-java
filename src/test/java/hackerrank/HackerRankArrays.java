package hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HackerRankArrays {

    @Test
    public void rotateArrayTest() {
        List<Integer> integers= new ArrayList<>();
        integers.add(1);integers.add(2);integers.add(3);
        integers.add(4);integers.add(5);
        List<Integer> result = new ArrayList<>();

        integers.remove(0);
        integers.add(0,100);
        System.out.println(Arrays.asList(result));
        System.out.println(Arrays.asList(integers));




    }

    boolean compare(int a,int b){
        if(a==b)
        { return true;}
        return false;
    }

    boolean compare(String a,String b){

        if(a.equals(b)) {
            return true;
        }
        return false;
    }

    boolean compare(int[] a,int[] b){
        if(Arrays.equals(a, b))
            return true;

        return false;
    }

}
