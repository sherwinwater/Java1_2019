public class Break1 {
  public static void main(String[] args){
    int j = 0;
    int i = 0;
    int x = 0;

//    //outer loop
//    outer:
//    for (i = 0; i < 2; i++){
//      //inner loop
//      inner:
//      for (x = 0; x < 3; x++){
//        if (x > 1){
//          System.out.println("x " + x);
//          break outer; //quit the outer loop
//        }
//          j++;
//        System.out.println("x loop: i "+ i +" x " + x +" j "+ j); //inner
//      }
//      System.out.println("i loop: i "+ i +" x " + x +" j "+ j); //outer
//    }
//    System.out.println("done loop: i "+ i +" x " + x +" j "+ j); //done loop

    //continue
    //outer loop
    outer:
    for (i = 0; i < 2; i++){
      //inner loop
      inner:
      for (x = 0; x < 3; x++){
        if (x == 1){
          System.out.println("x " + x);
          continue outer; // go to the next outer loop, not quit the outer loop
        }
        j++;
        System.out.println("x loop: i "+ i +" x " + x +" j "+ j); //inner
      }
      System.out.println("i loop: i "+ i +" x " + x +" j "+ j); //outer
    }
    System.out.println("done loop: i "+ i +" x " + x +" j "+ j); //done loop


  }

}
