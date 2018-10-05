package com.opensource.dada.dsa.linked.list;


public class SinglyLinkedList<T> {
    public static void main(String[] args) {
        System.out.println("Hello " + SinglyLinkedList.class.getSimpleName());

        SinglyLinkedList<Integer> linkedListInt = new SinglyLinkedList<>();
        linkedListInt.add(1).add(2).add(4).add(5).add(3);
        linkedListInt.traverse();
        linkedListInt.addFirst(0);
        linkedListInt.traverse();
        linkedListInt.deleteLast().deleteLast();
        linkedListInt.traverse();
        linkedListInt.deleteFirst().deleteFirst();
        linkedListInt.traverse();
    }

    private Node<T> head;

    public SinglyLinkedList addFirst(T value) {
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node<T> temp = head;
            head = new Node<>(temp, value);
        }
        return this;
    }

    public SinglyLinkedList addLast(T value) {
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<T>(value));
        }
        return this;
    }

    public SinglyLinkedList add(T value) {
        return addLast(value);
    }

    public SinglyLinkedList deleteFirst() {
        if (head == null || head.getNext()==null) {
            head = null;
            return this;
        } else {
            Node<T> temp = head.getNext();
            head = temp;
        }
        return this;
    }

    public SinglyLinkedList deleteLast() {
        if (head == null || head.getNext()==null) {
            head = null;
            return this;
        } else {
            Node<T> temp = head;
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
        }
        return this;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node<T> temp = head;
        StringBuilder traverseBuilder = new StringBuilder(temp.toString());
        while (temp.getNext() != null) {
            temp = temp.getNext();
            traverseBuilder.append("->");
            traverseBuilder.append(temp.toString());
        }

        System.out.println(traverseBuilder.toString());
    }

}
