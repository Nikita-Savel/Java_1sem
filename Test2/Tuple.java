package Test2;

public class Tuple<T> {
    public T[] elements;
    public int len = 0;
    
    @SuppressWarnings("unchecked")
    public Tuple(int capacity) {
        this.elements = (T[]) new Object[capacity];

    }

     public T get(int index) {
        return elements[index];
    }

    public void add(T el) {
        this.elements[len] = el;
        len++;
    }

    public void add(T el, int index) {
        if (this.elements[index] == null) {
            len++;
        }
        this.elements[index] = el;
    }

    public void remove(int index) {
        for (int i = index + 1; i < len; i++) {
            elements[i - 1] = elements[i];
        }
        len--;
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

    public void orElse(int i, T f) {
        
    }
}


/*Реализуйте класс Tuple - кортеж произвольной длины
обобщенных элементов (Если создан кортеж длины 5, то
работа с указанными пятью индексами должна быть доступна
и валидна, а вот с 6 и более уже нет, то есть кортеж - это
как список фиксированной длины). Должен быть предоставлен
конструктор Tuple(int capacity), задающий вместимость кортежа. 
Реализуйте методы get(int index) - получение по индексу, 
add(E el) и add(E el, int index) - в первом случае элемент 
добавляется на первую свободную позицию (перетирать существующие
значения нельзя), во втором добавляется по индексу - тут
перетирать значения можно, remove(int index) и remove(T el). 
Также должны быть методы isEmpty(), orElse(int i, T default). 
Предусмотрите и обработайте возможные исключения, которые могут 
возникнуть при работе с кортежем. */