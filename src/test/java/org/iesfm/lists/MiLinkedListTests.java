package org.iesfm.lists;

import org.junit.Assert;
import org.junit.Test;

public class MiLinkedListTests {

    @Test
    public void addTest() {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("hola");

        Assert.assertEquals("hola", list.getHead().getValue());
    }

    @Test
    public void sizeTest() {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("hola");
        list.add("adios");

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void containsTest() {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("hola");
        list.add("adios");

        Assert.assertTrue(list.contains("adios"));
    }
    @Test
    public void notContainsTest() {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("hola");
        list.add("adios");

        Assert.assertFalse(list.contains("otro"));
    }
}
