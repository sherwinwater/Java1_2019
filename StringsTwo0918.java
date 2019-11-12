public class StringsTwo0918 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = " ";

        // STRING CONCATINATION

        System.out.println("***** Join Strings ***** ");
        System.out.println(s1 + s3 + s2);
        System.out.println("Hello " + 5.3 + 3.1);
        System.out.println("Hello " + (5.3 + 3.1));

        // STRING LENGTH
        System.out.println("***** Strings Length ***** ");
        System.out.println(s1.length());
        System.out.println("Mom".length());
        System.out.println(s1+s2.length());

        int s1Size = s1.length();
        System.out.println("Size of s1 is: " + s1Size);
        System.out.printf("Size of s1 is: %d%n", s1Size);
        System.out.printf("%s %d %n", "Size of s1 is:", s1Size);


        // STRING COMPARE
        System.out.println("***** String compare ***** ");
        String c1 = "Hello";
        String c2 = "hELLO";
        String c3 = "World";
        System.out.println(c1.equals(s2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equalsIgnoreCase(c2));
        System.out.println(c1.equalsIgnoreCase(c3));

        // STRING - SUBSTRING
        System.out.println("***** subString ***** ");
        String g1 = "Hello";
        String g2 = "hELLO World";
        String g3 = "World Yes!";
        System.out.println(g1.substring(0));
        System.out.println(g1.substring(1));
        System.out.println(g1.substring(2));
        System.out.println(g1.substring(3));
        System.out.println(g1.substring(4));

        System.out.println(g2.substring(7));
        // System.out.println(g3.substring(22)); WONT WORK
        System.out.println(g3.substring(9));
        System.out.println(g3.substring(10));

        System.out.println(g3.substring(4,10));
        System.out.println(g3.substring(4,6));
        System.out.println(g1.substring(2,4));
        System.out.println(g1.substring(2,2));// none
        String g4 = g1.substring(2,4);
        System.out.printf("%s%n", g4);
        System.out.printf("%s", g1.substring(2,2)); //none
        System.out.println(g1.substring(2,3));

        String p1 = "Hello";

        // STRING - charAt
        System.out.println("***** charAt ***** ");
        System.out.println(p1.charAt(1));


        // Character values
        System.out.println("***** Char to ASCII ***** ");
        char c = 'a';
        char d = 'A';
        int intCharC = c;
        int intCharD = d;
        System.out.printf("ASCII for %s is %d%n", c, intCharC);
        System.out.printf("ASCII for %s is %d%n", d, intCharD);
        System.out.printf("ASCII for %s is %d%n", d, (int)d);

        // https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

        // STRING - toUpperCase()
        System.out.println("***** String upper and lower case ***** ");
        String u1 = "hello";
        String u2 = "WorLD";
        System.out.println(u1.toUpperCase());
        System.out.println(u1.toLowerCase());
        System.out.println(u2.toUpperCase());
        System.out.println(u2.toLowerCase());
        System.out.printf("%-2b%n", true);
        System.out.printf("%2b%n", true);
        System.out.printf("%.2b%n", true);


    }
}
