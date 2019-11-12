import java.util.Scanner;

public class Exercise0916 {
    public static void main(String[] args){
//        int i = 5;
//        i += 3;
//        i *= 2;  // i = i * 2;
//        System.out.println(i++);
//        System.out.println(--i);
        //        int x, y;
//        x = y = x = 2;
//        System.out.println(x);

        Scanner sc= new Scanner(System.in);
//        System.out.print("please input length: ");
//        double f = sc.nextDouble();
//        sc.nextLine();
//        System.out.print("please input width: ");
//        double x = sc.nextDouble();
//        System.out.println("area: " + (f * x - 3));

        System.out.println("celsius: ");
        double celsius = sc.nextDouble();

//        double celsius = 102;
        double far = (celsius * 9.0 / 5) + 32;
        System.out.println(far);

    }
}
