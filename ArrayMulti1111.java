import java.util.Scanner;
public class ArrayMulti1111 {
  public static void main(String[] args) {
    //    String[][] name = {
    //            {"jack", "23"},
    //            {"sam","22"},
    //            {"tom", "44"}
    //    };
    //    for (String[] n : name){
    //      for(String i : n) System.out.println(i);
    //    }

    //3d

    //    String[][][] name2 = {
    //            {
    //            {"jack", "23"},
    //            {"sam","22"}
    //            }, {{"tom", "44"}}
    //    };
    //    for (String[] n : name){
    //      for(String i : n) System.out.println(i);
    //    }
    //
    //    // test is a 3d array
    //    int[][][] test = {
    //            {
    //                    {1, -2, 3},
    //                    {2, 3, 4}
    //            },
    //            {
    //                    {-4, -5, 6, 9},
    //                    {1},
    //                    {2, 3}
    //            }
    //    };

    // for..each loop to iterate through elements of 3d array
    //    for (int[][] array2D: test) {
    //      for (int[] array1D: array2D) {
    //        for(int item: array1D) {
    //          System.out.println(item);
    //        }
    //      }
    //    }

    /////////
    //    String[][] rooms = new String[3][3]; // room, wing, and class size
    //    String[][] newRooms = {
    //            {"B212", "B", "30"},
    //            {"C312", "C", "10"},
    //            {"J555", "J", "15"}};
    //    for(int i = 0; i < newRooms.length; ++i){
    //        System.out.println(newRooms[i][1]);
    //    }

    //////
//    String[][] patient = {{"1", "Bob", "Dilon", "26", "Toronto", "647", "555-1111"}, {"2", "John", "Basic", "35", "Brampton", "416", "655-1111"}, {"3", "Mike", "Pron", "60", "Mississauga", "647", "755-1111"}, {"4", "James", "Liu", "40", "Toronto", "416", "855-1111"}, {"5", "Clement", "Ma", "22", "Brampton", "905", "955-1111"}, {"6", "John", "David", "6", "Vaughan", "905", "155-1111"}};
//    for (int i = 0; i < patient.length; ++i) {
//      if (patient[i][4].equalsIgnoreCase("Brampton")) {
//        System.out.println(patient[i][1]);
//      }
//    }
//
//    for (int i = 0; i < patient.length; ++i) {
//      if (Integer.parseInt(patient[i][3]) > 30) {
//        System.out.println(patient[i][1] + " " + patient[i][2]);
//      }
//    }
//    int oldestPatient = Integer.parseInt(patient[0][3]);
//    String oldestName = patient[0][1];
//    //    int oldestIndex = 0;
//    for (int i = 1; i < patient.length; ++i) {
//      if (Integer.parseInt(patient[i][3]) > oldestPatient) {
//        oldestPatient = Integer.parseInt(patient[i][3]);
//        //        oldestIndex = i;
//        oldestName = patient[i][1];
//      }
//    }
//    //    System.out.println(patient[oldestIndex][1] + " "
//    //            +patient[oldestIndex][2]+" "+patient[oldestIndex][3]);
//
//    System.out.println(oldestName);


    //    Question A:
    //    Write a program that:
    //    1. stores the following stores in an array: "bay", "Tim", "Superstore", "lowes".
    //    2. prompts the user to input a store the user wishes to delete
    //    3. deletes the store from the array
    //    4. prints a list of all remaining stores

    //    String[] store = {"bay", "Tim", "Superstore", "lowes"};
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("enter a store you like to delete");
    //    String deleteStore = sc.next();
    //    String[] newStore;
    //    for (int i = 0; i < store.length; ++i){
    //      //delete it
    //      if (store[i].equalsIgnoreCase(deleteStore)){
    //        for (int j = i ; j < store.length -1 ; ++j){
    //          store[j] = store[j + 1];
    //        }
    //        store[store.length-1] = "";
    //      }
    //
    //    }
    //
    //    for (String s : store)
    //      System.out.println(s);


    //    String[] x = {"x", "y"};
    //    int[][] xx = {{1,2}};
    //    patient[0] = x;
    //    System.out.println(xx[0][1]);

    //    int[][] matrix = new int[2][3];
    //
    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Enter " + matrix.length + " rows and " +
    //            matrix[0].length + " columns: ");
    //    for (int row = 0; row < matrix.length; row++) {
    //      for (int column = 0; column < matrix[row].length; column++) {
    //        matrix[row][column] = input.nextInt();
    //      }
    //    }
    //    for (int row = 0; row < matrix.length; row++) {
    //    for (int column = 0; column < matrix[row].length; column++) {
    //    System.out.print(matrix[row][column] + " ");
    //    }
    //    System.out.println();
    //    }

    int[][] array = {{1, 2}, {3, 4}, {5, 6}};
    for (int i = array.length - 1; i >= 0; --i) {
      for (int j = array[i].length - 1; j >= 0; --j)
        System.out.print(array[i][j] + " ");
        System.out.println();
    }

  }
}
