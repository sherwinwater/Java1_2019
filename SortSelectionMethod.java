public class SortSelectionMethod {
  public static void main(String[] arg) {
    int[] list = {2,7,9,30,15,100,6,11};
    sortSelection(list);
  }

  public static void sortSelection(int[] list) {
//    int[] list = {2,7,9,30,15,100,6,11};
    for(int i = 0; i < list.length - 1; ++i){
      int min = list[i];
      int minOfIndex = i;
      for(int j = i+1; j < list.length; ++j){
        if(min > list[j]){
          min = list[j];
          minOfIndex = j;
        }
      }
      list[minOfIndex] = list[i];
      list[i] = min;
    }
    for (int i : list) System.out.print(i+" ");
  }
}
