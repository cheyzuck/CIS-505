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

            /* This creates the header row. */
            String[] headers = {"First Name", "Last Name", "Course", "Grade" };
            writer.writeNext(headers);
        }
        /* This records the student data fields for every student. It uses commas to delimit the columns. It also adds a split to separate student entries so we can have multiple entries in the file and display them accordingly.  */
        for (Student student: students){
            output.write("" + student.getFirstName() + ",");
            output.write("" + student.getLastName() + ",");
            output.write("" + student.getCourse() + ",");
            output.write("" + student.getGrade() + ",");
            output.write("\n");
        }
        /* This closes the output stream. */
        output.close();
    }

    /* This finds all the students and sets those data fields. */
    public static ArrayList<Student> findAll() throws IOException{
        Scanner input = new Scanner(new File(FILE_NAME));
        ArrayList<Student> students = new ArrayList<Student>();

        boolean isHeader = true;

        /* This while loop iterates through the students and returns them to the program. */
        while (input.hasNext()){
            /* This helps ignore the header. */
            if (isHeader){
                input.nextLine();
                isHeader = false;
                continue;
            }

            /* This helps split the students up by commas and display them according to the entries in the column based on the index in a list. 
            This change was based on peer review of Joseph Polen's and Joshua Bollman's projects. 
            It made more sense to use a list format and set items that way that using input.next() in my eyes. Especially because I used this with the header row. */
            String studentLine = input.nextLine();
            String[] studentGrade = studentLine.split(",");
            if (studentGrade.length > 0){ 
                Student student = new Student();
                student.setFirstName(studentGrade[0]);
                student.setLastName(studentGrade[1]);
                student.setCourse(studentGrade[2]);
                student.setGrade(studentGrade[3]);
                students.add(student);
            }
        }
        input.close();
        return students;
    }
} /* End Student IO Class. */
