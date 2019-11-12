public class Loop1030 {
  public static void main(String[] args) {
    //    int i = 30;
    //    do {
    //      System.out.print(i);
    //      i = i - 3;
    //    } while (i >= -30);


    int a = 24;
    int b = 18;
    int temp;
    while (a > 8) {
      b = a % b;
      temp = b;
      a = temp;
    }
    System.out.println(a);

    String s = "hello";
//    char ss = s.charAt(6);
    String as = s.substring(2);
    System.out.println(as);

    int x = 3;
    int y = 5;
    int z = 4;
    if (x > 1)  if ( y > 2) if (z > 4)  System.out.println(y);
      else
        System.out.println(y+1);

    System.out.println("hello");

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < i; j++)  System.out.println("j" + j);
        System.out.println("i" + i);
    }
    System.out.println("ii-------");
    int ii = 1;
    for (; ii < 3 && ii > 1; ii++){
      for (int j = 0; j < ii; j++)  System.out.println("j" + j);
      System.out.println("i" + ii);
    }

  }
}
