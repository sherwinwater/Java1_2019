import java.util.Scanner;

public class Gcd {


  public static int gcdFind(int m, int n) {
    int x = 1;

    if (m % n == 0) {
      return n;
    } else {
      x++;
      return gcdFind(n, m % n);
      //      System.out.println(x);
    }
  }

  public static void main(String[] args) {
    String isContinue = "y";
    while (isContinue.equalsIgnoreCase("y")) {

      Scanner sc = new Scanner(System.in);
      System.out.println("enter 2 integers: ");
      int n = sc.nextInt();
      int m = sc.nextInt();
      int minMN = n > m ? m : n;
      int maxMN = n > m ? n : m;

      int i = 1;
      int j = 1;
      int gcd1 = 1;
      int gcd2 = 1;
      int k = 2;
      int i1 = 1;
      int i2 = 1;

      //method0
      while (k < n && k < m) {
        if (n % k == 0 && m % k == 0) {
          gcd1 = k;
        }
        k++;
      }
      System.out.printf("method 0 gcd1: %d, %d times%n", gcd1, k);

      //method 1
      for (i = 1; i <= minMN; i++) {
        //      System.out.println("i: " + i);
        if (n % i == 0 && m % i == 0) {
          i1 = i;
          gcd1 = i;
        }
      }
      System.out.printf("method 1 gcd1: %d, %d times%n", gcd1, i1);


      //method 2
      if (maxMN % minMN == 0) {
        //      System.out.println("i: " + i);
        gcd1 = n;
      } else {
        for (i = 1; i <= minMN / 2; i++) {
          //        System.out.println(i);
          if (n % i == 0 && m % i == 0) {
            i2 = i;
            gcd1 = i;
          }
        }
      }
      System.out.printf("method 2 gcd1: %d, %d times%n", gcd1, i2);

      //method 3
      if (maxMN % minMN == 0) {
        //      System.out.println("i: " + i);
        gcd1 = n;
        break;
      } else {
        for (i = minMN / 2; i >= 1; i--) {
          //        System.out.println(i);
          j++; // j = j + 1;
          if (n % i == 0 && m % i == 0) {
            gcd1 = i;
            break;
          }
        }
      }
      System.out.printf("method3 gcd1: %d, %d times%n", gcd1, j);


      //method4
      for (i = 1; i <= minMN / 2; i++) {
        //        System.out.println("i: " + i);
        if (minMN % i == 0) {
          int g = minMN / i;
          if (maxMN % g == 0) {
            gcd2 = g;
            break;
          }
        }
      }
      System.out.printf("method4 gcd2: %d, %d times%n", gcd2, i);

      //method5 Euclid
      System.out.printf("method5 gcd2: %d%n", gcdFind(m, n));

      //
      System.out.println("continue y/n?");
      isContinue = sc.next();
    }
  }
}
