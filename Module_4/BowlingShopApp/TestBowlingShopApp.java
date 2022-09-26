/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Java Linked Lists. W3 Schools. (2022). Retrieved 23 September 2022, from https://www.w3schools.com/java/java_while_loop.asp.
Modifications by C. Zuck, 2022.
 
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

package Module_4.BowlingShopApp;

import java.util.*;
import java.io.*;

public class TestBowlingShopApp { /* Begin BowlingShopTestApp. */
    public static void displayMenu(){ /* This method displays the menu. */
        System.out.println("");
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> Bowling Balls");
        System.out.println("");
        System.out.print("  Please choose an option: ");
    }

    public static void main(String[] args){ /* This is the main method. */
        System.out.println("  Welcome to the Bowling Shop");
        System.out.println("");

        do{ /* Begin do... while loop to allow user to choose when to exit. */
        Scanner userIn = new Scanner(System.in);
        displayMenu(); /* displayMenu. */
        String userCode = userIn.next();
        System.out.println("");

        /* This if helps break down userCode so that if they select one of our main 3 options, it will dequeue and print their product listings accordingly. */
        if (userCode.equalsIgnoreCase("b")||userCode.equalsIgnoreCase("a")||userCode.equalsIgnoreCase("s")){
            GenericQueue<Product> products = ProductDB.getProducts(userCode);
            while(products.size() > 0){
                products.dequeue();
                System.out.println(products.toString()); /* This is where things got wonky. I could not figure out where the toString got lost. */
            }
        } else if (userCode.equalsIgnoreCase("x")){ /* This condition allows them to exit the loop. */
            System.out.println("");
            System.out.println("  End of Line...");
            break;
        }

        } while (true); /* This continues the do...while loop until the user breaks it. */
    }/* End main method. */
} /* End TestBowlingShopApp. */

