public class Array1113 {
  public static void main(String[] args) {

//    1. Write a program that shifts the array by 1 element up.
//    The n-1 element of the array moves to element n. Element 0 will
//    move to the last element.

    int[] num = {1,2,3,4,5,6,7};
    int temp = num[0];
    for (int i = 0; i < num.length-1; ++i){
      num[i] = num[i+1];
    }
    num[num.length-1] = temp;
    for(int i : num) System.out.print(i);
    System.out.println();


//    2. Using the multidimensional array below:
//    String[][] patient = {
//            {"1", "Bob", "Dilon", "26", "Toronto", "647", "555-1111"},
//            {"2", "John", "Basic", "35", "Brampton", "416", "655-1111"},
//            {"3", "Mike", "Pron", "60", "Mississauga", "647", "755-1111"},
//            {"4", "James", "Liu", "40", "Toronto", "416", "855-1111"},
//            {"5", "Clement", "Ma", "22", "Brampton", "905", "955-1111"},
//            {"6", "John", "David", "6", "Vaughan", "905", "155-1111"}
//    };
//
//    a. Write a program that updates element 0 with the below data:
//
//    ID: 8, First Name: Jay, Last Name: Cob, Age: 59, Country: Ajax,
//            Area code: 905, Phone number: 999-0000
//
//    b. Write a program that "deletes" element 5 (and shifts the array up -
//            so element 6 becomes element 5, element 7 becomes element 6, and
//    element 7 is blank). Use an int variable numPatients to keep track of the
//    total patients in the array.
        String[][] patient = {
                {"1", "Bob", "Dilon", "26", "Toronto", "647", "555-1111"},
                {"2", "John", "Basic", "35", "Brampton", "416", "655-1111"},
                {"3", "Mike", "Pron", "60", "Mississauga", "647", "755-1111"},
                {"4", "James", "Liu", "40", "Toronto", "416", "855-1111"},
                {"5", "Clement", "Ma", "22", "Brampton", "905", "955-1111"},
                {"6", "John", "David", "6", "Vaughan", "905", "155-1111"}
        };
        String[] element0 = {"8", "Jay", "Cob", "59", "Ajax", "905", "999-0000"};
        patient[0] = element0;
//        for (int i = 0 ; i <patient[0].length; ++i){
//          patient[0][i] = element0[i];
//        }

        //
        int numPatients;
        for (int i = 4; i < patient.length-1; ++i){
          for (int j = 0; j < patient[i].length; ++j){
            patient[i][j] = patient[i+1][j];
          }
        }

        //delete the last array
//        for (int i = 0; i < patient[5].length; ++i){
//          patient[5][i] = " ";
//        }
        String[] e = {};
        patient[5] = e;

        for (int i = 0; i < patient.length; ++i){
          for (int j = 0; j < patient[i].length; ++j){
            System.out.print(patient[i][j]+" ");
          }
          System.out.println();
        }




  }
}
