/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Java Files. W3 Schools. (2022). Retrieved 20 September 2022, from https://www.w3schools.com/java/java_files.asp.
Modifications by C. Zuck, 2022.

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_5.ExpenseTracker;

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.SimpleDateFormat;

public class TestExpenseTracker { /* Begin TestExpenseTracker class. */

    /* This method displays the menu. */
    public static String menu(){
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. View Transactions");
        System.out.println("    2. Add Transactions");
        System.out.println("    3. View Expense");
        System.out.print("  Please choose an option: ");
        return " ";
    }
    /* This is the main method that allows the program to run. It throws an IO Exception. */
    public static void main(String[] args) throws IOException{
        /* This is an attribute defined outside the if/else if/else... statements to simplify code. */
        ArrayList<Transaction> transactions = new ArrayList<>();

        System.out.println("  Welcome to the Expense Tracker");
        System.out.println("");
        do{ /* Begin do... while loop to allow user to continue for as long as they like. */
            Scanner sc = new Scanner(System.in);
            int input = ValidatorIO.getInt(sc, menu()); /* This validates user input. */
            /* Begin if... else if... statement to attest to the three possibilities in the menu. */
            if (input == 1){
                TransactionIO.findAll();
                System.out.println(TransactionIO.findAll()); /* This should show all transactions in file. */
            } else if (input == 2){ /* This allows the user to enter any number of transactions. */
                String c = "y";

                while (c.equalsIgnoreCase("y")){
                    SimpleDateFormat simpleDate = new SimpleDateFormat("MM-dd-yyyy");
                    String date = simpleDate.format(new Date());
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                    transactions.add(new Transaction(date, description, amount));

                    c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
                }try{ /* This tries the add those transactions to the file. */
                    TransactionIO.bulkInsert(transactions);
                } catch (IOException e){ /* This catches an exception if its made. */
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            } else if (input == 3){ /* This displays monthly expenses. */
                double monthlyExpense = 0;
                TransactionIO.findAll();
                for (Transaction transaction : transactions){
                    monthlyExpense += transaction.getAmount();
                }
                System.out.println("  Your total monthly expense is "+ String.format("$%6.2f", monthlyExpense));
            } else if (input != 1|| input !=2||input !=3){ /* This throws an error if the user does not input 1, 2, or 3. */
                System.out.print("  Error! Invalid option.");
            } /* This allows the user to choose to continue if they wish. */
            System.out.println("");
            System.out.print("  Continue? (y/n): ");
            Scanner userContinue = new Scanner(System.in);
            String continueChoice = userContinue.next();
            System.out.println("");
            if (continueChoice.equalsIgnoreCase("n")){
                System.out.println("");
                System.out.println("  Program terminated by user...");
                System.out.println("");
                break;
            } else if (continueChoice.equalsIgnoreCase("y")){
                continue;
            }
        } while (true); /* This continues the loop if the conditions are met. */
    }
}/* End TestExpenseTrackerApp. */
