package org.iesfm.stack;

public class Main {

    public static void main(String[] args) throws EmptyStackException {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(5);
        stack1.push(2);
        stack1.push(-6);
        int v1 = stack1.pop();
        System.out.println(v1);


        Stack<String> stack2 = new Stack<>();
        stack2.push("Hola");
        stack2.push("Mundo");
        stack2.push("Adios");
        String v2 = stack2.pop();
        System.out.println(v2);
    }
}
