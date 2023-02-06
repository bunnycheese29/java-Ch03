import java.util.Scanner;

public class ArrayAccess {

  public static void main(String[] args) {
    int intArray[] = new int[5];
    System.out.println("양수 5개를 쓰세요.");
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    double sum = 0;
    for (int i = 0; i < 5; i++) {
      intArray[i] = scanner.nextInt();
      if (intArray[i] > max) {
        max = intArray[i];
      }
      sum += intArray[i];
    }
    System.out.println("가장 큰 수는 " + max);
    System.out.println("평균 값은 " + (double) sum / intArray.length);
    scanner.close();
  }
}
