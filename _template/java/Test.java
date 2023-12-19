package _template.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Test {

  public static void main(String[] args) {
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
        long beforeTime = System.currentTimeMillis();
        while ((line = br.readLine()) != null) {
          Main.logic(line);
        }
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("Execute Time: " + secDiffTime + "ms");
        br.close();
      }
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Fail to Test Code");
    }
  }
}
