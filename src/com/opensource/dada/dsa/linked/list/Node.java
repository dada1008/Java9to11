package com.opensource.dada.dsa.linked.list;

public class Node<T> {
    private Node next;
    private T value;
    public Node(T value) {
        this.value = value;
    }
    public Node(Node node, T value) {
        this.next = node;
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}
