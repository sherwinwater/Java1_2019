/*Name: Shuwen Wang
  Assignment: Assignment2
  Program: Software Engineering
  Break the input string down into three strings with same length from beginning to end.
  The string must have the length of multiple of three.
*/
import java.util.Scanner;
public class Assignment2 {
    public static void main (String[] args) {


        String isContinue = "Y";  // used for the user to continue or not? Default is "y"
        Scanner sc = new Scanner(System.in);

        //when the isContinue is "y", execute the program.
        while (isContinue.equalsIgnoreCase("y")) {
            //get one string from the user
            System.out.println("Enter String with length of multiple of three:");
            String input = sc.nextLine();

            //declare how many strings will be breakdown
            int stringNumber = 3;
            //ask the user to re-enter the string if its length is not multiple of three
            while (input.length() % stringNumber != 0) {
                System.out.println("Re-Enter String with length of multiple of three:");
                input = sc.nextLine();
            }

            //calculate the length of three divided strings
            int n = input.length() / stringNumber;
            String startString = input.substring(0, n);      //get start string
            String middleString = input.substring(n, 2 * n); //get middle string
            String endString = input.substring(2 * n);       //get end string

            //print string length and three divided strings
            System.out.println("String length is " + input.length());
            System.out.println("Start is: " + startString);
            System.out.println("Middle is: " + middleString);
            System.out.println("End is: " + endString);

            //ask user to continue or not?
            System.out.println("continue Y/N?");
            isContinue = sc.nextLine();
        }
    }
}