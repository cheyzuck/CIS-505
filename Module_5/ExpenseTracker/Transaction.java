package Module_5.ExpenseTracker;

import java.text.*;

public class Transaction {
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    private String date = String.format(dateFormat.format(date));
    private String description;
    private double amount = 0;

}
