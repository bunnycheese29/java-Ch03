package Practice;

public class Practice09 {

  public static void main(String[] args) {
    int n[][] = new int[4][4];
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n.length; j++) {
        n[i][j] = (int) (Math.random() * 10 + 1);
        System.out.print(n[i][j] + " ");
      }
      System.out.println();
    }
  }
}
