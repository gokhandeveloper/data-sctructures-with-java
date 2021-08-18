package hackerrank;

import org.junit.jupiter.api.Test;

import java.util.*;

public class HackerRank {


    @Test
    public void findOddTest() {
        int l=3;
        int r=9;
        System.out.println(Arrays.toString(findOdd(l, r).toArray()));
    }

    private List<Integer> findOdd(int l, int r) {
        List<Integer> oddNumbers= new ArrayList<>();
        for(int index=0; index<=r; index++){
           if(index>=l && index<=r) {
               if(index%2!=0) {
                   oddNumbers.add(index);
               }

            }
        }
        return oddNumbers;

    }

    @Test
    public void findNumberInAnAyrray() throws ExceededTheNumberOfElementsException {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);

        int elementToBeSearched = -1;
        System.out.println(findNumber(ints,elementToBeSearched));


    }
    @Test
    public void findPairTest() {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(10);
        arr.add(30);
        arr.add(50);
        arr.add(10);
        arr.add(20);

        //System.out.println(findNumberOfPairs(arr));
        System.out.println(hike("UDDDUDUDUU"));
    }


    private int hike(String string) {
        int seaLevel=0;
        int valley=0;
        char[] charArray = string.toCharArray();
        for(int index=0; index<charArray.length; index++) {
            if(String.valueOf(charArray[index]).equals("U")) {
                seaLevel++;
            }
            if(String.valueOf(charArray[index]).equals("D")) {
                seaLevel--;
            }
            if(seaLevel<0 && index-1>=0) {
                if(String.valueOf(charArray[index-1]).equals("U")&&
                String.valueOf(charArray[index]).equals("D")){
                    valley++;
                }
            }

        }
        return valley;

    }

    private int findNumberOfPairs(List<Integer> sockArr) {
        Map<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
        for (int j = 0; j < sockArr.size(); j++) {
            Integer count = mapCount.get(sockArr.get(j));
            if (count == null) {
                mapCount.put(sockArr.get(j), 1);
            } else {
                mapCount.put(sockArr.get(j), count + 1);
            }
        }
        int count = 0;
        for (Integer value : mapCount.values()) {
            count += (value / 2);
        }
        return count;
        //return returnCount(mapCount);

    }



    private static String findNumber(List<Integer> arr, int k) throws ExceededTheNumberOfElementsException {
        String found = "NO";
        if (arr.size() >= 10_000 || arr.size() <= 1)
            throw new ExceededTheNumberOfElementsException();
        for (int index = 0; index < arr.size(); index++) {
            if (arr.get(index) == k) {
                found = "YES";
            }
        }
        return found;
    }

    private static class ExceededTheNumberOfElementsException extends Throwable {
    }
}
