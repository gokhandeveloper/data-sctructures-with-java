public class LinkedList {
    private int reference=0;
    private Node firstNode = null;
    private Node nodeLast= null;

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public int findValue(int item){
        int index = 0;
        var current=  firstNode;

        for(index=0; current!=null; index++){
            if(current.value==item) return index;
            current = current.next;
        }
        return -1;

    }


    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty()) {
            firstNode = nodeLast = node;
        }
        else {
            node.next = firstNode;
            firstNode = node;

        }
    }

    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty()) {
            firstNode = nodeLast = node;
        }else {
            nodeLast.next=node;
            nodeLast = node;
        }
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public LinkedList reverse() {
        return new LinkedList();
    }
}
