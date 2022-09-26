package Module_4.BowlingShopApp;

import java.util.*;
import java.io.*;

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
        System.out.println("  Welcome to the Bowling Shop");
        System.out.println("");
        do{
        Scanner userIn = new Scanner(System.in);
        displayMenu();
        String userCode = userIn.next();

        if (userCode.equalsIgnoreCase("b")||userCode.equalsIgnoreCase("a")||userCode.equalsIgnoreCase("s")){
            GenericQueue<Product> products = ProductDB.getProducts(userCode);
            while(products.size() > 0){
                products.dequeue();
                products.toString();
            }
        } else if (userCode.equalsIgnoreCase("x")){
            System.out.println("");
            System.out.println("End of Line...");
        }
        } while (true);
    }
}

