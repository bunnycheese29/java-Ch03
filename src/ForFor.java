public class ForFor {

  public static void main(String[] args) {
    //continue, break
    for (int i = 2; i < 10; i++) {
      //(i==3) continue: 3단만 건너뛰기 (i==3) break: 2단에서 멈춤) / (i % 2 == 0) 쓰면 홀수 (i % 3 == 0) 쓰면 짝수
      if (i == 3) break;
      for (int j = 1; j < 10; j++) {
        System.out.print(i + "x" + j + "=" + (i * j));
        System.out.print('\t');
      }
      System.out.println();
    }
  }
}
