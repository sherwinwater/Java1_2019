public class ContinueAndBreak {
  public static void main(String[] args){
    int i = 10;

    //continue
//    while (true){
//      System.out.println(i);
//      if(i < 9) continue;
//      i -= 9;
//      System.out.println(i);
//    }

    // break
//    while (true){
//      System.out.println(i);
//      if (i < 9) break;
//      i -= 9;
//      System.out.println(i);
//    }

    //break
    int j;
    for (i = 1; i < 4; i++) {
      for (j = 1; j < 4; j++) {
        if (i * j > 2)
          break;
        System.out.println(i * j + " "+i + " " + j);
      }
      System.out.println(i + " "+i + " " + j );
    }

    //continue
    for (i = 1; i < 4; i++) {
      for (j = 1; j < 4; j++) {
        if (i * j > 2)
          continue;
        System.out.println(i * j + " "+i + " " + j);
      }
      System.out.println(i + " "+i + " " + j );
    }
  }
}
