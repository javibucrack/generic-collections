package org.iesfm.lists;

public class Main {

    public static void main(String[] args) {
        // head -> null
        MyLinkedList<Integer> l1 = new MyLinkedList<>();
        // head -> 1 -> null
        l1.add(1);
        // head -> 2 -> 1 -> null
        l1.add(2);

        // head -> null
        MyLinkedList<String> l2 = new MyLinkedList<>();
        // head -> hola -> null
        l2.add("hola");
        // head -> Adios -> hola -> null
        l2.add("Adios");
    }

    public static <E> MyLinkedList<E> crearLista(E s1, E s2) {
        MyLinkedList<E> lista = new MyLinkedList<>();
        lista.add(s1);
        lista.add(s2);
        return lista;
    }
}
