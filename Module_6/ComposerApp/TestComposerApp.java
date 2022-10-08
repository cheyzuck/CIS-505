package Module_6.ComposerApp;

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
        
    }
}
