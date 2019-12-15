//Write a method public boolean doesItMatch(double[] d) that takes an array of
//double as parameter. You may assume that all elements in the array
//store a double value. The program checks to see if the average of
//elements 1 to last element is equal to the value stored in element 0.
//If the array element at 0 stores that average value,
//the method returns true, else it returns false.
//As an example: {3.0, 2.5, 3.5,4.0, 2.0} returns true
//as (2.5+ 3.5 + 4.0+2.0)/4 = 3.0

public class DoestItmachMockexam1202 {
  public static void main(String[] args) {
    double[] d = {3.0, 2.5, 3.5, 4.0, 2.0};
    System.out.println(doesItMatch(d));
  }

  public static boolean doesItMatch(double[] d){
    double total = 0.0;

    for(double i : d) total +=i;
    if (total / d.length == d[0]) return true;
    else return false;

  }
}
