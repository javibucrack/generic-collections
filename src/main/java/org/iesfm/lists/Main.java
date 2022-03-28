package org.iesfm.lists;

public class Main {

    public static void main(String[] args) {
        // head -> null
        Lista<Integer> l1 = new Lista<>();
        // head -> 1 -> null
        l1.add(1);
        // head -> 2 -> 1 -> null
        l1.add(2);

        // head -> null
        Lista<String> l2 = new Lista<>();
        // head -> hola -> null
        l2.add("hola");
        // head -> Adios -> hola -> null
        l2.add("Adios");
    }

    public static <E> Lista<E> crearLista(E s1, E s2) {
        Lista<E> lista = new Lista<>();
        lista.add(s1);
        lista.add(s2);
        return lista;
    }
}
