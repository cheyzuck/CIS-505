/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. */

/* Imports. */
import java.io.*;
import java.util.*;

/* Begin StudentIO Class. */
public class StudentIO {
    /* This sets the file name and creates the file. 
     * For the file, I know I need to create a header row. Would that work here or in the if/else statement better?
    */
    final private static String FILE_NAME = "grades.csv";
    private static File file = new File(FILE_NAME);

    /* This inserts the entered data into the file. */
    public static void insert(ArrayList<Student> students) throws IOException{
        PrintWriter output = null;

        /* Begin if/else statement to create a new file based on if one exists or not. */
        if (file.exists()){
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        }
        else {
            output = new PrintWriter(FILE_NAME);
        }
        /* This records the student data fields for every student. */
        for (Student student: students){
            output.print("" + student.getFirstName());
            output.print("" + student.getLastName());
            output.print("" + student.getCourse());
            output.print("" + student.getGrade());
        }
        /* This closes the output stream. */
        output.close();
    }

    /* This finds all the students and sets those data fields. */
    public static ArrayList<Student> findAll() throws IOException{
        Scanner input = new Scanner(new File(FILE_NAME));
        ArrayList<Student> students = new ArrayList<Student>();

        /* This while loop iterates through the transactions and returns them to the program. */
        while (input.hasNext()){
            Student student = new Student();
            student.setFirstName(input.next());
            student.setLastName(input.next());
            student.setCourse(input.next());
            student.setGrade(input.next());
            students.add(student);
        }
        return students;
    }
} /* End Student IO Class. */
