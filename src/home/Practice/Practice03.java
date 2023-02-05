package home.Practice;

import java.util.Scanner;

public class Practice03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수를 입력하시오 >>");
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
      scanner.close();
    }
  }
}
