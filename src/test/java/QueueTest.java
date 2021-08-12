import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

    @Test
    public void quetest() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(100);
        q.add(200);
        q.add(300);
        //System.out.println(q.remove());
        reverse(q);
    }

    public void reverse(Queue<Integer> queue) {
        //add
        //remove
        //isempty
        //10,20,30
        //
        Stack<Integer> stack = new Stack();
        while(!queue.isEmpty()) {
            //remove 1 item from queue and add it to stack
            stack.push(queue.remove());
        }
        System.out.println("stack is" + stack);
        var popped =stack.pop();
        System.out.println("popoed" + popped);
//        while(!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//        System.out.println(queue);
    }

}
