package home;

/**
 * star
 */
public class star {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int k = 1; k <= 10; k++) {
      for (int l = k; l <= 10; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
//j = 1 ; j <= i; j++ 는 별찍기 1~10
//j = i ; j <= 10 ; j++ 는 별찍기 10~1
