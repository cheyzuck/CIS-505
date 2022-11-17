/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Writing a CSV file in Java using OpenCSV. GeeksforGeeks. (2022). Retrieved 16 November 2022, from https://www.geeksforgeeks.org/writing-a-csv-file-in-java-using-opencsv/
Modifications by C. Zuck, 2022. */

/* Imports. */
import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

/* Begin StudentIO Class. */
public class StudentIO {
    /* This sets the file name and creates the file. */
    final private static String FILE_NAME = "grades.csv";
    private static File file = new File(FILE_NAME);

    /* This inserts the entered data into the file. */
    public static void insert(ArrayList<Student> students) throws IOException{
        FileWriter output = null;

        /* Begin if/else statement to create a new file based on if one exists or not. */
        if (file.exists()){
            output = new FileWriter(FILE_NAME, true);
        }
        else {
            output = new FileWriter(FILE_NAME);
            CSVWriter writer = new CSVWriter(output);

            String[] headers = {"First Name", "Last Name", "Course", "Grade" };
            writer.writeNext(headers);
        }
        /* This records the student data fields for every student. */
        for (Student student: students){
            output.write("" + student.getFirstName() + ",");
            output.write("" + student.getLastName() + ",");
            output.write("" + student.getCourse() + ",");
            output.write("" + student.getGrade() + ",");
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
