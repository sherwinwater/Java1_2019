import java.util.Scanner;
public class IPO1 {
    public static final float HST_RATE = .13f;
    public static void main (String[] args) {
        //1. Write a program that accepts the bill amount (e.g.: 54.43), and the tip percentage (e.g.: 10).
        //The program then calculates and print the total bill using the bill amount and tip percentage.
        Scanner sc = new Scanner(System.in);
        System.out.println("please input bill amount: ");
        float billAmount = sc.nextFloat();
        System.out.println("please input tip amount: ");
        float tipAmount = sc.nextFloat();
        float totalPrice;
        totalPrice = billAmount * (1 + tipAmount);
        System.out.println("total price: " + totalPrice);

        //2. At the movie theatre, popcorn costs $5.53, soft drinks cost $2.99, and a chocolate bar costs $3.45.
        //Write a program that prompts the user for the quantity of popcorn, soft drink, and chocolate bars and
        //calculates the total price (including 13% HST).
        float popcornPrice = 5.53f;
        float softDrinksPrice = 2.99f;
        float chocolateBarPrice = 3.45f;
        float totalPriceWithoutHST;
        float totalPriceWithHST;

        System.out.println("please input quantity of popcorn: ");
        float quantityOfPopcorn = sc.nextFloat();
        System.out.println("please input quantity of soft drink: ");
        float quantityOfSoftDrink = sc.nextFloat();
        System.out.println("please input quantity of chocolate bars: ");
        float quantityOfChocolateBars = sc.nextFloat();
        totalPriceWithoutHST = popcornPrice * quantityOfPopcorn + softDrinksPrice * quantityOfSoftDrink +
                chocolateBarPrice * quantityOfChocolateBars;
        totalPriceWithHST = totalPriceWithoutHST * (1 + HST_RATE);
        System.out.println("total price with 13% HST: " + totalPriceWithHST);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("x" + x + " y" + y + " z" + z);

        System.out.println(Math.ceil(2.1f));
        System.out.println(Math.round(2.1000f));
        System.out.println(Math.round(2.1));

        System.out.println("\\t is a tab character");
        System.out.println("\t is a tab character");

        int intValue = sc.nextInt();
        System.out.println("please i: ");

        String line = sc.nextLine();





    }
}

