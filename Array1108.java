import java.util.Scanner;
public class Array1108 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
//    System.out.println("enter 5 integers");
//    int[] input = new int[5];
//    for (int i = 0; i < input.length; i++){
//      input[i] = sc.nextInt();
//    }
//    for (int i : input)
//    System.out.print(i + " ");

    //print char
//    char[] ch = {'D', 'A', 'L'};
//    System.out.println(ch);

      //find indexofmax and max
//    int[] array1 = { 1,2,33,4,8};
//    int max = array1[0];
//    int indexOfMax = 0;
//    int i =0;
//    for (i = 1; i < array1.length; i++){
//      if (array1[i] > max){
//        max = array1[i];
//        indexOfMax = i;
//      }
//    }
//    System.out.println("indexofMax: " + indexOfMax);

    //shuffling
//    int[] array1 = { 1,2,33,4,8};
//
//    for (int i = 1; i < array1.length; i++){
//      int j = (int)Math.random()*(i+1);
//      int temp = array1[i];
//      array1[i] = array1[j];
//      array1[j] = temp;
//    }
//    for (int i : array1) System.out.print(i+" ");

    //copy
//    int[] array1 = { 1,2,33,4,8};
//    int[] result = new int[array1.length];
//    for(int i = 0, j = result.length - 1 ; i < array1.length; ++i, --j){
//      result[j] = array1[i];
//    }
//    for(int i : result) System.out.println(i);

    //count how many
      int[] number = new int[50];
    int counter[] = new int[10];

    for (int i = 0; i < number.length; ++i){
        number[i] = (int)(Math.random()*10);
        if((i+1) % 10 == 0) System.out.println(number[i]);
        else  System.out.print(number[i]+ " ");

        //counter
        int x = number[i] - 0;
        counter[x]++;
      }
      for (int i = 0; i < counter.length; ++i){
        System.out.println("number "+i + " : "+ counter[i]+" times");
      }
  }
}
