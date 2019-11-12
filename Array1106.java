import java.util.Scanner;

public class Array1106 {
  public static void main(String[ ] args){
//    String[ ] myCourse = {"Java Pro","Web ","Networking"};
//    System.out.println(myCourse[1]);
//
//    myCourse[1] = "web develop";
//    String s = "Sheridan ";
//    for (String i : myCourse){
//      i = s + i;
//      System.out.println(i);
//    }
//
//    int[] num = {200,13,34,212,23,43,121,323,22,132};
//    int minValue = num[0];
//    for (int i : num){
//      if (i < minValue) minValue = i;
//    }
//    System.out.println(minValue);


//    1. Declare a String array with values "Volvo", "BMW", "Ford", "Mazda".
//            Write a Java program that takes an input a String and checks if
//    that String value exists in the array

//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter a string");
//    String input = sc.next();
//    String[] str1 = {"Volvo", "BMW", "Ford", "Mazda"};
//    for (String i : str1){
//      if ( i.equals(input)) System.out.println(i + " is in the array");
//    }

//    Scanner sc = new Scanner(System.in);
//    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//
//    String value = sc.nextLine();
//    boolean found = false;
//
//    for(int i = 0; i < cars.length; i++) {
//      if (cars[i].equalsIgnoreCase(value)) {
//        found = true;
//        break;
//      }
//    }
//
//    if (found)
//      System.out.println("FOUND");
//    else
//      System.out.println("NOT FOUND");

//    2. Declare an int array with values 75, 56, 49, 32, 100.
//    Write a Java program that takes an input an int value and checks if
//    that int value exists in the array.

//    Scanner sc1 = new Scanner(System.in);
//    System.out.println("enter a integer");
//    int input2 = sc.nextInt();
//    int[] int1 = {75, 56, 49, 32, 100};
//    for (int i : int1){
//      if ( i == input2 ) System.out.println(i + " is in the array");
//    }

//    3. Declare a String array with values "Volvo", "BMW", "Ford", "Mazda".
//            Write a Java program that takes an input a String value.
//    Program should find and print the index of an array element.
//            If value does not exist, print -1.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.next();
        String[] str1 = {"Volvo", "BMW", "Ford", "Mazda"};

//        Boolean isIn = false;
//        for (int i = 0; i < str1.length; i++){
//          if (str1[i].equals(input)) {
//            isIn = true;
//            break;
//          }
//        }
//       if(isIn)
//         System.out.println("the index of "+ str1[i]+ " is "+ i);
//       else
//         System.out.println("-1");

        int index = -1;
          for (int i = 0; i < str1.length; i++){
            if (str1[i].equals(input)) {
              index = i;
              break;
            }
          }

    System.out.println("index is " + index);


//    4. Declare a String array with values "Volvo", "BMW", "Ford", "Mazda".
//            Write a Java program that takes an input an int value called index.
//    Program should print the value stored at that index value. If value entered
//    is outside of the array length, print an error message.

//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter an int index");
//    String[] str1 = {"Volvo", "BMW", "Ford", "Mazda"};
//
//    int inputIndex = sc.nextInt();
//    if (inputIndex >= str1.length ) System.out.println("outside of the array");
//     else System.out.println(str1[inputIndex]);

  }
}
