public class ArrayQueue {

    private int[] items;
    public int rear;
    private int count;
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enque(int item) {
        if(count ==items.length)
            try {
                throw new QueueOverFlowException();
            } catch (QueueOverFlowException e) {
                e.printStackTrace();
            }

        items[rear++] =  item;
    }

    private class QueueOverFlowException extends Throwable {

    }
}
