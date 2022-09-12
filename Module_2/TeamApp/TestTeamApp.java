package Module_2.TeamApp;

import java.util.*;

public class TestTeamApp{

    public static void main(String[] args){
            System.out.println("");
            System.out.println("  Welcome to the Sports Team App.");
        while (true){
            Scanner userIn = new Scanner(System.in);
            System.out.println("");
            System.out.print("  Please enter a team name: ");
            String teamName = userIn.next();

            System.out.println("\n  Please enter the names of the players: ");
            System.out.print("    Hint: Use commas for multiple players. Do not use spaces. Example: Aaron,Allen,Smithy: ");
            Scanner userIn_02 = new Scanner(System.in);
            String players = userIn_02.next();

            Team newTeam = new Team(teamName);
            newTeam.addPlayer(players);
            String[] player = players.split(",");

            System.out.println("");
            System.out.println("  --Team Summary--");
            System.out.println("  Number of players on team: " + newTeam.getPlayerCount());
            System.out.print("  Players on team: ");
            String[] playersArray = newTeam.getPlayers();
            for (int i=0; i < newTeam.getPlayerCount(); i++)
                System.out.print(playersArray[i] +", ");

            System.out.println("");
            Scanner userIn_Continue = new Scanner(System.in);
            System.out.print("\n  Continue? y/n: ");
            String userDecision = userIn_Continue.next(); 
            if (userDecision.equalsIgnoreCase("n")){;
                System.out.println("");
                System.out.println("");
                System.out.println("  End of line.");
                System.out.println("");
                break;
            }
        }
    }
}