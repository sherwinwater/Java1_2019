import java.util.Scanner;

public class Switch3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String isContinue = "y";
    while (isContinue.equalsIgnoreCase("y")) {

      System.out.println("enter month");
      int month = sc.nextInt();
      switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          System.out.println("31");
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          System.out.println("30");
          break;
        case 2: {
          System.out.println("enter year");
          int year = sc.nextInt();
          switch (year % 4) {
            case 0:
              System.out.println("28");
              break;
            default: System.out.println("29");
          }
        }
        break;
      }
      System.out.println("continue y/n?");
      isContinue = sc.next();
    }
  }
}
