package Module_5.ExpenseTracker;

import java.text.*;

public class Transaction {
    private String date;
    private String description;
    private double amount = 0;

    public Transaction(){
    }

    public Transaction(String date, String description, double amount){
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
        return "  MONTHLY EXPENSES\n  Date: "+date+"\n  Description: "+description+"\n  Amount: "+amount;
    }

}
