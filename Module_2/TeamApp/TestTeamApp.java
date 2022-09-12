package Module_2.TeamApp;

import java.util.*;

public class TestTeamApp{

    public static void main(String[] args){
            System.out.println("Welcome to the Sports Team App.");
            Scanner userIn = new Scanner(System.in);
        while (true){
            System.out.println("");
            System.out.println("Please enter a team name: ");
            String teamName = userIn.next();

            System.out.println("\nPlease enter the names of the players: ");
            System.out.println("Hint: Use commas for multiple players. Do not use spaces.");
            System.out.println("Example: Aaron,Allen,Smithy\n");
            Scanner userIn_02 = new Scanner(System.in);
            String players = userIn_02.next();

            Team newTeam = new Team(teamName);
            newTeam.addPlayer(players);
            String [] player = players.split(",");

            System.out.println("");
            System.out.println("---Team Summary---");
            System.out.println("Number of players on team: " +newTeam.getPlayerCount());
            System.out.println("Players on team:");
            String [] playerArray = newTeam.getPlayers();
            for (int i=0; i < newTeam.getPlayerCount(); i++)
                System.out.print(playerArray[i] +", ");

            System.out.println("");
            Scanner userIn_Continue = new Scanner(System.in);
            System.out.println("\nWould you like to continue? Please type 'y' or 'n'.");
            String userDecision = userIn_Continue.next(); 
            if (userDecision.equalsIgnoreCase("n")){;
                break;
            }
        }
    }
}