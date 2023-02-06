public class ForEach {

  public static void main(String[] args) {
    int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + "\t");
    }
    //for each문
    for (int item : num) {
      System.out.print(item + "\t");
    }
    String fruits[] = { "berry", "apple", "melon", "orange" };
    for (String item : fruits) {
      System.out.print(item + "\t");
    }
  }
}
