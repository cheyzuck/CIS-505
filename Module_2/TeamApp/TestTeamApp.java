package Module_2.TeamApp;

import java.util.Scanner;

public class TestTeamApp{

    public static void main(String[] args){
        System.out.println("Welcome to the Sports Team App.");
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter a team name: ");
        String teamName = userIn.nextLine();

        System.out.println("\nPlease enter the names of the players: ");
        System.out.println("Hint: use commas for multiple players. Do not use spaces.");
        System.out.println("Example: Aaron,Allen,Smithy\n");
        Scanner userIn_02 = new Scanner(System.in);
        String players = userIn_02.nextLine();

        Team newTeam = new Team(teamName);
        newTeam.addPlayer(players);
        newTeam.getPlayers();
        newTeam.getTeamName();
        newTeam.getPlayerCount();

        System.out.println("---Team Summary---");
        System.out.println("Number of players on team: " +newTeam.getPlayerCount());
        for (int i=0; i<newTeam.getPlayerCount(); i++)
            System.out.print(players[i] +", ");

        
    }
}