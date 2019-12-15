public class EliminateDuplicated {
  public static void main(String[] args) {
    int[] array1 = {2,4,5,6,1,2,4,6,5,1,7,1,2,41};
    for (int i : eliminateDuplicate(array1))
    System.out.print(i);
  }

  public static int[] eliminateDuplicate(int[] array){
    int[] arrayB = new int[array.length];
    int count = 1;
    arrayB[0] = array[0];
    boolean isDuplicate;

    for (int i = 0; i < array.length; ++i){
      isDuplicate = false;
      for(int j = 0; j < count; ++j){
        if(array[i] == arrayB[j]) isDuplicate = true;
      }
      if(!isDuplicate) {
        arrayB[count] = array[i];
        ++count;
      }
    }

    int[] newArray = new int[count];
    for(int i =0; i < count; ++i){
      newArray[i] = arrayB[i];
    }
    return newArray;
  }

  }

