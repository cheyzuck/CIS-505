/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University.

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Java User Input. W3 Schools. (2022). Retrieved 9 September 2022, from https://www.w3schools.com/java/java_user_input.asp.
Modifications by C. Zuck, 2022.

Java While Loop. W3 Schools. (2022). Retrieved 9 September 2022, from https://www.w3schools.com/java/java_while_loop.asp.
Modifications by C. Zuck, 2022.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_2.TeamApp;

public class Team {
    /* These are the attributes of a Team. */
    private String teamName;
    private String[] players = new String[20];
    private int playerCount = 0;

    /* This is a constructor that takes one argument. */
    public Team(String teamName) {
        this.teamName = teamName;
    }

<<<<<<< HEAD
    /*
     * This is a method that adds a player to a team and correspondingly increases
     * the player count.
     */
=======
    /* This is a method that adds a player to a team and correspondingly increases the player count. */
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    }

    /* This is an accessor method that returns the players names. */
<<<<<<< HEAD
    public String[] getPlayers() {
=======
    public String [] getPlayers() {
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
        return players;
    }

    /* This is an accessor method that returns the number of players. */
    public int getPlayerCount() {
        return playerCount;
    }
<<<<<<< HEAD

=======
    
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
    /* This is an accessor method that returns the team name. */
    public String getTeamName() {
        return teamName;
    }
<<<<<<< HEAD
}/* End of Team Class. */
=======
}/* End of Team Class. */
>>>>>>> 4cc78b311d896d4b5d6411fad702ad2564301895
