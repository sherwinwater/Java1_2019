public class BubbleSort78 {
  public static void main(String[] args) {
    int[] num = {2,14,6,13,8,9,12,45,23};
    for (int i =0; i < num.length-1; ++i){
      for (int j = i; j >= 0 ; --j){
      if (num[j] > num[j+1]) {
        int temp = num[j + 1];
        num[j + 1] = num[j];
        num[j] = temp;
      }
      }
    }
    for (int i : num) System.out.print(i + " ");
  }
}
