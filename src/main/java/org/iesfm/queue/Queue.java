package org.iesfm.queue;

public class Queue {

    private Node head;
    private Node last;

    public Queue() {
        head = null;
    }

    public void enqueue(String value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public String dequeue() throws EmptyQueueException {
        if (head == null) {
            throw new EmptyQueueException();
        }
        String value = head.getValue();
        head = head.getNext();
        return value;
    }
}
