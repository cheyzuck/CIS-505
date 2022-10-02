package Module_5.ExpenseTracker;

import java.util.*;
import java.io.*;

public class TestExpenseTracker {

    public static String menu(){
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. View Transactions");
        System.out.println("    2. Add Transactions");
        System.out.println("    3. View Expense");
        System.out.print("  Please choose an option: ");
        return null;
    }
    public static void main(String[] args){
        System.out.println("  Welcome to the Expense Tracker");
        do{
        menu();
        Scanner sc = new Scanner(System.in);
        int input = ValidatorIO.getInt(sc, menu());
        if (input == 1){
            TransactionIO.findAll();
        } else if (input == 2){
            String c = "y";
            ArrayList<Transaction> transactions = new ArrayList<>();

            while (c.equalsIgnoreCase("y")){
                String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");
                
                Transaction transaction = new Transaction(description, amount);

                transactions.add(transaction);

                c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
            }
            try{
                TransactionIO.bulkInsert(transactions);
            }
            catch (IOException e){
                System.out.println("\n  Exception: " + e.getMessage());
            }
        } else if (input == 3){
            TransactionIO.findAll();
            for (Transaction transaction : transactions){
                monthlyExpense += transaction.getAmount();
            }
        }
        }
    }
}
