package home.Practice;

public class Practice07 {

  public static void main(String[] args) {
    int n[] = new int[10];
    double sum = 0;
    System.out.print("랜덤한 정수들 : ");
    for (int i = 0; i < n.length; i++) {
      int x = (int) (Math.random() * 10 + 1);
      sum += x;
      System.out.print(x + " ");
    }
    System.out.println("\n평균은 " + sum / n.length);
  }
}
