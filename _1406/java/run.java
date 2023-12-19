package _1406.java;

public class run {

  public static void solution() {
    System.out.println("Hello, World!");
  }

  public static void main(String[] args) {
    long beforeTime = System.currentTimeMillis();
    solution();
    long afterTime = System.currentTimeMillis();
    long secDiffTime = (afterTime - beforeTime);
    System.out.println("Execute Time: " + secDiffTime + "ms");
  }
}
