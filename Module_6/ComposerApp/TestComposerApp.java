package Module_6.ComposerApp;

import java.util.*;

public class TestComposerApp {
    public static void displayMenu(){
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. View Composers");
        System.out.println("    2. Find Composer");
        System.out.println("    3. Add Composer");
        System.out.println("    4. Exit");
        System.out.println("");
        System.out.print("  Please choose an option: ");
    }

    public static void main(String[] args){
        System.out.println("  Welcome to the Composer App");
        displayMenu();
        do{
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput == 1){
            
        }
        else if (userInput == 2){

        }
        else if (userInput == 3){

        }
        else if (userInput == 4){
            System.out.println("");
            System.out.println("  Session terminated by user...");
            System.out.println("");
            break;
        }
        else if (userInput != 1 || userInput !=2 || userInput !=3 || userInput != 4){
            System.out.println("  Error! Invalid input.");
        }
        } while (true);
    }
}
