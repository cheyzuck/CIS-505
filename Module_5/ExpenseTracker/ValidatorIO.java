/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Java Files. W3 Schools. (2022). Retrieved 20 September 2022, from https://www.w3schools.com/java/java_files.asp.
Modifications by C. Zuck, 2022.

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_5.ExpenseTracker;

import java.util.*;

public class ValidatorIO { /* Begin ValidatorIO Class. */
    /* This method retrieves the integer for the menu. */
    public static int getInt(Scanner sc, String prompt){
        /* These are the attributes. */
        int input = 0;
        boolean isValid = false;

        /* This while loop allows the input to be validated and allow the scanner to move forward. */
        while (!isValid){
            System.out.print(prompt);
            /* This if/else statement shows what to do if the input is not valid. */
            if (sc.hasNextInt()){
                input = sc.nextInt();
                isValid = true;
            }
            else {
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /* This method retrieves the double amount and validates that is it possible. */
    public static double getDouble(Scanner sc, String prompt){
        double input = 0;

        boolean isValid = false;

        while(!isValid){
            System.out.print(prompt);
            /* This if/else statement shows what to do if the input is not valid. */
            if (sc.hasNextDouble()){
                input = sc.nextDouble();
                isValid = true;
            }
            else{
                System.out.println("\n  Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }
    /* This method retrieves the string and validates that is it possible. */
    public static String getString(Scanner sc, String prompt){
        String input = "0";

        boolean isValid = false;

        while(!isValid){
            System.out.print(prompt);

            if (sc.hasNext()){
                input = sc.next();
                isValid = true;
            }
            else{
                System.out.println("\n  Error! Invalid input.\n");
            }
            sc.nextLine();
        }
        return input;
    }
}/* End ValidatorIO class. */
