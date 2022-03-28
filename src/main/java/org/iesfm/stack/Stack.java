package org.iesfm.stack;

/**
 * Una pila es una estructura de datos lineal que sigue el orden LIFO (Last In First Out) en la inserción y extracción de elementos.​
 * <p>
 * LIFO significa que las operaciones óptimas (O(1)) para esta estructura de datos serán añadir y extraer de la parte superior de la pila, es decir, se sacará el último elemento que ha sido insertado (Last In First Out)​
 * <p>
 * La operación de insertar en la parte superior se llama push (apilar)​
 * <p>
 * La operación de extraer de la parte superior se llama pop (desapilar)
 */
public class Stack {
    private Node top;

    public Stack(Node top) {
        this.top = null;
    }

    /**
     * Extrae el valor de la parte superior de la pila y lo devuelve
     *
     * @return
     * @throws EmptyStackException
     */
    public int pop() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    /**
     * Añade el valor a la parte superior de la pila
     *
     * @param value
     */
    public void push(int value) {
        Node node = new Node(value, top);
        top = node;
    }
}
