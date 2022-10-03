package Module_5.ExpenseTracker;

import java.util.*;
import java.io.*;
import java.math.*;

public class TestExpenseTracker {

    public static String menu(){
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. View Transactions");
        System.out.println("    2. Add Transactions");
        System.out.println("    3. View Expense");
        System.out.print("  Please choose an option: ");
        return " ";
    }
    public static void main(String[] args) throws IOException{
        ArrayList<Transaction> transactions = new ArrayList<>();

        System.out.println("  Welcome to the Expense Tracker");
        System.out.println("");
        do{
            Scanner sc = new Scanner(System.in);
            int input = ValidatorIO.getInt(sc, menu());
            if (input == 1){
                TransactionIO.findAll();
                System.out.println(TransactionIO.findAll());
            } else if (input == 2){
                String c = "y";

                while (c.equalsIgnoreCase("y")){
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                    transactions.add(new Transaction(description, amount));

                    c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
                }try{
                    TransactionIO.bulkInsert(transactions);
                } catch (IOException e){
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            } else if (input == 3){
                double monthlyExpense = 0;
                TransactionIO.findAll();
                for (Transaction transaction : transactions){
                    monthlyExpense += transaction.getAmount();
                }
                System.out.println("  Your total monthly expense is "+ String.format("$%,6.2.f", monthlyExpense));
            } else if (input != 1|| input !=2||input !=3){
                System.out.print("  Error! Invalid option.");
            }
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
        } while (true);
    }
}
