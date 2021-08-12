import org.junit.jupiter.api.Test;
public class PriorityQueueTest {

    @Test
    public void prqTest() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.insert(1);
        queue.insert(4);
        queue.insert(3);
        queue.insert(5);
        queue.insert(2);
        System.out.println(queue);
    }
}
