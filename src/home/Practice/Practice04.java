package home.Practice;

import java.util.Scanner;

public class Practice04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s;
    char c;
    System.out.println("소문자 알파벳 하나를 입력하시오>>");
    s = scanner.next();
    c = s.charAt(0); //s의 첫번째 문자열 읽기

    for (int i = 0; i <= c - 'a'; i++) {
      for (char j = 'a'; j <= c - i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    scanner.close();
  }
}
