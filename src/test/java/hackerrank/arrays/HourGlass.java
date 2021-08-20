package hackerrank.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourGlass {

    @Test
    public void nothing() {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();
        List<Integer> integers3 = new ArrayList<>();
        List<Integer> integers4 = new ArrayList<>();
        List<Integer> integers5 = new ArrayList<>();
        List<Integer> integers6 = new ArrayList<>();
        int a=0;
        while(a<6) {
            integers.add(a);
            integers2.add(a);

            integers3.add(a);
            integers4.add(a);
            integers5.add(a);
            integers6.add(a);
            a++;
        }
        integers2.remove(0);
        integers2.add(0,99);
        list.add(integers);
        list.add(integers2);
        list.add(integers3);
        list.add(integers4);
        list.add(integers5);
        list.add(integers6);

       // System.out.println(Arrays.asList(list));
      int hourGlass=0;
      int hourGlassJ = 0;

          for (int i = 0; i < 3; i++) { //this equals to the row in our matrix.
              for (int j = 2; j < 5; j++) { //this equals to the column in each row.
                  System.out.print(list.get(i).get(j) + " ");
                  hourGlassJ++;
              }
              System.out.println(); //change line on console as row comes to end in the matrix.
              hourGlass++;
          }

      }


}

