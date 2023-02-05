package home.Practice;

import java.util.Scanner;

public class Practice08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수 몇 개?");
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int x = (int) (Math.random() * 100 + 1);
      System.out.print(x + " ");
      if (i % 10 == 0) {
        System.out.println();
      }
    }
  }
}
