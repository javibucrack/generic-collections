package org.iesfm.lists;

public class Lista<E> {
    private Nodo<E> head;

    public Lista(Nodo<E> head) {
        this.head = head;
    }

    public Lista() {
        this.head = null;
    }

    /**
     * Añada el elemento al principio de la lista
     * @param value
     */
    public void add(E value) {
        Nodo<E> nodo = new Nodo<>(value, head);
        head = nodo;
    }

    public Nodo<E> getHead() {
        return head;
    }

    public void setHead(Nodo<E> head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lista<?> lista = (Lista<?>) o;

        return getHead() != null ? getHead().equals(lista.getHead()) : lista.getHead() == null;
    }

    @Override
    public int hashCode() {
        return getHead() != null ? getHead().hashCode() : 0;
    }
}
