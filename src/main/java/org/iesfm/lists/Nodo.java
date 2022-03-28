package org.iesfm.lists;

public class Nodo<E> {
    private E value;
    private Nodo<E> siguiente;

    public Nodo(E value, Nodo<E> siguiente) {
        this.value = value;
        this.siguiente = siguiente;
    }

    public void add(Nodo<E> nodo) {
        if(siguiente ==  null) {
            siguiente = nodo;
        } else {
            siguiente.add(nodo);
        }
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
}
