package Module_5.ExpenseTracker;

import java.text.*;
import java.util.*;

public class Transaction {
    SimpleDateFormat simpleDate = new SimpleDateFormat("MM-dd-yyyy");
    Date today = new Date();
    private String date = String.format(simpleDate.format(today));
    private String description;
    private double amount = 0;

    public Transaction(){
    }

    public Transaction(String description, double amount){
    }

    public void setDate(String newDate){
        this.date = newDate;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setAmount(double newAmount){
        this.amount = newAmount;
    }

    public String getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    public double getAmount(){
        return amount;
    }
    public String toString(){
        return "  MONTHLY EXPENSES\n  Date: "+date+"\n  Description: "+description+"\n  Amount: "+String.format("$%,6.2.f", amount);
    }
}
