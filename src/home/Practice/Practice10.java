package home.Practice;

public class Practice10 {

  public static void main(String[] args) {
    int n[][] = new int[4][4];
    int result = 0;
    while (result < 10) {
      int p1 = (int) (Math.random() * 4);
      int p2 = (int) (Math.random() * 4);
      if (n[p1][p2] == 0) {
        n[p1][p2] = (int) (Math.random() * 10 + 1);
        result++;
      }
    }
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n.length; j++) {
        System.out.print(n[i][j] + " ");
      }
      System.out.println();
    }
  }
}
