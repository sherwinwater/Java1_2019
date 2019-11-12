public class PerfectNumber {
  public static void main(String[] args) {

    int i, j;
    int number = 10000;
    int x = 0;
    // perfect number

    for (i = 1; i <= number; i++) {
      x = 0;
      for (j = 1; j <= i / 2; j++) {
        if (i % j == 0) x = x + j;
      }
    if (x == i) System.out.println(x);
  }
  }
}
