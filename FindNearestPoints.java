import java.util.Scanner;
public class FindNearestPoints {
  public static void main(String[] args) {
    //get array
    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[7][2];
    System.out.println("enter "+ matrix.length + " row and "+matrix[0].length + " column");
    for(int i = 0; i < matrix.length; ++i){
      for(int j = 0; j < matrix[i].length; ++j){
        matrix[i][j] = sc.nextInt();
      }
    }
    //compare array
    double nearestPoint = Math.abs(Math.pow((matrix[0][0] - matrix[1][0]),2)
            + Math.pow((matrix[0][1] - matrix[1][1]),2));
    int nearestIndex0 = 0;
    int nearestIndex1 = 1;
    for(int i = 1; i < matrix.length; ++i){
      for (int j = i+1; j < matrix.length; ++j){
        double x = Math.abs(Math.pow((matrix[i][0] - matrix[j][0]),2)
                + Math.pow((matrix[i][1] - matrix[j][1]),2));
        if ( x < nearestPoint ) {
          nearestPoint = x;
          nearestIndex0 = i;
          nearestIndex1 = j;
        }

      }
    }
    System.out.println("nearst pair: ("+ matrix[nearestIndex0][0]+", "+matrix[nearestIndex0][1]
    +"),("+ matrix[nearestIndex1][0]+","+matrix[nearestIndex1][1]+")");
    for (int i = 0; i < matrix.length; ++i){
      for(int j = 0; j < matrix[i].length; ++j)
        System.out.print(matrix[i][j]+" ");
        System.out.println();
    }

  }
}
