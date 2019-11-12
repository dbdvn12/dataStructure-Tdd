package list;

import java.util.*;

public class MyLinkedList<String> implements List<String> {

    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(String data) {
        Node newNode = new Node<>(data, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(String data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = new Node<>(data, null, null);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private boolean equals(Object target, Object element) {
        if (target == null)
            return element == null;
        else return target.equals(element);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String string) {
        addLast(string);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node p = head;
        while (index > 0) {
            p = p.next;
            index--;
        }
        return (String) p.data;
    }

    @Override
    public String set(int index, String element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node p = head;
        while (index > 0) {
            p = p.next;
            index--;
        }
        p.data = element;
        return (String) p.data;
    }

    @Override
    public void add(int index, String element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node<String> p = head;
        while (index > 1) {
            p = p.next;
            index--;
        }
        p.next.next = p.next;
        p.next = new Node<>(element, p.next.next, p);
        size++;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int i=0;
        for (Node p = head; p != null; p = p.next,i++) {
            if(equals(o,p.data))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }

    private static class Node<String> {
        String data;
        Node<String> next;
        Node<String> prev;

        public Node(String data, Node<String> next, Node<String> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
