package Module_3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.math.*;

class Account {
    private double balance = 200;
    private double amt;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        double newBalance = balance + amt;
    }
    public void withdraw(double amt){
        if (balance>amt){
            double newBalance = balance - amt;
        }
        else if (balance == amt){
            double newBalance = balance - amt;
        }
    }
    public void displayMenu(){
        System.out.println("");
        System.out.println("  Amount Menu\n  Enter <D/d> for deposit\n  Enter <W/w> for withdraw\n  Enter <B/b> for balance");
        System.out.print("    Enter option>: ");
    }
    public String getTransactionDate(){
        SimpleDateFormat simpleDate = new SimpleDateFormat("MM-dd-yyyy");
        Date today = new Date();
        String outputDate = String.format(simpleDate.format(today));
        return outputDate;
    }
}
