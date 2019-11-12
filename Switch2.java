import java.util.Scanner;

public class Switch2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //  For each of the below problems, use the best of if, switch, or ternary to solve the below:
    //
    //        1. Using switch statements, write a Java program to find the number of days in a month.
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
    //        2. Write a program to find the eligibility of admission based on the following criteria:

    //
    //        Marks in Maths >=65
    //        Marks in Phy >=55
    //        Marks in Chem>=50
    //        Total in all three subject >=180
    System.out.println("enter Math score:");
    int mathScore = sc.nextInt();
    System.out.println("enter Phy score:");
    int phyScore = sc.nextInt();
    System.out.println("enter Chem score:");
    int chemScore = sc.nextInt();

    if (mathScore >= 65 && phyScore >= 55 && chemScore >= 50 && (mathScore + phyScore + chemScore) >= 180) {
      System.out.println("eligible for admission");
    } else {
      System.out.println("not eligible for admission");
    }

    //
    //
    //        3. Write a program to read temperature in centigrade and display a suitable message
    //        according to temperature state below:
    //
    //        Temp < 0 then Freezing weather
    //        Temp 0-10 then Very Cold weather
    //        Temp 10-20 then Cold weather
    //        Temp 20-30 then Normal in Temp
    //        Temp 30-40 then Its Hot
    //        Temp >=40 then Its Very Hot

    System.out.println("enter centigrade temperature:");
    float temperature = sc.nextFloat();
    if (temperature >= 40) {
      System.out.println("Its very hot");
    } else if (temperature >= 30) {
      System.out.println("its hot");
    } else if (temperature >= 20) {
      System.out.println("normal in temp");
    } else if (temperature >= 10) {
      System.out.println("cold weather");
    } else if (temperature >= 0) {
      System.out.println("very cold weather");
    } else if (temperature < 0) {
      System.out.println("Freezing weather");
    }

   String output = temperature >= 40? "Its very hot":
            temperature >= 30? "its hot":
                    temperature >=20? "normal in temp":
                            temperature >=10? "cold weather":
                                    temperature >= 0? "very cold weather": "Freezing weather";
    System.out.println(output);




    //
    //        4. Write a program to check whether the first alphabet of the word entered is a vowel or consonant.

    isContinue = "y";
    while (isContinue.equalsIgnoreCase("y")) {

      System.out.println("enter one word");
      String word = sc.next();
      switch (word.toLowerCase().charAt(0)) {
        case 'a':
//        case 'A':
        case 'e':
//        case 'E':
        case 'i':
//        case 'I':
        case 'o':
//        case 'O':
        case 'U':
        case 'u': System.out.println("vowel");
          break;
        default: System.out.println("consonant");
      }
      System.out.println("continue y/n?");
      isContinue = sc.next();
    }
  }
}
