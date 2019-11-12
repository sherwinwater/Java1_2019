import java.util.Scanner;

public class Palindromes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("%s%n", "enter a string: ");
    String inputString = sc.nextLine();
    int lengthString = inputString.length();
    int i = 0;
    int j = 0;
    int low = 0;
    int high = lengthString;
    int half = high / 2;

    for (i = 0; i < half; i++) {
      if (inputString.charAt(i) != inputString.charAt(high - 1 - i)) {
        System.out.printf("%s%n", "not palindromes");
        break;
      } else {
        j++;
//        System.out.println(j+ " " + lengthString / 2);
        if (j == half)
          System.out.printf("%s%n", "it's palindromes");
      }
    }

    //using boolean
    boolean isP = true;
    for (i = 0; i < half; i++){
       if (inputString.charAt(i) != inputString.charAt(high - 1 - i)) {
         isP = false;
         break;
       }
      }

    if(isP)
      System.out.printf("%s%n", "it's palindromes");
    else
      System.out.printf("%s%n", "not palindromes");

    //
   isP = true;
   while (low < high){
     if (inputString.charAt(low) != inputString.charAt(high - 1)) {
       isP = false;
       break;
     }
     low++;
     high--;
   }

    if(isP)
      System.out.printf("%s%n", "it's palindromes");
    else
      System.out.printf("%s%n", "not palindromes");
  }
}
