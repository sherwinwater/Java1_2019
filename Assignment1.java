/*Name: Shuwen Wang
  Assignment: Assignment1
  Program: Software Engineering
  Calculate student's final grade regarding on these inputs entered by the user, such as
  midterm exam 1 and 2, final exam, and assignments. Each input has a different weight.
*/
import java.util.Scanner;
public class Assignment1 {
    // declare each weight as final variable
    public static final float MIDTERM1_WEIGHT = .15f;
    public static final float MIDTERM2_WEIGHT = .25f;
    public static final float FINALEXAM_WEIGHT = .35f;
    public static final float ASSIGNMENT_WEIGHT = .25f;

    public static void main (String[] args) {
        System.out.println("***** This program calculates final grades for prog10082 *****");
        //get Mid Term 1 marks from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mid Term 1 marks:");
        float marksofMidTermExam1 = sc.nextFloat();

        //get Mid Term 2 marks from the user
        System.out.println("Enter Mid Term 2 marks:");
        float marksofMidTermExam2 = sc.nextFloat();

        //get final exam from the user
        System.out.println("Enter Final exam marks:");
        float marksofFinalExam = sc.nextFloat();

        //get assignment from the user
        System.out.println("Enter Assignment marks:");
        float marksofAssigment = sc.nextFloat();

        //calculate the final course grade with the weight of each course
        float finalCourseGrade = marksofMidTermExam1 * MIDTERM1_WEIGHT + marksofMidTermExam2 * MIDTERM2_WEIGHT
                + marksofFinalExam * FINALEXAM_WEIGHT + marksofAssigment * ASSIGNMENT_WEIGHT;
        // input with two decimal places
        System.out.printf("Final course grade: %.2f%n", finalCourseGrade );
    }
}