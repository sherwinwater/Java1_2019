public class MockExam1202 {
  public static void main(String[] args) {

    int[] ii = {10, 2, 3, 4};
    int[] j = ii;
    int m = 0;
    //    ii[m++] = 5;
    //    ii[m++] = m--;
    ii[++m] = m--;

    System.out.println("m: " + m);
    System.out.println(j[0]);
    System.out.println(j[1]);
    System.out.println(j[2]);
    System.out.println(j[3]);

    //
    String[] i = {"1", "2", "3", "4"};
    String[] jj = i;
    int mm = 1;
    i[--mm] = "Hello";
    i[mm += 2] = "World"; //first get mm = 2; i[2] = "world"
    System.out.println(jj[0]);
    System.out.println(jj[1]);
    System.out.println(jj[2]);
    System.out.println(jj[3]);


    for (int multi = 2; multi <= 40; multi += 2) {
      System.out.print(multi + " ");
    }
    System.out.println();

    //
//    Scanner in = new Scanner(System.in);
//    try {
//      int input = in.nextInt();
//      System.out.println("You entered " + input);
//    } catch (Exception e) {
//      System.out.println("wrong input");
//    }

    //
    int x = 5;
    int whatEverIsReturned = doSomething(x, 3);
    System.out.println(x + " doSomething " + 3 + " = " + whatEverIsReturned);

    //
    String name;
    int i1;
    boolean blah;
    name = "Sheridan College Oakville";
    blah = true;
    for (i1 = 0; i1 < name.length(); i1++) {
      if (blah) System.out.println(name.charAt(i1));
      if (name.charAt(i1) == ' ') blah = true;
      else blah = false;
    }


  }

  public static int doSomething(int n, int m) {
    n = doSomethingAgain(m);
    System.out.println(n + " -- " + m);
    return n + m;
  }

  public static int doSomethingAgain(int a) {
    a *= 3;
    System.out.println("a: " + a);
    return a-- * 2;
  }

}
