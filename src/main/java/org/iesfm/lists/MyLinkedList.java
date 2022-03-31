package org.iesfm.lists;

public class MyLinkedList<E> {
    private MyNode<E> head;

    public MyLinkedList(MyNode<E> head) {
        this.head = head;
    }

    public MyLinkedList() {
        this.head = null;
    }

    /**
     * Añada el elemento al principio de la lista
     *
     * @param value
     */
    public void add(E value) {
        MyNode<E> nodo = new MyNode<>(value, head);
        head = nodo;
    }

    public int size() {
        // head --> null: size =0
        // head --> 1 --> null: size = 1
        // head --> 1 --> 3 --> null: size = 3
        MyNode<E> node = head;
        int size = 0;
        while (node != null) {
            size++;

            node = node.getSiguiente();
        }
        return size;
    }

    boolean contains(E value) {
        MyNode<E> node = head;

        while (node != null) {
            if (node.getValue().equals(value)) {
                return true;
            }

            node = node.getSiguiente();
        }
        return false;
    }

    public static <E> MyLinkedList<E> listOf(E... values) {
        MyLinkedList<E> lista = new MyLinkedList<>();
        for (E value : values) {
            lista.add(value);
        }
        return lista;
    }

    public MyNode<E> getHead() {
        return head;
    }

    public void setHead(MyNode<E> head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyLinkedList<?> lista = (MyLinkedList<?>) o;

        return getHead() != null ? getHead().equals(lista.getHead()) : lista.getHead() == null;
    }

    @Override
    public int hashCode() {
        return getHead() != null ? getHead().hashCode() : 0;
    }
}
