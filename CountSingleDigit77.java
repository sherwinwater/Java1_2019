public class CountSingleDigit77 {
  public static void main(String[] args) {
    int[] counts = new int[10];
    int n;
    for (int i = 0; i < 100; ++i){
      n = (int)(Math.random()*10);
      ++counts[n];
      if ((i+1) % 10 != 0) System.out.print(n + " ");
      else System.out.println(n);
    }
    for (int i = 0; i < counts.length; ++i){
      System.out.println(i + " is "+counts[i]);
    }
  }
}
