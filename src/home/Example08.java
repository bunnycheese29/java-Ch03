package home;

import java.util.Scanner;

public class Example08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("나뉨수를 입력하시오.");
      int dividend = scanner.nextInt();
      System.out.println("나눗수를 입력하시오.");
      int divider = scanner.nextInt();
      try {
        System.out.println("몫은 " + dividend / divider + "입니다.");
        break;
      } catch (ArithmeticException e) {
        System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
      }
    }
    scanner.close();
  }
}
