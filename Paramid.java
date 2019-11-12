import java.util.Scanner;

public class Paramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number between 3 to 15: ");
    int number = sc.nextInt();
    int i, j;

    for (i = 1; i <= number; i++) {
      // get the digits of a number
//      if (number )
      for(j = 1; j <= number - i; j++){
        System.out.printf("%-4s", "");
      }
      for (j = i; j >= 1; j--) {
        if (i != 1) {
          System.out.printf("%-4d", j);
        } else break;
      }
      for (j = 2; j <= i-1; j++) {
        System.out.printf("%-4d", j);
      }
        System.out.printf("%-4d%n",i);
    }

  }
}