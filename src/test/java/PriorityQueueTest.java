import org.junit.jupiter.api.Test;
public class PriorityQueueTest {

    @Test
    public void prqTest() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<1000000;i++) {
            if(i!=78){
                queue.insert(i);
            }

        }
        queue.insert(78);
//        queue.insert(4);
//        queue.insert(3);
//        queue.insert(5);
//        queue.insert(2);
        System.out.println(queue);
    }
}
