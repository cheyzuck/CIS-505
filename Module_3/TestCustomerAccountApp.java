package Module_3;

import java.util.*;

public class TestCustomerAccountApp {
    public static void main(String[] args){
        System.out.println("  Welcome to the Customer Account App\n");
        Scanner userIn = new Scanner(System.in);
        System.out.print(" Please enter a customer ID:\n   ex: 1007, 1008, 1009: ");
        int id = userIn.nextInt();
        
        Customer customer = CustomerDB.getCustomer(id);
        do{
            Account customerAccount = new Account();
            Scanner userIn2 = new Scanner(System.in);
            customerAccount.displayMenu();
            String userSelection = userIn2.next();
            if (userSelection == "D"){
                Scanner userDeposit = new Scanner(System.in);
                System.out.print("  Enter deposit amount: ");
                double amt = userDeposit.nextDouble();
                customerAccount.deposit(amt);
            }
            else if (userSelection == "d"){
                Scanner userDeposit = new Scanner(System.in);
                System.out.print("  Enter deposit amount: ");
                double amt = userDeposit.nextDouble();
                customerAccount.deposit(amt);
            }
            else if (userSelection == "W"){
                Scanner userWithdraw = new Scanner(System.in);
                System.out.print("  Enter withdraw amount: ");
                double amt = userWithdraw.nextDouble();
                customerAccount.withdraw(amt);
            }
            else if (userSelection == "w"){
                Scanner userWithdraw = new Scanner(System.in);
                System.out.print("  Enter withdraw amount: ");
                double amt = userWithdraw.nextDouble();
                customerAccount.withdraw(amt);
            }
            else if (userSelection == "B"){
                Scanner userBalance = new Scanner(System.in);
                System.out.print("  Enter deposit amount: ");
                double amt = userBalance.nextDouble();
                customerAccount.getBalance();
            }
            else if (userSelection == "b"){
                Scanner userBalance = new Scanner(System.in);
                System.out.print("  Enter deposit amount: ");
                double amt = userBalance.nextDouble();
                customerAccount.getBalance();
            }
            else{
                System.out.println("  Error: Invalid Option.");
            }
            Scanner userContinue = new Scanner(System.in);
            System.out.print("  Continue? y/n: ");
            String continueChoice = userContinue.next();
            if (continueChoice == "y"){
                continue;
            }
            else{
                System.out.println("");
                System.out.println(customer.toString());
                System.out.println("");
                System.out.println("  Balance as of "+customerAccount.getTransactionDate()+" is $"+customerAccount.getBalance());
                System.out.println("");
                System.out.println("  End of line...");
                break;
            }
        }           
        while (true);
    }
}
