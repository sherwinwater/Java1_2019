import java.util.Scanner;
public class Strings0918 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        String s3 = " ";

        // STRING CONCATINATION

        System.out.println("***** Join Strings ***** ");
        System.out.println(s1 + s3 + s2);
        System.out.println("Hello " + 5.3 + 3.1);
        System.out.println("Hello " + (5.3 + 3.1));

        int i = 5;
        double d = 5.1234567;
        String s = "Hello World";
        char c = 'c';
        boolean b = true;

        //System.out.println("i is " + i + " d is " + d + " s is " + s + " c " +"is " + c);


        // use %n for new line - https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        //There is also one specifier that doesn't correspond to an argument. It is "%n" which outputs a line break. A "\n" can also be used in some cases, but since "%n" always outputs the correct platform-specific line separator, it is portable across platforms whereas"\n" is not.
        // printing
        System.out.println("Printing");
        System.out.printf("%d%n", i);
        System.out.printf("%d %f%n", i, d);

        System.out.printf("%d%n", i);

        //System.out.printf("%D", i);

        System.out.printf("%f%n", d);
        System.out.printf("%,f%n", d);

        //System.out.printf("%F%n", d);

        System.out.printf("%c%n", c);
        System.out.printf("%C%n", c);

        System.out.printf("%s%n", s);
        System.out.printf("%S%n", s);

        System.out.printf("%b%n", b);
        System.out.printf("%B%n", b);

        System.out.printf("%e%n", d); // 6 digits after dot
        System.out.printf("%E%n", d);

        // % [flags] [width] [.precision] conversion-character

        System.out.printf("Printing number %d", 5);
        System.out.printf("%n");
        System.out.printf("Printing float %f", 5.0);
        System.out.printf("%n");
        System.out.printf("Printing boolean lowercase %b", false);
        System.out.printf("%n");
        System.out.printf("Printing boolean uppercase %B", 5>4);
        System.out.printf("%n");
        System.out.printf("Printing string lowercase %s", "Hello");
        System.out.printf("%n");
        System.out.printf("Printing string uppercase %S", "Hello");
        System.out.printf("%n");
        System.out.printf("Printing char lowercase %c", 'h');
        System.out.printf("%n");
        System.out.printf("Printing char uppercase %C", 'h');
        System.out.printf("%n");
        System.out.printf("I got %.2f%% in Math", 100.0);
        System.out.printf("%n");


// printing multiple statements
        System.out.println("****** Multiple Statements****** ");
        System.out.printf("i is %d%nd is %f%ns is %s%nc is %c%n", i, d, s, c);
        System.out.printf("i is %d d is %f s is %s c is %c%n", i, d, s, c);
        System.out.printf("i is %d d is %f s is %s c is %c%n", 4, 3.4, "Hello", 'm');

// precision
        System.out.println("****** Precision with doubles****** ");
        System.out.printf("No Precision defined %f%n", d);
        System.out.printf("0 Precision defined %.0f%n", d);
        System.out.printf("1 Precision defined %.1f%n", 5.19);
        System.out.printf("2 Precision defined %.2f%n", d);
        System.out.printf("3 Precision defined %.3f%n", d);
        System.out.printf("4 Precision defined %.4f%n", d);
        System.out.printf("5 Precision defined %.5f%n", d);
        System.out.printf("6 Precision defined %.6f%n", d);
        System.out.printf("7 Precision defined %.7f%n", d);
        System.out.printf("8 Precision defined %.8f%n", d);

        System.out.println("****** Precision with Strings****** ");
        System.out.printf("No Precision defined %s%n", s);
        System.out.printf("0 Precision defined %.0s%n", s);
        System.out.printf("1 Precision defined %.1s%n", s);
        System.out.printf("2 Precision defined %.2s%n", s);
        System.out.printf("3 Precision defined %.3s%n", s);
        System.out.printf("4 Precision defined %.4s%n", s);
        System.out.printf("5 Precision defined %.5s%n", s);
        System.out.printf("6 Precision defined %.6s%n", s);
        System.out.printf("7 Precision defined %.7s%n", s);
        System.out.printf("8 Precision defined %.8s%n", s);


        System.out.println("****** Precision with booleans****** ");
        System.out.printf("No Precision defined %b%n", b);
        System.out.printf("2 Precision defined %.2b%n", b);


        System.out.println("****** Precision with ints****** ");
        System.out.printf("No Precision defined %d%n", 12345678);
        //System.out.printf("2 Precision defined %.2d%n", 123456); // does not
        // apply to int


        System.out.println("****** Precision with chars****** ");
        System.out.printf("No Precision defined %c%n", 'c');
//System.out.printf("2 Precision defined %.0c%n", 'c'); // does not apply to
// char

        System.out.printf("%.0f%n", 5.9);


// width
        System.out.println("****** Width with int****** ");
        System.out.printf("Width is 9 %9d%n",1234567);
        System.out.printf("Width is 1 %1d%n",1234567);
        System.out.printf("Width of 6 defined int %6d%n",123);
        System.out.printf("Width not defined %d%d%n",123, 789);
        System.out.printf("Width of 4 and 6 defined %4d%4d%n",123, 789);

        System.out.println("****** Width with String****** ");
        System.out.printf("Width is 9 %9s%n","Hello");
        System.out.printf("Width is 1 %1s%n","Hello");
        System.out.printf("Width not defined %s%s%n","Hello", "this is java");
        System.out.printf("Width of 6 and 5 defined %-6s%5s%n","Hello", "this" +
                " is java");


        String name = "Bob";
        int age = 30;
        double finalMark = 80.50;

        System.out.println("**************************");
        System.out.printf("%-7s%7s%n", "Name = ", "Bill");
        System.out.printf("%7s%7d%n", "Age = ", 20);
        System.out.printf("%-9s%-5.2f%n", "Price = ", 56.7598);


        System.out.printf("%8d%n", 124);
        System.out.printf("%-8d%n", 124);
        System.out.printf("%-8s%-5d%n", "num = ", 567);
        System.out.println("**************************");

        double m = 19.3393;
        System.out.printf("%1.3f%n", m);

        String temp = "Hello";
        System.out.printf("%-4.4S%n", temp);

        String course = "PROG10082";
        String courseSubString1 = course.substring(2,3).toLowerCase();
        System.out.println(courseSubString1);

        char courseSubString3 = course.charAt(3);
        System.out.println(courseSubString3);

        String courseSubString2 = course.substring(2,2);
        System.out.println(courseSubString2);

    }

}