package Module_4.BowlingShopApp;

import java.util.*;

public class TestBowlingShopApp {
    public static void displayMenu(){
        System.out.println("");
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> Bowling Balls");
        System.out.println("");
        System.out.println("  Please choose an option: ");
    }

    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        displayMenu();
        String userChoice = userIn.next();

    }
}
