import java.util.*;
public class LinkedListQueue {
    private Node frontNode, rearNode;
    private int queueSize; // queue size  

    //linked list node  
    private class Node {
        int data;
        Node next;
    }

    //default constructor - initially front & rear are null; size=0; queue is empty  
    public LinkedListQueue() {
        frontNode = null;
        rearNode = null;
        queueSize = 0;
    }

    //check if the queue is empty  
    public boolean isEmpty() {
        return (queueSize == 0);
    }

    //Remove the item from the front of the queue.  
    public int dequeue() throws IllegalStateException {
        if (isEmpty()) throw new IllegalArgumentException("Queue is Empty");
        int data = frontNode.data;
        frontNode = frontNode.next;
        if (isEmpty()) {
            rearNode = null;
        }
        queueSize--;
        return data;
    }
    public int first() throws IllegalStateException {
        if (isEmpty()) throw new IllegalArgumentException("Queue is Empty");
        return frontNode.data;
    }
    public int size() {
        return queueSize;
    }

    //Add data at the rear of the queue.  
    public void enqueue(int data) {
        Node oldRear = rearNode;
        rearNode = new Node();
        rearNode.data = data;
        rearNode.next = null;
        if (isEmpty()) {
            frontNode = rearNode;
        } else {
            oldRear.next = rearNode;
        }
        queueSize++;
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(18);
        System.out.println("Element at front :  " + queue.first());
        System.out.println("Element removed from front : " + queue.dequeue());
        System.out.println("Queue is Empty : " + queue.isEmpty());
        queue.enqueue(79);
        queue.enqueue(90);
        System.out.println("Size of the queue : " + queue.size());
        System.out.println("Element removed from front end : " + queue.dequeue());
    }
}              
//Output
Element at front :  18
Element removed from front : 18
Queue is Empty : true
Size of the queue : 2
Element removed from front end : 79
