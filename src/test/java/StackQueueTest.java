import org.junit.jupiter.api.Test;

public class StackQueueTest {

    @Test
    public  void stackQueueTest() {
        StackQueue stackQueue = new StackQueue();
        stackQueue.enque(1);
        stackQueue.enque(2);
        stackQueue.enque(3);
        stackQueue.deque();
        stackQueue.deque();
        stackQueue.enque(4);
        System.out.println(stackQueue);

    }

}
