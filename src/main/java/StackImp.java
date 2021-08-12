import java.util.Arrays;

public class StackImp {

    public static int[] items = new int[5];
    private static int count;

    public static void push (int item) {
        if(count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }
    public static int pop () {
        if(count == 0)
            throw new IllegalStateException();
        return items[--count];
    }
    @Override
    public String toString() {
        return Arrays.toString(items);

    }
}
