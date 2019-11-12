public class ChallengePen {
  public static int pentagonal(int num) {
    if ( num == 1) return 1;
    else return (pentagonal(num - 1) + (num - 1) * 5);
  }

  }
