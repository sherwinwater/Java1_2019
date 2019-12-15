//Write a method that prints that smallest and largest value in an array that
//        stores double. public void printSmallestAndLargest(double[] d) {……. }

public class SmallLargeMockexam1204 {
  public static void main(String[] args){
    double[] d = {1.2,2,3,4,5.55,6,2.1};
    printSmallestAndLargest(d);

  }

  public static void printSmallestAndLargest(double[] d){
    int sizeOfArray = d.length;
    if (sizeOfArray == 0) System.out.println("empty array");
    else {
      double smallest = d[0];
      double largest = d[0];
      for(int i = 1; i < sizeOfArray; ++i){
        if (d[i] < smallest) smallest = d[i];
        if (d[i] > largest) largest = d[i];
      }
      System.out.println("smallest and largest value: " + smallest + " "+ largest);
    }
  }

}
