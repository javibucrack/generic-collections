package org.iesfm.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Node<E extends Comparable<E>> {
    private E value;
    private Node<E> left;
    private Node<E> right;

    public Node(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void add(E newValue) {
        int compare = value.compareTo(newValue);
        if (compare > 0) {
            if (right == null) {
                right = new Node<E>(newValue);
            } else {
                right.add(value);
            }
        } else if (compare < 0) {
            if (left == null) {
                left = new Node<E>(newValue);
            } else {
                left.add(value);
            }
        }
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public List<E> asList() {
        List<E> list = new LinkedList<>();
        if (right != null) {
            list.addAll(right.asList());
        }

        list.add(value);

        if (left != null) {
            list.addAll(left.asList());
        }

        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value) && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }
}