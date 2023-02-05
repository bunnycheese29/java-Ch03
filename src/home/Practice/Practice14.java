package home.Practice;

import java.util.Scanner;

public class Practice14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
    int score[] = { 95, 88, 76, 62, 55 };

    while (true) {
      System.out.print("과목 이름>>");
      String name = scanner.next();
      if (name.equals("그만")) break;
      int isFind = 0;
      for (int i = 0; i < course.length; i++) {
        if (course[i].equals(name)) {
          System.out.println(course[i] + "의 점수는 " + score[i]);
          isFind = 1;
          break;
        }
      }
      if (isFind == 0) {
        System.out.println("없는 과목입니다.");
      }
      scanner.close();
    }
  }
}
