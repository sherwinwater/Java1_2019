public class FindE {
  public static void main(String[] args){

    double i, j, k;
    int n = 30;
    double x = 1;
    double sum = 1;
    int count = 0;

    //method1
    for (i = 1; i <= n; i++){
      x = 1;        //repeat calculating the i!, cannot reuse the data
                    //eg: i=1, 1; i = 2, recalculate, 1, 2; i =3, 1,2,6;
      for (j = 1; j <= i; j++){
        x *= j;
        count++;
//        System.out.println(" x "+x+" i "+ i+ " j "+j);
      }
//      System.out.println(" x "+x+" i "+ i);
      sum += 1 / x;
    }
    System.out.println("the\t" + n + "\t:\t" + sum);
    System.out.println("count: " + count);

    //method2:
      count = 0;
      sum = 1;
      x = 1;
    for (i = 1; i <= n; i++){
      x = x / i ; //get i=1,2,3,,,, and assign it to the sum; only calculate it once.
      sum += x;
      count++;
    }
    System.out.println("the\t" + n + "\t:\t" + sum);
    System.out.println("count: " + count);

  }
}