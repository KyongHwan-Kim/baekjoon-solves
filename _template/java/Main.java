/*
 * 제출시 패키지 삭제
 */
package _template.java;

/*******제출 코드******/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {

  public static void solution(String input) {
    System.out.println("Hello, World!");
  }

  /*
   * main class 제출
   */
  public static void main(String[] args) {
    long beforeTime = System.currentTimeMillis();
    solution();
    long afterTime = System.currentTimeMillis();
    long secDiffTime = (afterTime - beforeTime);
    System.out.println("Execute Time: " + secDiffTime + "ms");
    test();
  }

  public static void test() {
    try {
      File dict = new File("../example");
      String tests[] = dict.list();
      for (String test : tests) {
        System.out.println("Excute Test : " + test);
        Reader input = new FileReader("../example/" + test + "/input.txt");
        BufferedReader br = new BufferedReader(input);
        String line = "";
        while ((line = br.readLine()) != null) {
          System.out.println(line);
        }
        br.close();
      }
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Fail to Test Code");
    }
  }
}
