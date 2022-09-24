/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

package Module_3.CustomerAccountApp;

import java.util.*;
import java.text.*;
import java.math.*;

/* Begin Account class. */
class Account {
    /* These are the attributes of an account. */
    private double balance = 200.00;
    private double amt;

    /* This is a getter method that retrieves the balance. */
    public double getBalance(){
        return balance;
    }

    /* This is a method that allows the user to make a deposit. */
    public void deposit(double amt){
        double newBalance = balance + amt;
        this.balance = newBalance;
    }
    /* This is a method that allows the user to make a withdraw. */
    public void withdraw(double amt){
        if (balance>amt){
            double newBalance = balance - amt;
            this.balance = newBalance;
        }
        else if (balance == amt){
            double newBalance = balance - amt;
            this.balance = newBalance;
        }
    }
    /* This method displays the account menu. */
    public void displayMenu(){
        System.out.println("");
        System.out.println("  Amount Menu\n  Enter <D/d> for deposit\n  Enter <W/w> for withdraw\n  Enter <B/b> for balance");
        System.out.print("    Enter option>: ");
    }
    /* This method displays the transaction date. */
    public String getTransactionDate(){
        SimpleDateFormat simpleDate = new SimpleDateFormat("MM-dd-yyyy");
        Date today = new Date();
        String outputDate = String.format(simpleDate.format(today));
        return outputDate;
    }
}/* End Account Class. */
