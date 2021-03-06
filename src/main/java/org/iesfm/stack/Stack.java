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
public class Stack<E> {
    private Node<E> top;

    public Stack() {
        top = null;
    }

    public Stack(Node<E> top) {
        this.top = null;
    }

    /**
     * Extrae el valor de la parte superior de la pila y lo devuelve
     *
     * @return
     * @throws EmptyStackException
     */
    public E pop() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        E value = top.getValue();
        top = top.getNext();
        return value;
    }

    /**
     * Añade el valor a la parte superior de la pila
     */
    public void push(E value) {
        Node<E> node = new Node<>(value, top);
        top = node;
    }

    @SafeVarargs
    public static <E> Stack<E> StackOf(E... values) {
        Stack<E> stack = new Stack<>();
        for (E value : values) {
            stack.push(value);
        }
        return stack;
    }
}