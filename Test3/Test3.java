package Test3;
public class Test3 {
  public static void main(String[] args) {
    Pair<Integer> myPair = new Pair<>(15, 2);
    System.out.println(myPair.getLeft());
    System.out.println(myPair.getRight());
    System.out.println(myPair.min());
    System.out.println(myPair.max());
  }
}