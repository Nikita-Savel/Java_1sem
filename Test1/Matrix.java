package Test1;

public interface Matrix<T> {
    void pop(int line, int column);
    T get(int line, int column);
    void set(int line, int column, T value);
    int getLine();
    int getColumn();
}