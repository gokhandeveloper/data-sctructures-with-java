package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer [] integers = new Integer[n];
        for (int i=0; i<n; i++) {
            System.out.println("enter a number");
            integers[i]=input.nextInt();
        }


        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.sum(integers));
    }

}
class Arithmetic {
    public Integer sum (Integer [] ints){
        Integer sum = 0;
        for(int i=0; i<ints.length; i++) {
            sum = sum+ints[i];
        }
        return sum;
    }
    public String sum (String[] strings) {
        String sum="";
        for(int i=0; i<strings.length; i++) {
            sum += strings[i];
        }
        return sum;
    }
}