package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyHashSet<E> implements BaseSet<E> {

    private static final int DEFAULT_CAPACITY = 1 << 4;
    private static final int MAX_CAPACITY = 1 << 30;
    private static final float LOAD_FACTOR = 0.75f;

    private Node<E>[] table;
    private int size;
    private final float loadFactor; // коэффициент загрузки
    private int threshold; // максимальное количество элементов

    @SuppressWarnings("unchecked")
    public MyHashSet() { // конструктор
        this.table = new Node[DEFAULT_CAPACITY];
        this.size = 0;
        this.loadFactor = LOAD_FACTOR;
        this.threshold = (int) (DEFAULT_CAPACITY * LOAD_FACTOR);
    }

    private static int hash(Object key) { // вычисляет хэш-код
        return key.hashCode();
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = table.length * 2;
        if (newCapacity > MAX_CAPACITY) { // проверка корректности capacity
            newCapacity = MAX_CAPACITY;
        }
        threshold = (int) (newCapacity * loadFactor);
        Node<E>[] newTable = new Node[newCapacity];
        for (Node<E> node : table) {
            while (node != null) {
                Node<E> next = node.next;
                int index = getIndex(node.key, newTable.length);
                node.next = newTable[index];
                newTable[index] = node;
                node = next;
            }
        }
        table = newTable;
        
    }

    @Override
    public void add(E e) {
        if (contains(e)) {
            return;
        }
        if (size >= threshold) {
            resize();
        }
        int index = getIndex(e, table.length);
        Node<E> newNode = new Node<>(e.hashCode(), e, null);
        if (table[index] == null) { // если пусто по хэш-функции, то кидаем туда
            table[index] = newNode;
        } else { // если не пусто, то идём по связному списку
            Node<E> current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(Object o) {
        int index = getIndex(o, table.length);
        Node<E> current = table[index];
        if (current == null) {
            return;
        }
        if (current.key.equals(o)) {
            table[index] = current.next;
            size--;
            return;
        }
        Node<E> prev = current;
        current = current.next;
        while (current != null) {
            if (current.key.equals(o)) {
                prev.next = current.next;
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    @Override
    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        int index = getIndex(o, table.length);
        Node<E> current = table[index];
        while (current != null) {
            if (current.key.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyHashSet<?> current = (MyHashSet<?>) o;
        if (size != current.size) {
            return false;
        }
        for (Node<E> node : table) {
            while (node != null) {
                if (!current.contains(node.key)) {
                    return false;
                }
                node = node.next;
            }
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new HashSetIterator();
    }

    public class HashSetIterator implements Iterator<E> {

        public Node<E> currentNode;

        public HashSetIterator() {
            currentNode = null;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null && currentNode.next != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                E element = currentNode.key;
                currentNode = currentNode.next;
                return element;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder myStringBuilder = new StringBuilder();
        boolean first = true;
        for (Node<E> node : table) {
            while (node != null) {
                if (!first) {
                    myStringBuilder.append(", ");
                }
                myStringBuilder.append(node.key);
                first = false;
                node = node.next;
            }
        }
        return myStringBuilder.toString();
    }

    private int getIndex(Object o, int length) {
        int hashCode = 0;
        if (!(o == null)) {
            hashCode = hash(o);
        }
        return hashCode % length;
    }

    static class Node<T> {

        final int hash;
        final T key;
        Node<T> next;

        public Node(int hash, T key, Node<T> next) {
            this.hash = hash;
            this.key = key;
            this.next = next;
        }

        @Override 
        public boolean equals(Object o) { 
            if (this == o) { 
                return true; 
            } 
            if (o == null || getClass() != o.getClass()) { 
                return false; 
            } 
            Node<?> node = (Node<?>) o; 
            return hash == node.hash && Objects.equals(key, node.key) && Objects.equals(next, node.next); 
        }
 
        @Override 
        public int hashCode() { 
                return Objects.hash(hash, key, next); 
        } 
 
        @Override 
        public String toString() { 
            return "Node {" + 
                    "hash = " + hash + 
                    ", key = " + key + 
                    ", next = " + next + 
                    '}'; 
        }
    }
}