import java.util.Arrays;

public class Array {
    int length;
    int index;
    private int[] array;

    public Array(int length) {
        this.length = length;
        array = new int[length];
    }
    public void changeLength() {

    }
    public void addItem(int item) {

        if(array.length==index) {
            int [] newArray = new int[index *2];
            for(int i=0; i<index; i++) {
                newArray[i]= array[i];
            }
            array = newArray;
        }
        array[index++]=item;

    }
    //0,1,2,3,4,5

    public Array intersect(int [] array1, int[] array2) {
        Array array = new Array(1);
        for(int i = 0; i<array1.length; i++) {
            int foundItem = array1[i];
            for(int j=0; j<array2.length; j++) {
                if(foundItem==array2[j]) {
                    array.addItem(foundItem);
                }
            }
        }
       return array;
    }

    public int maxValue() {
        int bigNumber=0;
        for(int i = 0; i<array.length; i++ ) {
            int foundNumber = array[i];
            for(int j = 0; j<array.length; j++ ){
                if(foundNumber>array[j]){
                    bigNumber =foundNumber;
                }
            }
        }

        return bigNumber;
    }

    public int indexOf(int item) {

        for(int i = 0; i<=array.length; i++ )
            if(array[i]==item)
                return i;
        return -1;
    }

    public Array reverseArray() {
        Array newArray = new Array(length);
        for(int i =array.length-1; i>=0; i-- ) {
            System.out.println("hi");
          //  for(int j =0; j<newArray.length; j++) {
                newArray.addItem(array[i]);
          //  }
        }
        return newArray;

    }

    public void insertAt(int item, int index) {
        array[index]=item;
    }

    public void removeItem(int passedIndex) {
        if(passedIndex<0 || passedIndex>=index)
            throw new IllegalArgumentException();
        for(int i = passedIndex; i<index; i++) {
            array[i]=array[i+1];
        }
        index--;
       // array[passedIndex]=0;
    }
    public String toString() {
        return Arrays.toString(array);
    }


}
