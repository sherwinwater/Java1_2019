//
//5.11 Case Study: Displaying Prime Numbers
//        This section presents a program that displays the first fifty prime numbers
//        in five lines,
//        each containing ten numbers.
//        An integer greater than 1 is prime if its only positive divisor is 1 or itself.
//        For example, 2, 3,
//        5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.

public class PrimeNumber {
  public static void main(String[] args) {
    int i = 1;
    int j = 0;
    int x = 0;
    String s1 = "";
    String s2 = "";
    String s3 = "";
    String s4 = "";
    String s5 = "";

    System.out.println("method1");

    // one prime
    for (i = 1; i < 10000; i++) {
      boolean isPrime = true;

      for (j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        //        System.out.print(i+" ");
        x++;
        if (x <= 50) {
          if (x >= 1 && x <= 10) {
            s1 = s1 + i + " ";
          } else if (x >= 11 && x <= 20) {
            s2 = s2 + i + " ";
          } else if (x >= 21 && x <= 30) {
            s3 = s3 + i + " ";
          } else if (x >= 31 && x <= 40) {
            s4 = s4 + i + " ";
          } else if (x >= 41 && x <= 50) {
            s5 = s5 + i + " ";
          }
        } else break;
      }
    }

    //one line 10 numbers in five line
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);

    System.out.println("method2");

    // print 10 numbers per line for 50 numbers
    x = 0;
    for (i = 1; i < 10000; i++) {
      boolean isPrime = true;

      for (j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        x++;
        if (x <= 50) {
          if (x % 10 == 0) System.out.println(i + " ");
          else System.out.print(i + " ");
        } else break;
      }
    }

    //method3
    System.out.println("method3");
    //count
    i = 1;
    x = 0;
    while (x < 50) {
      //find prime
        boolean isPrime = true;

//        for (j = 2; j <= i /2 ; j++) {
//          if (i % j == 0) {
//            isPrime = false;
//            break;
//          }
//        }

      for (j = 2; j <= i /2 && isPrime; j++) {
        if (i % j == 0) {
          isPrime = false;
//          break;
        }
      }

        if (isPrime) {
          x++;
          if (x % 10 == 0) System.out.println(i + " ");
          else System.out.print(i + " ");
        }
        i++;
      }

    }
  }

