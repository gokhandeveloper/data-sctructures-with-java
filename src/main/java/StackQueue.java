import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    private static Stack<Integer> stack= new Stack<>();
    private static Stack<Integer> memoryStack = new Stack<>();

    //qu: 10,20,30 adding 40, 50
    //remove
    // 20,30,40,50

    //stack: 10,20,30,40,50
    // stack pop
    //10,20,30,40

    public static void enque(int item) {
        stack.push(item);
    }
    public static void deque() {
        Stack<Integer> memoryStack = (Stack<Integer>) stack.clone();
        int lastPopped =0;
        System.out.println(memoryStack);
        while(!stack.isEmpty()) {
            lastPopped = stack.pop();
        }
        System.out.println("lastpoped" + lastPopped);
        System.out.println(memoryStack);
        for(Integer item : memoryStack) {
            if(item!=lastPopped) {
                stack.push(item);
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}
