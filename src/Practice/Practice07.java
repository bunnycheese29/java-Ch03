package Practice;

public class Practice07 {

  public static void main(String[] args) {
    int num[] = new int[10];
    System.out.print("랜덤한 정수들 : ");
    for (int i = 0; i < num.length; i++) {
      int x = (int) (Math.random() * 10 + 1);
      num[i] = x;
    }
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
      sum += num[i];
    }
    System.out.println("평균 : " + (double) sum / 10);
  }
}
