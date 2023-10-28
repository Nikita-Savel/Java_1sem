package Test1;
public class GenMatrix<T> implements Matrix<T> {
  public T[][] matrix;
  public int line;
  public int column;

  @SuppressWarnings("unchecked") 
  public GenMatrix(int line, int column) {
    this.line = line;
    this.column = column;
    this.matrix = (T[][]) new Object[line][column];
  }

  @SuppressWarnings("unchecked") 
  public GenMatrix(Matrix<T> matrix) {
    this.line = matrix.getLine();
    this.column = matrix.getColumn();
    this.matrix = (T[][]) new Object[line][column];
    for (int i = 0; i < line; i++) {
      for (int j = 0; j < column; j++) {
        this.matrix[i][j] = matrix.get(i, j);
      }
    }
  }

  @Override
  public void pop(int line, int column) {
    this.matrix[line][column] = null;
  }

  @Override
  public T get(int line, int column) {
    return matrix[line][column];
  }

  @Override
  public void set(int line, int column, T value) {
    this.matrix[line][column] = value;
  }

  @Override
  public int getLine() {
    return line;
  }

  @Override
  public int getColumn() {
    return column;
  }
}