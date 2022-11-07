/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University.
<<<<<<< HEAD
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.
Java User Input. W3 Schools. (2022). Retrieved 9 September 2022, from https://www.w3schools.com/java/java_user_input.asp.
Modifications by C. Zuck, 2022.
Java While Loop. W3 Schools. (2022). Retrieved 9 September 2022, from https://www.w3schools.com/java/java_while_loop.asp.
Modifications by C. Zuck, 2022.
=======

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Java User Input. W3 Schools. (2022). Retrieved 9 September 2022, from https://www.w3schools.com/java/java_user_input.asp.
Modifications by C. Zuck, 2022.

Java While Loop. W3 Schools. (2022). Retrieved 9 September 2022, from https://www.w3schools.com/java/java_while_loop.asp.
Modifications by C. Zuck, 2022.

>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_2.TeamApp;

import java.util.*;

<<<<<<< HEAD
public class TestTeamApp {

    /* This is the main method, which allows the program to run. */
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("  Welcome to the Sports Team App.");
        /*
         * This begins the while loop, which allows the user to continue until they say
         * to stop.
         */
        while (true) {
=======
public class TestTeamApp{

    /* This is the main method, which allows the program to run. */
    public static void main(String[] args){
            System.out.println("");
            System.out.println("  Welcome to the Sports Team App.");
        /* This begins the while loop, which allows the user to continue until they say to stop. */
        while (true){
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
            Scanner userIn = new Scanner(System.in);
            System.out.println("");
            System.out.print("  Please enter a team name: "); /* This takes user input for the team name. */
            String teamName = userIn.next(); /* This translates the input to a defined variable. */

<<<<<<< HEAD
            System.out.println("\n  Please enter the names of the players: "); /*
                                                                                * This takes user input for the players.
                                                                                */
            System.out.print(
                    "    Hint: Use commas for multiple players. Do not use spaces. Example: Aaron,Allen,Smithy: ");
            Scanner userIn_02 = new Scanner(System.in);
            String players = userIn_02.next(); /*
                                                * This takes the players and converts that data to a defined string
                                                * variable.
                                                */

            Team newTeam = new Team(teamName);
            newTeam.addPlayer(players); /* This adds the players to the team being built. */
            String[] player = players.split(","); /* This splits the players into an array of players. */

            System.out.println("");
            System.out.println("  --Team Summary--");
            System.out.println("  Number of players on team: " + newTeam.getPlayerCount()); /*
                                                                                             * This returns the player
                                                                                             * count with the help of
                                                                                             * splitting the array of
                                                                                             * entered players. This is
                                                                                             * where I had the most
                                                                                             * trouble.
                                                                                             */
            System.out.print("  Players on team: "); /*
                                                      * This gives the player's names as they were entered continuously
                                                      * until there are no more names to give.
                                                      */
            String[] playersArray = newTeam.getPlayers();
            for (int i = 0; i < newTeam.getPlayerCount(); i++)
                System.out.print(playersArray[i] + ", ");
=======
            System.out.println("\n  Please enter the names of the players: "); /* This takes user input for the players. */
            System.out.print("    Hint: Use commas for multiple players. Do not use spaces. Example: Aaron,Allen,Smithy: ");
            Scanner userIn_02 = new Scanner(System.in);
            String players = userIn_02.next(); /* This takes the players and converts that data to a defined string variable. */

            Team newTeam = new Team(teamName);
            newTeam.addPlayer(players); /* This adds the players to the team being built. */
            String[] playerArray = players.split(","); /* This splits the players into an array of players. */
            
            for (String player:playerArray) /* This adds players to the team one at a time. */
                newTeam.addPlayer(player);

            System.out.println("");
            System.out.println("  --Team Summary--");
            System.out.println("  Number of players on team: " + newTeam.getPlayerCount()); /* This returns the player count with the help of splitting the array of entered players. This is where I had the most trouble. */
            System.out.print("  Players on team: "); /* This gives the player's names as they were entered continuously until there are no more names to give. */
            playerArray = newTeam.getPlayers();
            for (int i=0; i < newTeam.getPlayerCount(); i++){
                System.out.print(playerArray[i]+ ", ");
            }
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895

            System.out.println("");
            Scanner userIn_Continue = new Scanner(System.in);
            System.out.print("\n  Continue? y/n: "); /* This takes user input on whether to continue. */
            String userDecision = userIn_Continue.next(); /* This translates the user input into a defined variable. */
<<<<<<< HEAD
            if (userDecision.equalsIgnoreCase("n")) {
                ; /*
                   * This allows the while loop to end if the user selects 'n'. It ignores the
                   * case of the letter.
                   */
=======
            if (userDecision.equalsIgnoreCase("n")){; /* This allows the while loop to end if the user selects 'n'. It ignores the case of the letter. */
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
                System.out.println("");
                System.out.println("");
                System.out.println("  End of line.");
                System.out.println("");
<<<<<<< HEAD
                break;
=======
                break; 
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
            } /* End ending condition. */
        } /* End 'while' loop. */
    } /* End main function. */
} /* End TestTeamApp. */