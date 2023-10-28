package Test3;

public class Test3 {

  public static void main(String[] args) {
    Pairss<Integer> myPair = new Pairss<>(1, 2);
    Integer name = myPair.getRight();
    System.out.println(name);
  }
}