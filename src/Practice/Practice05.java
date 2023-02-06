package Practice;

import java.util.Scanner;

public class Practice05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("양의 정수 10개를 입력하시오>>");
    int num[] = new int[10];
    for (int i = 0; i < num.length; i++) {
      num[i] = scanner.nextInt();
      if (num[i] % 3 == 0) {
        System.out.println("3의 배수는 " + num[i]);
      }
      scanner.close();
    }
  }
}
