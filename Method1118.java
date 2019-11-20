public class Method1118 {
  public static void main(String[] args) {

    int i = getSmallest(111, 44, 332);
    System.out.println(i);

    System.out.println(getAverage(1, 4, 5));
    System.out.println(countVowels("hello"));
    System.out.println(checkPassword("hel30eh"));
    System.out.println(recurrenceChar("ZBCADzBA"));

  }

  //    1. Write a Java method that takes a parameters three ints and
  //    returns the smallest number among three numbers.
  public static int getSmallest(int n1, int n2, int n3) {

    //    return (n1 < n2 && n1 < n3)? n1: (n2 < n1 && n2 < n3)?
    //            n2 : (n3 < n1 && n3 < n2)?n3:0;

    int smallest = n1;
    if (n2 < smallest) smallest = n2;
    if (n3 < smallest) smallest = n3;
    return smallest;

  }


  //  2. Write a Java method that takes a parameters three ints and
  //  returns the average of the three numbers
  public static double getAverage(int n1, int n2, int n3) {
    return (n1 + n2 + n3) / 3.0;
  }

  //3. Write a Java method that takes a String parameter and outputs
  //  the count of all vowels in the string.

  public static int countVowels(String s) {
    int count = 0;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < s.length(); ++i) {
      for (int j = 0; j < vowels.length; ++j) {
        if (s.toLowerCase().charAt(i) == vowels[j]) ++count;
      }
    }
    return count;
  }

  //  4. Write a Java method to check whether a string is a valid password.
  //  Password rules:
  //        1) A password must have at least ten characters.
  //        2) A password must contain at least two digits and at least two alphabets.

  public static boolean checkPassword(String s) {
    //    boolean charMore10 = false;
    boolean isLetterDigit = false;
    int countLetter = 0;
    int countDigit = 0;

    //    if (s.length() >= 10) charMore10 = true;
    for (int i = 0; i < s.length(); ++i) {
      if (Character.isLetter(s.charAt(i))) ++countLetter;
      if (Character.isDigit(s.charAt(i))) ++countDigit;
      if (countLetter >= 2 && countDigit >= 2) {
        isLetterDigit = true;
        break;
      }
    }
    //    if (isLetterDigit && charMore10)  isPassword = true;
    //    return isPassword;
    return isLetterDigit && (s.length() >= 10);


    //    for (int i = 0; i < s.length(); ++i) {
    //      if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')) {
    //        ++countDigits;
    //        if (countDigits >= 2) break;
    //      }
    //    }

    //    for (int i = 0; i < s.length(); ++i) {
    //      if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'Z')) {
    //        ++countAlphabets;
    //        if (countAlphabets >= 2) break;
    //      }
    //    }
    //        countAlphabets = 3;
    //    if (charMore10 && (countAlphabets >= 2) && (countDigits >= 2))
    //      isPassword = true;
    //    return isPassword;


  }

  public static char recurrenceChar(String s) {
    char[] charOfstring = new char[300];
    char reChar = ' ';
    for (int i = 0; i < s.length(); ++i) {
      //      int ch = s.toLowerCase().charAt(i) - 'a';
      int ch = s.charAt(i);
      ++charOfstring[ch];
      if (charOfstring[ch] == 2) {
        reChar = s.charAt(i);
        break;
      }
    }
    return reChar;
  }


}
