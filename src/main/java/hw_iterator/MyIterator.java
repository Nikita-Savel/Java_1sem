package hw_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {

  public Node<T> currentNode;
  
  @SuppressWarnings("unchecked")
  public MyIterator(Object head) {
    this.currentNode = (Node<T>) head;
  }

  public class Node<T> {
    public T element;
    public Node<T> prev;
    public Node<T> next;

    public Node(T element, Node<T> prev, Node<T> next) {
      this.element = element;
      this.prev = prev;
      this.next = next;
    }
  }

  @Override
  public boolean hasNext() {
    return currentNode != null;
  }

  @Override
  public T next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }

    T value = currentNode.element;
    currentNode = currentNode.next;
    return value;
  }

  public boolean hasPrevious() {
    return currentNode != null && currentNode.prev != null;
  }

  public T previous() {
    if (!hasPrevious()) {
      throw new NoSuchElementException();
    }

    T value = currentNode.element;
    currentNode = currentNode.prev;
    return value;
  }
}
