package Test2;

public class Tuple<T> {
    public T[] elements;
    public int len = 0;
    String firstMessage = ": Неподходящий index";
    String secondMessage = ": Кортеж уже заполнен";
    
    @SuppressWarnings("unchecked")
    public Tuple(int capacity) {
        this.elements = (T[]) new Object[capacity];

    }

    public T get(int index) {
        return elements[index];
    }

    public int getLen() {
        return len;
    }

    public void add(T el) {
        this.elements[len] = el;
        len++;
    }

    public void add(T el, int index) {
        if (this.elements[index] == null) {
            this.elements[len] = el;
            len++;
        } else {
            this.elements[index] = el;
        }
    }

    public void remove(int index) {
        for (int i = index + 1; i < len; i++) {
            elements[i - 1] = elements[i];
        }
        len--;
        elements[len] = null;
    }

    public void remove(T el) {
        for (int i = 0; i < len; i++) {
            if (elements[i].equals(el)) {
                remove(i);
                break;
            }
        }
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public T orElse(int i, T defaultValue) {
        if (i >= 0 && i < len) {
            return elements[i];
        } else {
            return defaultValue;
        }
    }
}