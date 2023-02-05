package home.Practice;

public class Practice01 {

  //0~100까지의 2의 배수의 합
  public static void main(String[] args) {
    int sum = 0, i = 0;
    while (i < 100) {
      sum = sum + i;
      i += 2;
    }
    System.out.println(sum);
  }

  public static void forTest(String[] args) {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
      System.out.println(sum);
    }
  }

  public static void doWhileTest(String[] args) {
    int sum = 0, i = 0;
    do {
      sum += i;
      i += 2;
    } while (i <= 100);
    System.out.println(sum);
  }
}
