public class LeapYear {
  public static void main(String[] args){
    int i = 1;
    int count = 0;

    System.out.println("-----------method1------------");
    for (i = 101; i <= 2100; i++){
      if(i % 4 == 0){
        count++;
        if(count % 10 == 0) {
          System.out.println(i);
        } else
          System.out.print(i + " ");
      }
    }

    //method2
    System.out.println("-----------method2------------");
    count = 0;
    i = 1;
    while (count < 50) {
      if (i % 4 == 0){
        count++;
        if(count % 10 == 0){
          System.out.println(i);
        } else
          System.out.print(i + " ");
      }
      i++;
    }
  }
}