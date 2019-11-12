public class BillAmount {
    public static final float HST_RATE = .13f;
    public static void main (String[] args) {

        //1. Write a program that sets the bill amount to the value 54.64, sets the tip amount to the value 0.10.
        // Calculate and print the total price using the bill amount and tip percentage.
        float billAmount = 54.64f;
        float tipAmount = 0.10f;
        float totalPrice;
        totalPrice = billAmount * (1 + tipAmount);
        System.out.println(totalPrice);

        //2. At the movie theatre, popcorn costs $5.53, soft drinks cost $2.99, and a chocolate bar costs $3.45.
        // Store the values in three different variables. Calculates the total sum when a customer orders 2 popcorns,
        // 1 soft drink, and 2 chocolate bars. Print the total sum using the "fixed" HST value of 13%.
        float popcornPrice = 5.53f;
        float softDrinksPrice = 2.99f;
        float chocolateBarPrice = 3.45f;
        float totalPriceWithoutHST;
        float totalPriceWithHST;
        totalPriceWithoutHST = popcornPrice * 2 + softDrinksPrice * 1 + chocolateBarPrice * 2;
        totalPriceWithHST = totalPriceWithoutHST * (1 + HST_RATE);
        System.out.println(totalPriceWithHST);

    }
}
