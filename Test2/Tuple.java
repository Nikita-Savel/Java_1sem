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
        try {
            return elements[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + firstMessage);
            return null;
        }
    }

    public int getLen() {
        return len;
    }

    public void add(T el) {
        try {
            this.elements[len] = el;
            len++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + secondMessage);
        }
    }

    public void add(T el, int index) {
        try {
            if (this.elements[index] == null) {
                this.elements[len] = el;
                len++;
            } else {
                this.elements[index] = el;
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println(e + firstMessage);
        }
    }

    public void remove(int index) {
        try {
            T tmp = elements[index];
            for (int i = index + 1; i < len; i++) {
                elements[i - 1] = elements[i];
            }
            len--;
            elements[len] = null;
            
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + firstMessage);
        }
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
        try {
            if (i >= 0 && i < len) {
                return elements[i];
            } else if (i < elements.length) {
                return defaultValue;
            } else {
                T tmp = elements[i];
                return defaultValue;
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println(e + firstMessage);
            return defaultValue;
        }
    }
}