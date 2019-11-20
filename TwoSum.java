public class TwoSum {
  public static void main(String[] args) {
    int[] s = {1,3,4,6};
    twoSum(s, 4);

  }

    public static int[] twoSum ( int[] nums, int target){
      for (int i = 0; i < nums.length; ++i) {
        for (int j = i + 1; j < nums.length; ++j) {
          if (nums[i] + nums[j] == target) {
//            int[] x = {i,j};
            return new int[] {i,j};
          }
        }
      }
      throw new IllegalArgumentException("No two sum solution");

  }

}
