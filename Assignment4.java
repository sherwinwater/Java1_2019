/*
 Assignment4
 */

import java.util.Scanner;

public class Assignment4 {

    public static void main (String[] args) {

        // student object to store student records
        Student s = new Student();

        Scanner in = new Scanner(System.in);
        String input; // user's input
        System.out.println("Enter Students or exit");

        // insert or delete student records until user enters exit
        while (!(input = in.nextLine()).equalsIgnoreCase("exit")) {

            String[] output = input.split(",");
            if (output[0].equalsIgnoreCase("insert")) {
                s.storeStudents(output[1], output[2], output[3]);
            } else if (output[0].equalsIgnoreCase("delete_by_number")) {
                s.deleteStudentByNumber(output[1]);
            } else if (output[0].equalsIgnoreCase("delete_by_name")) {
                s.deleteStudentByName(output[1]);
            }
        }
        s.printStudents();
    }
}
