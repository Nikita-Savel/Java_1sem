package Test3;
class Pair<T extends Comparable<T>> {
  public T left;
  public T right;

  public Pair(T left, T right) {
    this.left = left;
    this.right = right;
  }

  public T getLeft() {
    return left;
  }

  public void setLeft(T left) {
    this.left = left;
  }

  public T getRight() {
    return right;
  }

  public void setRight(T right) {
    this.right = right;
  }

  public T min() {
    if (check() > 0) {
      return right;
    } else {
      return left;
    }
  }

  public T max() {
    if (check() > 0) {
      return left;
    } else {
      return right;
    }
  }

  public int check() {
    return left.compareTo(right);
  }
}