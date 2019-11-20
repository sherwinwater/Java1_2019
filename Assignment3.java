/*
  Calculate Chinese Zodiac by the year or Zodiac by the month and day input from the user.
*/

import java.util.Scanner;

public class Assignment3 {
  public static void main(String[] args) {
    // decide whether continue or not. default is "y"
    String isContinue = "y";
    while (isContinue.equalsIgnoreCase("y")) {
      String inputAgain = "y";
      Scanner sc = new Scanner(System.in);

      // ask user to input again if it's illegal
      while (inputAgain.equalsIgnoreCase("y")) {
        // set inputAgain as empty
        inputAgain = "";
        //get the choice from the user
        System.out.println("Zodiac or Chinese Zodiac?");
        String input = sc.nextLine();
        //calculate the Chinese zodiac
        if (input.equalsIgnoreCase("chinese zodiac")) {
          System.out.println("enter year(number): ");
          int year = sc.nextInt();
          switch (Math.abs(year) % 12) {
            case 0: System.out.println("year of Monkey");
              break;
            case 1: System.out.println("year of Rooster");
              break;
            case 2: System.out.println("year of Dog");
              break;
            case 3: System.out.println("year of Pig");
              break;
            case 4: System.out.println("year of Rat");
              break;
            case 5: System.out.println("year of Ox");
              break;
            case 6: System.out.println("year of Tiger");
              break;
            case 7: System.out.println("year of Hare");
              break;
            case 8: System.out.println("year of Dragon");
              break;
            case 9: System.out.println("year of Snake");
              break;
            case 10: System.out.println("year of Horse");
              break;
            case 11: System.out.println("year of Sheep");
          }
        }
        // calculate Zodiac if user input is Zodiac
        else if (input.equalsIgnoreCase("zodiac")) {
          // get month, day from the user

          System.out.println("enter month: ");
          String month = sc.next();

          // ask user to enter month again if the input is illegal
          // method2: String[] monthNumber = {"1","2","3","4","5","6","7","8","9","10","11","12"};
          // method2: String[] monthList = {"January","February","March","April","May","June","July","August","September","October","November","December"};
          // method2: while(!Arrays.asList(monthNumber).contains(month) && !Arrays.asList(monthList).contains(month.toLowerCase())){

          while(!month.equalsIgnoreCase("1") && !month.equalsIgnoreCase("2")&& !month.equalsIgnoreCase("3")
                  && !month.equalsIgnoreCase("4")&& !month.equalsIgnoreCase("5")&& !month.equalsIgnoreCase("6")
                  && !month.equalsIgnoreCase("7")&& !month.equalsIgnoreCase("8")&& !month.equalsIgnoreCase("9")
                  && !month.equalsIgnoreCase("10")&& !month.equalsIgnoreCase("11")&& !month.equalsIgnoreCase("12")
                  && !month.equalsIgnoreCase("January") && !month.equalsIgnoreCase("February")&& !month.equalsIgnoreCase("March")
                  && !month.equalsIgnoreCase("April")&& !month.equalsIgnoreCase("May")&& !month.equalsIgnoreCase("June")
                  && !month.equalsIgnoreCase("July")&& !month.equalsIgnoreCase("August")&& !month.equalsIgnoreCase("September")
                  && !month.equalsIgnoreCase("October")&& !month.equalsIgnoreCase("November")&& !month.equalsIgnoreCase("December")){

            System.out.println("Invalid input. Re-enter month(1-12, or full month name): ");
            month = sc.next();
          }

          //get valid day
          System.out.println("enter day: ");
          int day = sc.nextInt();
          while (day >= 32 || day <= 0) {
            System.out.println("Invalid input. Re-enter day(0-31): ");
            day = sc.nextInt();
          }

          // Capricorn - December 22 to January 19
          if (((month.equals("12") || month.equals("December")) && day >= 22 && day <= 31) || ((month.equals("1") || month.equals("January")) && (day >= 1) && (day <= 19))) {
            System.out.println("Capricorn");
          }
          // Aquarius - January 20 to February 18
          else if (((month.equals("1") || month.equals("January")) && (day >= 20) && (day <= 31)) || ((month.equals("2") || month.equals("February")) && day >= 1 && day <= 18)) {
            System.out.println("Aquarius");
          }
          // Pisces - February 19 to March 20
          else if (((month.equals("2") || month.equals("February")) && (day >= 19) && (day <= 29)) || ((month.equals("3") || month.equals("March")) && day >= 1 && day <= 20)) {
            System.out.println("Pisces");
          }
          // Aries - March 21 to April 19
          else if (((month.equals("3") || month.equals("March")) && (day >= 21) && (day <= 31)) || ((month.equals("4") || month.equals("April")) && day >= 1 && day <= 19)) {
            System.out.println("Aries");
          }
          // Taurus - April 20 to May 20
          else if (((month.equals("4") || month.equals("April")) && (day >= 20) && (day <= 30)) || ((month.equals("5") || month.equals("May")) && day >= 1 && day <= 20)) {
            System.out.println("Taurus");
          }
          // Gemini - May 21 to June 20
          else if (((month.equals("5") || month.equals("May")) && (day >= 21) && (day <= 31)) || ((month.equals("6") || month.equals("June")) && day >= 1 && day <= 20)) {
            System.out.println("Gemini");
          }
          // Cancer - June 21 to July 22
          else if (((month.equals("6") || month.equals("June")) && (day >= 21) && (day <= 30)) || ((month.equals("7") || month.equals("July")) && day >= 1 && day <= 22)) {
            System.out.println("Cancer");
          }
          // Leo - July 23 to August 22
          else if (((month.equals("7") || month.equals("July")) && (day >= 23) && (day <= 31)) || ((month.equals("8") || month.equals("August")) && day >= 1 && day <= 22)) {
            System.out.println("Leo");
          }
          // Virgo - August 23 to September 22
          else if (((month.equals("8") || month.equals("August")) && (day >= 23) && (day <= 31)) || ((month.equals("9") || month.equals("September")) && day >= 1 && day <= 22)) {
            System.out.println("Virgo");
          }
          // Libra - September 23 to October 22
          else if (((month.equals("9") || month.equals("September")) && (day >= 23) && (day <= 30)) || ((month.equals("10") || month.equals("October")) && day >= 1 && day <= 22)) {
            System.out.println("Libra");
          }
          // Scorpio - October 23 to November 21
          else if (((month.equals("10") || month.equals("October")) && (day >= 23) && (day <= 31)) || ((month.equals("11") || month.equals("November")) && day >= 1 && day <= 21)) {
            System.out.println("Scorpio");
          }
          // Sagittarius - November 22 to December 21
          else if (((month.equals("11") || month.equals("November")) && (day >= 22) && (day <= 30)) || ((month.equals("12") || month.equals("December")) && day >= 1 && day <= 21)) {
            System.out.println("Sagittarius");
          }
        } else {
          System.out.println("Invalid input. Re-input again(Zodiac or Chinese Zodiac)");
          inputAgain = "y";
        }
      }
      // ask user to continue or not?
      System.out.println("Continue(Y/N)?");
      isContinue = sc.next();
    }
  }
}
