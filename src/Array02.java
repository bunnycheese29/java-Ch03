public class Array02 {

  public static void main(String[] args) {
    int intArray[][] = new int[2][3];
    intArray[0][0] = 1;
    intArray[0][1] = 2;
    intArray[0][2] = 3;
    intArray[1][0] = 10;
    intArray[1][1] = 20;
    intArray[1][2] = 30;

    int intArray02[][] = { { 1, 2, 3 }, { 10, 20, 30 } };
    System.out.println(intArray02[1][2]);

    double score[][] = new double[4][2]; //4학년 2학기
    score[0][0] = 2.75;
    score[0][1] = 3.5;
    score[1][0] = 3.5;
    score[1][1] = 3.86;
    score[2][0] = 3.16;
    score[2][1] = 4.17;
    score[3][0] = 4.27;
    score[3][1] = 4.37;
    double score02[][] = {
      { 2.75, 3.5 },
      { 3.5, 3.86 },
      { 3.16, 4.17 },
      { 4.27, 4.37 },
    };
    double sum = 0;
    //score02.length (4), score02[year].length (2)
    for (int year = 0; year < score02.length; year++) {
      for (int term = 0; term < score02[year].length; term++) {
        sum += score[year][term];
      }
    }
    int n = score.length; //배열의 행 개수, 4
    int m = score[0].length; // 배열의 열 개수, 2
    System.out.println("4년 전체 평점 평균은 " + sum / (n * m));

    double score03[][] = new double[4][]; //4행 ?열
    score03[0] = new double[2]; //1행에 2열 추가
    score03[1] = new double[3]; //2행 3열
    score03[2] = new double[2]; //3행 2열
    score03[3] = new double[3]; //4행 3열
    score03[0][0] = 4.3;
    score03[0][1] = 3.3;
    score03[1][0] = 4.3;
    score03[1][1] = 3.6;
    score03[1][2] = 4.13;
    score03[2][0] = 4.23;
    score03[2][1] = 4.19;
    score03[3][0] = 4.21;
    score03[3][1] = 4.32;
    score03[3][2] = 4.5;
  }
}
