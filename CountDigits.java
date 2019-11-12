public class CountDigits {
    public static int Count (int num) {
      int count = 0;
      for(; num != 0; num/=10, ++count) {
      }
return count;
    }
  }

