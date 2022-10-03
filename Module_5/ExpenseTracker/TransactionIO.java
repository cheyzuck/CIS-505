/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_5.ExpenseTracker;

import java.io.*;
import java.util.*;

public class TransactionIO {
    final private static String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException{
        PrintWriter output = null;

        if (file.exists()){
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } 
        else{
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions){
            output.println("  "+ tran.getDate() + " ");
            output.println("  "+ tran.getDescription() + " ");
            output.println("  "+ tran.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException{
        Scanner input = new Scanner (FILE_NAME);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        while (input.hasNext()){
            System.out.println(input.next());
            transactions.add(new Transaction());
        } 
        return transactions; 
    }
}
