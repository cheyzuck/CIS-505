package Module_3;

import java.util.*;

public class TestCustomerAccountApp {
    public static void main(){
        System.out.println("  Welcome to the Customer Account App");
        Scanner userIn = new Scanner(System.in);
        System.out.print(" Please enter a customer ID:\n ex: 1007, 1008, 1009: ");
        String id = userIn.next();
        
        Customer newCustomer = new Customer();
        newCustomer.getCustomer(id);

        
        
    }
    
}
