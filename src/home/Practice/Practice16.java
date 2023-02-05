package home.Practice;

import java.util.Scanner;

public class Practice16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
    String str[] = { "가위", "바위", "보" };
    while (true) {
      int n = (int) (Math.random() * 3); //n은 0,1,2중에서 랜덤하게 결정
      System.out.println("가위 바위 보!>>");
      String item = scanner.next();
      if (item.equals("그만")) {
        System.out.println("게임을 종료합니다.");
        break;
      }
      if (str[n].equals(item)) {
        System.out.println(
          "컴퓨터 = " + str[n] + " 사용자 = " + item + ", 비겼습니다."
        );
      } else {
        if (str[n].equals("바위")) {
          if (item.equals("보")) {
            System.out.println(
              "컴퓨터 = " + str[n] + " 사용자 = " + item + ", 이겼습니다."
            );
          } else {
            System.out.println(
              "컴퓨터 = " + str[n] + "사용자 = " + item + ", 졌습니다."
            );
          }
        }
        if (str[n].equals("가위")) {
          if (item.equals("바위")) {
            System.out.println(
              "컴퓨터 = " + str[n] + " 사용자 = " + item + ", 이겼습니다."
            );
          } else {
            System.out.println(
              "컴퓨터 = " + str[n] + " 사용자 = " + item + ", 졌습니다."
            );
          }
        }
        if (str[n].equals("보")) {
          if (item.equals("가위")) {
            System.out.println(
              "컴퓨터 = " + str[n] + " 사용자 = " + item + ", 이겼습니다."
            );
          } else {
            System.out.println(
              "컴퓨터 = " + str[n] + " 사용자 = " + item + ", 졌습니다."
            );
          }
        }
      }
    }
  }
}
