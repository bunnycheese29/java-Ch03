/**
 * For
 */
public class For {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
      System.out.print(i);
      if (i < 10) {
        System.out.print("+");
      } else {
        System.out.print("=");
        System.out.print(sum);
      }
    }
    // System.out.println(sum);
  }
}
