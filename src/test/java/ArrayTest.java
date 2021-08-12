import org.junit.jupiter.api.Test;
public class ArrayTest {

    @Test
    public void arrayTest () {
        Array array = new Array(3);
        array.addItem(1);
        array.addItem(2);
        array.addItem(3);
        array.addItem(4);
        array.addItem(5);
        array.addItem(6);
        array.addItem(7);
        array.insertAt(99,2);
        System.out.println(array.toString());
//        array.removeItem(6);
//        System.out.println(array.maxValue());
//        System.out.println(array);
//        int []items1 = {1,2,3};
//        int []items2 = {2};
//        System.out.println(array.intersect(items1,items2).toString());

    }
}
