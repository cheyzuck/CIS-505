/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_5.ExpenseTracker;

import java.text.*;
import java.util.*;

/* Begin Transaction class. */
public class Transaction {
    /* This sets the date format. */
    SimpleDateFormat simpleDate = new SimpleDateFormat("MM-dd-yyyy");
    Date today = new Date();
    /* These are the attributes of a transaction. */
    private String date = String.format(simpleDate.format(today));
    private String description;
    private double amount = 0;

    /* This is a default constructor. */
    public Transaction(){
    }

    /* This is an argument constructor. */
    public Transaction(String description, double amount){
    }

    /* Mutator Methods. */
    /* This method sets the date. */
    public void setDate(String newDate){
        this.date = newDate;
    }
    /* This method sets the description. */
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    /* This method sets the amount. */
    public void setAmount(double newAmount){
        this.amount = newAmount;
    }
    
    /* Accessor Methods. */
    /* This method gets the date. */
    public String getDate(){
        return date;
    }
    /* This method gets the description. */
    public String getDescription(){
        return description;
    }
    /* This method gets the amount. */
    public double getAmount(){
        return amount;
    }
    /* This overrides the toString method. */
    public String toString(){
        return "  MONTHLY EXPENSES\n  Date: "+date+"\n  Description: "+description+"\n  Amount: "+String.format("$%,6.2.f", amount);
    }
}/* End Transaction class. */
