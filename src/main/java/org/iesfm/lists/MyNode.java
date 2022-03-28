package org.iesfm.lists;

public class MyNode<E> {
    private E value;
    private MyNode<E> siguiente;

    public MyNode(E value, MyNode<E> siguiente) {
        this.value = value;
        this.siguiente = siguiente;
    }

    public void add(MyNode<E> nodo) {
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

    public MyNode<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MyNode<E> siguiente) {
        this.siguiente = siguiente;
    }
}
