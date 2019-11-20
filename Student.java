/*
Class: Student
 */

public class Student {

    String[][] student; // store the students
    int studentSize; // number of students added

    public Student() {
        // there can be a maximum of 30 students
        // Number, name, and program are stored for each student
        student = new String[30][3];

        studentSize= 0; // when the object is initialized, the size is 0

    }

    // this function stores the student's number, name, and program in the
    // Student array
    public void storeStudents(String number, String name, String program) {

        // check if the input is validate. The maximum values of Student Number:
        // 4 characters,Name: 8 characters, Program: 8 characters

        Boolean numberIsValidate = true;
        Boolean nameIsValidate = true;
        Boolean programIsValidate = true;
        Boolean numberIsValidateSpace = true;
        Boolean nameIsValidateSpace = true;
        Boolean programIsValidateSpace = true;

        //validate the student number
        if(number.length() > 4 || number.length() < 1) {
            numberIsValidate = false;
            System.out.println("Please input again. The characters of " + "student number must be >=1 && <=4");
        }
        for(int i = 0; i < number.length();++i){
          if(Character.isWhitespace(number.charAt(i))) {
              numberIsValidateSpace = false;
          }
        }
        if(!numberIsValidateSpace)
            System.out.println("Please input again. There are spaces in the student number");

        //validate the student name
        if(name.length() > 8 || name.length() < 1) {
            nameIsValidate = false;
            System.out.println("Please input again. The characters of " + "student name must be >=1 && <=8");
        }
        for(int i = 0; i < name.length();++i){
            if(Character.isWhitespace(name.charAt(i))) {
                nameIsValidateSpace = false;
            }
        }
        if(!nameIsValidateSpace)
            System.out.println("Please input again. There are spaces in the student name");

        //validate the student program
        if(program.length() > 8 || program.length() < 1) {
            programIsValidate = false;
            System.out.println("Please input again. The characters of " + "student program must be >=1 && <=8");
        }
        for(int i = 0; i < program.length();++i){
            if(Character.isWhitespace(program.charAt(i))) {
                programIsValidateSpace = false;
            }
        }
        if(!programIsValidateSpace)
            System.out.println("Please input again. There are spaces in the student program");

        //store the student
        if (numberIsValidate && nameIsValidate && programIsValidate
                && numberIsValidateSpace && nameIsValidateSpace && programIsValidateSpace){
            String[] newStudent = {number, name, program};
            student[studentSize] = newStudent;
            //add student size
            ++studentSize;
        }

    }

    // delete the student record from the student array based on the number
    // provided
    public void deleteStudentByNumber(String number) {

        //delete the matched row by number: replace the i row with i+1 row until the last row.
        for (int i =0; i < studentSize; ++i){
            if(number.equalsIgnoreCase(student[i][0])) {//check the number
                for (int j = i; j < studentSize - 1; ++j) { // replace the rows(>=i)
                    for (int k = 0; k < student[j].length; ++k)
                        student[j][k] = student[j+1][k];  // replace j row with j+1 row
                }
                String[] empty = {};
                student[studentSize - 1] = empty; //delete the last row
                --studentSize; // reduce student size
            }
        }
    }

    // delete the student record from the student array based on the name
    // provided. If there are multiple students with the same name, delete
    // all names
    public void deleteStudentByName(String name) {

        //delete the matched row by name: replace the i row with i+1 row until the last row.
        for (int i =0; i < studentSize; ++i){
            if(name.equalsIgnoreCase(student[i][1])) { //check the name
                for (int j = i; j < studentSize - 1; ++j) {//replace the row (>=i)
                    for (int k = 0; k < student[j].length; ++k) {
                        student[j][k] = student[j+1][k]; // replace j row with j+1 row
                    }
                }
                String[] empty = {};
                student[studentSize - 1] = empty; //delete the last row
                --studentSize;//reduce studentSize
            }
        }
    }

    // Print the elements in the student array
    public void printStudents() {
        // Table headers
        System.out.printf("%-5s%-10s%-10s%-10s%n","ID","Number","Name","Program");

        // TO DO.
        // //Use printf based on the columns / width defined above
        for(int i = 0; i < studentSize; ++i){
            System.out.printf("%-5s%-10s%-10s%-10s%n",i+1,student[i][0],student[i][1],student[i][2]);
        }

    }

    // Returns the numbers of students added
    public int getStudentSize() {

        // TO DO
        return studentSize;
    }

}


