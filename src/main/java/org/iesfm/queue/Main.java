package org.iesfm.queue;

public class Main {

    public static void main(String[] args) throws EmptyQueueException {
        Queue<Integer> queue1 = new Queue<>();
        queue1.enqueue(2);
        queue1.enqueue(-3);
        queue1.enqueue(12);
        queue1.enqueue(4);
        int v1 = queue1.dequeue();
        System.out.println(v1);

        Queue<String> queue2 = new Queue<>();
        queue2.enqueue("Hola");
        queue2.enqueue("Mundo");
        queue2.enqueue("Adios");
        queue2.enqueue("Bye");
        String v2 = queue2.dequeue();
        System.out.println(v2);

        Queue<Boolean> queue3 = new Queue<>();
        queue3.enqueue(true);
        queue3.enqueue(false);
        queue3.enqueue(false);
        queue3.enqueue(true);
        boolean v3 = queue3.dequeue();
        System.out.println(v3);

        Queue<Integer> queue4 = Queue.queueOf(1, 5, 2, 8, -1);
        int v4 = queue4.dequeue();
        System.out.println(v4);
    }
}
