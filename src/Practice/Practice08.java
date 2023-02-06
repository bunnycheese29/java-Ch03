package Practice;

import java.util.Scanner;

public class Practice08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 몇개?");
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int x = (int) (Math.random() * 100 + 1);
      System.out.print(x + " ");
      if (i % 10 == 0) {
        System.out.println();
      }
      scanner.close();
    }
  }
}
