import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LinkedListTest {

    @Test
    public void reverse() {
        var linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        System.out.println(linkedList.findValue(2));
//        linkedList.addFirst(20);
//        linkedList.addLast(30);
//        Assertions.assertEquals(linkedList, linkedList.reverse());

       // System.out.println(Arrays.toString(linkedList.toArray()));
    }


}
