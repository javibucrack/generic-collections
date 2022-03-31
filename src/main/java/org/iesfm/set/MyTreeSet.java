
package org.iesfm.set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyTreeSet<E extends Comparable<E>> implements Iterable<E> {
    private Node<E> head;

    public MyTreeSet() {
        head = null;
    }

    public void add(E value) {
        if (head == null) {
            head = new Node<E>(value);
        } else {
            head.add(value);
        }
    }


    @Override
    public Iterator<E> iterator() {
        List<E> list = head == null ? new LinkedList<>() : head.asList();
        return list.iterator();
    }
}