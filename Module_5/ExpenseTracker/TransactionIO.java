/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Java Files. W3 Schools. (2022). Retrieved 20 September 2022, from https://www.w3schools.com/java/java_files.asp.
Modifications by C. Zuck, 2022.

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_5.ExpenseTracker;

import java.io.*;
import java.util.*;

public class TransactionIO { /* Begin Transaction IO Class. */
    /* This is a constant for the file name. */
    final private static String FILE_NAME = "expenses.txt";
    /* This creates a new file and uses the constant for the name. */
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException{ /* This is a method to write a file that will throw an IO Exception. */
        PrintWriter output = null;
        
        /* Begin if/else statement to create a new file based on if one exists or not. */
        if (file.exists()){
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } 
        else{
            output = new PrintWriter(FILE_NAME);
        }

        /* This iterates through transactions and adds them to the file. */
        for (Transaction transaction : transactions){
            output.print("  "+ transaction.getDate());
            output.print("  "+ transaction.getDescription());
            output.println("  "+ transaction.getAmount());
        }
        /* This closes the output stream. */
        output.close();
    }

    /* This reads the file and throws an IO Exception. */
    public static ArrayList<Transaction> findAll() throws IOException{
        Scanner input = new Scanner (FILE_NAME);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        /* This while loop iterates through the transactions and returns them to the program. */
        while (input.hasNext()){
            Transaction transaction = new Transaction();
            transactions.add(transaction);
            System.out.println(input.next());
        }
        return transactions; 
    }
}/* End Transaction IO Class. */
