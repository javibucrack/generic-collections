package org.iesfm.queue;

public class Queue<E> {

    private Node<E> head;
    private Node<E> last;

    public Queue() {
        head = null;
    }

    public void enqueue(E value) {
        Node<E> node = new Node<>(value, null);
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public E dequeue() throws EmptyQueueException {
        if (head == null) {
            throw new EmptyQueueException();
        }
        E value = head.getValue();
        head = head.getNext();
        return value;
    }
}
