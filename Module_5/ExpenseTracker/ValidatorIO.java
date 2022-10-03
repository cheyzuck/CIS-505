/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_5.ExpenseTracker;

import java.util.*;

public class ValidatorIO {
    public static int getInt(Scanner sc, String prompt){
        int input = 0;

        boolean isValid = false;

        while (!isValid){
            System.out.print(prompt);

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

    public static double getDouble(Scanner sc, String prompt){
        double input = 0;

        boolean isValid = false;

        while(!isValid){
            System.out.print(prompt);

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
}
