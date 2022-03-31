package org.iesfm.set;

public class Main {

    public static void main(String[] args) {
        MyTreeSet<String> tree = new MyTreeSet();
        tree.add("Hola");
        tree.add("ZzZ");
        tree.add("Adiós");

        for (String v : tree) {
            System.out.println(v);
        }

        MyTreeSet<Integer> tree2 = new MyTreeSet<>();
        tree2.add(1);
        tree2.add(3);
        tree2.add(-5);
        tree2.add(8);
        tree2.add(0);
        for (Integer i : tree2) {
            System.out.println(i);
        }

        MyTreeSet<User> userMyTreeSet = new MyTreeSet<User>();
        userMyTreeSet.add(
                new User(
                        "12345678A",
                        "Javier",
                        "Peña"
                )
        );
        for (User user : userMyTreeSet) {
            System.out.println(user);
        }
    }
}