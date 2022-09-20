/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Java User Input. W3 Schools. (2022). Retrieved 18 September 2022, from https://www.w3schools.com/java/java_user_input.asp.
Modifications by C. Zuck, 2022.

Java While Loop. W3 Schools. (2022). Retrieved 18 September 2022, from https://www.w3schools.com/java/java_while_loop.asp.
Modifications by C. Zuck, 2022.

*/
package Module_3.CustomerAccountApp;

import java.util.*;

public class TestCustomerAccountApp {

     /* This is the main method, which allows the program to run. */
    public static void main(String[] args){
        System.out.println("  Welcome to the Customer Account App\n");
        Scanner userIn = new Scanner(System.in);
        System.out.print(" Please enter a customer ID:\n   ex: 1007, 1008, 1009: "); /* This takes user input for the Customer ID. */
        int id = userIn.nextInt(); /* This translates the input to a defined variable. */
        
        Customer customer = CustomerDB.getCustomer(id); /* This retrieves customer information based on the ID. */

        /* Begin do... while loop. */
        do{
            Account customerAccount = new Account();
            Scanner userIn2 = new Scanner(System.in);
            customerAccount.displayMenu(); /* Display menu. */
            String userSelection = userIn2.next();

            /* This takes the user input and applies appropriate condition. */

            /* Deposit. */
            if (userSelection.equals("D")||userSelection.equals("d")){
                Scanner userDeposit = new Scanner(System.in);
                System.out.print("  Enter deposit amount: ");
                double amt = userDeposit.nextDouble();
                customerAccount.deposit(amt);
            }
            /* Withdraw. */
            else if (userSelection.equals("W")||userSelection.equals("w")){
                Scanner userWithdraw = new Scanner(System.in);
                System.out.print("  Enter withdraw amount: ");
                double amt = userWithdraw.nextDouble();
                customerAccount.withdraw(amt);
            }
            /* Balance. */
            else if (userSelection.equals("B")||userSelection.equals("b")){
                System.out.println(customerAccount.getBalance());
            }
            else{
                System.out.println("  Error: Invalid Option.");
            }
            /* Allows user to choose to continue. */
            Scanner userContinue = new Scanner(System.in);
            System.out.print("  Continue? y/n: ");
            String continueChoice = userContinue.next();
            if (continueChoice.equals("n")){
                System.out.println("");
                System.out.println(customer.toString());
                System.out.println("");
                System.out.println("  Balance as of "+customerAccount.getTransactionDate()+" is $"+customerAccount.getBalance());
                System.out.println("");
                System.out.println("  End of line...");
                break;
            }
            if (continueChoice.equals("y")){
                continue;
            }
        }           
        while (true); /* End do... while loop. */
    }/* End main method. */
}/* End TestCustomerAccountApp. */
