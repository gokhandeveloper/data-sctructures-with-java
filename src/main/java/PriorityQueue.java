import java.util.Arrays;

public class PriorityQueue<I extends Number> {

    int array[] = new int[10];
    private int index=0;
    private int count;


    public void insert(int item) {
        upsizeTheArray();
        //1,3,4
        //array[index++]=item;
        int i;
        for(i=index-1; i>=0; i--){
            if(array[i] > item)
                array[i+1]=array[i];
            else
                break;
        }
        array[i+1] = item;
        index++;


    }

    private void upsizeTheArray() {
        if(array.length==index) {
            int [] newArray = new int[index *2];
            for(int i=0; i<index; i++) {
                newArray[i]= array[i];
            }
            array = newArray;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
