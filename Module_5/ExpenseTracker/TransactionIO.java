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
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException{
        Scanner input = new Scanner (FILE_NAME);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        while (input.hasNext()){
            for (Transaction transaction : transactions){
                Transaction newTransaction = new Transaction();
                newTransaction.getDate();
                newTransaction.getDescription();
                newTransaction.getAmount();
                transactions.add(newTransaction);
                System.out.println(newTransaction.toString());
            }
        } 
        return transactions; 
    }
}
